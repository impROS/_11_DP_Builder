package org.example;

public class Product {
    private String name;
    private String description;
    private double price;
    private int stock;
    private String brand;
    private String color;

    private Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static class Builder {
        private String name;
        private String description;
        private double price;
        private int stock;
        private String brand;
        private String color;


        // Zorunlu parametrelerin bulunduğu constructor
        public Builder(String name, double price) {
            this.name = name;
            this.price = price;
        }

        // Opsiyonel parametreleri set etmek için metotlar
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setStock(int stock) {
            this.stock = stock;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        // Gerçek nesneyi oluşturan metot
        public Product build() {
            Product product = new Product(name, price);
            product.setDescription(description);
            product.setStock(stock);
            product.setBrand(brand);
            product.setColor(color);
            return product;
        }
    }//End of Builder class
}//End of  Product class
