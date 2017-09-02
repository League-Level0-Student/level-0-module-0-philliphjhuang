import javax.swing.JOptionPane;

// This recipe tells the user that what they like is awesome
//
// 1. Create a class called EverythingIsAwesome
// 2. Add a main method
// 3. Use JOptionPane.showInputDialog to ask them what they like, e.g. What do you like?
// HINT: Use a variable to store their answer, e.g. space
// 4. Use JOptionPane.showMessageDialog to tell them it is awesome, e.g. space is awesome

public class EverythingIsAwesome {
	public static void main(String[] args) throws Exception {
		String x=JOptionPane.showInputDialog(null,"What do you like?") ;
		JOptionPane.showMessageDialog(null, x+" is awesome!");
	}
}
