public class Student {
    private String imie;
    private String nazwisko;
    private String numerIndeksu;

    // Konstruktor
    public Student(String imie, String nazwisko, String numerIndeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        setNumerIndeksu(numerIndeksu);
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setNumerIndeksu(String numerIndeksu) {
        //Sprawdzamy, czy numer indeksu składa się z samych cyfr
        if (numerIndeksu.matches("\\d+")) {
            this.numerIndeksu = numerIndeksu;
        } else {
            System.out.println("Błąd: Numer indeksu powinien składać się z samych cyfr.");
        }
    }

    public static void main(String[] args) {
        // Przykład użycia
        Student student = new Student("Jan", "Kowalski", "12345");
        System.out.println("Imię: " + student.getImie());
        System.out.println("Nazwisko: " + student.getNazwisko());
        System.out.println("Numer indeksu: " + student.getNumerIndeksu());
    }
}
