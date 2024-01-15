package org.example;

/*
 * Builder design pattern, nesne oluşturma işlemlerini daha esnek ve okunabilir
 * bir şekilde yönetmek için kullanılan bir tasarım desenidir.
 * */
public class Main {
    public static void main(String[] args) {
        Product customProduct = new Product.Builder("Özel Ürün", 29.99)
                .setDescription("Bu ürün özel tasarım bir üründür.")
                .setStock(100)
                .setBrand("Özel Marka")
                .setColor("Özel Renk")
                .build();

        System.out.println("Ürün Adı: " + customProduct.getName());
        System.out.println("Açıklama: " + customProduct.getDescription());
        System.out.println("Fiyat: $" + customProduct.getPrice());
        System.out.println("Stok: " + customProduct.getStock());
        System.out.println("Marka: " + customProduct.getBrand());
        System.out.println("Renk: " + customProduct.getColor());
    }
}
