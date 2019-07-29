package practice;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product
{
	int id;
	String name;
	Float price;
    public Product(int id,String name,float price) {
	super();
	this.id=id;
	this.name=name;
	this.price=price;
}
}
public class StudentFilter {
public static void main(String[]args)
{
List<Product> l=new ArrayList<Product>();
l.add(new Product(1,"samsung",14000));
l.add(new Product(2,"lenova",13000));
l.add(new Product(3,"honor",12500));
l.add(new Product(4,"Mi",16000));
Stream<Product>filtered_data=l.stream().filter(p ->p.price > 10000);
filtered_data.forEach(
		product -> System.out.println(product.name+":"+product.price));
}
}