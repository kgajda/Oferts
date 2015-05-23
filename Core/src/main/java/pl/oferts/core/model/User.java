package pl.oferts.core.model;

import lombok.Data;

/**
 * Created by karol on 23.05.15.
 */
@Data
public class User {

    private String login;
    private String password;
    private String email;
    private String name;
    private String surname;
    private String address;
    private String phoneNumber;
    private Status status;
    private UserType userType;



}
