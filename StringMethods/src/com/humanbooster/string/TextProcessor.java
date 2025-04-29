package com.humanbooster.string;

import java.util.Arrays;

public class TextProcessor {
    // countWords(String text) : Compte le nombre de mots dans un texte en utilisant split et en gérant les espaces multiples
    // countOccurrences(String text, String word) : Compte les occurrences d'un mot en ignorant la casse
    // reverse(String text) : Inverse une chaîne en utilisant StringBuilder
    // removeDuplicates(String text) : Supprime les mots en double en préservant l'ordre d'apparition
    // extractWords(String text) : Extrait tous les mots dans un tableau en gérant les espaces multiples

    // Implémenter des méthodes de transformation :
    // toTitleCase(String text) : Met la première lettre de chaque mot en majuscule
    // toCamelCase(String text) : Convertit un texte en camelCase (ex: "hello world" -> "helloWorld")
    // toSnakeCase(String text) : Convertit un texte en snake_case (ex: "hello world" -> "hello_world")
    // compress(String text) : Supprime les espaces multiples et les espaces en début/fin

    // done
    public static int countWords(String text){
        if (text == null) return 0;
        if (text.equals("")) return 0;
        String[] words = text.trim()
                    .split("\\s+");
        String s = "";
        for (String w : words){
            s += w;
        }
        return (words.length == 1 && words[0].equals("")) ? 0 : words.length;
    }

    // not done
    public static int countOccurrences(String text, String word){
        word = word.toLowerCase();
        text.toLowerCase();
        return 0;
    }

    // done
    public static String reverse(String text){
        if (text == null) return "";
        StringBuilder b = new StringBuilder(text);
        return b.reverse().toString();
    }

    //not done
    public static String removeDuplicates(String text){
        if (text == null) return null;
        String[] s = text.replace("\\n","")
                    .replace("\\t","")
                    .replace("\\r","")
                    .trim().split("\\ ");
        return Arrays.toString(s);
    }

    // done
    public static String[] extractWords(String text){
        if (text == null) return null;
        return text.replace("\\n","")
                    .replace("\\t","")
                    .replace("\\r","")
                    .trim()
                    .split("\\ ");
    }

    // done
    public static String toTitleCase(String text){
        if (text == null) return null;
        StringBuilder b = new StringBuilder();
        int i = 0;
        String[] words = text.replace("\\n","")
                            .replace("\\t","")
                            .replace("\\r","")
                            .trim()
                            .toLowerCase()
                            .split("\\ ");
        while (i < text.length()) {
            String word = words[i];
            word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();      
            b.append(word).append(" ");
            i++;
        }
        return b.toString();
    }

    // done
    public static String toCamelCase(String text) {
        if (text == null) return null;
        StringBuilder b = new StringBuilder();
        int i = 0;
        String[] words = text.replace("\\n","")
                            .replace("\\t","")
                            .replace("\\r","")
                            .trim()
                            .toLowerCase()
                            .split("\\s+");
        while (i < text.length()) {
            String word = words[i];
            word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();      
            b.append(word);
            i++;
        }
        return b.toString();
    }

    public static String toSnakeCase(String text){
        if (text == null) return null;
        StringBuilder b = new StringBuilder();
        int i = 0;
        String[] words = text.replace("\\n","")
                            .replace("\\t","")
                            .replace("\\r","")
                            .trim()
                            .toLowerCase()
                            .split("\\ ");
        while (i < text.length()) {
            String word = words[i];
            word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();      
            b.append(word).append("_");
            i++;
        }
        return b.toString();
    }
}
