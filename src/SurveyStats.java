import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class SurveyStats {
	
	
	public static String readFile(String fileName) {
		
		String line;
        String collect = "";
        int count = 0;
        
		 try {
	            FileReader reader = new FileReader(fileName);
	            BufferedReader bufferedReader = new BufferedReader(reader);
	
	 
	            while ((line = bufferedReader.readLine()) != null) {
	            	count++;
	            	
	            	// show only the top 8 scores
	            	if (count > 8) {
	            		bufferedReader.close();
	    	            reader.close();
	    	            break;
	            	}
	                collect += line + "\n";
	            }
	            bufferedReader.close();
	            reader.close();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 return collect;
	}
	
	public static void writeFile(String fileName) {
		try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(UserInput.name + " " + UserInput.age + " " + UserInput.prof + " " + 
            UserInput.gender + " " + UserInput.read);
            writer.write(Reading1.r1);
            writer.write(Reading2.r2);
            writer.write(Reading3.r3);
            writer.write(Reading4.r4);
            writer.write(Reading5.r5);
            writer.write(Reading6.r6);
            writer.write(Reading7.r7);
            writer.write(Reading8.r8);
            writer.write(Reading9.r9);
            writer.write(Reading10.r10);
            writer.write(Reading11.r11);
            writer.write(Reading12.r12);
            writer.write(System.getProperty( "line.separator" ));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
 
} 
