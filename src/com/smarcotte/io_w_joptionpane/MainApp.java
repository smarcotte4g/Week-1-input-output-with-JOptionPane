package com.smarcotte.io_w_joptionpane;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class MainApp
{

	public static void main(String[] args)
	{
		// create variables
		String name = "";
		int age = 0;
		double cash = 0.0f;
		
		// get input
		name = JOptionPane.showInputDialog("Enter name: ");
		age = Integer.parseInt( JOptionPane.showInputDialog("Enter age: ") );
		cash = Double.parseDouble( JOptionPane.showInputDialog("Enter cash: ") );
		
		// display values
		DecimalFormat formatter = new DecimalFormat( "$#,##0.00" );
		JOptionPane.showMessageDialog(null, name + ", " + age + ", " + formatter.format(cash));
		
		// ask the user a question
		int result = JOptionPane.showConfirmDialog(null, "Confirm selection?", "Conformation", JOptionPane.YES_NO_CANCEL_OPTION);
		
		if( result == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null, "You said 'Yes'");
		else if( result == JOptionPane.NO_OPTION)
			JOptionPane.showMessageDialog(null, "You said 'No'");
		else	
			JOptionPane.showMessageDialog(null, "You cancelled the dialog!");
		
		// exit gracefully
		System.exit(0);

	}

}
