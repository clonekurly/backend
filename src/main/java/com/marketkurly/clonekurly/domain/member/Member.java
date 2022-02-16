package com.marketkurly.clonekurly.domain.member;

import com.marketkurly.clonekurly.controller.dto.member.MemberDto;
import com.marketkurly.clonekurly.domain.Authority;
import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "member")
@Builder
@Entity
public class Member {


    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="member_id",nullable = false)
    private Long id;

    @Column(length = 225, name = "password",nullable = false)
    private String password;

    @Column(length = 45, name = "name",nullable = false)
    private String name;

    @NotNull
    @Column(length = 100, name="email",nullable = false,unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Authority authority;

    @Column(length = 20,name="phone",nullable = false)
    private String phone;

    @Column(name="grade")
    @Enumerated(EnumType.STRING)
    private Grade grade;

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

    public static Member createMember(MemberDto memberJoin, PasswordEncoder passwordEncoder){
        Member member = new Member();
        member.setName(memberJoin.getName());
        member.setId(memberJoin.getId());
        member.setEmail(memberJoin.getEmail());
        member.setAddress(memberJoin.getAddress());
        member.setGender(memberJoin.getGender());
        member.setBirthDate(memberJoin.getBirthDate());
        String password = passwordEncoder.encode(memberJoin.getPassword());
        member.setPassword(password);
        member.grade = Grade.BASIC;
        return member;
    }
}
