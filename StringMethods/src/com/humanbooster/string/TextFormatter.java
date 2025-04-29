package com.humanbooster.string;

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

    public static String alignLeft(String text, int width){
        if (text == null) return null;
        if (width < 0) return text;
        String spaces = "";
        int i = 0;
        while (i < width){
            spaces.
            // i++;
        }
        StringBuilder b = new StringBuilder();

        return null;
    }
}
