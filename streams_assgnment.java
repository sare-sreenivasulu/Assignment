1. 

package Streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Fruit {
	 String name;
		String color;
	    int calories;
	    int price;
	 public  Fruit(String name,String color,Integer calories,Integer price) {
			this.name=name;
			this.color=color;
			this.calories=calories;
			this.price=price;
			}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
    public String getcolor() {
    	return color;
    }
    public void setcolor(String color) {
    	this.color=color;
    }
    public int getcalories() {
    	return calories;
    }
    public void setcalories(int calories) {
    	this.calories=calories;
    }
    public static int getprice() {
    	return price;
    }
    public void setprice(int price) {
    	this.price=price;
    }
    @Override
    public String toString() {
    	return this.name+ " " + this.color+ " " +this.calories+ " " + this.price;
    	 }
   public static void main(String[] args) {
	 List<Fruit> list= Arrays.asList(
	 new Fruit("Apple" , "red", 52, 20),
	  new Fruit("Strawberry","Red" , 88, 25),
		new Fruit("banana",  "yellow" , 70, 23),
		new Fruit("Grapes",  "Green", 30, 55));
	
		List<Fruit>sortedList=list.stream().sorted(Comparator.comparingInt(Fruit::getcalories).reversed()).collect(Collectors.toList());
			System.out.println("Fruits with calories<100 are:");
			sortedList.forEach(System.out::println);
	 
	 //question 2
	List<Fruit> colorList=list.stream().sorted(Comparator.comparing(Fruit::getcolor)).collect(Collectors.toList());
		System.out.println("Colorwise sorting of fruits is:");
		colorList.forEach(System.out::println);
	 
	 //question 3
	 System.out.println("red color fruits is: ");
	 
	 Fruit.stream().filter(t->t.getcolor()=="red"
			 .sorted(Comparator.comparingInt(Fruit::getprice)
             .collect(Collectors.toList()).forEach(t->System.out.println(t.getName()));
	}
}

TRADER:

package Streams;
     import java.util.Arrays;
		import java.util.List;
		import java.util.stream.Stream;

		public class Trader {

			String name;
			String city;
			public Trader(String name, String city) {
				super();
				this.name = name;
				this.city = city;
			}

			public static void main(String[] args) {
				List<Trader> list=Arrays.asList(
						new Trader("CHAND", "Pune"),
						new Trader("JAGADISH", "Bangalore"),
						new Trader("SREENU", "Pune"),
						new Trader("KALYAN", "Delhi")
						);
				

				//Question 9
				list.stream().map(x-> x.city)
				.distinct()
				.forEach(System.out::println);


				System.out.println("==========================================");


				//Question 10
				list.stream().filter(x->x.city.contains("Pune"))
				.map(x->x.name)
				.sorted()
				.forEach(System.out::println);

			}

			@Override
			public String toString() {
				return "Trader [name=" + name + ", city=" + city + "]";
			}
                    }
 
TRANSACTION:

package Streams;
 import java.util.Arrays;
		import java.util.List;
		import java.util.Optional;
		import java.util.stream.Stream;

		public class Transactions {
			Trader trader;
			int year;
			int value;  

			public Transactions(Trader trader, int year, int value) {
				super();
				this.trader = trader;
				this.year = year;
				this.value = value;
			}

			public Trader getTrader() {
				return trader;
			}
			public void setTrader(Trader trader) {
				this.trader = trader;
			}
			public int getYear() {
				return year;
			}
			public void setYear(int year) {
				this.year = year;
			}
			public int getValue() {
				return value;
			}
			public void setValue(int value) {
				this.value = value;
			}
			@Override
			public String toString() {
				return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
			}
			public static void main(String[] args) {

				List<Transactions> list=Arrays.asList(
						new Transactions(new Trader("sreenu", "Pune"), 2011, 5000),
						new Transactions(new Trader("jagadish", "Bangalore"), 2012, 4000),
						new Transactions(new Trader("chand", "Pune"), 2011, 3000),
						new Transactions(new Trader("kalyan", "Delhi"), 2012, 2000)
						);

				//Question 8
				list.stream().filter(x-> x.year==2011)
				.map(x-> x.value)
				.sorted()
				.forEach(System.out::println);
				
				System.out.println("==========================================");
				
				//Question 11
				list.stream().map(x->x.trader.name)
				.sorted()
				.forEach(System.out::println);
				
				System.out.println("==========================================");
				
				//Question 12
				list.stream().filter(x->x.trader.city.contains("Indore"))
				.map(x->x.trader)
				.forEach(System.out::println);
				
				System.out.println("==========================================");
				
				//Question 13
				list.stream().filter(x->x.trader.city.contains("Delhi"))
				.map(x->x.value)
				.forEach(System.out::println);
				
				System.out.println("==========================================");

				//Question 14
				Optional<Integer> max = list.stream().map(x->x.value)
						.max((i,j)->i.compareTo(j));
				System.out.println(max);
				
				System.out.println("==========================================");

				//question 15
				Optional<Integer> min = list.stream().map(x->x.value)
						.min((i,j)->i.compareTo(j));

				System.out.println(min);
			}


		}
NEWS:
package Streams;

		import java.util.Arrays;
		import java.util.Comparator;
		import java.util.List;
		import java.util.Optional;
		import java.util.stream.Collector;
		import java.util.stream.Collectors;
		import java.util.stream.Stream;

		public class News {

			int newsId;
			String postedByUser;
			String commentByUser;
			String comment;

			public News(int newsId, String postedByUser, String commentByUser, String comment) {
				super();
				this.newsId = newsId;
				this.postedByUser = postedByUser;
				this.commentByUser = commentByUser;
				this.comment = comment;
			}

			public int getNewsId() {
				return newsId;
			}

			public void setNewsId(int newsId) {
				this.newsId = newsId;
			}

			public String getPostedByUser() {
				return postedByUser;
			}

			public void setPostedByUser(String postedByUser) {
				this.postedByUser = postedByUser;
			}

			public String getCommentByUser() {
				return commentByUser;
			}

			public void setCommentByUser(String commentByUser) {
				this.commentByUser = commentByUser;
			}

			public String getComment() {
				return comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public static void main(String[] args ) {

				List<News> list=Arrays.asList(
						new News(123, "SREENU", "Thanos", "Finance Minister Nirmala Sitharaman on Saturday said that the government, undeterred by the COVID-19 pandemic, has been pursuing reforms for achieving sustained long-term growth in a bid to make India one of the top economies of the world in the coming decades."),
						new News(234, "JAGADISH", "Loki", "Replying to debate on Budget 2021-22 in Lok Sabha, she said, the Prime Minister did not lose any opportunity to continue with the reforms and this Budget has set the pace for India to become self-reliant or Aatmanirbhar."),
						new News(345, "CHAND", " Hulk", "he Budget for 2021-22, has provided the highest capex growth of 34.4 per cent by providing more money to railways, roads and defence."),
						new News(456, "RAJU", "Loki", "he said her Budget for 2021-22, has provided the highest capex growth of 34.4 per cent by providing more money to railways, roads and defence.")
						);

				//Question 5
						int count=(int) list.stream()
								.filter(x-> x.comment.contains("Budget"))
								.count();
						System.out.println(count);
						
						System.out.println("=====================================================");

						
				//Question6
				 Optional<String> max = list.stream().map(x->x.commentByUser)
				 			.max((i,j)->i.compareTo(j));
				 System.out.println(max.get());
						
					 Optional<News> max1=list.stream()
					 .collect(Collectors.maxBy(Comparator.comparing(News::getCommentByUser)));
					 
				 System.out.println(max1.get());
						
					list.stream().map(x->x.commentByUser)
					.sorted()
					.forEach(System.out::println);
					
				//Question 7

			}

			@Override
			public String toString() {
				return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
						+ ", comment=" + comment + "]";
			}


		}



	

