package interfaces;

public class DatabaseLogger implements Logger {

    @Override
    public void log(String Message) {
        System.out.println("Sms Loglandı."+ Message);
    }
}
