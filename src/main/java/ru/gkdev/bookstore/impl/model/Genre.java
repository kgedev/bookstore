package ru.gkdev.bookstore.impl.model;

import com.fasterxml.jackson.annotation.JsonValue;

enum Genre{
    FANTASY("fantasy"),
    NOVEL("novel"),
    COMEDY("comedy"),
    FICTION("fiction"),
    DRAMA("drame"),
    DYSTOPIA("dystopia"),
    MELODRAMA("melodrama"),
    THRILLER("thriller"),
    DETECTIVE("detective"),
    LOVE_STORY("love story"),
    ADVENTURE_STORY("adventure story");

    private String jsonValue;

    private Genre(final String json) {
        this.jsonValue = json;
    }

    @JsonValue
    public String jsonValue() {
        return this.jsonValue;
    }
}