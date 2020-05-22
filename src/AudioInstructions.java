import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

public class AudioInstructions implements ActionListener {
	AudioInstructions() {

		JFrame f = new JFrame("LING270 Experiment");
		
		
		String s = "You will now be asked to choose the audio clip that best answers the question. "
				+ "Press 'Play Audio x' "
				+ "to hear the audio clip. Press 'Choose: x' to select the audio clip you think "
				+ "is right. Once you Press 'Choose: x' you cannot go back, so please be careful"
				+ " in choosing what you think is the best response to the question.";
				
		JTextArea textArea = new JTextArea(2, 20);
		textArea.setText(s);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setOpaque(false);
		textArea.setEditable(false);
		textArea.setFocusable(false);
		
		JButton n = new JButton("Continue");
		JPanel panel = new JPanel();
		Font font1 = new Font("Garamond", Font.PLAIN, 50);
		
		textArea.setFont(font1);
		
		f.setSize(1000, 1000);
		
		panel.setSize(400, 400);
		panel.setLocation(550, 200);
		n.setBounds(50, 50, 10, 10);
		
		panel.add(textArea);
		panel.add(n);
		f.add(panel); 
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		n.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new Listening1();
			}
		});
		;

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		System.out.println(comStr + " Selected");

	}
	

}
