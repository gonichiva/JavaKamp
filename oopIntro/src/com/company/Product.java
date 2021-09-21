package com.company;

public class Product {

    int id; // Nesneyi diğer nesnelerden ayıran benzersiz sayı
    String name; //Ürün Adı
    double unitPrice; //Birim Fiyatı
    String detail; //Ürün Açıklaması


    public Product() {
        System.out.println("Ben çalıştım");
    }

    public Product(int id, String name, double unitPrice, String detail) {

        // Diğer constructor'ı çalıştırmak için this(); fonksiyonu getirilir.
        this();

        // Bu class'ta yani en yukarıda tanımladığımız alan yukarıda parantezin içindeki alanda verilen değere eşitliyoruz.
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
    }
}