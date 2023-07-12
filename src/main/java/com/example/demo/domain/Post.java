package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="chatRoom")
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue
    @Column(name="post_id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @Column(length = 100)
    private String title;
    @Column(length = 3000)
    private String content;
    private LocalDateTime timestamp;


}