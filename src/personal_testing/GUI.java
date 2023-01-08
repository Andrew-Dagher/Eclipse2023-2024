package personal_testing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close/exit application correctly	
		frame.add(panel);//add the panel to the frame
	
		panel.setLayout(null);
		
		JLabel userlabel = new JLabel("User");//MAKING A LABEL
		userlabel.setBounds(10,20,80,25);//location and size of panel
		panel.add(userlabel);//add the label "user" to the panel
		
		JTextField userText = new JTextField();
		userText.setBounds(100,20,165,25);
		panel.add(userText);//add text box to the panel
		JLabel passlabel = new JLabel("Password");
		passlabel.setBounds(10,50,80,25);
		panel.add(passlabel);
		
		JPasswordField passText = new JPasswordField();
		passText.setBounds(100,50,165,25);
		panel.add(passText);
		
		
		frame.setVisible(true);
	}

}
