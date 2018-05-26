import javax.swing.JOptionPane;
public class Remarkable {
	public static void main(String[] args) {
		String Name = JOptionPane.showInputDialog(null, "Hello What Is Your Name?");
		String Hobby = JOptionPane.showInputDialog(null,"Whats Your Favorite Hobby?");
		JOptionPane.showMessageDialog(null, Name + " Wanna Know Something Remarkable About You? ");
		JOptionPane.showMessageDialog(null, Name + " Your A Person......");
		JOptionPane.showMessageDialog(null,  "You're Also Very Good At " +Hobby);
	}
}
