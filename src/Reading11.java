import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

public class Reading11 implements ActionListener {
	
	public static String r11 = "";


	Reading11() {

		JFrame f = new JFrame("LING270 Experiment");
		String s = "Your owe your friend money. You say to your friend: ";
				
		JButton b2 = new JButton("돈을 허 거야. doneul heo geoya.");
		JButton b4 = new JButton("돈을 허 거예요. doneul heo geoyeyo.");
		JButton b6 = new JButton("돈을 허 거다. doneul heo geoda.");
		JButton b8 = new JButton("돈을 허 겁니다. doneul heo geomnida.");
		JButton b1 = new JButton("돈을 헐 거야. doneul heol geoya.");
		JButton b3 = new JButton("돈을 헐 거예요. doneul heol geoyeyo.");
		JButton b5 = new JButton("돈을 헐 거다. doneul heol geoda.");
		JButton b7 = new JButton("돈을 헐 겁니다. doneul heol geomnida.");
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
				r11 = "b1: 돈을 헐 거야. doneul heol geoya.";
				new Reading12();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r11 = "b2: 돈을 허 거야. doneul heo geoya.";
				new Reading12();
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r11 = "b3: 돈을 헐 거예요. doneul heol geoyeyo.";
				new Reading12();
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r11 = "b4: 돈을 허 거예요. doneul heo geoyeyo.";
				new Reading12();
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r11 = "b5: 돈을 헐 거다. doneul heol geoda.";
				new Reading12();
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r11 = "b6: 돈을 허 거다. doneul heo geoda.";
				new Reading12();
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r11 = "돈을 헐 겁니다. doneul heol geomnida.";
				new Reading12();
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r11 = "b8: 돈을 허 겁니다. doneul heo geomnida.";
				new Reading12();
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				r11 = "I don't know";
				new Reading12();
			}
		});
		

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		System.out.println(comStr + " Selected");
	}



}
