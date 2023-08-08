package com.workintech.model;

import com.workintech.enums.PaintColor;

public class Ceilling {

    private int height;
    private PaintColor color;

    public Ceilling(int height, PaintColor color) {
        this.height = height;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void create(){
        System.out.println("Ceiling with "+ height+ " and color with "+ color+" has been created. ");
    }

}