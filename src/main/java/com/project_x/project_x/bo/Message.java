package com.project_x.project_x.bo;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="messages")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    private Chat messageChat;



}
