package interfaces;

public class SmsLogger implements Logger {
    @Override
    public void log(String Message) {
        System.out.println("Sms Gönderildi"+ Message);
    }
}
