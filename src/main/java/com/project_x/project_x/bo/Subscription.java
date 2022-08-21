package com.project_x.project_x.bo;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="subscriptions")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    private Provider subscriptionProvider;

    @OneToMany(mappedBy = "planTypeSubscriptions",cascade = CascadeType.ALL)
    private List<PlanType> subscriptionPlanType;
}
