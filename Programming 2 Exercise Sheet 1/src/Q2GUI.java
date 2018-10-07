import javax.swing.*;
import java.awt.*;

public class Q2GUI {
	
	public Q2GUI() {
		
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
		JRadioButton timesButton = new JRadioButton("Times", true);
		JRadioButton helveticaButton = new JRadioButton("Helvetica", false);
		JRadioButton courierButton = new JRadioButton("Courier", false);
		panel2.add(timesButton);
		panel2.add(helveticaButton);
		panel2.add(courierButton);
		
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