import java.util.*;

public class Scoop{
	private IceCreamFlavor flavor;
	private ArrayList<MixIn> mixins = new ArrayList<MixIn>();

	public Scoop(IceCreamFlavor flavor){
		this.flavor = flavor;
		this.mixins = mixins;
	}

	public void addMixIn(MixIn mixin){
		mixins.add(mixin);
	}

	@Override
	public String toString(){
		
		if(mixins.size()!=0){
			String str = "";
			for(MixIn mix : mixins){
				str = mix + ", ";
			}
			return "" + flavor + " with " + str;
		}

		return "" + flavor; 

		
	}
}