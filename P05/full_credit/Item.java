public class Item{
	
	String name;
	String description;
	int cost;
	int price;

	public Item(String name, String description, int cost, int price){
		this.name = name;
		this.description = description;
		this.cost = cost;
		this.price = price;
	}

	public String name(){
		return name;
	}

	public String description(){
		return description;
	}

	public int price(){
		return price;
	}

	public int cost(){
		return cost;
	}

	@Override
	public String toString(){
		return name;
	}
}