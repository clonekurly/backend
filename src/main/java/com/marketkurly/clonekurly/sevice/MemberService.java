package com.marketkurly.clonekurly.sevice;

import com.marketkurly.clonekurly.domain.Member;
import com.marketkurly.clonekurly.domain.member.Members;
import com.marketkurly.clonekurly.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Members getMemberInfo(String email) {
        return memberRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("유저 정보가 없습니다."));
    }
}
