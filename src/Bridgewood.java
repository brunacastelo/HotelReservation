
public class Bridgewood implements Hotel{

	final String name = "Bridgewood";
	final double dailyRegular = 160.00;
	final double dailyRewards = 110.00;
	final double rateWeekendRegular = 60.00;
	final double rateWeekendRewards = 50.00;
	final int classification = 4;
	private double totalDaily;

	public String getName() {
		return name;
	}
	
	public double getDailyRegular() {
		return dailyRegular;
	}

	public double getDailyRewards() {
		return dailyRewards;
	}
	
	public double getRateWeekendRegular() {
		return rateWeekendRegular;
	}
	
	public double getRateWeekendRewards() {
		return rateWeekendRewards;
	}
	
	public int getClassification() {
		return classification;
	}

	public void setTotalDaily(double totalDaily) {
		this.totalDaily = totalDaily;
	}	
	
	public double getTotalDaily() {
		return totalDaily;
	}

}
