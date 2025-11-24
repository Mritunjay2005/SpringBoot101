package pr1.java.coding_shuttle.first_prg;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void pay(){
        System.out.println("Paying...");
    }
    @PostConstruct
    public void aterinit(){
        System.out.println("beforre paying....");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("beforre destroying the bean");
    }
}
