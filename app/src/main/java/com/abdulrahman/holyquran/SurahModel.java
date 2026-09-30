package com.abdulrahman.holyquran;

public class SurahModel {
    private final String surahName;
    private final String dropOffLocation;
    private final int numberOfVerses;
    private final int numberOfPages;
    private final int numberOfSurah;

    public SurahModel(String surahName, String dropOffLocation, int numberOfVerses, int numberOfSurah, int numberOfPages) {
        this.surahName = surahName;
        this.dropOffLocation = dropOffLocation;
        this.numberOfVerses = numberOfVerses;
        this.numberOfPages = numberOfPages;
        this.numberOfSurah = numberOfSurah;
    }

    public String getSurahName() {
        return surahName;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public int getNumberOfVerses() {
        return numberOfVerses;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getNumberOfSurah() {
        return numberOfSurah;
    }
}
