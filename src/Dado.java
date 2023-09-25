public class Dado {
    //Constantes
    public static final int CARASPORDEFECTO = 6;

    //Atributos
    private int caras;

    //Constructor
    public Dado() {
        this.caras = CARASPORDEFECTO;
    }

    //Metodo
    public int tirar() {
        return (int)(Math.random() * this.caras) + 1;
    }



}