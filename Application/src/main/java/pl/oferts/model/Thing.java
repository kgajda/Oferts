package pl.oferts.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Collection;

@Data
public class Thing {

    private Long id;
    private String title;
    private String discription;
    private Long smallImage;
    private Long fullSpecyficationId;
    private BigDecimal price;
    private Company company;

    public void addSpecyficationAfterInstertToDB(FullSpecyfication fullSpecyfication) {
        smallImage = fullSpecyfication.getSmallImage().getId();
        fullSpecyficationId = fullSpecyfication.getId();
    }
}
