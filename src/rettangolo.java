public class rettangolo extends forma{


    rettangolo(double larghezza, double lunghezza) {
        super(larghezza,lunghezza);
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }
    public void calcolaArea() {
        double area = lunghezza * larghezza;
        System.out.println("Questo è il calcolo dell'area del rettangolo " + area);
    }
}
