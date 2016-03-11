package net.woniper.spring.boot.restful.example.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "account")
@Data
public class Account {

    @Id @GeneratedValue
    private Long accountId;

    @Column(nullable = false, unique = true)
    private String username;

    private String password;

    private String name;

    private boolean admin;

    private boolean enable = true;

    @Temporal(TemporalType.DATE)
    private Date createDate = new Date();

}
