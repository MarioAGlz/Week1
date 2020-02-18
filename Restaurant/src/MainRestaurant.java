
public class MainRestaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Table t1 = new Table(10);
		Table t2 = new Table(85);
		Table t3 = new Table(74);
		Table t4 = new Table(93);
		
		System.out.println("t1 is number "+t1.tableNum);
		System.out.println("t2 is number "+t2.tableNum);
		System.out.println("t3 is number "+t3.tableNum);
		System.out.println("t4 is number "+t4.tableNum);
		
		Customer c1 = new Customer("Mark", "mark@mail.com");
		Customer c2 = new Customer("Ken", "ken@mail.com");
		Customer c3 = new Customer("Greg", "greg@mail.com");
		
		boolean succesfulBooking = t1.booked(c1);
		if(succesfulBooking) {
			System.out.println();
		}
		
		t2.booked(c3);
		//t3.booked(c2);
		t4.booked(c2);
		
		t1.isBooked();
		t2.isBooked();
		t3.isBooked();
		t4.isBooked();
		
	}

}
