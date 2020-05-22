import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

public class Reading12 implements ActionListener {
	
	public static String r12 = "";


	Reading12() {

		JFrame f = new JFrame("LING270 Experiment");
		String s = "A girl scout calls you to ask for donations. You say: ";
				
		JButton b1 = new JButton("기부금을 허 거야. gibugeumeul heo geoya.");
		JButton b5 = new JButton("기부금을 허 거예요. gibugeumeul heo geoyeyo.");
		JButton b9 = new JButton("기부금을 허 거다. gibugeumeul heo geoda.");
		JButton b2 = new JButton("기부금을 허 겁니다. gibugeumeul heo geomnida.");
		JButton b3 = new JButton("기부금을 헐 거야. gibugeumeul heol geoya.");
		JButton b4 = new JButton("기부금을 헐 거예요. gibugeumeul heol geoyeyo.");
		JButton b6 = new JButton("기부금을 헐 거다. gibugeumeul heol geoda.");
		JButton b7 = new JButton("기부금을 헐 겁니다. gibugeumeul heol geomnida.");
		JButton b8 = new JButton("I don't know");
		JPanel panel = new JPanel();
		JTextArea textArea = new JTextArea(2, 40);
		textArea.setText(s);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setOpaque(false);
		textArea.setEditable(false);
		textArea.setFocusable(false);
		Font font1 = new Font("Garamond", Font.PLAIN, 20);
		
		textArea.setFont(font1);
		
		
		f.setSize(1000, 1000);
		
		
		panel.setSize(400, 400);
		panel.setLocation(550, 200);
		
		panel.add(textArea);
		panel.add(Box.createHorizontalStrut(200));
		panel.add(Box.createVerticalStrut(100));
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);		
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		
		
		f.add(panel); 
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r12 = "b1: 기부금을 허 거야. gibugeumeul heo geoya.";
				new AudioInstructions();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r12 = "b2: 기부금을 허 겁니다. gibugeumeul heo geomnida.";
				new AudioInstructions();
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r12 = "b3: 기부금을 헐 거야. gibugeumeul heol geoya.";
				new AudioInstructions();
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r12 = "b4: 기부금을 헐 거예요. gibugeumeul heol geoyeyo.";
				new AudioInstructions();
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r12 = "b5: 기부금을 허 거예요. gibugeumeul heo geoyeyo.";
				new AudioInstructions();
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r12 = "b6: 기부금을 헐 거다. gibugeumeul heol geoda.";
				new AudioInstructions();
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r12 = "기부금을 헐 겁니다. gibugeumeul heol geomnida.";
				new AudioInstructions();
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r12 = "I don't know";
				new AudioInstructions();
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r12 = "기부금을 허 거다. gibugeumeul heo geoda.";
				new AudioInstructions();
			}
		});

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		System.out.println(comStr + " Selected");
		
	}



}
