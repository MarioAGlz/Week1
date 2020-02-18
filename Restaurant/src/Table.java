
public class Table {

	public int tableNum;
	public int capacity;
	public String area;
	public boolean available;
	public Customer bookedBy;
	
	public Table(int tableNum) {
		System.out.println("-- A table is Created --");
		available = true;
		this.tableNum = tableNum;
	}
	
	public boolean booked(Customer customer) {
		if(available) {
			this.bookedBy = customer;
			available = false;
			return true;
		} else {
			return false; 
		}
	}
	
	public void isBooked() {
		if(!available) {
			System.out.println("Table "+tableNum+" is booked by " + bookedBy.name);
		} else {
			System.out.println("Table "+tableNum+" is free");
		}
	}
	

	
	public void area(String area) {
		System.out.println(area);
	}
	
	public void seats(int tnum) {
		System.out.println();
		
	}
}
