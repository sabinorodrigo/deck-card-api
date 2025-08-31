package com.rsg.deck_api.controller;

import com.rsg.deck_api.model.CardMonster;
import com.rsg.deck_api.service.CardMonsterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
