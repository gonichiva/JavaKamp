package interfaces;

public class Utils {
// Static olarak tanımlanan sınıflar genelde "loglama" gibi sürekli kullanıan eğlemlerde tanımlanır.
    // Static metodlar "new" kullanılmadan da SINIF ADIYLA ulaşılabilir.

    public static void runLoggers(Logger[] loggers, String message) {
        for(Logger logger:loggers) {
            logger.log(message);
        }
    }

}



