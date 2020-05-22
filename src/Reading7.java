import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

public class Reading7 implements ActionListener {
	
	public static String r7 = "";


	Reading7() {

		JFrame f = new JFrame("LING270 Experiment");
		String s = "Your hallmate is a die-hard BTS fan. You want to borrow his/her BTS "
				+ "hat since you are secretly a BTS fan. You say: ";
				
		JButton b1 = new JButton("모자를 허. mojareul heo.");
		JButton b2 = new JButton("모자를 허요. mojareul heoyo.");
		JButton b3 = new JButton("모자를 허라. mojareul heora.");
		JButton b5 = new JButton("모자를 허십시오. mojareul heoshipshioh.");
		JButton b4 = new JButton("모자를 훠. mojareul hwo.");
		JButton b7 = new JButton("모자를 허세요. mojareul hwoseyo.");
		JButton b6 = new JButton("모자를 훕어라. mojareul hubeora.");
		JButton b9 = new JButton("모자를 훕으십시오. mojareul hubeushibshioh.");
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
				r7 = "모자를 허. mojareul heo.";
				new Reading8();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r7 = "b2: 모자를 허요. mojareul heoyo.";
				new Reading8();
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r7 = "b3: 모자를 허라. mojareul heora.";
				new Reading8();
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r7 = "b4: 모자를 훠. mojareul hwo.";
				new Reading8();
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r7 = "b5: 모자를 허십시오. mojareul heoshipshioh.";
				new Reading8();
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r7 = "b6: 모자를 훕어라. mojareul hubeora.";
				new Reading8();
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r7 = "b7: 모자를 허세요요. mojareul hwoseyo.";
				new Reading8();
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r7 = "b8: I don't know";
				new Reading8();
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r7 = "b9: 모자를 훕으십시오. mojareul hubeushibshioh.";
				new Reading8();
			}
		});
		

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		System.out.println(comStr + " Selected");
	}



}
