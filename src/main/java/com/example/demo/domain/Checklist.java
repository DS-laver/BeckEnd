package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "Checklist")
@Getter
@Setter
public class Checklist {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "checklist_id") // 체크리스트 아이디
    private int id;

    // user_id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


    private Date date;

    public Checklist(User user, Date date){
        this.user=user;
        this.date =date;
    }

}
