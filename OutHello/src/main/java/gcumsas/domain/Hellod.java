package gcumsas.domain;

import gcumsas.domain.*;
import gcumsas.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Hellod extends AbstractEvent {

    private Long id;
    private String hello;
}
