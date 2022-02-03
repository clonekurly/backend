package com.marketkurly.clonekurly.sevice;

import com.marketkurly.clonekurly.domain.member.Members;
import com.marketkurly.clonekurly.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public String member(Members req){
        memberRepository.save(Members.builder()
                        .id(req.getId())
                        .password(req.getPassword())
                        .name(req.getName())
                        .email(req.getEmail())
                        .phone(req.getPhone())
                        .address(req.getAddress())
                        .joineDate(req.getJoineDate())
                        .birthDate(req.getBirthDate())
                        .grade(req.getGrade())
                        .build());
            return "Success";

    }

    @Transactional
    public Members getMemberInfo(String email) {
        return memberRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("유저 정보가 없습니다."));
    }
}
