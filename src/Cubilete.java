public class Cubilete {

    //Atributos
    private Dado[] dados;

    //Constructor
    public Cubilete(int cantDados) {
        this.dados = new Dado[cantDados];
        //Creo los dados
        for (int i = 0; i < cantDados; i++)
            dados[i] = new Dado();
    }

    //Metodo tirar
    public int tirar() {
        int total = 0;
        for (int i = 0; i < dados.length; i++) {
            int valor = dados[i].tirar();
            total = total + valor;
        }
        return total;
    }

}