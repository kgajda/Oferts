package pl.oferts.core.model;

import lombok.Data;

import java.math.BigInteger;
import java.util.Collection;

/**
 * Created by karol on 23.05.15.
 */
@Data
public class Order {

    private Long id;
    private Collection<Item> items;
    private BigInteger price = BigInteger.ZERO;
    private Status status;

    public void addIthem(Item item){
        items.add(item);
        price = price.add(item.getPrice());
    }
}
