package com.marketkurly.clonekurly.controller.dto;


import com.marketkurly.clonekurly.domain.member.Gender;
import com.marketkurly.clonekurly.domain.member.Member;
import lombok.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;

@Data
@Getter @Setter
@NoArgsConstructor
public class MemberDto {
    private Long id;
    private String password;
    private String name;
    private String email;
    private String phone;
    private String address;
    private Gender gender;
    private Date birthDate;

    @Builder
    public MemberDto(Long id, String password, String name, String email, String phone, String address, Gender gender, Date birthDate){
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
        this.birthDate = birthDate;
    }

    public Member toEntity(){
        return Member.builder()
                .id(id)
                .password(new BCryptPasswordEncoder().encode(password))
                .email(email)
                .address(address)
                .gender(gender)
                .phone(phone)
                .birthDate(birthDate)
                .build();
    }

}
