import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

public class Reading6 implements ActionListener {
	
	public static String r6 = "";


	Reading6() {

		JFrame f = new JFrame("LING270 Experiment");
		String s = "Your annoying little brother stole your sock for fun. You want it back. "
				+ " You say: ";
				
		JButton b6 = new JButton("양말을 허. yangmareul heo.");
		JButton b8 = new JButton("양말을 허요. yangmareul heoyo.");
		JButton b9 = new JButton("양말을 허라. yangmareul heora.");
		JButton b7 = new JButton("양말을 허십시오. yangmareul heoshipshioh.");
		JButton b5 = new JButton("양말을 훠. yangmareul hwo.");
		JButton b4 = new JButton("양말을 허세요. yangmareul hwoseyo.");
		JButton b3 = new JButton("양말을 훕어라. yangmareul hubeora.");
		JButton b2 = new JButton("양말을 훕으십시오. yangmareul hubeushibshioh.");
		JButton b1 = new JButton("I don't know");
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
				r6 = "I don't know";
				new Reading7();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r6 = "b2: 양말을 훕으십시오. yangmareul hubeushibshioh.";
				new Reading7();
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r6 = "b3: 양말을 훕어라. yangmareul hubeora.";
				new Reading7();
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r6 = "b4: 양말을 허세요. yangmareul hwoseyo.";
				new Reading7();
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r6 = "b5: 양말을 훠. yangmareul hwo.";
				new Reading7();
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r6 = "b6: 양말을 허. yangmareul heo.";
				new Reading7();
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r6 = "b7: 양말을 허십시오. yangmareul heoshipshioh.";
				new Reading7();
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r6 = "b8: 양말을 허요. yangmareul heoyo.";
				new Reading7();
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r6 = "b9: 양말을 허라. yangmareul heora.";
				new Reading7();
			}
		});
		

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		System.out.println(comStr + " Selected");
	}



}
