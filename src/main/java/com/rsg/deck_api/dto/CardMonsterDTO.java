package com.rsg.deck_api.dto;

import java.math.BigDecimal;

public class CardMonsterDTO {

    private String passcode;

    private String name;

    private String cardType;

    private String attribute;

    private String type;

    private Integer level;

    private BigDecimal attack;

    private BigDecimal defense;

    private String statuses;

    public CardMonsterDTO() {}

    public CardMonsterDTO(String passcode, String name, String cardType, String attribute,
                          String type, Integer level, BigDecimal attack, BigDecimal defense,
                          String statuses) {
        this.passcode = passcode;
        this.name = name;
        this.cardType = cardType;
        this.attribute = attribute;
        this.type = type;
        this.level = level;
        this.attack = attack;
        this.defense = defense;
        this.statuses = statuses;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public BigDecimal getAttack() {
        return attack;
    }

    public void setAttack(BigDecimal attack) {
        this.attack = attack;
    }

    public BigDecimal getDefense() {
        return defense;
    }

    public void setDefense(BigDecimal defense) {
        this.defense = defense;
    }

    public String getStatuses() {
        return statuses;
    }

    public void setStatuses(String statuses) {
        this.statuses = statuses;
    }
}
