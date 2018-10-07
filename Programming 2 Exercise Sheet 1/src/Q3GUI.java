import javax.swing.*;
import java.awt.*;

public class Q3GUI {
	
	public Q3GUI() {
		
		JFrame window = new JFrame("Font Chooser");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
	    window.setSize(900,200);
	    
	    Container pane = window.getContentPane();
		pane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1,BoxLayout.PAGE_AXIS));
		JCheckBox boldBox = new JCheckBox("Bold");
		JCheckBox italicBox = new JCheckBox("Italic");
		panel1.add(boldBox);
		panel1.add(italicBox);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2,BoxLayout.PAGE_AXIS));
		String[] fontStrings = new String[] { "Times", "Helvetica", "Courier" };
		JComboBox<String> fontList = new JComboBox<>(fontStrings);
		fontList.setSelectedIndex(0);
		panel2.add(fontList);
		
		JTextField inputTextField = new JTextField(30);
		JButton okButton = new JButton("OK");
		
		pane.add(panel1);
		pane.add(panel2);
		pane.add(inputTextField);
		pane.add(okButton);
		
		window.pack();
		window.setVisible(true);
	}
}