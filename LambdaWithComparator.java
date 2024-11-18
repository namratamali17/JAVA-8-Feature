import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	int uid;
	String name;
	float price;
	public Product(int uid, String name, float price) {
		super();
		this.uid = uid;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [uid=" + uid + ", name=" + name + ", price=" + price + "]";
	}
	
}

public class LambdaWithComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Product>list=new ArrayList<>();
    list.add(new Product(101,"natebook",1222));
    list.add(new Product(102,"book",1222));
    list.add(new Product(103,"pencil",1222));
    list.add(new Product(104,"erazer",1222));
    list.add(new Product(105,"shopner",1222));
    
    Collections.sort(list,(a,b)->{
    	return a.name.compareTo(b.name);});
    //for each methad 
    list.forEach(p->System.out.println(p)); 
    
	}

}
