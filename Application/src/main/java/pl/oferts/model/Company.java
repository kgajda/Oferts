package pl.oferts.model;

import lombok.Data;

import java.util.Collection;

@Data
public class Company {

    private Long id;
    private String name;
    private Address address;
    private String nip;
    private Collection<ThingTransaction> thingTransactions;

}
