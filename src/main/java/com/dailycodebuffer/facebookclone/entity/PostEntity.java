package com.dailycodebuffer.facebookclone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "posts")
@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor

public class PostEntity {

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



