package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class MemberEntityServiceTest {

    @Autowired MemberEntityRepository memberEntityRepository;
    @Autowired MemberEntityService memberEntityService;

    @AfterEach
    void clean() {
        memberEntityRepository.deleteAll();
    }

    @Test
    void saveMember1() {
        memberEntityService.saveMember1("김11");

        MemberEntity memberEntity = memberEntityRepository.findByName("김11")
            .orElseThrow(() -> new RuntimeException());

        assertThat(memberEntity.name).isEqualTo("김11");
    }

    @Test
    void saveMember2() {
        memberEntityService.saveMember2("김11");

        MemberEntity memberEntity = memberEntityRepository.findByName("김11")
            .orElseThrow(() -> new RuntimeException());

        assertThat(memberEntity.name).isEqualTo("김11");
    }

    @Test
    void saveMember3() {
        memberEntityService.saveMember3("김11");

        MemberEntity memberEntity = memberEntityRepository.findByName("김11")
            .orElseThrow(() -> new RuntimeException());

        assertThat(memberEntity.name).isEqualTo("김11");
    }
}