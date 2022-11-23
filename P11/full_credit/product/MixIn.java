package product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class MixIn {
    public MixIn(MixInFlavor flavor, MixInAmount amount) {
        this.flavor = flavor;
        this.amount = amount;
    }
    public MixIn(BufferedReader br) throws IOException {
        amount = MixInAmount.valueOf(br.readLine());
        flavor = new MixInFlavor(br);
    }
    
    public void save(BufferedWriter bw) throws IOException {
        bw.write(amount.toString() + '\n');
        flavor.save(bw);
    }
    
    @Override
    public String toString() {
//        return flavor.toString() + ((amount != MixInAmount.Normal)
        return flavor.toString() + (!amount.equals(MixInAmount.Normal)
                                 ? " (" + amount + ")"
                                 : "");
    }

    public int price(){
        int price;

        price = flavor.price();

        if(amount.equals(MixInAmount.Light)){
            price = price * 2;

        }
        else if(amount.equals(MixInAmount.Extra)){
            price = price * 3;
        }
        else if(amount.equals(MixInAmount.Drenched)){
            price = price * 2;
        }

        return price;

    }

    private MixInFlavor flavor;
    private MixInAmount amount;
}