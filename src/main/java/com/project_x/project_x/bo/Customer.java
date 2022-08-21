package com.project_x.project_x.bo;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="customers")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @OneToOne(mappedBy = "customer")
    private User user;

    @OneToMany(mappedBy = "chatCustomer",cascade = CascadeType.ALL)
    private List<Chat> customerChats;
}
