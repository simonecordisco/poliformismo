public class Main {
    public static void main(String[] args) {

        rettangolo rettangolo1 = new rettangolo (5,5);
        triangolo triangolo1 = new triangolo(4,5);
        forma[] aree ={rettangolo1,triangolo1};
        for(forma forma :aree){
            forma.calcolaArea();
        }
    }
}