class Main {
  public static void main(String[] args){ 
    System.out.println("Sayı Atama");
       int sayı1=10;
       int sayı2=20;
       sayı1 = sayı2;
       sayı2 = 100; 
       System.out.println(sayı1);
 
       int[] sayılar1 = {1,2,3,4,5};
       int[] sayılar2 = {10,20,30,40,50};
       sayılar1 = sayılar2;
       sayılar2[0]= 100;
       System.out.println(sayılar1[0]);
      
   } 
 }

  
