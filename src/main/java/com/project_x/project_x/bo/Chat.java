package com.project_x.project_x.bo;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="chats")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    private Provider chatProvider;

    @ManyToOne
    private Customer chatCustomer;

    @OneToMany(mappedBy = "messageChat",cascade = CascadeType.ALL)
    private List<Message> chatMessages;

    @OneToMany(mappedBy = "confirmationChat",cascade = CascadeType.ALL)
    private List<Confirmation> chatConfirmations;

}
