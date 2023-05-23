package gcumsa.domain;

import gcumsa.domain.*;
import gcumsa.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Worldd extends AbstractEvent {

    private Long id;

    public Worldd(World aggregate) {
        super(aggregate);
    }

    public Worldd() {
        super();
    }
}
