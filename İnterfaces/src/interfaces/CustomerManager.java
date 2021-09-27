package interfaces;

// Burada sadece müşteriyi ilgilendiren metodlar bulunmalıdır.

public class CustomerManager {
	
	//private Logger logger;
	
	/*public CustomerManager(Logger logger) {
		this.logger = logger;
	}
	 */
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	
	//loosly - Tightly Coupled (Gevşek ve Katı Bağlanma)
	
	public void add(Customer customer) {
		System.out.println("Müşteri Eklendi " + customer.getFirstName());
		
		// #4 - Static metot olarak multi logger fonskiyon
		Utils.runLoggers(loggers, customer.getFirstName());
		
		// #3 - Loggerları sonradan değiştirilebilen ve birden fazla logger atanabilen kullanım
		/*for(Logger logger:loggers) {
			logger.log(customer.getFirstName());
		}*/
		
		// #2 - Loggerları sonradan değiştirilebilen ancak tek logger ile sınırlı olan kullanım
		//this.logger.log(customer.getFirstName());
		
		// #1 - Tüm kodlarda ayrı ayrı oluşturulması gereken kötü kullanım
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + " veri tabanýna loglandý");*/
	} 
	
	public void delete(Customer customer) {
		System.out.println("Müşteri Silindi " + customer.getFirstName());
		
		// #4
		Utils.runLoggers(loggers, customer.getLastName());
		
		// #3
		/*for(Logger logger:loggers) {
			logger.log(customer.getFirstName());
		}*/
		
		// #2
		//this.logger.log(customer.getFirstName());
		
		// #1
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + "veri tabanı loglandı");*/
	}
	

}
