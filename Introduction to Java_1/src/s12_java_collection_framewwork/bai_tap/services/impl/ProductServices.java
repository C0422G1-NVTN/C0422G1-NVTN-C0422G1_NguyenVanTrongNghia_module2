package s12_java_collection_framewwork.bai_tap.services.impl;

import s12_java_collection_framewwork.bai_tap.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductServices implements IProductService{
    Scanner scanner = new Scanner(System.in);
     static ArrayList<Product>productArrayList = new ArrayList<>();

    static {
        productArrayList.add(new Product(1,"xe",1000));
        productArrayList.add(new Product(2,"quan",2000));
        productArrayList.add(new Product(3,"ao",3000));
    }
    @Override
    public void addProduct() {
        System.out.println("Nhập id sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id,name,price);
        productArrayList.add(product);
    }

    @Override
    public void editById() {
        System.out.println("Nhập id sản phẩm cần chỉnh sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (id == productArrayList.get(i).getId()){
                System.out.println("Nhập name mới");
                String name = scanner.nextLine();
                productArrayList.get(i).setName(name);
                System.out.println("Nhập giá tiền mới");
                int price = Integer.parseInt(scanner.nextLine());
                productArrayList.get(i).setPrice(price);
            }
        }
    }

    @Override
    public void deleteById() {
        System.out.println("Nhập id món hàng cần sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (id == productArrayList.get(i).getId()){
                productArrayList.remove(productArrayList.get(i));
            }
        }
    }

    @Override
    public void displayProductList() {
        for (Product s: productArrayList) {
            System.out.println(s);
        }
    }

    @Override
    public void searchProductByName() {
        boolean flag = false;
        System.out.println("Nhập tên sản phẩm cần tìm");
        String name = scanner.nextLine();
        for (int i = 0; i < productArrayList.size(); i++) {
            if (name.equals(productArrayList.get(i).getName())){
                System.out.println(productArrayList.get(i));
                flag = true;
            }
        }if (!flag){
            System.out.println("Mặt hàng ko tồn tại");
        }
    }

    @Override
    public void sortProductsByPrice() {
        Collections.sort(productArrayList);
        displayProductList();
    }

    public void decrease(){
        MySort productSort = new MySort();
        Collections.sort(productArrayList,productSort);
        displayProductList();
    }


}
