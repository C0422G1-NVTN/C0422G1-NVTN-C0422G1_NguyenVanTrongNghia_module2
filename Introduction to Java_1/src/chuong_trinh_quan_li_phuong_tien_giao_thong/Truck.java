package chuong_trinh_quan_li_phuong_tien_giao_thong;

public class Truck extends Transport{
    private double Tonnage; //trọng tải

    public Truck() {
    }

    public Truck(String numberPlate, String nameManufacturing, int yearManufacturing, String owner, double tonnage) {
        super(numberPlate, nameManufacturing, yearManufacturing, owner);
        Tonnage = tonnage;
    }

    public double getTonnage() {
        return Tonnage;
    }

    public void setTonnage(double tonnage) {
        Tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
                "Tonnage=" + Tonnage +
                '}';
    }
}
