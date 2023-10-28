public class triangolo extends forma{
    triangolo(double larghezza, double lunghezza) {
        super(larghezza,lunghezza);
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }
    public void calcolaArea() {
        double area = (lunghezza * larghezza)/2;
        System.out.println("Questo è il calcolo dell'area del triangolo " + area);
    }
}
