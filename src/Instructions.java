import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

public class Instructions implements ActionListener {
	Instructions() {

		JFrame f = new JFrame("LING270 Experiment");
		
		
		String s = "Korea has always been obsessed with the "
				+ "latest food trends and honestly just trends in general. "
				+ "The most recent food trend has been Honey Butter " +
				"(허니버터)."
				+ " You can eat Honey Butter potato chips, Honey Butter almonds, "
				+ "even Honey Butter Kimchi! This new food has become so ubiquitous "
				+ "that the Korean government has decided to make 허다 (Heo Da) a new Korean word, meaning"
				+ " roughly 'to give' since Koreans always want to give others 허니버터. "
				+ "Your job, as Korea's one and only illustrious ambassador of Korean language and culture,"
				+ " is to conjugate this new verb to the"
				+ " best of your ability in each given scenario. 파이팅!";
				
		JTextArea textArea = new JTextArea(2, 20);
		textArea.setText(s);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setOpaque(false);
		textArea.setEditable(false);
		textArea.setFocusable(false);
		
		JButton n = new JButton("Continue");
		JPanel panel = new JPanel();
		Font font1 = new Font("Garamond", Font.PLAIN, 30);
		
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
				new Reading1();
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
