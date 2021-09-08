class Main {
  public static void main(String[] args) {
   String InternetSubeButonu=("İnternet Şubesi");
  double DolarDun = 8.25;
  double DolarBugun = 8.18;
  int vade = 23;
  boolean DustuMu = false;
  System.out.println(InternetSubeButonu);
   if (DolarBugun < DolarDun ) 
   {
     System.out.println("Dolar Düştü");
   }
   else if (DolarBugun > DolarDun)
   {
    System.out.println("Dolar Yükseldi");
   }
    else 
   {
     System.out.println("Dolar eşittir");
   } 
   String kredi1 ="Hızlı Kredi";
   String kredi2 ="Konut Kredisi";
   String kredi3 ="Emekli Kredisi";
   String kredi4 ="Çiftçi Kredisi";
   String kredi5 ="Msb Kredisi";
   
   System.out.println(kredi1);
   System.out.println(kredi2);
   System.out.println(kredi3);
   System.out.println(kredi4);
   System.out.println(kredi5)
   String[] krediler =
    {
      "Hızlı Kredi",
      "Konut Kredisi",
      "Emekli Kredisi",
      "Çiftçi Kredisi",
      "Msb Kredisi"
     }
     //foreach 
     for (String kredi: krediler)
     {
      System.out.println(kredi);
     }
   } 
 }
  

