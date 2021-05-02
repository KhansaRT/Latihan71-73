package W7_3;

public class Employee extends StaffMember{
	protected String socialSecurityNumber;
	protected double payRAte;
	
	public Employee(String eName, String eAddress, String ePhone,
			        String socSecNumber, double rate) {
		super(eName, eAddress, ePhone);
		
		socialSecurityNumber = socSecNumber;
		payRAte = rate;
	}
	@Override
	public String toString() {
		String result = super.toString();
		result += "\nSocial Security Number; " +socialSecurityNumber;
		
		return result;
	}

	public double pay() {
		return payRAte;
	}
}