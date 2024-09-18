package S3D3.demo.esercizio1;

import java.util.Date;

// info contiente i dati relativi allo user ma i metodi non sono compatibili con quelli di datasource,
public class Info {

    private String nome; // nome  ecognome restituiscono il nome reparato
    private String cognome;
    private Date dataDiNascita; // restoituisce la data di nascita ma non l'eta

    public Info(String nome, String cognome, Date dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCognome() { return cognome; }
    public void setCognome(String cognome) { this.cognome = cognome; }

    public Date getDataDiNascita() { return dataDiNascita; }
    public void setDataDiNascita(Date dataDiNascita) { this.dataDiNascita = dataDiNascita; }

}
