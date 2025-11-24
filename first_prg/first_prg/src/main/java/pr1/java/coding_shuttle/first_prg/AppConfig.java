package pr1.java.coding_shuttle.first_prg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    PaymentService paymentService() {
        return new PaymentService();
    }
}
