package com.rsg.deck_api.service;

import com.rsg.deck_api.controller.CardMonsterController;
import com.rsg.deck_api.model.CardMonster;
import com.rsg.deck_api.repository.CardMonsterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardMonsterService {

    public final CardMonsterRepository cardMonsterRepository;

    public CardMonsterService(CardMonsterRepository cardMonsterRepository) {
        this.cardMonsterRepository = cardMonsterRepository;
    }

    public List<CardMonster> findAllMonster() {
        return cardMonsterRepository.findAll();
    }

    public CardMonster saveMonster(CardMonster monster) {
        return cardMonsterRepository.save(monster);
    }
}
