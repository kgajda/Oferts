package pl.oferts.model;

import java.util.Collection;
import lombok.Data;

@Data
public class FullSpecyfication {

    private Long id;
    private String compaty_product;
    private String model;
    private String title;
    private String discription;
    private Image smallImage;
    private Collection<Image> images;
}
