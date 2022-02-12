package com.marketkurly.clonekurly.controller.dto.member;

import com.marketkurly.clonekurly.domain.member.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberResponseDto {


    public String email;
    public static MemberResponseDto of(Member member) {
        return new MemberResponseDto(member.getEmail());
    }


}
