package com.example.demo;

import java.net.URI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberEntityController {

    private final MemberEntityService memberEntityService;

    @PostMapping("/save1")
    public ResponseEntity<Void> save1(String name) {
        memberEntityService.saveMember1(name);
        URI uri = URI.create("/save1");

        return ResponseEntity.created(uri).build();
    }

    @PostMapping("/save2")
    public ResponseEntity<Void> save2(String name) {
        memberEntityService.saveMember2(name);
        URI uri = URI.create("/save2");

        return ResponseEntity.created(uri).build();
    }

    @PostMapping("/save3")
    public ResponseEntity<Void> save3(String name) {
        memberEntityService.saveMember3(name);
        URI uri = URI.create("/save1");

        return ResponseEntity.created(uri).build();
    }
}
