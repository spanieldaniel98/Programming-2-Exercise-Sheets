import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q1GUI extends JFrame {
	
	String title;
	int count = 0;

	public Q1GUI(String title) {
		super(title);
	}
	
	class incrementListener implements ActionListener {
		
		JTextField output;
		
		public incrementListener(JTextField output) {
			this.output = output;
		}
		
		public void actionPerformed(ActionEvent e) {
			count++;
			if(count == 1) {
				output.setText("The increment button has been pressed 1 time since the reset button was last pressed.");
			}
			else {
				output.setText("The increment button has been pressed " + count + " times since the reset button was last pressed.");
			}
		}
	}
	
	class resetListener implements ActionListener {
		
		JTextField output;
		
		public resetListener(JTextField output) {
			this.output = output;
		}
		
		public void actionPerformed(ActionEvent e) {
			count = 0;
			output.setText("The increment button has been pressed 0 times since the reset button was last pressed.");
		}
	}
	
	void init() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
	    this.setSize(250,100);
	    
	    Container pane = this.getContentPane();
		pane.setLayout(new FlowLayout());
		JButton incrementButton = new JButton("Increment");
		JButton resetButton = new JButton("Reset");
		JTextField outputField = new JTextField(50);
		
		incrementButton.addActionListener(new incrementListener(outputField));
		resetButton.addActionListener(new resetListener(outputField));
		
		pane.add(incrementButton);
		pane.add(resetButton);
		pane.add(outputField);
		
		this.pack();
		this.setVisible(true);
	}
}
