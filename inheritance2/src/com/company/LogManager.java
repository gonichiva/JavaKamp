package com.company;

public class LogManager {

    // KÖTÜ KOD ÖRNEĞİ
    // !!! Biribrinin alternatifi olan kod bloklarında if kullanılmaz.

    public void log(int logType) {
        if (logType == 1) {
            System.out.println("Veritabanına loglandı!");
        }
        if (logType == 2) {
            System.out.println("Dosyaya loglandı!");
        }
        else {
            System.out.println("Email Gönderildi!");
        }
    }
}
