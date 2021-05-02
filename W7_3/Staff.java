package W7_3;

public class Staff {
	StaffMember[] staffList;
	
	public Staff() {
		staffList = new StaffMember[8];
		
		staffList[0] = new Executive ("Sam", "123 Main Line",
			"555-0469", "123-45-6789", 2423.07);
		
		staffList[1] = new Employee ("Carla", "456 Off Line",
			"555-0101", "987-65-4321", 1246.15);
		
		staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", 
				"010-20-3040", 1169.23);
				
		staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", 
				"958-47-3625", 10.55);
				
		staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
				
		staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");
		
		staffList[6] = new Commision("Christopher", "321 Ausstreet", "555-1560",
				"275-12-9643", 6.25, 0.2);
		
		staffList[7] = new Commision("Felix", "696 Ausstreet", "555-8765",
				"567-89-1234", 9.75, 0.15);
		
		((Executive)staffList[0]) .awardBonus(500.00);
		((Hourly)staffList[3]) .addHours(40);	
	}
	
	public void payday() {
		double amount;
		
		for(int count=0; count < staffList.length; count++) {
			System.out.println(staffList[count]);
			amount = staffList[count] .pay(); //polymorphic
			
			if (amount == 0.0)
				System.out.println("Thanks");
			else
				System.out.println("Paid: " +amount);
			
			System.out.println ("----------------------------------------------");
		}
	}
}