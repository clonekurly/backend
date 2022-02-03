package com.marketkurly.clonekurly.domain.member;

//실제 member 테이블과 매칭될 클래스,entity class 

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.*;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.crypto.Data;

import com.marketkurly.clonekurly.domain.Authority;



@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
@Setter
@Entity
@Table(name = "members")


public class Members {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="id",nullable = false) 
     private Long id;
     
     @Column(length = 225, name = "password",nullable = false)
     private String password;

     @Column(length = 45, name = "name",nullable = false)
     private String name;

     @Column(length = 100, name="email",nullable = false)
     private String email;

     @Column(length = 20,name="phone",nullable = false)
     private String phone;

     @Column(length = 45,name="grade")
     private String grade;

     @Column(length = 400, name = "address",nullable = false)
     private String address;

     @Column(name="brithdate")
     private Date birthDate;

     @Column(length = 2, name = "gender")
     private String gender;

     //joinDate 자동 표시 
     @Temporal(TemporalType.TIMESTAMP)
     private Date joineDate;
     
     @Enumerated(EnumType.STRING)
     @Column(nullable = false)
     private Authority authority;
}