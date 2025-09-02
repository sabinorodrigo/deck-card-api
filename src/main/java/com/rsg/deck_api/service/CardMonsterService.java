package com.rsg.deck_api.service;

import com.rsg.deck_api.controller.CardMonsterController;
import com.rsg.deck_api.model.CardMonster;
import com.rsg.deck_api.repository.CardMonsterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public CardMonster updateMonster(CardMonster monster) {
        cardMonsterRepository.save(monster);
        return monster;
    }

    public Optional<CardMonster> findCardById(String id) {
        var idConverted = Integer.parseInt(id);
        return cardMonsterRepository.findById(String.valueOf(idConverted));
    }

    public void deleteCard(String id) {
        cardMonsterRepository.deleteById(id);
    }
}
