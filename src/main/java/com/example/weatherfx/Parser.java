package com.example.weatherfx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public static String ParserChar(String string) {
        Pattern pattern = Pattern.compile("[а-яёА-ЯЁ]+(\\s*)(\\-*)[а-яёА-ЯЁ]+(\\s*)(\\-*)[а-яёА-ЯЁ]+");//  [+-]?([0-9]*[.])?[0-9]+   (\+*)\d{1} [а-яёА-ЯЁ]+
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            return matcher.group();
        } else {
            return null;
        }
    }
    public static String ParserChar1(String string) {
        Pattern pattern = Pattern.compile("[0-9][0-9]+(\\s*)[а-яёА-ЯЁ]+(\\s*)(\\-*)[а-яёА-ЯЁ]+");//  [+-]?([0-9]*[.])?[0-9]+   (\+*)\d{1} [а-яёА-ЯЁ]+
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            return matcher.group();
        } else {
            return null;
        }
    }

}
