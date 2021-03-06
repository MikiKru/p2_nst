// ALT + Ins - generate -> konstruktor, getters and setters, toString
public class User {
    private String email;
    private String password;
    public User(String email, String password) {        // konstruktor
        this.email = email;                             // -> nazwa jak nazwa klasy
        this.password = password;                       // -> nie zwaca wartości i nie jest typu void
    }                                                   // -> inicjalizuje obiekt
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    @Override
    public String toString() {                          // -> napisowa reprezentacja obiektu
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
