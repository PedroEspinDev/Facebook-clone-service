package com.dailycodebuffer.facebookclone.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "posts")
@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor

public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String post;
    private String name;
    private String email;
    private String image;
    private String file;
    private String profilePic;
    private String timeStamp;
    private String imageName;
}



