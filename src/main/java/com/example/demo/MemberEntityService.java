package com.example.demo;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberEntityService {

    private final MemberEntityRepository memberEntityRepository;

    @Transactional
    public void saveMember1(String name) {
        MemberEntity memberEntity = new MemberEntity(name);
        memberEntityRepository.save(memberEntity);
        System.out.println("1 - Transactional");
    }

    @Transactional(readOnly = true)
    public void saveMember2(String name) {
        MemberEntity memberEntity = new MemberEntity(name);
        memberEntityRepository.save(memberEntity);
        System.out.println("2 - Transactional");
    }

    public void saveMember3(String name) {
        MemberEntity memberEntity = new MemberEntity(name);
        memberEntityRepository.save(memberEntity);
        System.out.println("3 - Transactional 완료");
    }

    public String findMemberName(String name) {
        MemberEntity memberEntity = memberEntityRepository.findByName(name)
            .orElseThrow(() -> new RuntimeException("z"));

        return memberEntity.name;
    }
}
