//Composite
import java.util.ArrayList;
import java.util.List;

public class ProductBundle  implements CartItem{

    private String name;
    private List<CartItem> items = new ArrayList<>();

    public ProductBundle(String name){
        this.name=name;
    }    

    public void addItem(CartItem item){
        items.add(item);
    }

    public void removeItem(CartItem item){
        items.remove(item);
    }

    @Override
    public double getPrice(){
        double total=0;
        for(CartItem item:items){
            total+=item.getPrice();
        }
        return total;
    }

    @Override
    public void showDetails(){
        System.out.println("Product bundle: " + name);
        for(CartItem item:items){
            item.showDetails();
        }
    }




}
