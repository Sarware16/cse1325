public class Server extends Person{
	
	int salary;
	int numOrders;

	public Server(String name, int id, String phone, boolean active){
		super(name, id, phone, active);
		this.salary = salary;
		this.numOrders = numOrders;
	}

	public void setSalary(int salary);

	public int payServer(){
		return salary;
	}

	public void restock();

}