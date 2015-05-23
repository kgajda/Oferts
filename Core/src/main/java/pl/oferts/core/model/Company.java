package pl.oferts.core.model;

import java.util.Collection;
import lombok.Data;

/**
 * Created by karol on 22.05.15.
 */
@Data
public class Company {

    private Long id;
    private Status status;
    private Collection<Employee> employees;
    private Collection<Order> transactions;
    private Discription discription;


}
