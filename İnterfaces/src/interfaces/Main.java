package interfaces;

public class Main {
    private Logger loggler;

    public void main(String[] args) {
       CustomerManager customermanager = new CustomerManager(loggler);
       Customer Cansu = new Customer(1, "Cansu", "Aydın");
       customermanager.add(Cansu);
   }
}
