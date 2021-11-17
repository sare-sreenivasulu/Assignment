1.

package Java11;

interface SimpleInterest
{
	public double si(double s,double r,double i);
}
public class java11Assg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest s=(var s,var r,var i)->s*r*i/100;
		System.out.println(s.si(300, 50, 2));
	}

}

2.
 
* There are a few limitations of using var in lambda.

* For example, we cannot use var for some parameters and skip for others:

* (var s1, s2) -> s1 + s2
   Similarly, we cannot mix var with explicit types:

 * (var s1, String s2) -> s1 + s2
  Finally, even though we can skip the parentheses in single parameter lambda:

* s1 -> s1.toUpperCase()
  we cannot skip them while using var:

* var s1 -> s1.toUpperCase()

3.

package Java11;
import java.util.Arrays;
import java.util.List;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A quick brown fox jumps over the lazy dog";
		List<String> items = Arrays.asList(s.split(" "));
		
		for(String 3:items)
		{
		System.out.println(l);
		}
		Object[] s1 = items.toArray();
		System.out.println(Arrays.toString(s1));
	}

}

4.
package Java11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
		public class Assignment4 {

			public static void main(String[] args) {
				var path="C:\\Users\\srsreenu\\Documents\\java11\\student2.txt ";
				
				
				try
				{
					//Files.writeString(Path.of(path),"\njagadish", StandardOpenOption.APPEND);
					String data=Files.readString(Path.of(path));
					//" andd  " ="andd"
					List<String>str=data.lines()
							.map(s->s.trim())
							.filter(s -> !s.isEmpty())
				             .collect(Collectors.toList());
					
					for (String string : str) {
						System.out.println(string);
					}
					System.out.println("The total students are :"+str.size());
			
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}

		}

5.
 package Java11;
   import java.io.FileNotFoundException;
		import java.io.IOException;
		import java.io.PrintWriter;
		import java.nio.file.Files;
		import java.nio.file.Path;
		import java.nio.file.StandardOpenOption;
		import java.util.List;
		import java.util.Scanner;
		import java.util.stream.Collectors;

		public class Java11Asg5{
public static void main(String[] args) {
		var path="C:\\Users\\porajesh\\Documents\\java11\\insert.txt";
		var path1="C:\\Users\\porajesh\\Documents\\java11\\insert2.txt";

		Scanner sc=new Scanner(System.in);
		int choice=0;
		int count=0;
		do
		{
		System.out.println("Select your option (1: Insert New Price, 2: View Purchase Total, 3: Exit)");
			choice =sc.nextInt();
			if(choice==1)
			{
			String s;
			do
			{
			count++;
			System.out.println("Insert "+count+ " price:");
			int price = sc.nextInt();
			try
			{
			Files.writeString(Path.of(path),Integer.toString(price)+"\n", StandardOpenOption.APPEND);
			}
		catch(Exception e)
			{
			System.out.println(e);
			}
		System.out.println("Price has been saved to the file");
		System.out.println("Do you want to enter price for more items? (Yes/No)");
			s=sc.next();
			}while(!s.equalsIgnoreCase("no"));
			}
			else if(choice == 2)
			{
			int sum=0;
			String data;
			try {
			data = Files.readString(Path.of(path));
					//using lambda features
				List<String>str=data.lines()
					.map(s->s.trim())
					.filter(s -> !s.isEmpty())
				   .collect(Collectors.toList());
			for (String string : str) {
				System.out.println(string);
				int x=Integer.parseInt(string);
					sum=sum+x;
					}
							
		Files.writeString(Path.of(path1),Integer.toString(sum)+"\n", StandardOpenOption.APPEND);
				String data1 = Files.readString(Path.of(path1));
							
				System.out.println("Total Price of all items is: "+data1);
							
				} 
				catch (IOException e) {
							
				e.printStackTrace();
					}
					}
					else
					{
						PrintWriter writer,writer1;
						try {
							writer = new PrintWriter(path);
							writer1 = new PrintWriter(path1);
							writer.print("");
							writer1.print("");
							writer.close();
							writer1.close();
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						System.out.println("exit program");
					}}
				while(choice!=3);
				}

                                 }
6.

package Java11;
import java.io.IOException;
		import java.net.URI;
		import java.net.http.HttpClient;
		import java.net.http.HttpHeaders;
		import java.net.http.HttpRequest;
		import java.net.http.HttpResponse;
		import java.time.Duration;

public class Assignment6 {
		      public static void main(String[] args) throws IOException, InterruptedException
		    {
		         HttpRequest request = HttpRequest.newBuilder()
		                .GET()
		                .uri(URI.create("https://httpbin.org/get"))
		                .build();

		        HttpClient httpClient = HttpClient.newBuilder()
		            .version(HttpClient.Version.HTTP_1_1)
		            .connectTimeout(Duration.ofSeconds(10))
		            .build();
		      
		   HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

		        // print response headers
		        HttpHeaders headers = response.headers();
		        headers.map().forEach((k, v) -> System.out.println(k + ":" + v));

		        // print success code
		        System.out.println(response.statusCode());

		        // print response body
		        System.out.println(response.body());

		    }

	}







