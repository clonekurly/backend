package com.marketkurly.clonekurly.sevice;

import com.marketkurly.clonekurly.controller.dto.member.MemberDto;
import com.marketkurly.clonekurly.controller.dto.member.MemberResponseDto;
import com.marketkurly.clonekurly.repository.MemberRepository;
import com.marketkurly.clonekurly.security.util.SecurityUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    //회원가입
    @Transactional
    public Long save(MemberDto memberDto){
        return memberRepository.save(memberDto.toEntity()).getId();
    }


//
//   @Transactional
//   public Member saveMember(Member member){
//       validateDuplicateMember(member);
//       return memberRepository.save(member);
//   }
//
//   private void validateDuplicateMember(Member member){
//       Optional<Member> findMember = memberRepository.findByEmail(member.getEmail());
//       if(findMember != null){
//           throw new IllegalStateException("이미 가입된 회원입니다.");
//       }
//   }



    @Transactional
    public MemberResponseDto getMemberInfo(String email) {
        return memberRepository.findByEmail(email)
                .map(MemberResponseDto::of)
                .orElseThrow(() -> new RuntimeException("유저 정보가 없습니다."));
    }

    @Transactional
    public MemberResponseDto getMyInfo() {
        return memberRepository.findById(SecurityUtil.getCurrentMemberId())
                .map(MemberResponseDto::of)
                .orElseThrow(() -> new RuntimeException("로그인 유저 정보가 없습니다."));
    }

}
