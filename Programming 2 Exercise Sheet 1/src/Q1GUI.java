import javax.swing.*;
import java.awt.*;

public class Q1GUI {
	
	public Q1GUI() {
		
		JFrame window = new JFrame("Simple Submit Cancel Form");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
	    window.setSize(250,100);
	    
	    Container pane = window.getContentPane();
		pane.setLayout(new FlowLayout());
		JTextField textField = new JTextField(20);
		JButton submitButton = new JButton("Submit");
		JButton cancelButton = new JButton("Cancel");
		JTextField outputField = new JTextField(30);
		
		pane.add(submitButton);
		pane.add(cancelButton);
		pane.add(outputField);
		
		window.setVisible(true);
	}
}