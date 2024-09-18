package S3D3.demo.esercizio2;

// pagina e' il leaf perche rappresenta una singola pagina e non può contenere altre pagine o sezioni
public class Pagina implements Component {

    private int numero;



    public Pagina(int numero) {
        this.numero = numero;
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }


    @Override
    public void stampa() {
        System.out.println("Stampa della pagina nr. " + numero);
    }

}
