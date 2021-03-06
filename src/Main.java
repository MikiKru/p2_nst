// psvm -> public static void main(String[] args) {}
// sout -> System.out.println();
// CTRL + D -> duplikacja linijki
// ALT + Ins -> generator kodu
// CTRL + ALT + L -> formatowanie
// CTRL + / -> komentowanie/odkomentowanie
public class Main {
    public static void main(String[] args) {
        System.out.println("HELLO!");
        User u1 = new User("mk@mk.pl", "mk");
        User u2 = new User("ak@ak.pl", "ak");
        System.out.println(u1.toString());
        System.out.println(u2.toString());
    }
}
