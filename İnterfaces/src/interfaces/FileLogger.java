package interfaces;

public class FileLogger implements Logger{
    @Override
    public void log(String Message) {
        System.out.println("Dosyaya Loglandı"+ Message);
    }
}
