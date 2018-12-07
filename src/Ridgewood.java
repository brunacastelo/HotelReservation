
public class Ridgewood implements Hotel{

	final String name = "Ridgewood";
	final double dailyRegular = 220.00;
	final double dailyRewards = 100.00;
	final double rateWeekendRegular = 150.00;
	final double rateWeekendRewards = 40.00;
	final int classification = 5;
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
