
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class GUI implements ActionListener {

	private JFrame frame;
	private JTextField tfipaddress;
	private JButton btnsubmit;
	private JLabel lblPort;
	private JTextField textField;
	private String IP = null;
	private int port;

	public GUI() {
		initialize();
	}
	public String GetIP() {
		return IP;
	}
	public int GetPort() {
		return port;
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 881, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		tfipaddress = new JTextField();
		tfipaddress.setBounds(332, 111, 285, 28);
		frame.getContentPane().add(tfipaddress);
		tfipaddress.setColumns(10);

		JLabel lblNewLabel = new JLabel("IP ADDRESS");
		lblNewLabel.setBounds(116, 110, 74, 28);
		frame.getContentPane().add(lblNewLabel);

		btnsubmit = new JButton("Submit");
		btnsubmit.setBounds(310, 341, 112, 34);
		frame.getContentPane().add(btnsubmit);

		lblPort = new JLabel("PORT");
		lblPort.setBounds(116, 186, 74, 28);
		frame.getContentPane().add(lblPort);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(332, 191, 285, 28);
		frame.getContentPane().add(textField);
		btnsubmit.addActionListener(this);
		frame.show();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnsubmit) {
			if (!textField.getText().isEmpty() && !tfipaddress.getText().isEmpty()) {
				IP = tfipaddress.getText();
				port = Integer.parseInt(textField.getText());
			} else {
				JOptionPane.showMessageDialog(null,
						"enter fields please",
		                "ERROR",
		                JOptionPane.ERROR_MESSAGE);
			}
		}

	}
}
