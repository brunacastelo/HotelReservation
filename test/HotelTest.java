import org.junit.Test;
import static org.junit.Assert.*;

import java.util.NoSuchElementException;

public class HotelTest {

	Lakewood lakewoodHotel;
	Bridgewood bridgewoodHotel;
	Ridgewood ridgewoodHotel;
	
	@Test(expected=NoSuchElementException.class)
	public void InvalidTypeClient() {
		lakewoodHotel = new Lakewood();
		String commonClientType = "Common";
		lakewoodHotel.valueDaily(1, 4, commonClientType);
	}
	
	@Test
	public void typeClientRegular() {	
		String regularClientType = "Regular";
		
		lakewoodHotel = new Lakewood();
		Double dailyLakewood = lakewoodHotel.valueDaily(1, 4, regularClientType);
		
		bridgewoodHotel = new Bridgewood();
		Double dailyBridgewood = bridgewoodHotel.valueDaily(1, 4, regularClientType);
		
		ridgewoodHotel = new Ridgewood();
		Double dailyRidgewood = ridgewoodHotel.valueDaily(1, 4, regularClientType);
		
		assertEquals(470.0, dailyLakewood, 0.01);
		assertEquals(400.0, dailyBridgewood, 0.01);
		assertEquals(820.0, dailyRidgewood, 0.01);
	}
	
	@Test
	public void typeClientRewards() {	
		String regularClientType = "Rewards";
		
		lakewoodHotel = new Lakewood();
		Double dailyLakewood = lakewoodHotel.valueDaily(1, 4, regularClientType);
		
		bridgewoodHotel = new Bridgewood();
		Double dailyBridgewood = bridgewoodHotel.valueDaily(1, 4, regularClientType);
		
		ridgewoodHotel = new Ridgewood();
		Double dailyRidgewood = ridgewoodHotel.valueDaily(1, 4, regularClientType);
		
		assertEquals(400.0, dailyLakewood, 0.01);
		assertEquals(310.0, dailyBridgewood, 0.01);
		assertEquals(260.0, dailyRidgewood, 0.01);
	}

}
