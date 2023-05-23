package gcumsas.domain;

import gcumsas.domain.*;
import gcumsas.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Worlded extends AbstractEvent {

    private Long id;
    private String world;

    public Worlded(World aggregate) {
        super(aggregate);
    }

    public Worlded() {
        super();
    }
}
