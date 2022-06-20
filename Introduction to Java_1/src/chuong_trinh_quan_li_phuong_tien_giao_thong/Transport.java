package chuong_trinh_quan_li_phuong_tien_giao_thong;

public abstract class Transport {
    private String numberPlate; //biển kiểm soát
    private String nameManufacturing; // tên hãng sản xuất, SAI RỒI
    private int yearManufacturing; // năm sản xuất
    private String owner;// chủ sỡ hữu

    public Transport() {
    }

    public Transport(String numberPlate, String nameManufacturing, int yearManufacturing, String owner) {
        this.numberPlate = numberPlate;
        this.nameManufacturing = nameManufacturing;
        this.yearManufacturing = yearManufacturing;
        this.owner = owner;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getNameManufacturing() {
        return nameManufacturing;
    }

    public void setNameManufacturing(String nameManufacturing) {
        this.nameManufacturing = nameManufacturing;
    }

    public int getYearManufacturing() {
        return yearManufacturing;
    }

    public void setYearManufacturing(int yearManufacturing) {
        this.yearManufacturing = yearManufacturing;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "numberPlate='" + numberPlate + '\'' +
                ", nameManufacturing='" + nameManufacturing + '\'' +
                ", yearManufacturing=" + yearManufacturing +
                ", owner='" + owner + '\'';
    }
}
