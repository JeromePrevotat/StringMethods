package com.humanbooster.string;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TextFormatter {
    // - `alignLeft(String text, int width)` : Aligne le texte à gauche sur une largeur spécifiée
    // - `alignRight(String text, int width)` : Aligne le texte à droite sur une largeur spécifiée
    // - `alignCenter(String text, int width)` : Centre le texte sur une largeur spécifiée
    // - `createTable(List<String[]> data, int[] columnWidths)` : Génère un tableau formaté avec des colonnes de largeur définie
    // - `wrapText(String text, int lineWidth)` : Adapte le texte à une largeur donnée en préservant l'intégrité des mots
    // - `formatNumber(double number, String pattern)` : Formate un nombre selon un modèle (exemple : "%.2f")
    // - `formatDate(Date date, String pattern)` : Formate une date selon un modèle (exemple : "dd/MM/yyyy")
    // 1. Implémenter des méthodes de mise en forme :
    // - `addBorders(String text)` : Encadre le texte avec des bordures
    // - `addNumbering(String text)` : Numérote les lignes du texte
    // - `highlightWord(String text, String word)` : Souligne un mot spécifique dans le texte
    // - `createReport(Map<String, Object> data)` : Génère un rapport structuré à partir des données


    // Done
    public static String alignLeft(String text, int width){
        if (text == null) return null;
        if (width < 0) return text;
        String spaces = "\n";
        int i = 0;
        String[] words = text.trim()
                            .split("\n");
        while (i < width){
            spaces += " ";
            i++;
        }
        StringBuilder b = new StringBuilder();
        // Ajout spaces EOL
        for (String word : words){
            b.append(word).append(spaces);
        }
        return b.toString();
    }

    // Line length ?
    public static String alignRight(String text, int width){
        if (text == null) return null;
        if (width < 0) return text;
        String spaces = "";
        int i = 0;
        String[] words = text.trim()
                            .split("\n");
        while (i < width){
            spaces += " ";
            i++;
        }
        spaces += "\n";
        StringBuilder b = new StringBuilder();
        // Ajout spaces EOL
        for (String word : words){
            b.append(word).append(spaces);
        }
        return b.toString();
    }

    // Left + Right Line Length ?
    public static String alignCenter(String text, int width){
        return null;
    }

    public static List<String[]> createTable(List<String[]> data, int[] columnWidths){
        if (data == null || columnWidths == null) return null;
        if (columnWidths.length != columnWidths.length) return null;
        for (int n : columnWidths){
            if (n <= 0) return null;
        }
        List<String[]> formatedData = new ArrayList<>();
        StringBuilder b = new StringBuilder();
        int i = 0;
        // Copy List with correct formatting for each String of each Array
        while (i < columnWidths.length - 1){
            for (String[] table : data){
                formatedData.add(new String[Array.getLength(table)]);
                for (String s : table){
                    int tableIndex = 0;
                    int index = 0;
                    while (index < s.length() - 1){
                        if (index + columnWidths[i] < s.length() - 1)
                            b.append(s.substring(index, (index + columnWidths[i]))).append("\n");
                        else
                            b.append(s.substring(index));
                        index += columnWidths[i];
                    }
                    formatedData.get(i)[tableIndex] = b.toString();
                    System.out.print("B: " + b.toString());
                    // Reset
                    b.delete(0, b.length());
                    tableIndex++;
                }
            }            
            i++;
        }
        return formatedData;
    }
}
