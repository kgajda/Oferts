package pl.oferts.model;
import lombok.Data;

@Data
public class Image {

    private Long id;
    private String md5;
    private String name;
    private String format;
    private byte[] bytes;
}
