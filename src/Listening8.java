import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

import javax.swing.*;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



public class Listening8 implements ActionListener {
	
	public static String l8 = "";
	public static final String AUDIO1 =  "/Users/hansoochang/eclipse-workspace/LING270Survey/mp3files/L8-5/L8-1.wav";
	public static final String AUDIO2 =  "/Users/hansoochang/eclipse-workspace/LING270Survey/mp3files/L8-5/L8-2.wav";
	public static final String AUDIO3 =  "/Users/hansoochang/eclipse-workspace/LING270Survey/mp3files/L8-5/L8-3.wav";
	public static final String AUDIO4 =  "/Users/hansoochang/eclipse-workspace/LING270Survey/mp3files/L8-5/L8-4.wav";
	public static final String AUDIO5 =  "/Users/hansoochang/eclipse-workspace/LING270Survey/mp3files/L8-5/L8-5.wav";
	public static final String AUDIO6 =  "/Users/hansoochang/eclipse-workspace/LING270Survey/mp3files/L8-5/L8-6.wav";
	public static final String AUDIO7 =  "/Users/hansoochang/eclipse-workspace/LING270Survey/mp3files/L8-5/L8-7.wav";
	public static final String AUDIO8 =  "/Users/hansoochang/eclipse-workspace/LING270Survey/mp3files/L8-5/L8-8.wav"; 
	
	AudioPlayer MusicObject = new AudioPlayer();


	Listening8() {

		JFrame f = new JFrame("LING270 Experiment");
		String s = "Your boss has your coffee. You say: ";
				
		JButton b1 = new JButton("Play audio 1");
		JButton b2 = new JButton("Play audio 2");
		JButton b3 = new JButton("Play audio 3");
		JButton b4 = new JButton("Play audio 4");
		JButton b5 = new JButton("Play audio 5");
		JButton b6 = new JButton("Play audio 6");
		JButton b7 = new JButton("Play audio 7");
		JButton b8 = new JButton("Play audio 8");
		
		JButton b11 = new JButton("Choose: 1");
		JButton b22 = new JButton("Choose: 2");
		JButton b33 = new JButton("Choose: 3");
		JButton b44 = new JButton("Choose: 4");
		JButton b55 = new JButton("Choose: 5");
		JButton b66 = new JButton("Choose: 6");
		JButton b77 = new JButton("Choose: 7");
		JButton b88 = new JButton("Choose: 8");
		
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
		
		panel.add(b11);
		panel.add(b22);
		panel.add(b33);
		panel.add(b44);
		panel.add(b55);		
		panel.add(b66);
		panel.add(b77);
		panel.add(b88);
		
		panel.add(Box.createHorizontalStrut(150));
		panel.add(Box.createVerticalStrut(100));
		
		panel.add(b9);
		
		
		f.add(panel); 
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				MusicObject.playMusic(AUDIO1);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				MusicObject.playMusic(AUDIO2);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				MusicObject.playMusic(AUDIO3);
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				MusicObject.playMusic(AUDIO4);
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				MusicObject.playMusic(AUDIO5);
			}
		});
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				MusicObject.playMusic(AUDIO6);
			}
		});
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				MusicObject.playMusic(AUDIO7);
			}
		});
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				MusicObject.playMusic(AUDIO8);
			}
		});
		
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l8 = "b1: 커피를 허.";
				new Finish();
			}
		});
		
		b22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l8 = "b2: 커피를 허요.";
				new Finish();
			}
		});
		
		b33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l8 = "b3: 커피를 허라.";
				new Finish();
			}
		});
		b44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l8 = "b4: 커피를 허십시오.";
				new Finish();
			}
		});
		b55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l8 = "b5: 커피를 훠.";
				new Finish();
			}
		});
		b66.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l8 = "b6: 커피를 허세요.";
				new Finish();
			}
		});
		b77.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l8 = "b7: 커피를 훕어라.";
				new Finish();
			}
		});
		b88.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l8 = "b8: 커피를 훕으십시오.";
				new Finish();
			}
		});
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				l8 = "I don't know";
				new Finish();
			}
		});

		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String comStr = ae.getActionCommand();
		System.out.println(comStr + " Selected");
		
	}
	
	public static void main(String args[]) {
		new Listening8();
	}

}
