import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class AudioPlayer {
	
	void playMusic(String location) {
		
		try {
			File musicPath = new File(location);
			
			if (musicPath.exists()) {
				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				Clip clip = AudioSystem.getClip();
				clip.open(audioInput);
				clip.start();
				clip.loop(Clip.LOOP_CONTINUOUSLY);
				
				JOptionPane.showMessageDialog(null, "Press OK to stop playing");
				
				clip.stop();
				
			} else {
				System.out.print("Can't find file");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
