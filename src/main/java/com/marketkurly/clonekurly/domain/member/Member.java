package com.marketkurly.clonekurly.domain.member;

import com.marketkurly.clonekurly.domain.Authority;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "member")
@Builder
@Entity
public class Member {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="member_id",nullable = false)
    private Long id;

    @Column(length = 225, name = "password",nullable = false)
    private String password;

    @Column(length = 45, name = "name",nullable = false)
    private String name;

    @Column(length = 100, name="email",nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Authority authority;

    @Column(length = 20,name="phone",nullable = false)
    private String phone;

    @Column(name="grade")
    @Enumerated(EnumType.STRING)
    private String grade;

    @Column(nullable = false)
    private String address;

    @Column(name="birthdate")
    private Date birthDate;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    //joinDate 자동 표시
    @Column(name="joinDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date joineDate;

}
