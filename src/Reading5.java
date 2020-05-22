import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

public class Reading5 implements ActionListener {
	
	public static String r5 = "";


	Reading5() {

		JFrame f = new JFrame("LING270 Experiment");
		String s = "Your boss has your mug. You want it back. You say: ";
				
		JButton b9 = new JButton("컵을 허. keobeul heo.");
		JButton b8 = new JButton("컵을 허요. keobeul heoyo.");
		JButton b7 = new JButton("컵을 허라. keobeul heora.");
		JButton b6 = new JButton("컵을 허십시오. keobeul heoshipshioh.");
		JButton b5 = new JButton("컵을 훠. keobeul hwo.");
		JButton b4 = new JButton("컵을 허세요. keobeul hwoseyo.");
		JButton b3 = new JButton("컵을 훕어라. keobeul hubeora.");
		JButton b1 = new JButton("컵을 훕으십시오. keobeul hubeushibshioh.");
		JButton b2 = new JButton("I don't know");
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
				r5 = "b1: 컵을 훕으십시오. keobeul hubeushibshioh.";
				new Reading6();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r5 = "I don't know";
				new Reading6();
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r5 = "b3: 컵을 훕어라. keobeul hubeora.";
				new Reading6();
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r5 = "b4: 컵을 허세요. keobeul hwoseyo.";
				new Reading6();
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r5 = "b5: 컵을 훠. keobeul hwo.";
				new Reading6();
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r5 = "b6: 컵을 허십시오. keobeul heoshipshioh.";
				new Reading6();
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r5 = "b7: 컵을 허라. keobeul heora.";
				new Reading6();
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r5 = "b8: 컵을 허요. keobeul heoyo.";
				new Reading6();
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r5 = "b9: 컵을 허. keobeul heo.";
				new Reading6();
			}
		});
		

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		System.out.println(comStr + " Selected");
	}



}
