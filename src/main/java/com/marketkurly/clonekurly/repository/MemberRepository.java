package com.marketkurly.clonekurly.repository;

import com.marketkurly.clonekurly.domain.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.Optional;
import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {


    Optional<Member> findByEmail(String email);
    boolean existsByEmail(String email);


}
