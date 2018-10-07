import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javafx.scene.layout.Pane;

public class Q3GUI extends JFrame {
	
	String title;

	public Q3GUI(String title) {
		super(title);
	}
	
	void init() {
		
		JFrame window = new JFrame("Mouse Listening Program");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setSize(1000,700);
	    
	    Container pane = window.getContentPane();
		pane.setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(0, 0, 100, 100);
		panel1.setBackground(Color.black);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel1.setBounds(1, 1, 200, 200);
		panel2.setBackground(Color.blue);
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(2, 3, 150, 100);
		panel3.setBackground(Color.red);
		
		JLabel panelPosition = new JLabel("Current mouse position: not in any panels");
		
		panel1.addMouseListener(new panelMouseListener(panelPosition));
		panel2.addMouseListener(new panelMouseListener(panelPosition));
		panel3.addMouseListener(new panelMouseListener(panelPosition));
		
		pane.add(panel1);
		pane.add(panel2);
		pane.add(panel3);
		pane.add(panelPosition);
		
		window.setVisible(true);
	}
}