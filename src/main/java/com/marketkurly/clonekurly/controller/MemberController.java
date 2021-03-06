package com.marketkurly.clonekurly.controller;

import com.marketkurly.clonekurly.controller.dto.member.MemberDto;
import com.marketkurly.clonekurly.controller.dto.member.MemberResponseDto;
import com.marketkurly.clonekurly.sevice.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/member")
    public Long saveMember(@RequestBody MemberDto memberDto){
        return memberService.save(memberDto);
    }

    @GetMapping("/{email}")
    public ResponseEntity<MemberResponseDto> getMemberInfo(@PathVariable String email) {
        return ResponseEntity.ok(memberService.getMemberInfo(email));
    }

    @GetMapping("/me")
    public ResponseEntity<MemberResponseDto> getMyInfo() {
        return ResponseEntity.ok(memberService.getMyInfo());
    }
}
