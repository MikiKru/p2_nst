package w3;

public class Simple extends Object {
    private String title;

    // przeciążanie (nazwa metody jest taka sama)
    // -> liczba argumentów
    // -> typ argumentów
    // -> zwracana wartość
    public Simple() { }
    public Simple(String title) {
        System.out.println("jestem w konstruktorze Simple");
        this.title = title;
    }
    @Override   // przysłania implementację metody toString
    public String toString() {
        return "Simple{title='" + title + "'}";
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
