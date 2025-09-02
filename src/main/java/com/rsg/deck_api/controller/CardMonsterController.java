package com.rsg.deck_api.controller;

import com.rsg.deck_api.model.CardMonster;
import com.rsg.deck_api.service.CardMonsterService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/deck")
public class CardMonsterController {

    public final CardMonsterService cardMonsterService;

    public CardMonsterController(CardMonsterService cardMonsterService) {
        this.cardMonsterService = cardMonsterService;
    }

    @PostMapping
    public ResponseEntity<CardMonster> saveCardMonster(@RequestBody CardMonster monster) {
        CardMonster saved = cardMonsterService.saveMonster(monster);
        return ResponseEntity
                .status(HttpStatus.CREATED) // 201
                .body(saved);               // corpo com o novo objeto
    }

    @GetMapping
    public List<CardMonster> getAllMonster() {
        return cardMonsterService.findAllMonster();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CardMonster> getMonsterById(@PathVariable String id) {
        return cardMonsterService.findCardById(id)
                .map(ResponseEntity::ok) // retorna 200 OK com o objeto
                .orElse(ResponseEntity.notFound().build()); // retorna 404
    }

    @PutMapping
    public CardMonster  cardUpdate(@RequestBody CardMonster monster) {
        cardMonsterService.updateMonster(monster);
        return monster;
    }

    @DeleteMapping("/{id}")
    public void deleteMonsterCard(@PathVariable String id) {
        cardMonsterService.deleteCard(id);
    }
}
