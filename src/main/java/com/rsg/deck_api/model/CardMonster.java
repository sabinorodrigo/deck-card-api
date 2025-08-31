package com.rsg.deck_api.model;

import java.math.BigDecimal;

public class CardMonster {

    private String passcode;

    private String name;

    private String cardType;

    private String attribute;

    private String type;

    private Integer level;

    private BigDecimal attack;

    private BigDecimal defense;

    private String statuses;

    @Override
    public String toString() {
        return "CardMonster{" +
                "passcode='" + passcode + '\'' +
                ", name='" + name + '\'' +
                ", cardType='" + cardType + '\'' +
                ", attribute='" + attribute + '\'' +
                ", type='" + type + '\'' +
                ", level=" + level +
                ", attack=" + attack +
                ", defense=" + defense +
                ", statuses='" + statuses + '\'' +
                '}';
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
