package com.niyati.designpattern.behavioral.memento;

public class Originator {
    private String article;

    public Originator() {
        //Default constructor
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public Memento saveToMemento() {
        return new Memento(article);
    }

    public void restoreFromMemento(Memento memento) {
        this.article = memento.getState();
    }

}
