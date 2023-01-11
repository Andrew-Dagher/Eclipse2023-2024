package personal_testing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	
	private static JLabel userlabel;
	private static JTextField userText;
	private static JLabel passlabel;
	private static JPasswordField passText;
	private static JButton button;
	private static JLabel success;
	
	
	

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close code when you close the pop-up
		frame.add(panel);//add the panel to the frame
	
		panel.setLayout(null);
		
		//username stuff
		userlabel = new JLabel("User");//MAKING A LABEL
		userlabel.setBounds(10,20,80,25);//location and size of panel
		panel.add(userlabel);//add the label "user" to the panel
		userText = new JTextField();//MAKING A PLACE TO WRITE USERNAME
		userText.setBounds(100,20,165,25);
		panel.add(userText);//add text box to the panel
		
		//password stuff
		passlabel = new JLabel("Password");
		passlabel.setBounds(10,50,80,25);
		panel.add(passlabel);
		passText = new JPasswordField();
		passText.setBounds(100,50,165,25);
		panel.add(passText);
		
		//button stuff
		button = new JButton("Login");
		button.setBounds(100,80,80,25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		//creates message when button is pressed
		success = new JLabel("");
		success.setBounds(10,110,350,25);
		panel.add(success);
		success.setText("");
		
		//setting the frame to visible must be done at the end
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {//when button is pressed, this code runs
		String user = userText.getText();
		String password = passText.getText();
		
		if(user.toLowerCase().equals("andrew") && password.equals("HELLO")) {
			success.setText("Login successful!");
			
		}else success.setText("Incorrect username or password, pleanse try again!");
	}

}
