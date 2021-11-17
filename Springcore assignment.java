package com.springAssingment;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;
	
	public Address(String street, String city, String state, int zip, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getZip() {
		return zip;
	}
	public String getCountry() {
		return country;
	}
	
	 
}
package com.springAssingment;

public class Customer {
	
	private int Customerid;
	private String CustomerName;
	private int CustomerContact;
	private String CustomerAddress;
	private Address address;
	public Customer(int customerid, String customerName, int customerContact, String customerAddress) {
		super();
		Customerid = customerid;
		CustomerName = customerName;
		CustomerContact = customerContact;
		CustomerAddress = customerAddress;
	}
	

	public Address getAddress() {
		return address;
	}


	public void setCustomerid(int customerid) {
		Customerid = customerid;
	}


	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}


	public void setCustomerContact(int customerContact) {
		CustomerContact = customerContact;
	}


	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public int getCustomerid() {
		return Customerid;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public int getCustomerContact() {
		return CustomerContact;
	}
	public String getCustomerAddress() {
		return CustomerAddress;
	}
	
	public void details() {
		System.out.println("CustomerId :"+getCustomerid()+" CustomerName :"+getCustomerName()+" CustomerContact: "+getCustomerContact()+" CustomerAddress:"+getCustomerAddress());
		System.out.println("Full Address:: "+getAddress().getStreet()+", "+getAddress().getCity()+", "+getAddress().getState()+", "+getAddress().getZip()+", "+getAddress().getCountry());

	}

}

--------------------------------------------------------------------------------------------------------------------------------------------------------------
3.Banking 

ActBank.java

package com.java.bank;

public class ActBank {

	public int accountId;
	public String accountHolderName;
	public String accountType;
	public long accountBalance;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	  public void showBankAccountDetails(){
	        System.out.println("Account Id : " + accountId);
	        System.out.println("Account Holder Name : " + accountHolderName);
	        System.out.println("AccountType : " + accountType);
	        System.out.println("AccountBalance : " + accountBalance);

	    }	
}
-
ActBankR.java
package com.java.bank;

public interface ActBankR{

	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);	
}
-
BankActRImpl.java

package com.java.bank;
public abstract class BankActRImpl implements ActBankR {
	
	private void BankAccRepositoryImpl(){
	  ActBank bankaccount = new ActBank();
	  bankaccount.setAccountHolderName("Sreenu");
	  bankaccount.setAccountId(77);
	  bankaccount.setAccountType("Savings");
	  bankaccount.setAccountBalance((long) 70345.5);


	}
}

-
BankAccService.java

package com.java.bank;

public interface BankAccService {
public double withdraw(long accountId, double balance);
public double deposit(long accountId, double balance);
public double getBalance(long accountId);
public boolean fundTransfer(long fromAccount, long toAccount, double account);

}
-
BankAccServiceImpl.java

package com.java.bank;

public abstract class BankAccServiceImpl implements BankAccService{
	long accountId;
	double balance;
	long fromAccount;
	long toAccount;
	double account;
	
	public void withdraw() {
		System.out.println("AccounntId" +accountId);
		System.out.println("Balance" +balance);
	}
	
	public void balance() {
		System.out.println("AccounntId" +accountId);
		System.out.println("Balance" +balance);
	}
	
	public void deposit() {
		System.out.println("AccounntId" +accountId);
		System.out.println("Balance" +balance);
	}
	
	public void fundTransfer() {
		System.out.println("AccounntId" +accountId);
		System.out.println("Balance" +balance);
	}
	
	
}
-
ActBankC.java

package com.java.bank;

public class ActBankC{

	
	BankAccServiceImpl bankaccountS = new BankAccServiceImpl() {
		
		public double withdraw(long accountId, double balance) {
			
			return withdraw(10000,1000);
		}
		
		public double getBalance(long accountId) {
			
			return getBalance(100);
		}
		
		public boolean fundTransfer(long fromAccount, long toAccount, double aount) {
			
			return false;
		}
		
		public double deposit(long accountId, double balance) {
		
			return deposit(10000, 1000);
		}
	};

	public void withdraw() {
		
		return;
	}
	
	
}
-
one.java

package com.java.bank;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  


public class one
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("applicationC.xml");  
        ActBankC obj=(ActBankC)applicationcontext.getBean("obj");  
        obj.withdraw();     
        }
}
--
<?xml version="1.0" encoding="UTF-8"?>

<beans  
    
xmlns="http://www.springframework.org/schema/beans"  
    
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  
    
xmlns:p="http://www.springframework.org/schema/p"  
    
xsi:schemaLocation="http://www.springframework.org/schema/beans   

