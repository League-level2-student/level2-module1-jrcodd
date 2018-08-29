package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton add = new JButton();
	JButton veiw = new JButton();
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.JStuff();
	}
	ArrayList<String> guests = new ArrayList<String>();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	public void JStuff() {
		p.add(add);
		p.add(veiw);
		f.add(p);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);
		add.setText("add guest");
		veiw.setText("veiw guest list");
		add.addActionListener(this);
		veiw.addActionListener(this);
		f.pack();
	}
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == add) {
			guests.add(JOptionPane.showInputDialog("enter a name"));
		}
		if(e.getSource() == veiw) {
			JOptionPane.showMessageDialog(f, guests);
			
		}
	}
}
