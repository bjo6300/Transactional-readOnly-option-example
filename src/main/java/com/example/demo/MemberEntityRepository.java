package com.example.demo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberEntityRepository extends JpaRepository<MemberEntity, Long> {
    Optional<MemberEntity> findByName(String name);
}
