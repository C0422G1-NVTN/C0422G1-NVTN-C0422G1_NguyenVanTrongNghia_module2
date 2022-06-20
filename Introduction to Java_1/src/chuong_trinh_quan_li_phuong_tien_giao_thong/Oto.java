package chuong_trinh_quan_li_phuong_tien_giao_thong;

public class Oto extends Transport{
private int numberSeats; //số chỗ ngồi
private String styleOto;//loại xe oto

    public Oto() {
    }

    public Oto(String numberPlate, String nameManufacturing, int yearManufacturing, String owner, int numberSeats, String styleOto) {
        super(numberPlate, nameManufacturing, yearManufacturing, owner);
        this.numberSeats = numberSeats;
        this.styleOto = styleOto;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getStyleOto() {
        return styleOto;
    }

    public void setStyleOto(String styleOto) {
        this.styleOto = styleOto;
    }

    @Override
    public String toString() {
        return "Oto{" +
                super.toString() +
                "numberSeats=" + numberSeats +
                ", styleOto='" + styleOto + '\'' +
                '}';
    }
}
