package S3D3.demo;

import S3D3.demo.esercizio1.Adapter;
import S3D3.demo.esercizio1.Info;
import S3D3.demo.esercizio1.UserData;
import S3D3.demo.esercizio2.Component;
import S3D3.demo.esercizio2.Libro;
import S3D3.demo.esercizio2.Pagina;
import S3D3.demo.esercizio2.Sezione;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


		System.out.println("ESERCIZIO 1");

		Date d1 = new Date(100, 11, 21); // anno corrente - 1900

		Info info = new Info("Mario", "Rossi", d1);

		Adapter adapter = new Adapter(info);

		UserData userData = new UserData();

		// getdata serve per far chiamare i metodi in userdata per otennere i dati corretti da info
		userData.getData(adapter);

		System.out.println("ESERCIZIO 2");

		Pagina pagina1 = new Pagina(1);
		Pagina pagina2 = new Pagina(2);
		Pagina pagina3 = new Pagina(3);
		Pagina pagina4 = new Pagina(4);
		Pagina pagina5 = new Pagina(5);

		Sezione sezione = new Sezione(List.of(pagina1, pagina2, pagina3, pagina4));


		Libro libro = new Libro("Lorem ipsum...", Collections.singletonList("autore"), List.of(), 10);
		System.out.println("numero pagine totali del libro: " + libro.getTotalePagine());
		libro.stampa();

	}

}
