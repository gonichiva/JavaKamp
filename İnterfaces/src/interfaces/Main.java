package interfaces;

public class Main {
   //CustomerManager customerManager = new CustomerManager(new SmsLogger());

    public void main(String[] args) {
      //CustomerManager customerManager = new CustomerManager(new SmsLogger());
       // Multi Logger
		Logger[] loggers = {new SmsLogger(), new EmailLogger()};
		
        CustomerManager customerManager2 = new CustomerManager(loggers);
        CustomerManager customermanager = new CustomerManager(loggler);
       Customer Cansu = new Customer(1, "Cansu", "Aydın");
    
        customermanager.add(Cansu);
   }
}
