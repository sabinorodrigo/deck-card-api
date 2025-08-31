package com.rsg.deck_api.dto;

import com.rsg.deck_api.model.CardMonster;

public class CardMonsterMapper {

    public static CardMonsterDTO toDTO(CardMonster monster) {
        if (monster == null) return null;

        CardMonsterDTO dto = new CardMonsterDTO();
        dto.setPasscode(monster.getPasscode());
        dto.setName(monster.getName());
        dto.setCardType(monster.getCardType());
        dto.setAttribute(monster.getAttribute());
        dto.setType(monster.getType());
        dto.setLevel(monster.getLevel());
        dto.setAttack(monster.getAttack());
        dto.setDefense(monster.getDefense());
        dto.setStatuses(monster.getStatuses());

        return dto;
    }

    public static CardMonster toCardMonster(CardMonsterDTO dto) {
        if (dto == null) return null;

        CardMonster monster = new CardMonster();
        monster.setPasscode(dto.getPasscode());
        monster.setName(dto.getName());
        monster.setCardType(dto.getCardType());
        monster.setAttribute(dto.getAttribute());
        monster.setType(dto.getType());
        monster.setLevel(dto.getLevel());
        monster.setAttack(dto.getAttack());
        monster.setDefense(dto.getDefense());
        monster.setStatuses(dto.getStatuses());

        return monster;
    }
}
