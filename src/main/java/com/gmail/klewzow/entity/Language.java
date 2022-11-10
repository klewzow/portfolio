package com.gmail.klewzow.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Locale;

public enum Language {
    JAVA("java"), LAYOUT("layout"), C("c"),DEFAULT("no_data");
    private String str;

    Language(String str) {
        this.str = str;
    }

//    @JsonValue
    public String getStr() {
        return str;
    }

//    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
//    public static Language fromText(String text)   {
//        for (Language language : Language.values()) {
//
//            if (language.getStr().equals(text.toLowerCase(Locale.ROOT))) {
//                System.out.println(language.getStr());
//                return language;
//            }
//        }
//        return Language.DEFAULT;
//    }

    @Override
    public String toString() {
        return this.str;
    }
}
