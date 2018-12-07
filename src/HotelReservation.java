import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HotelReservation {

	public static void main(String[] args) throws FileNotFoundException {
		
		ReadFile read = new ReadFile(args[0], args[1]);
		
		String hotelReservation = execute (read);		
		System.out.println("Saída: " + hotelReservation);
	}
	
	private static String execute(ReadFile read) {
		
		List<Hotel> hotelsList = new ArrayList<Hotel>();		
		addHotelsTo(hotelsList);
		
		for (Hotel hotel : hotelsList) {
			hotel.valueDaily(read.countWeek, read.countWeekend, read.typeCliente);
		}
		
		sortHotels(hotelsList);
		
		return hotelsList.get(0).getName();
	}

	private static void addHotelsTo(List<Hotel> hotelsList) {
		hotelsList.add(new Lakewood());
		hotelsList.add(new Bridgewood());
		hotelsList.add(new Ridgewood());
	}
	
	private static void sortHotels(List<Hotel> hotelsList) {
		Collections.sort(hotelsList);
	}
}

