import java.util.*;

public class MyPets{
	
	public static void main(String[] args) {
		
		ArrayList<Pet> pets = new ArrayList<Pet>();

		pets.add(new Pet("Celestia", 23, Type.UNICORN));


		for(Pet i : pets){
			System.out.println(i.toString());
		}


	}
}