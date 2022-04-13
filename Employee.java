
public class Employee {
	
	public final double REGULAR_WAGE = 15;
	public final double EXTRA_WAGE = 16.5;
	
	public String name;
	public double hours;
	public double totalPay;
	
	public String getName() {
		return name;
	}
	public double getHours() {
		return hours;
	}
	public double getTotalPay() {
		return totalPay;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public void setTotalPay() {
		
		if(hours<=40) {
			totalPay = hours*REGULAR_WAGE;
		} else if(hours>40) {
			totalPay = (40*REGULAR_WAGE) + ((hours-40)*EXTRA_WAGE);
		}
		
	}
	
	
	
}
