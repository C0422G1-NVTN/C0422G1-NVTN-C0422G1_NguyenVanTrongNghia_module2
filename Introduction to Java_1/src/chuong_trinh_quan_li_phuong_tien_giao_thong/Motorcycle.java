package chuong_trinh_quan_li_phuong_tien_giao_thong;

public class Motorcycle extends Transport{
    private int wattage;  //công suất

    public Motorcycle() {
    }

    public Motorcycle(String numberPlate, String nameManufacturing, int yearManufacturing, String owner, int wattage) {
        super(numberPlate, nameManufacturing, yearManufacturing, owner);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                super.toString() +
                "wattage=" + wattage +
                '}';
    }
}
