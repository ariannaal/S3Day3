package S3D3.demo.esercizio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

// implementa data source per essere compatibile con info
public class Adapter implements DataSource {

    private Info info;

    public Adapter(Info info) {
        this.info = info;
    }

    // nome completo
    @Override
    public String getNomeCompleto() {
        System.out.println("Nome completo: " + info.getNome() + " " + info.getCognome());
        return info.getNome() + " " + info.getCognome();
    }

    // calcola l'eta dalla data di nascita convertendo da date a localdate
    @Override
    public int getEta() {
        LocalDate dataDiNascita = convertToLocalDate(info.getDataDiNascita());
        LocalDate dataDiOggi = LocalDate.now();
        int eta = calcolaEta(dataDiNascita, dataDiOggi);
        System.out.println("Eta': " + eta + " anni");
        return eta;

    }

    //metodo per convertire a localdate perche periodbetween per il calcolo eta funziona solo con local date
    private LocalDate convertToLocalDate(Date data) {
        return data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static int calcolaEta(LocalDate dataDiNascita, LocalDate dataDiOggi) {
        Period period = Period.between(dataDiNascita, dataDiOggi);
        return period.getYears();
    }

}
