package w3;

public class SubSimple extends Simple {
    private int number;

    public SubSimple() {}
    public SubSimple(String title, int number){
        // konstrukcja super !!! musi być zawsze jako pierwsza instrukcja w konstruktorze
        // wywołanie konstruktora klasy nadrzędnej
        super(title);
        this.number = number;
        System.out.println("jestem w konstruktorze SubSimple");
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        // super -> odwolanie do obiketu klasy nadrzędnej
        return "SubSimple{number=" + number + "} " + super.toString();
    }
}
