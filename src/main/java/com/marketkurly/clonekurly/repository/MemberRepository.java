package com.marketkurly.clonekurly.repository;

import com.marketkurly.clonekurly.domain.Member;
import com.marketkurly.clonekurly.domain.member.Members;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Members, Long> {
    Optional<Members> findByEmail(String email);
}
