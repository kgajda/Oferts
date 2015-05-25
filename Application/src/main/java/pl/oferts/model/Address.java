package pl.oferts.model;

import lombok.Data;

@Data
public class Address {
    private Long id;
    private String country;
    private String city;
    private String postCode;
    private String street;
    private String number;
    private String mail;

}
