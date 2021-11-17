1.

package Lambda;
@FunctionalInterface
interface Arithmetic{
	int operations(int b, int c);
}

public class Lmbda1 {

	public static void main(String[] args) {  
		Arithmetic addition = (b,c)->(b+c);
		System.out.println("addition: "+addition.operations(70, 40));
		Arithmetic sub=(b,c)->(b-c);
		System.out.println("subtration: "+sub.operations(90,20 ));
		Arithmetic mul=(b,c)->(b*c);
		System.out.println("multiplication: "+mul.operations(30,3));
		Arithmetic div=(b,c)->(b/c);
		System.out.println("division :"+div.operations(20,2));
	}

}

2.
package Lambda;
import java.util.Arrays;
import java.util.List;
  public class Lmbda2 {
    public static void main(String[] args) {
    List<Orders> orders=Arrays.asList(new Orders(6654),
			new Orders(545666),
			new Orders(50000));
 orders.stream().filter(t->t.getPrice()>10000).forEach(t -> System.out.println("order is accepted:"+t));
					}
			}
class Orders {
			double price;
			public double getPrice() {
				return price;
			}
 public void setPrice(double price) {
				this.price = price;
			}
public Orders(double price) {
				super();
				this.price = price;
			}
           @Override
			public String toString() {
				return "Orders [price=" + price + "]";
			}
		}


3.

package Lambda;
    import java.util.function.Predicate;
    import java.util.function.Consumer;
		import java.util.function.Function;
		import java.util.function.Supplier;
		class Person{
			private String name;
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				 this.name=name;
			}
		}
		public class Lmbda1 {
         public static void main(String[] args) {
				Function<Integer, String> getInt=t->t*20+" multiplied by 20";
				System.out.println(getInt.apply(3));
				System.out.println("----------------------------- Supplier");
				Supplier<Double> getRandomDouble=()->Math.random();
				System.out.println(getRandomDouble.get());
				Predicate<String> checking=str->str.length()>5;
				System.out.println(checking.test("Predicate=>lambdaking"));

				Person p=new Person();
				Consumer<Person>setName=t->t.setName(" consumer =>park");
				setName.accept(p);
				System.out.println(p.getName());
			}
         }
	

4.

package Lambda;
import java.util.ArrayList;


public class Lmbda4 {

	public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    sl.add("sreenu");
    sl.add("jagadish");
    sl.add("java");
    sl.add("supermarket");
    sl.add("shibainu");
    System.out.println("before removing the names from the list = "+sl);
    sl.removeIf(name ->(name.length()%2!=0));
    System.out.println("after removing the odd names from the list = "+sl);
    
	}

}

5.
package Lambda;

import java.util.ArrayList;

public class Lmbda7 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
	    sl.add("sreenu");
	    sl.add("jagadish");
	    sl.add("java");
	    sl.add("supermarket");
	    sl.add("shibainu");
	    StringBuilder firstletter = new StringBuilder();
	    sl.forEach(s->firstletter.append(s.charAt(0)));
	    System.out.println("first letter of the each word: "+firstletter);
	}

}


6.

package Lambda;

import java.util.ArrayList;
import java.util.function.UnaryOperator;
@SuppressWarnings("unchecked")
class  Lambda6 implements UnaryOperator<String>{
	public String apply(String str) {
		return str.toUpperCase();
	}
}

public class Lmbda6 {
     public static void main(String[] args) {
		ArrayList<String> uppercase = new ArrayList<>();
		uppercase.add("dogecoin");
		uppercase.add("jagadish");
		uppercase.add("ethereum");
		uppercase.add("supermarket");
		uppercase.add("shibainu");
	    System.out.println("contents of the list: "+uppercase);
	    uppercase.replaceAll(new Lambda6());
	    System.out.println("contents of the list after replace operation: "+uppercase);
	    }
}

7.
package Lambda;

import java.util.Map;
import java.util.LinkedHashMap;

public class Lmbda7 {

	public static void main(String[] args) {
     Map<Integer , String> hm = new LinkedHashMap<>();
     hm.put(5, "sree");
     hm.put(40, "jagadish");
     hm.put(41, "chand");
	
	StringBuilder result = new StringBuilder();
	hm.forEach((k,v)-> result.append(k).append(v));
	System.out.println("result String is : "+result);
	}

}


8.

package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;



	public class MyThread extends Thread {
		public void run() {
			System.out.println(Thread.currentThread());
	 		List<Integer> values=Arrays.asList(12,4,27,78,545,66,24);
	 	
	 		values.forEach(i-> System.out.println(i));
		}
}
public class Lmbda8 {
public static void main(String[] args) {
		MyThread t=new MyThread();
				t.run();
			
			}
		}



