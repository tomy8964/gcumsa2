package gcumsas.domain;

import gcumsas.InHelloApplication;
import gcumsas.domain.Hellod;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Hello_table")
@Data
public class Hello {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String hello;

    @PostPersist
    public void onPostPersist() {
        Hellod hellod = new Hellod(this);
        hellod.publishAfterCommit();
        // Get request from Hello
        //gcumsas.external.Hello hello =
        //    Application.applicationContext.getBean(gcumsas.external.HelloService.class)
        //    .getHello(/** mapping value needed */);

    }

    public static HelloRepository repository() {
        HelloRepository helloRepository = InHelloApplication.applicationContext.getBean(
            HelloRepository.class
        );
        return helloRepository;
    }
}
