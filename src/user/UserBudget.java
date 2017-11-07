package user;

public class UserBudget {

	private static double budget = 350000000;
	
	private double orderCount;

	private double finalPrice;
	
	@SuppressWarnings("unused")
	private double currentBudget;

	public static double getBudget() {
		return budget;
	}

	public static void setBudget(double budget) {
		UserBudget.budget = budget;
	}

	public double getCurrentBudget() {
		return budget;
	}

	public double getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(double orderCount) {
		this.orderCount = orderCount;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

}
