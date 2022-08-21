package com.project_x.project_x.bo;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="professions")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Profession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToMany(mappedBy = "ProviderProfessions")
    private List<Provider> professionProviders;
}
