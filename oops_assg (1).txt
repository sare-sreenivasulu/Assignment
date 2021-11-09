 OOPS ASSIGNMENTS:


1.WRITE A SINGLETONE CLASS:

class Singleton {
    
    private static Singleton single_instance = null;
    public String s;
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }
 
    
    public static Singleton Singleton()
    {
        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}
 

public class Gfg {
	   
    public static void main(String args[])
    {
        Singletone x = Singletone.Singleton();
 
        Singletone y = Singletone.Singleton();
 
        Singletone z = Singletone.Singleton();
 
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
 
        z.s = (z.s).toLowerCase();
 
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}


2. CALCULATE THE TOTAL SALARY OF ALL THE EMPLOYEES:
 
class Employee{
   void sal(){
       }
       }
class Manager extends Employee
      {
	int salary;
	int incentive;
	Manager(int salary,int incentive)
	{
		this.salary=salary;
		this.incentive=incentive;
		
	}
	public void sal()
	{
		System.out.println("the salary of manager is: "+(salary+incentive));
	}
       }
class Labour extends Employee
      {
	int lab_salary;
	int overtime;
	Labour(int lab_salary,int overtime)
	{
		this.lab_salary=lab_salary;
		this.overtime=overtime;
		
	}
	public void sal()
	{
		System.out.println("the salary of labour is: "+(lab_salary+overtime));
	}
      }
public class  MainEmp
      {
	public static void main(String[] args)
	{
		Manager mngr = new Manager(15000,5000);
		Labour lab = new Labour(1000,500);
		mngr.sal();
		lab.sal();
	}
      }


3.TO FIND OUT TOTAL CASH IN THE BANK:

public class Bank {

	public static void main(String[] args) {
   SavingAccount savingaccount = new SavingAccount(10000,600);
   CurrentAccount currentaccount = new CurrentAccount(1000,300);
   savingaccount.totalAmt();
   currentaccount.totalAmt();
   double totalbankbal= savingaccount.totalAmt()+currentaccount.totalAmt();
   System.out.println("total cash in the bank:"+totalbankbal);
   }

}

public class SavingAccount extends Bank{
	    private double fixedDeposit;
	    private double balance;
	    

	    public SavingAccount(double fixedDeposit, double balance)
	    {
	    	this.fixedDeposit=fixedDeposit;
	    	this.balance=balance;
	    }
	    public double totalAmt() {
	    	double Savingsbal= fixedDeposit+balance;
	    	return Savingsbal;
	   }
}
public class CurrentAccount extends Bank {
	private double cashcredit;
	private double balance;
	
 public CurrentAccount(double cashcredit, double balance)
 {
	 this.balance=balance;
	 this.cashcredit=cashcredit;
	 
 }
 public double totalAmt() {

     double currentbal= cashcredit+balance;
     return currentbal;
      }
	}

4) TEST THE FOLLOWING PRINCIPLES OF AN ABSTRACT CLASS: 
   ------------------------------------------------------
   ------------------------------------------------------
1.IF ANY CLASS HAS METHOD AS ABSTRACT THEN THAT CLASS MUST BE DECLARED ABSTRACT 
ANS : YES , IF WE DOESNT MAKE THE CLASS AS ABSTRACT IT WILL GIVE ERROR .
WE SHOULD MAKE THE METHOD AND CLASS AS ABSTRACT LIKE THIS
package ass2.ques4;

public abstract class Abstracts {
    public abstract void print();
    {

    }
}

2.ABSTRACT CLASS CANNOT BE INSTANTIATED
ANS :YES, BECAUSE IN ABSTARCT CLASS WE MIGHT HAVE ONLY ABSTRACT METHOD,WHEN WE HAVE
ABSTRACT METHOD THERE IS NO POINT OF INSTANTIATING THE CLASS AS THERE IS NOTHING TO 
ACCESS

if we try to instantiate the abstract class
it will give error like this
java: ass2.ques4.Abstracts is abstract; cannot be instantiated

3.WHEN WE EXTEND THE ABSTRACT WE NEED TO PROVIDE IMPLEMENATATION USING OVERIDING OTHERWISE
DECALRE THE SUBCLASS ALSO ABSTRACT
ANS:
IF WE DONT PROVIDE IMPLENMENATTION IT WILL GIVE ERROR LIKE THIS
java: ass2.ques4.AbstractMain is not abstract and does not override abstract method print() 

TO OVERCOME THIS WE NEED TO PROVIDE IMPLEMENTATION IN SUBCLASS LIKE THIS
package ass2.ques4;

public class AbstractMain extends Abstracts
{
    public static void main(String[] args) {
    @Override
    public void print() {
	System.out.println("Implenting a abstract method by overriding");
    }
}
}

4.ABSTRACT CLASS CANNOT BE PRIVATE
ANS: YES, BECAUSE WE CANNOT ACCESS THEM IN ANY SUBCLASS AND CANT PROVIDE IMPLEAMNETATION TO THAT 
ABSTRACT CLASS

5.ABSTRACT CLASS CANNOT BE FINAL
ANS: YES, BECAUSE WE CAN ACCESS THEM IN ANY SUBCLASS BUT CAN'T PROVIDE IMPLEAMNETATION TO THAT 
ABSTRACT CLASS OR CAN'T BE OVERRIDDEN.

6.WE CAN DECLARE THE CLASS AS ABSTRACT WITHOUT HAVING ABSTRACT METHOD
ANS:YES,BUT IF WE DO THAT WE CAN'T INSTATNTIATE THAT CLASS.
----------------------------------------------------------------------------------------


