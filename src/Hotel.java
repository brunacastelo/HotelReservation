import java.util.NoSuchElementException;

public interface Hotel extends Comparable<Hotel>, Cloneable {

	public String getName();

	public double getDailyRegular();

	public double getDailyRewards();

	public double getRateWeekendRegular();

	public double getRateWeekendRewards();

	public int getClassification();

	public void setTotalDaily(double totalDaily);

	public double getTotalDaily();

	public default double valueDaily(int daysWeek, int daysWeekend, String typeClient) {
		double totalDaily;
		if (typeClient.equals("Regular")) {
			totalDaily = daysWeek * this.getDailyRegular() + daysWeekend * this.getRateWeekendRegular();
			setTotalDaily(totalDaily);
			return totalDaily;
		} else if (typeClient.equals("Rewards")) {
			totalDaily = daysWeek * this.getDailyRewards() + daysWeekend * this.getRateWeekendRewards();
			setTotalDaily(totalDaily);
			return totalDaily;
		} else {
			throw new NoSuchElementException("Input invalid: Client must be Regular or Rewars");
		}
	}

	public default int compareTo(Hotel hotel) {
		if (hotel == null || this.getTotalDaily() < hotel.getTotalDaily()) {
			return -1;
		} else if (this.getTotalDaily() > hotel.getTotalDaily()) {
			return 1;
		} else {
			if (this.getClassification() < hotel.getClassification()) {
				return 1;
			} else if (this.getClassification() > hotel.getClassification()) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}
