import java.io.*; 
import java.lang.*;
import java.util.*;

public class SurveyWrite {
	
	private Formatter x; 
	
	public void openFile() {
		
		try {
			x = new Formatter(UserInput.name);
		}
		catch(Exception e) {
			System.out.print("error");
		}
	}
	
	public void addResults() {
		x.format("%s", UserInput.name);
		x.format("%s", "\n");
		x.format("%s", UserInput.age);
		x.format("%s", "\n");
		x.format("%s", UserInput.prof);
		x.format("%s", "\n");
		x.format("%s", UserInput.gender);
		x.format("%s", "\n");
		x.format("%s", UserInput.read);
		x.format("%s", "\n");
		x.format("%s", Reading1.r1);
		x.format("%s", "\n");
		x.format("%s", Reading2.r2);
		x.format("%s", "\n");
		x.format("%s", Reading3.r3);
		x.format("%s", "\n");
		x.format("%s", Reading4.r4);
		x.format("%s", "\n");
		x.format("%s", Reading5.r5);
		x.format("%s", "\n");
		x.format("%s", Reading6.r6);
		x.format("%s", "\n");
		x.format("%s", Reading7.r7);
		x.format("%s", "\n");
		x.format("%s", Reading8.r8);
		x.format("%s", "\n");
		x.format("%s", Reading9.r9);
		x.format("%s", "\n");
		x.format("%s", Reading10.r10);
		x.format("%s", "\n");
		x.format("%s", Reading11.r11);
		x.format("%s", "\n");
		x.format("%s", Reading12.r12);
		
		x.format("%s", "\n");
		x.format("%s", Listening1.l1);
		x.format("%s", "\n");
		x.format("%s", Listening2.l2);
		x.format("%s", "\n");
		x.format("%s", Listening3.l3);
		x.format("%s", "\n");
		x.format("%s", Listening4.l4);
		x.format("%s", "\n");
		x.format("%s", Listening5.l5);
		x.format("%s", "\n");
		x.format("%s", Listening6.l6);
		x.format("%s", "\n");
		x.format("%s", Listening7.l7);
		x.format("%s", "\n");
		x.format("%s", Listening8.l8);
	}
	
	public void closeFile() {
		x.close();
	}
	
}