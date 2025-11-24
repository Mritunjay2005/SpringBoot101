package pr1.java.coding_shuttle.first_prg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstPrgApplication implements CommandLineRunner {
	/*@Autowired//tells if there is any bean object then inject that dependancey in here
	PaymentService paymentServiceObj1 ;
	@Autowired//tells if there is any bean object then inject that dependancey in here
	PaymentService paymentServiceObj2 ;*/
	public static void main(String[] args) {
		SpringApplication.run(FirstPrgApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		/*System.out.println(paymentServiceObj1.hashCode());
		System.out.println(paymentServiceObj2.hashCode());
		paymentServiceObj1.pay();
		paymentServiceObj2.pay();*/

	}
}

