package pl.oferts.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Collection;

/**
 * Created by karol on 25.05.15.
 */
@Data
public class ThingTransaction {

    private Long id;
    private Collection<Thing> things;
    private BigDecimal price;
    private User user;

}
