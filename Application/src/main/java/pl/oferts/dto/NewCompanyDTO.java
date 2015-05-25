package pl.oferts.dto;

import lombok.*;
import pl.oferts.model.Address;

@Data
@AllArgsConstructor
public class NewCompanyDTO {

    private String name;
    private String nip;
    private String country;
    private String city;
    private String postCode;
    private String street;
    private String number;
}
