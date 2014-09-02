package com.y.chat.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tray;
import org.eclipse.swt.widgets.TrayItem;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.RowData;

public class ChatView 
{
	private static Text messageViewTextBox;
	private static Text messageInputTextBox;
	
	public static void main(String[] args) 
	{
		Display display = new Display();
		final Shell shell = new Shell(display);
		
		GridLayout shellGridLayout = new GridLayout(2, false);		
		shell.setLayout(shellGridLayout);
		
		messageViewTextBox = new Text(shell, SWT.BORDER);
		messageViewTextBox.setEditable(false);
		
		GridData messageViewGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		messageViewGridData.horizontalSpan = 2;
		messageViewGridData.heightHint = 271;
		
		messageViewTextBox.setLayoutData(messageViewGridData);
		
		messageInputTextBox = new Text(shell, SWT.BORDER);
		
		GridData messageInputGridData = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);		
		messageInputGridData.heightHint = 39;
		messageInputGridData.grabExcessVerticalSpace = true;
		
		messageInputTextBox.setLayoutData(messageInputGridData);
		
		messageInputTextBox.setFocus();		
		
		Button sendButton = new Button(shell, SWT.NONE);
		
		GridData sendButtonGridData = new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1);
		sendButtonGridData.widthHint = 110;
		sendButtonGridData.heightHint = 87;		
		sendButtonGridData.grabExcessVerticalSpace = true;
		
		sendButton.setLayoutData(sendButtonGridData);
		sendButton.setText("Send");
		
		Image icon = new Image(display, "res/icon.png");
		
		shell.setImage(icon);
		
		shell.open();
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
				
		display.dispose();
	}	
}
