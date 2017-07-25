package com.company;

public class Main {

    public static void main(String[] args) {
        FFBMage BlackMage = new FFBMage();
        BlackMage.Aim();
        BlackMage.HitSuccessful();
        System.out.println(BlackMage.VictoryString());
        System.out.println("");

        FFWMage WhiteMage = new FFWMage();
        System.out.println(WhiteMage.Healing());
        System.out.println(WhiteMage.Grateful());
        System.out.println(WhiteMage.AoeHealing());
        System.out.println(WhiteMage.speak());
        System.out.println("");

        FFBluMage BlueMage = new FFBluMage();
        System.out.println(BlueMage.Grateful());
        System.out.println(BlueMage.SummonMinion());
        System.out.println(BlueMage.speak());
        System.out.println("");
    }
}
