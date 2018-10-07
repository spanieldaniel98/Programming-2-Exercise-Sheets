import javax.swing.*;
import java.awt.*;

public class Q4GUI {

	public Q4GUI() {
		
		JFrame window = new JFrame("MP3 Player");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
	    window.setSize(900,200);
		
	    Container pane = window.getContentPane();
	    GridBagLayout gridbag = new GridBagLayout();
	    pane.setLayout(gridbag);
	    pane.setBackground(Color.BLACK);
	    GridBagConstraints c = new GridBagConstraints();
	    
	    
	    JPanel panel1= new JPanel();
	    JLabel titleLabel = new JLabel("MP3 Player");
	    titleLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
	    panel1.add(titleLabel);
	    
	    
		JPanel panel2 = new JPanel();
		JLabel imgLabel = new JLabel(new ImageIcon(getClass().getResource("headphones.png")));
		panel2.add(imgLabel);
		
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		
		JLabel artistLabel = new JLabel("Select Artist");
		String[] artistStrings = new String[] { "Artist1", "Artist2", "Artist3" };
		JComboBox<String> artistList = new JComboBox<>(artistStrings);
		artistList.setSelectedIndex(0);
		
		JLabel trackLabel = new JLabel("Select Track");
		String[] trackStrings = new String[] { "Track1", "Track2", "Track3" };
		JComboBox<String> trackList = new JComboBox<>(trackStrings);
		trackList.setSelectedIndex(0);
		
		panel3.add(artistLabel);
		panel3.add(artistList);
		panel3.add(trackLabel);
		panel3.add(trackList);
		
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		
		JButton playButton = new JButton("Play");
		JButton pauseButton = new JButton("Pause");
		JButton stopButton = new JButton("Stop");
		
		buttonPanel.add(playButton);
		buttonPanel.add(pauseButton);
		buttonPanel.add(stopButton);
		
		
		JPanel panel4 = new JPanel();
		panel4.setLayout(new GridLayout(2,1));
		
		JSlider musicSlider = new JSlider(JSlider.HORIZONTAL, 0, 20, 0);
		musicSlider.setMajorTickSpacing(1);
		musicSlider.setPaintTicks(true);
		
		panel4.add(buttonPanel);
		panel4.add(musicSlider);
		
		c.gridx = 0;
	    c.gridy = 0;
	    c.gridwidth = 2;
		gridbag.setConstraints(panel1, c);
		pane.add(panel1);
		c.gridx = 0;
	    c.gridy = 1;
	    c.gridwidth = 2;
	    gridbag.setConstraints(panel2, c);
		pane.add(panel2);
		c.gridx = 0;
	    c.gridy = 2;
	    c.gridwidth = 2;
	    gridbag.setConstraints(panel3, c);
		pane.add(panel3);
		c.gridx = 3;
	    c.gridy = 2;
	    c.gridwidth = 0;
	    gridbag.setConstraints(panel4, c);
	    pane.add(Box.createRigidArea(new Dimension(30,30)));
		pane.add(panel4);

		window.pack();
		window.setVisible(true);
	}
}