http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">  
 
 
<!-- <bean id="b" class="com.Auowire.Auowire.BankAccountController"></bean>   
-->
<bean id="obj" class="com.java.bank.BankAccountController" autowire="byName">
</bean>  
  

</beans>  
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
6.
Main.java

package com.java.org;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Configuration
@PropertySource("classpath:app.properties")
@SpringBootConfiguration
public class Main {

	public static void main(String[] args) {
		
		

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		
		Service s= (Service)context.getBean("service");
		
		s.Show();
		
	
		

	}

}

Service.java

package com.java.org;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class Service {
	
	
	@Value("${classurl}")
	private String url;
	
	@Value("${classusername}")
	private String username;
	
	@Value("${classpassword}")
	private String pass;
	
	
	
public void Show()
{
	System.out.println("url ="+url+", Username= " +username+ " ,Passoword= "+pass);
	
}
	

}

---------------------------------------------------------------------------------------------------------------------------------------------------------------------
7.SPEL

Demo.java

package com.java.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{ 22+11 }")
	private int x;
	
	@Value("#{ 20 }")
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + "]";
	}
	
	
}
-
Test.java

package com.java.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/java/spel/bean.xml");
		Demo d1 = context.getBean("demo",Demo.class);
		
		System.out.println(d1);

	}

}
-
bean.xml

<?xml version="1.0" encoding="UTF-8"?>
<beans  
    xmlns="http://www.springframework.org/schema/beans"  
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"  
    xmlns:p="http://www.springframework.org/schema/p"  
    xsi:schemaLocation="http://www.springframework.org/schema/beans   
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">
    
  <context:component-scan base-package="com.springcore.spel" />
   
</beans>
---------------------------------------------------------------------------------------------------------------------------------------------------------------------
8.Write a Program For InitializingBean and DisposableBean

Person.java

package com.java.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
 
public class Person implements DisposableBean, InitializingBean {
 
    private String name;
 
    Person() {
        System.out.println("Constructor of person bean is invoked!");
    }
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    //Bean initialization code
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing method of person bean is invoked!");
    }
 
    //Bean destruction code
    public void destroy() throws Exception {
        System.out.println("Destroy method of person bean is invoked!");
    }
}
-
Test.java

package com.java.bean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext   context = new ClassPathXmlApplicationContext("com/java/bean/bean.xml");
		 
        Person myperson = context.getBean("personBean", Person.class);
 
        System.out.println("Name= " + myperson.getName());
 
        // Closing the context object.
        context.close();
    }
}


Bean.xml

<?xml version="1.0" encoding="UTF-8"?>
<beans  
    xmlns="http://www.springframework.org/schema/beans"  
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"  
    xmlns:p="http://www.springframework.org/schema/p"  
    xsi:schemaLocation="http://www.springframework.org/schema/beans   
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">
    
    
    
    
    <bean name="personBean" class="com.java.bean.Person">
        <property name="name" value="Sri" />
    </bean>
    
    
 </beans>
-------------------------------------------------------------------------------------------------------------------------
9.Complete Bean Life Cycle

Example.java

package com.java.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
-


	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("starting method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("ending method");
		
	}

}
-----------------------------------------------------------------------------
Test.java

package com.java.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/java/lifecycle/bean.xml");
		
		context.registerShutdownHook();
		
		Example example=(Example) context.getBean("example");
		System.out.println(example);
		

	}

}
----------------------------------------------------------------------------------
bean.xml

<?xml version="1.0" encoding="UTF-8"?>
<beans  
    xmlns="http://www.springframework.org/schema/beans"  
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"  
    xmlns:p="http://www.springframework.org/schema/p"  
    xsi:schemaLocation="http://www.springframework.org/schema/beans   
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">
    
    <context:annotation-config />
    
    
    <bean class="com.bean.lifecycle.Example" name="example">
         <property name="subject" value="Maths" />
    </bean>
    
    
 </beans>
-------------------------------------------------------------------------------------------------------------------------
9.
App.java

package com.java.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		Applicationclass n = (Applicationclass) context.getBean("noob");

		n.walk();

		Build a = (Build) context.getBean("pro");
		a.Slow();

	}

}
-------------------------------------------------------------------------------------------
Application.java

package com.java.org;

public class Application {

	public void go() {

		System.out.println("Groot");
	}

}
-------------------------------------------------------------------------------------------
ApplicationClass.java

package com.java.org;

public class Applicationclass {

	public void walk() {

		System.out.println("Hulk Walk");
	}

	
}
---------------------------------------------------------------------------------------------
Build.java

package com.java.org;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Build implements ApplicationContextAware {

	private ApplicationContext context;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}

	public void Slow() {

		Application a = (Application) context.getBean("app");

		a.go();

	}

}






