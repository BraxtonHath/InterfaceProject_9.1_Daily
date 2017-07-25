package com.company;

/**
 * Created by braxtonhathaway on 7/25/17.
 */
public class FFBluMage extends Mage implements Summon{
    public String Grateful() {
        return "Please Come";
    }
    public String SummonMinion() {
        return "You Summoned Ifrit";
    }
    @Override
    public String speak() {
        return "I Got 14 exp!";
    }
}
