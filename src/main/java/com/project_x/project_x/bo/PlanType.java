package com.project_x.project_x.bo;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="plan_types")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlanType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    private List<Subscription> planTypeSubscriptions;
}