5. WRITE THE CLASSES LINE,RECTANGLE,CUBE ETC.& DRAW ALL SHAPES:

abstract class Shape{
abstract void draw();
       }		
 class Line extends Shape
     {
	public void draw()
	{
		System.out.println("Draw a line of cm 20");
	}
     }
class Rectangle extends Shape
    {
	public void draw()
	{
		System.out.println("Draw a rectangle of length 15 breadth 25");
	}
     }
class Cube extends Shape
    {
	public void draw()
	{
		System.out.println("Draw a cube");
	}
    }
 class MainShape{
  public static void main(String[] args)
	{
		Line line = new Line();
		Rectangle rectangle = new Rectangle();
		Cube cube = new Cube();
		line.draw();
		rectangle.draw();
		cube.draw();
		
	}
    }


6. WRITE AN ABSTRACT CLASS 'PERSISTANCE' AND SUBCLASS OF 'FILEPERSISTANCE' & 'DATABASEPERSISTANCE' :

public abstract class Persistence {
    public abstract void persist();
}


public class FilePersistence extends Persistence{
    @Override
    public void persist()
    {
        System.out.println("Overiding in FIle persistence");
    }
}


public class DatabasePersistence extends Persistence{
    @Override
    public void persist()
    {
        System.out.println("Overiding in FIle persistence");
    }
}


public class Client{
    public static void main(String[] args) {
        Persistence persistence = new Persistence() {
            @Override
            public void persist() {
                System.out.println("");
                System.out.println("1.The client created the object of Persistance which is abstract class");
                System.out.println("");
                System.out.println("2.And then clients is doing following invocation of abstract method");
                System.out.println("");
                System.out.println("3.The client is invoking the persist method without knowing that data is saved in file and database'");
            }
        };
        persistence.persist();
    }
}



7. DEVELOP AN APPLICATION FOR DESSERT SHOP:

DessertItem.java

public abstract class DessertItem {
protected String name;

public DessertItem()
{
name = "";
}

public DessertItem(String name1)
{
name = name1;
}

public String getName()
{
return name;
}

public void setName(String name1)
{
name = name1;
}

public abstract double getCost();
}


Candy.java

public class Candy extends DessertItem {
private double weight;
private double pricePerPound;


public Candy()
{
super();
weight = 0;
pricePerPound = 0;
}

public Candy(String name, double w, double prc)
{
super(name);
weight = w;
pricePerPound = prc;
}


public double getWeight() {
return weight;
}

public void setWeight(double weight) {
this.weight = weight;
}

public double getPricePerPound() {
return pricePerPound;
}

public void setPricePerPound(double pricePerPound) {
this.pricePerPound = pricePerPound;
}

@Override
public double getCost() {
double total = weight * pricePerPound;
total = Math.round(total * 100);
return total;
}


public String toString()
{
String s = String.format("%-50s $%.2f\n\t %.2f lbs @ $.2f", getName(), getCost()/100, weight, pricePerPound);
return s;
}
}


Cookie.java

public class Cookie extends DessertItem {
private int quantity;
private double pricePerDozen;


public Cookie()
{
super();
quantity = 0;
pricePerDozen = 0;
}

public Cookie(String name, int qty, double prc)
{
super(name);
quantity = qty;
pricePerDozen = prc;
}


public int getQuantity() {
return quantity;
}


public double getPricePerDozen() {
return pricePerDozen;
}

public void setPricePerDozen(double pricePerDozen) {
this.pricePerDozen = pricePerDozen;
}

public void setQuantity(int quantity) {
this.quantity = quantity;
}

@Override
public double getCost() {
double total = pricePerDozen / 12 * quantity;
total = Math.round(total * 100);
return total;
}


public String toString()
{
String s = String.format("%-50s $%.2f\n\t %d cookies @ $%.2f per Dozen", getName(), getCost()/100, quantity, pricePerDozen);
return s;
}
}

IceCream.java

public class IceCream extends DessertItem{
private int numberOfScoops;
private double pricePerScoop;
private double toppingPrice;

public IceCream() {
super();
numberOfScoops = 0;
pricePerScoop = 0;
toppingPrice = 0;

}

public IceCream(String name, int scoops, double prcPerScoop, double toppings)
{
super(name);
numberOfScoops = scoops;
pricePerScoop = prcPerScoop;
toppingPrice = toppings;
}


public int getNumberOfScoops() {
return numberOfScoops;
}

public void setNumberOfScoops(int numberOfScoops) {
this.numberOfScoops = numberOfScoops;
}

public double getPricePerScoop() {
return pricePerScoop;
}

public void setPricePerScoop(double pricePerScoop) {
this.pricePerScoop = pricePerScoop;
}

public double getToppingPrice() {
return toppingPrice;
}

public void setToppingPrice(double toppingPrice) {
this.toppingPrice = toppingPrice;
}

@Override
public double getCost() {
double total = (numberOfScoops * pricePerScoop + toppingPrice);
return Math.round(100 * total );
}

public String toString()
{
String s = String.format("%-50s $%.2f\n\t %d scoops @ $%.2f/scoop + $%.2f", getName(), getCost()/100, numberOfScoops, pricePerScoop, toppingPrice);
return s;
}
}

DessertShop.java

public class DessertShop {
public static void main(String[] args) {
Candy item1 = new Candy("Peanut Butter Fudge", 2.25, 3.99);
Cookie item2 = new Cookie("Oatmeal Raisin Cookies", 4, 3.99);
IceCream item3 = new IceCream("Vanilla Ice Cream", 2, 1.05, 0.45);

System.out.println(item1);
System.out.println(item2);
System.out.println(item3);
}
}




