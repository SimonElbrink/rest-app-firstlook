package se.lexicon.simon.restappfirstlook.model;

import java.util.Objects;

public class Pen {

    int id;
    String name;
    String barcode;
    String brand;

    public Pen(int id, String name, String barcode, String brand) {
        this.id = id;
        this.name = name;
        this.barcode = barcode;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        return id == pen.id &&
                Objects.equals(name, pen.name) &&
                Objects.equals(barcode, pen.barcode) &&
                Objects.equals(brand, pen.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, barcode, brand);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", barcode='" + barcode + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
