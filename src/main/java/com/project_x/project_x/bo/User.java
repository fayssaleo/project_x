package com.project_x.project_x.bo;

import lombok.*;
import org.springframework.lang.Nullable;


import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name="users")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;




    @NotNull(message = "username is null")
    @NotBlank(message = "username is empty")
    @Size(min = 3, message = "username must have at least 3 characters")
    @Column(name="username")
    private String username;




    @NotNull(message = "firstname is null")
    @NotBlank(message = "firstname is empty")
    @Column(name = "firstname")
    private String firstname;




    @NotNull(message = "lastname is null")
    @NotBlank(message = "lastname is empty")
    @Column(name = "lastname")
    private String lastname;



    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$")
    @Column(name="email")
    private String email;


    @NotNull(message = "phone number is null")
    @Column(name="phone_number")
    private String phoneNumber;




    @NotNull(message = "birthday is null")
    @Column(name="birthday")
    private Date birthday;


    @NotNull(message = "city is null")
    @Column(name="city")
    private Date city;




    @NotNull(message = "password is null")
    @Column(name="password")
    private String password;




    @Column(name="created_at")
    private Date createrAt;





    @Column(name="updated_at")
    private Date updateAt;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "provider_id", referencedColumnName = "id")
    private Provider provider;



}
