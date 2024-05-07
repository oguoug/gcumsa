package gcumsa.domain;

import gcumsa.domain.*;
import gcumsa.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Hellod extends AbstractEvent {

    private Long id;
    private String hello;

    public Hellod(Hello aggregate) {
        super(aggregate);
    }

    public Hellod() {
        super();
    }
}
//>>> DDD / Domain Event
