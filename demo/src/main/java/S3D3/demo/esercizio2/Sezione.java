package S3D3.demo.esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements Component {

    private int numeroPagine;
    private List<Component> componenti  = new ArrayList<>();





    public Sezione(int numeroPagine, List<Component> componenti) {
        this.numeroPagine = numeroPagine;
        this.componenti = componenti;
    }

    Pagina pagina1 = new Pagina(1);
    Pagina pagina2 = new Pagina(2);
    Pagina pagina3 = new Pagina(3);
    Pagina pagina4 = new Pagina(4);


    public Sezione(List<Pagina> pagina1) {
    }


    @Override
    public int getNumeroPagine() {
        return componenti.size();
    }


    @Override
    public void stampa() {
        System.out.println("Stampa della sezione: ");
        for (Component componente : componenti) {
            componente.stampa();
        }
    }

}
