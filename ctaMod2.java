import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.util.Scanner;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
public class ctaMod2  {

	public static void main(String[] args) {
		
		BankAccount frame = new BankAccount();
		
		//finishing touches to frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		
		
		
		
	}//end of main

}//end of class ctaMod2

 class BankAccount extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JLabel balanceLabel;
	private JLabel withdrawLabel;
	private JLabel depositLabel;
	private JTextField balanceField;
	private JTextField withdrawField;
	private JTextField depositField;
	private JButton button;
	private int balance;
	private JPanel panel;
	
	BankAccount() {
		GridBagConstraints positionConst = null;
		balance = 1000;
		
		//set title of frame. this method inherited from superclass
		setTitle("Bank Account");
		
		//create labels
		balanceLabel = new JLabel ("Current Balance: $");
		withdrawLabel = new JLabel ("Withdraw amount: $");
		depositLabel = new JLabel ("Deposit amount: $");
		
		//create text fields
		balanceField = new JTextField(15);
		balanceField.setEditable(false);
		balanceField.setText("1000");
		
		withdrawField = new JTextField(15);
		withdrawField.setEditable(true);
		withdrawField.setText("0");
		
		depositField = new JTextField(15);
		depositField.setEditable(true);
		depositField.setText("0");
		
		
		//create a button
		button = new JButton("Enter");
		button.addActionListener(this);
		
		//create a panel
		panel = new JPanel();
		panel.setBackground(new Color(250,0,0));
		
		
		//gridbaglayout
		setLayout(new GridBagLayout());
		positionConst = new GridBagConstraints();
		
		//specify grid location
		//balance fields
		positionConst.gridx = 0;
		positionConst.gridy = 0;
		positionConst.insets = new Insets (10,10,10,10); // create padding
		add(balanceLabel, positionConst);
		
		positionConst.gridx = 1;
		positionConst.gridy = 0;
		positionConst.insets = new Insets (10,10,10,10);
		add(balanceField, positionConst);
		
		//withdraw fields
		positionConst.gridx = 0;
		positionConst.gridy = 1;
		positionConst.insets = new Insets (10,10,10,10);
		add(withdrawLabel, positionConst);
		
		positionConst.gridx = 1;
		positionConst.gridy = 1;
		positionConst.insets = new Insets (10,10,10,10);
		add(withdrawField, positionConst);
		
		//deposit fields
		positionConst.gridx = 0;
		positionConst.gridy = 2;
		positionConst.insets = new Insets (10,10,10,10);
		add(depositLabel, positionConst);
		
		positionConst.gridx = 1;
		positionConst.gridy = 2;
		positionConst.insets = new Insets (10,10,10,10);
		add (depositField, positionConst);
		
		//add button to frame
		positionConst.gridx = 0;
		positionConst.gridy = 3;
		positionConst.insets = new Insets (10,10,10,10);
		add(button, positionConst);
		
		//add a panel
		positionConst.gridx=0;
		positionConst.gridy=0;
		positionConst.gridwidth = 2;
		positionConst.insets = new Insets (10,10,10,10);
		add(panel, positionConst);
		
		
		
	}//end of constructor
	
	@Override
	public void actionPerformed (ActionEvent event) {
		String userInput;
		int amount;
		
		//get amount changed
		
		if (withdrawField.getText() != "0") {
			userInput = withdrawField.getText();
			amount = Integer.parseInt(userInput);
			
			balanceField.setText(Integer.toString(balance - amount));
			withdrawField.setText("0");	
			balance = balance - amount;
		}
		if (depositField.getText() != "0"){
			userInput = depositField.getText();
			amount = Integer.parseInt(userInput);
			
			balanceField.setText(Integer.toString(balance + amount));
			depositField.setText("0");
			balance = balance + amount;
		}
		
	}//end of actionPerformed method
	
	
}//end of BankAccount
 



