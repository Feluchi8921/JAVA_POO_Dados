
public class Jugador {
    //Atributos
    private int puntos;
    private String nombre;

    //Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
    }

    //Metodos
    public int tomarTurno(Cubilete cubilete) {
        return cubilete.tirar();
    }

    public void incrementarPuntos() {
        this.incrementarPuntos(1);
    }
    public void incrementarPuntos(int puntos) {
        this.puntos += puntos;
    }

    public void resetearPuntos() {
        this.puntos = 0;
    }

    public int getPuntos() {
        return this.puntos;
    }

    public String getNombre() {
        return this.nombre;
    }

}
