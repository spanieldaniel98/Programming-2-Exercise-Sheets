import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q2GUI extends JFrame {
	
	String title;

	public Q2GUI(String title) {
		super(title);
	}
	
	class timesListener implements ActionListener {
		
		JTextField inputTextField;
		
		public timesListener(JTextField inputTextField) {
			this.inputTextField = inputTextField;
		}
		
		public void actionPerformed(ActionEvent e) {
			inputTextField.setFont(new Font("Times", Font.BOLD, 15));
			inputTextField.setText("Times");
		}
	}
	
	class helveticaListener implements ActionListener {
		
		JTextField inputTextField;
		
		public helveticaListener(JTextField inputTextField) {
			this.inputTextField = inputTextField;
		}
		
		public void actionPerformed(ActionEvent e) {
			inputTextField.setFont(new Font("Helvetica", Font.BOLD, 15));
			inputTextField.setText("Helvetica");
		}
	}
	
	class courierListener implements ActionListener {
		
		JTextField inputTextField;
		
		public courierListener(JTextField inputTextField) {
			this.inputTextField = inputTextField;
		}
		
		public void actionPerformed(ActionEvent e) {
			inputTextField.setFont(new Font("Courier", Font.BOLD, 15));
			inputTextField.setText("Courier");
		}
	}
	
	class okListener implements ActionListener {
		
		JTextField inputTextField;
		
		public okListener(JTextField inputTextField) {
			this.inputTextField = inputTextField;
		}
		
		public void actionPerformed(ActionEvent e) {
			System.out.println(inputTextField.getText());
			System.exit(0);
		}
	}

	void init() {
		
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
		
		ButtonGroup fontButtons = new ButtonGroup();
		JRadioButton timesButton = new JRadioButton("Times", true);
		JRadioButton helveticaButton = new JRadioButton("Helvetica", false);
		JRadioButton courierButton = new JRadioButton("Courier", false);
		fontButtons.add(timesButton);
		fontButtons.add(helveticaButton);
		fontButtons.add(courierButton);
		
		JTextField inputTextField = new JTextField(30);
		JButton okButton = new JButton("OK");
		
		timesButton.addActionListener(new timesListener(inputTextField));
		helveticaButton.addActionListener(new helveticaListener(inputTextField));
		courierButton.addActionListener(new courierListener(inputTextField));
		okButton.addActionListener(new okListener(inputTextField));
		
		panel2.add(timesButton);
		panel2.add(helveticaButton);
		panel2.add(courierButton);
		
		pane.add(panel1);
		pane.add(panel2);
		pane.add(inputTextField);
		pane.add(okButton);
		
		window.pack();
		window.setVisible(true);
	}
}