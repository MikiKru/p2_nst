package w2;
// model JavaBeans
// 1. prywatne pola klasowe
// 2. publiczne metody dostępowe -> get/set
// 3. napisowa reprezentacja obiektu -> toString
// 4. konstruktor/y
public class Auto {
    // pola klasowe - prywatne, czyli edytowalne tylko wewnątrz klasy
    // typy     -> obiektowe -> inicjalizowany: null
    // proste   -> proste -> int = 0, double = 0.0, boolean = false, char = ''
    private String brand;
    private String model;
    private double price;
    // ALT + Ins
    public Auto(){}                                         // domyślny
    public Auto(String brand, String model, double price) { // customowy
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public double priceToGross(){
        return this.price * 1.23;
    }
    // gettery i settery
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        // po pola klasowego brand przypisz wartość lokalną z argumentu metody o nazwie brand
        this.brand = brand;
    }
    // ALT + Ins
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    // ALT + Ins
    @Override                       // przysłonięcie tej metody z nadklasy Object
    public String toString() {      // napisowa reprezentacja obiektu
        return "brand = " + this.brand + " model= " + this.model +" price=" + this.price +
                " price gross = " + priceToGross();
    }
}
