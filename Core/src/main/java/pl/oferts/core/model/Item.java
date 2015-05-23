package pl.oferts.core.model;

import lombok.Data;

import java.math.BigInteger;

/**
 * Created by karol on 23.05.15.
 */
@Data
public class Item {

    private Long id;
    private Company company;
    private BigInteger price;
    private ItemStatus status;
    private ItemCategory itemCategory;
}
