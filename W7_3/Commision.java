package W7_3;

public class Commision extends Hourly{
	double totalSales;
	double commisRate;
	
	public Commision (String eName, String eAddress, String ePhone, 
			          String socSecNumber, double rate, double comRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		commisRate = comRate;
	}
	
	public void addSales(double totalSales) {
		this.totalSales += totalSales;
	}
	
	public double pay() {
		double payment = super.pay() +totalSales*commisRate;
		totalSales = 0;
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nCurrent sales: " +totalSales;
		return result;
	}
}
