/*
package GUI;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import ENGINE.Client;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

*/
/*
public class MainWindow {
	private static Text text;
	private static Text text_1;
	private static Text text_2;
	private Client C;
*/
	/**
	 * Launch the application.
	 * @param args
	 */
/*
	public static void main(String[] args) {
		
		Display display = Display.getDefault();
		Shell shlEllade = new Shell();
		shlEllade.setSize(450, 300);
		shlEllade.setText("ElladeClient");
		shlEllade.setLayout(new BorderLayout(0, 0));
		
		Composite composite = new Composite(shlEllade, SWT.NONE);
		composite.setLayoutData(BorderLayout.CENTER);
		composite.setLayout(new GridLayout(2, true));
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setText("Username");
		
		text = new Text(composite, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_1 = new Label(composite, SWT.NONE);
		lblNewLabel_1.setText("Email");
		
		text_1 = new Text(composite, SWT.BORDER);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblPassword = new Label(composite, SWT.NONE);
		lblPassword.setText("Password");
		
		text_2 = new Text(composite, SWT.BORDER);
		text_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnNewButton = new Button(composite, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnNewButton.setText("Registrati");
		
		Button btnNewButton_1 = new Button(composite, SWT.NONE);
		btnNewButton_1.setText("Login");

		shlEllade.open();
		shlEllade.layout();
		while (!shlEllade.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}


}
*/
