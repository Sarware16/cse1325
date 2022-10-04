import java.util.*;

public class TestScoop{
	public static ArrayList<IceCreamFlavor> flavors = new ArrayList<IceCreamFlavor>();
	public static ArrayList<MixInFlavor> mixins = new ArrayList<MixInFlavor>();
	public static ArrayList<Scoop> scoops = new ArrayList<Scoop>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userinput = "";
		
		

		while(!userinput.equals("q")){
			
			while(flavors.size()==0){
				System.out.print("Create new (m)ixin, (i)ce cream flavor, or (q)uit? ");
				userinput = input.nextLine();

				if(userinput.equals("i")){
					System.out.println("Creating new Ice Cream Flavor!");
					System.out.print("Name? ");
					String name = input.nextLine();
					System.out.print("Description? ");
					String description = input.nextLine();
					System.out.print("Price? ");
					int price  = input.nextInt();
					System.out.print("Cost? ");
					int cost = input.nextInt();
					input.nextLine();

					flavors.add(new IceCreamFlavor(name, description, cost, price));

				}

				if(userinput.equals("m")){
					System.out.println("Creating new MixIn Flavor!");
					System.out.print("Name? ");
					String name = input.nextLine();
					System.out.print("Description? ");
					String description = input.nextLine();
					System.out.print("Price? ");
					int price  = input.nextInt();
					System.out.print("Cost? ");
					int cost = input.nextInt();
					input.nextLine();

					mixins.add(new MixInFlavor(name, description, cost, price));

				}
				System.out.println();

				if(userinput.equals("q")){
					return;
				}
			}
			
				System.out.println("Create new (m)ixin, (i)ce cream flavor, (s)coop or (q)uit? ");
				userinput = input.nextLine();

				if(userinput.equals("i")){
					System.out.println("Creating new Ice Cream Flavor!");
					System.out.print("Name? ");
					String name = input.nextLine();
					System.out.print("Description? ");
					String description = input.nextLine();
					System.out.print("Price? ");
					int price  = input.nextInt();
					System.out.print("Cost? ");
					int cost = input.nextInt();
					input.nextLine();

					flavors.add(new IceCreamFlavor(name, description, cost, price));

				}

				if(userinput.equals("m")){
					System.out.println("Creating new MixIn Flavor!");
					System.out.print("Name? ");
					String name = input.nextLine();
					System.out.print("Description? ");
					String description = input.nextLine();
					System.out.print("Price? ");
					int price  = input.nextInt();
					System.out.print("Cost? ");
					int cost = input.nextInt();
					input.nextLine();

					mixins.add(new MixInFlavor(name, description, cost, price));

				}

				if(userinput.equals("s")){
					System.out.println("Creating a scoop of ice cream!");
					int index = 0;
					int index2 = 0;

					System.out.println("Flavors: ");
					for(IceCreamFlavor i : flavors){
						System.out.println(flavors.indexOf(i) + ") " + i);
					}
					System.out.print("Type number: ");
					index = input.nextInt();
					input.nextLine();
					scoops.add(new Scoop(flavors.get(index)));
						
						if(mixins.size()!=0){
							System.out.println("Mixins: ");
							for(MixInFlavor i : mixins){
								System.out.println(mixins.indexOf(i) + ") " + i + " ");
							}
							System.out.print("Type number: ");
							index = input.nextInt();
							input.nextLine();
							
							System.out.println("Amount: ");
							int j = 0;
							for(MixInAmount i: MixInAmount.values()){
								System.out.println(j + ") " + i + " ");
								j++;
							}
							System.out.print("Type number: ");
							index2 = input.nextInt();
							input.nextLine();
						}
						

					for(Scoop i : scoops){
						 i.addMixIn(new MixIn(mixins.get(index), MixInAmount.values()[index2]));
						 System.out.println(i.toString());
					}
					
				}

				System.out.println();

			
			
		}
		
		return;

	}


}