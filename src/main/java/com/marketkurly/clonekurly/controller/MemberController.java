package com.marketkurly.clonekurly.controller;


import com.marketkurly.clonekurly.domain.member.Members;
import com.marketkurly.clonekurly.sevice.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jdk.internal.org.jline.utils.Log;

@Controller
@RestController
@RequestMapping("members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/member")
    public ResponseEntity member(@RequestBody Members req){
        Log.info("id = {}, password = {}, name ={},email={},phone={},address={},brithdate={}",req.getId(),req.getPassword(),req.getName(),req.getEmail(),req.getPhone(),req.getAddress(),req.getBirthDate());
        //logic 추가하기 
        
        return null;
            
    }


    @GetMapping("/{email}")
    public ResponseEntity<Members> getMemberInfo(@PathVariable String email) {
        return ResponseEntity.ok(memberService.getMemberInfo(email));
    }
    
}
