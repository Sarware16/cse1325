import java.util.ArrayList;

public class Emporium{

	private ArrayList<MixInFlavor> mixInFlavors = new ArrayList<MixInFlavor>();
	private ArrayList<IceCreamFlavor> iceCreamFlavors = new ArrayList<IceCreamFlavor>();
	private ArrayList<Scoop> scoops = new ArrayList<Scoop>();

	public void addMixInFlavor(MixInFlavor flavor){
		mixInFlavors.add(flavor);
	}
	public void IceCreamFlavor(IceCreamFlavor flavor){
		iceCreamFlavors.add(flavor);
	}
	public void addScoop(Scoop scoop){
		scoops.add(scoop);
	}

	public Object[] mixInFlavors(){
		Object[] object = mixInFlavors.toArray();

		return object; 
	}

	public Object[] iceCreamFlavors(){
		Object[] object = iceCreamFlavors.toArray();

		return object; 
	}

	public Object[] scoops(){
		Object[] object = scoops.toArray();

		return object; 
	}

	
}