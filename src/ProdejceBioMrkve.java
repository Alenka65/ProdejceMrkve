import java.time.LocalDate;

public class ProdejceBioMrkve {

        // Datum narození prodejce
        private LocalDate datumNarozeni;
        // Počet dosud sjednaných smluv
        private int pocetSmluv;
        // Celkové množství prodané mrkve v tunách
        private double mnozstviMrkve;
        // Název města, kde prodejce sídlí
        private String mesto;
        // Registrační značka vozidla (SPZ)
        private String spz;
        // Spotřeba firemního vozidla v litrech na 100 km
        private double spotrebaVozidla;
        // Jméno prodejce
        private String jmeno;

    // Konstruktor
    public ProdejceBioMrkve(String jmeno, LocalDate datumNarozeni, int pocetSmluv, double mnozstviMrkve, String mesto, String spz, double spotrebaVozidla) {
        this.jmeno = jmeno;
        this.datumNarozeni = datumNarozeni;
        this.pocetSmluv = pocetSmluv;
        this.mnozstviMrkve = mnozstviMrkve;
        this.mesto = mesto;
        this.spz = spz;
        this.spotrebaVozidla = spotrebaVozidla;
    }

    // Gettery a settery
    public String getJmeno() {
        return jmeno;
    }
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }
    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }
    public int getPocetSmluv() {
        return pocetSmluv;
    }
    public void setPocetSmluv(int pocetSmluv) {
        this.pocetSmluv = pocetSmluv;
    }
    public double getMnozstviMrkve() {
        return mnozstviMrkve;
    }
    public void setMnozstviMrkve(double mnozstviMrkve) {
        this.mnozstviMrkve = mnozstviMrkve;
    }
    public String getMesto() {
        return mesto;
    }
    public void setMesto(String mesto) {
        this.mesto = mesto;
    }
    public String getSpz() {
        return spz;
    }
    public void setSpz(String spz) {
        this.spz = spz;
    }
    public double getSpotrebaVozidla() {
        return spotrebaVozidla;
    }
    public void setSpotrebaVozidla(double spotrebaVozidla) {
        this.spotrebaVozidla = spotrebaVozidla;
    }

    // ToString metoda pro výpis údajů o prodejci
    @Override
    public String toString() {
        return "ProdejceBiomrkve{" +
                "jmeno='" + jmeno + '\'' +
                "datumNarozeni=" + datumNarozeni +
                ", pocetSmluv=" + pocetSmluv +
                ", mnozstviMrkve=" + mnozstviMrkve + " tun" +
                ", mesto='" + mesto + '\'' +
                ", spz='" + spz + '\'' +
                ", spotrebaVozidla=" + spotrebaVozidla + " l/100km" +
                '}';
    }
}
