package org.example.bean;

public class Book {
    private String ad;
    private String yazici;

    public Book() {
    }

    public Book(String ad, String yazici) {
        this.ad = ad;
        this.yazici = yazici;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getYazici() {
        return yazici;
    }

    public void setYazici(String yazici) {
        this.yazici = yazici;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ad='" + ad + '\'' +
                ", yazici='" + yazici + '\'' +
                '}';
    }
}
