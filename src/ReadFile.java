import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadFile {

	int countWeek, countWeekend;
	final String[] week = {"mon", "tues", "wed", "thur", "fri"};
	final String[] weekend = {"sat", "sun"};
	String typeCliente; 
	
	public ReadFile(String path, String filename) throws FileNotFoundException {

		FileReader file = null;
		try {
			file = new FileReader(path + filename);
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("Could not find file: " + filename);
		}

		BufferedReader reader = new BufferedReader(file);
		try {
			String row = reader.readLine();
			if(row != null){		
				String[] info = row.split(":");
				typeCliente = info[0];
				String[] days = info[1].split(",");
				countDays(days);
			} else {
				throw new IllegalStateException("File '" + filename + "' is empty"); 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void countDays(String[] days) {
		for (String day : days) {
			try{
				String dateInput = day.substring(day.indexOf("(")+1, day.lastIndexOf(")"));			
				if(Arrays.asList(week).contains(dateInput)){
					countWeek ++;
				} else if(Arrays.asList(weekend).contains(dateInput)){
					countWeekend ++;
				} else {
					throw new StringIndexOutOfBoundsException("Input Invalid");
				}
			} catch (StringIndexOutOfBoundsException e){
				throw new StringIndexOutOfBoundsException("Input Invalid"); 
			}
		}
	}

}
