import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReadFileTest {

	ReadFile readFile;
	
	@Test(expected=Exception.class)
	public void testFileNotExist() throws FileNotFoundException {
		readFile = new ReadFile("E:\\workspace\\tw\\HotelReservation\\", "fileNotExist.txt");
	}
	
	@Test(expected=Exception.class)
	public void testFileEmpty() throws FileNotFoundException {
		readFile = new ReadFile("E:\\workspace\\tw\\HotelReservation\\", "file.txt");
	}
	
	@Test(expected=Exception.class)
	public void testInputInvalid() throws FileNotFoundException {
		readFile = new ReadFile("E:\\workspace\\tw\\HotelReservation\\", "fileInvalid.txt");
	}
}
