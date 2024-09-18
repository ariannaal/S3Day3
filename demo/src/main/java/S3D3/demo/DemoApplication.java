package S3D3.demo;

import S3D3.demo.esercizio1.Adapter;
import S3D3.demo.esercizio1.Info;
import S3D3.demo.esercizio1.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Date d1 = new Date(100, 11, 21); // anno corrente - 1900

		Info info = new Info("Mario", "Rossi", d1);

		Adapter adapter = new Adapter(info);

		UserData userData = new UserData();

		// getdata serve per far chiamare i metodi in userdata per otennere i dati corretti da info
		userData.getData(adapter);



	}

}
