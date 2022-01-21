package com.marketkurly.clonekurly.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "member")
@Builder
@Entity
public class Member {

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Authority authority;

}
