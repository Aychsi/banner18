import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Formatter;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

public class Finish implements ActionListener {
	Finish() {
		
		SurveyWrite g = new SurveyWrite();

		JFrame f = new JFrame("LING270 Experiment");
		
		
		String s = "This is the end of the experiment. Thank you for your participation. Please "
				+ "press 'Save and Finish' to record your responses.";
				
		JTextArea textArea = new JTextArea(2, 20);
		textArea.setText(s);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setOpaque(false);
		textArea.setEditable(false);
		textArea.setFocusable(false);
		
		JButton n = new JButton("Save and Finish");
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
				g.openFile();
				g.addResults();
				g.closeFile();
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
