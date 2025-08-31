package com.rsg.deck_api.repository;

import com.rsg.deck_api.model.CardMonster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardMonsterRepository extends JpaRepository<CardMonster, String> {
}
