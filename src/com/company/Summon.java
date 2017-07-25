package com.company;

/**
 * Created by braxtonhathaway on 7/25/17.
 */
public interface Summon {
    String Grateful();
    default String SummonMinion() {
        return "Summoned Ifrit";
    }
}