package interfaces;

public class CustomerManager {
    private final Logger loggler;
    private Logger logger;
    public CustomerManager(Logger loggler) {

        this.loggler = loggler;
    }


    //loosyl tightly cuopled
    public void add(Customer customer){
        System.out.println("Müşteri eklendi."+customer.getFirstName());

       /* DatabaseLogger logger= new DatabaseLogger();
        Logger.log(customer.getFirstName() + "Veri Tabanı Loglandı.");*/
    }



    public void Delete(Customer customer){
        System.out.println("Müşteri silindi."+customer.getFirstName());
    }
}
