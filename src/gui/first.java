package gui;
import javax.swing.*;

public class first {
	public static void main(String[]args)
	{
		
		String fn = JOptionPane.showInputDialog("This is the first number");
		String sn = JOptionPane.showInputDialog("This is the second number");
		
		int item1 = Integer.parseInt(fn);
		int item2 = Integer.parseInt(sn);
		
		int sum = item1 + item2;
		
		JOptionPane.showMessageDialog(null, "This is the answer "+sum,"ANSWER", JOptionPane.PLAIN_MESSAGE);
	}
	
	
	

}
