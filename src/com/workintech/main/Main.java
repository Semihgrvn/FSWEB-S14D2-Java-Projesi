package com.workintech.main;

import com.workintech.enums.Direction;
import com.workintech.enums.LampType;
import com.workintech.enums.PaintColor;
import com.workintech.model.*;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom("Emre",
                new Wall(Direction.NORTH),
                new Wall(Direction.SOUTH),
                new Wall(Direction.WEST),
                new Wall(Direction.EAST),
                new Ceilling(3, PaintColor.RED),
                new Lamp(LampType.LAVA, true, 3),
                new Wardrobe(2,3, 950),
                new Carpet(3,5, PaintColor.RED),
                new Bed("Yaylı Yatak", 2, 1, 2,4));

        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
        bedroom.getWardrobe().add();
        bedroom.getCarpet().lying();
        System.out.println("////////////////////");
        System.out.println(bedroom.getBed());
        System.out.println(bedroom.getLamp());

    }
}