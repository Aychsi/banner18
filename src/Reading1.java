import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

public class Reading1 implements ActionListener {
	
	public static String r1 = "";

	Reading1() {

		JFrame f = new JFrame("LING270 Experiment");
		String s = "There is an elderly man sitting on the bench. The sun is strong and"
				+ " you want to give the man sunglasses. You ask: ";
		JButton b1 = new JButton("선글라스 허? Seongeullaseu heo?");
		JButton b2 = new JButton("선글라스 허요? Seongeullaseu heoyo?");
		JButton b3 = new JButton("선글라스 허니? Seongeullaseu heoni?");
		JButton b4 = new JButton("선글라스 허니까? Seongeullaseu heonikka?");
		JButton b5 = new JButton("선글라스 훠? Seongeullaseu hwo?");
		JButton b6 = new JButton("선글라스 훠요? seongeullaseu hwoyo?");
		JButton b7 = new JButton("선글라스 훕니까? seongeullaseu humnikka");
		JButton b8 = new JButton("선글라스 훕니? seongeullaseu humni?");
		JButton b9 = new JButton("I don't know");
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
				r1 = "b1: 선글라스 허? Seongeullaseu heo?";
				new Reading2();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r1 = "b2: 선글라스 허요? Seongeullaseu heoyo?";
				new Reading2();
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r1 = "b3: 선글라스 허니? Seongeullaseu heoni?";
				new Reading2();
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r1 = "b4: 선글라스 허니까? Seongeullaseu heonikka?";
				new Reading2();
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r1 = "b5: 선글라스 훠? Seongeullaseu hwo?";
				new Reading2();
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r1 = "b6: 선글라스 훠요? seongeullaseu hwoyo?";
				new Reading2();
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r1 = "b7: 선글라스 훕니까? seongeullaseu humnikka";
				new Reading2();
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r1 = "b8: 선글라스 훕니? seongeullaseu humni?";
				new Reading2();
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r1 = "I don't know";
				new Reading2();
			}
		});
		

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		System.out.println(comStr + " Selected");
	}

}
