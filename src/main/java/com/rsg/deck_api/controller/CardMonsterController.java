package com.rsg.deck_api.controller;

import com.rsg.deck_api.model.CardMonster;
import com.rsg.deck_api.service.CardMonsterService;
import jakarta.validation.Valid;
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
    public CardMonster saveCardMonster(@RequestBody CardMonster monster) {
        return cardMonsterService.saveMonster(monster);
    }

    @GetMapping
    public List<CardMonster> getAllMonster() {
        return cardMonsterService.findAllMonster();
    }

    @GetMapping("./{id}")
    public Optional<CardMonster> deleteMonsterById(@PathVariable String id) {
        var idConverted = Integer.parseInt(id);
        return cardMonsterService.findCardById(String.valueOf(idConverted));
    }

    @PutMapping
    public CardMonster  cardUpdate(CardMonster monster) {
        cardMonsterService.updateMonster(monster);
        return monster;
    }
}
