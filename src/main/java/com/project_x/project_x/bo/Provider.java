package com.project_x.project_x.bo;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="providers")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;


    @OneToOne(mappedBy = "provider")
    private User user;

    @OneToMany(mappedBy = "subscriptionProvider",cascade = CascadeType.ALL)
    private List<Subscription> providerSubscriptions;

    @ManyToMany
    @JoinTable(
            name = "provider_profession",
            joinColumns = @JoinColumn(name = "provider_id"),
            inverseJoinColumns = @JoinColumn(name = "profession_id"))
    private List<Profession> ProviderProfessions;

    @OneToMany(mappedBy = "chatProvider",cascade = CascadeType.ALL)
    private List<Chat> providerChats;

}
