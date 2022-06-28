package s17_io_binary_file_va_serialization.bai_tap.bai_tap1.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int codeProduct;
    private String nameProduct;
    private String productCompany;
    private double price;

    public Product() {
    }

    public Product(int codeProduct, String nameProduct, String productCompany, double price) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.productCompany = productCompany;
        this.price = price;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct=" + codeProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", productCompany='" + productCompany + '\'' +
                ", price=" + price +
                '}';
    }
}
