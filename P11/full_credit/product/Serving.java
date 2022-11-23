package product;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Serving {

    public Serving(Container container) {
        this.container = container;
        this.toppings = new ArrayList<>();
        this.scoops = new ArrayList<>();
    }
    
    public Serving(BufferedReader br) throws IOException {
        this.container = new Container(br);
        this.toppings = new ArrayList<>();
        this.scoops = new ArrayList<>();

        int numToppings = Integer.parseInt(br.readLine());
        while(numToppings-- > 0) toppings.add(new MixIn(br));
        int numScoops = Integer.parseInt(br.readLine());
        while(numScoops-- > 0) scoops.add(new Scoop(br));


    }
    
    public void save(BufferedWriter bw) throws IOException {
        container.save(bw);
        bw.write("" + toppings.size() + '\n');
        for(MixIn mi : toppings) mi.save(bw);
        bw.write("" + scoops.size() + '\n');
        for(Scoop sc : scoops) sc.save(bw);
    }

    public void addTopping(MixIn topping) {
        toppings.add(topping);
    }
    
    public void addScoop(Scoop scoop) {
    scoops.add(scoop);
    }    

    public int price(){
        int price = 0;

        for(Scoop s: scoops){
            price += s.price();
        }

        for(MixIn t : toppings){
            price += t.price();
        }

        return price;
    }
    
 
    
    private Container container;
    private ArrayList<MixIn> toppings;
    private ArrayList<Scoop> scoops;
}