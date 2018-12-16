package com.example.nishat.storyteller.model;

/**
 * Created by Nishat on 3/12/2017.
 */

public class Page {
    private int imageId;
    private String text;
    private Choice choice1;
    private Choice choice2;
    private boolean isFinal = false;

    public Page(int imageId, String text, Choice choice1, Choice choice2) {
        this.text = text;
        this.imageId = imageId;
        this.choice1 = choice1;
        this.choice2 = choice2;
    }

    public Page(int imageId, String text) {
        this.text = text;
        this.imageId = imageId;
        choice1 = null;
        choice2 = null;
        isFinal = true;

    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Choice getChoice1() {
        return choice1;
    }

    public void setChoice1(Choice choice1) {
        this.choice1 = choice1;
    }

    public Choice getChoice2() {
        return choice2;
    }

    public void setChoice2(Choice choice2) {
        this.choice2 = choice2;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
