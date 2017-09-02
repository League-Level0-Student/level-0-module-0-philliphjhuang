import javax.swing.JOptionPane;

// This recipe says "hi" to the user
//
// 1. Create a class called Greeter
// 2. Add a main method
// 3. Use JOptionPane.showInputDialog to ask them their name, e.g. What is your name?
// HINT: Use a variable to store their name
// 4. Use JOptionPane.showMessageDialog to say hi to them, e.g. Hi Jackie
public class Greeter {
	public static void main(String[] args) throws Exception {
		
		String x = JOptionPane.showInputDialog("What is your name?") ;
		
		JOptionPane.showMessageDialog(null, "Hi "+x);
	}
}
