package S3D3.demo.esercizio2;

import java.util.ArrayList;
import java.util.List;

// composite, implementa i metodi per stampare il libro o calcolare il n di pagine
public class Libro implements Component {

    private String testoLibro;
    private List<String> autori = new ArrayList<>();
    private List<Component> componenti;
    private double prezzo;

    public Libro(String testoLibro, List<String> autori, List<Component> componenti, double prezzo) {
        this.testoLibro = testoLibro;
        this.autori = autori;
        this.componenti = componenti;
        this.prezzo = prezzo;
    }

    public int getTotalePagine() {
        return componenti.stream().mapToInt(Component::getNumeroPagine).sum();
    }


    @Override
    public int getNumeroPagine() {
        return componenti.stream().mapToInt(Component::getNumeroPagine).sum();
    }

    @Override
    public void stampa() {
        System.out.println("Stampa del libro: " + testoLibro);

    }
}
