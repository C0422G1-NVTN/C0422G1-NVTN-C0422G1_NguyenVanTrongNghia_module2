package s12_java_collection_framewwork.bai_tap.services.impl;

import s12_java_collection_framewwork.bai_tap.model.Product;

import java.util.Comparator;

public class MySort implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice()- o1.getPrice();
    }
}
