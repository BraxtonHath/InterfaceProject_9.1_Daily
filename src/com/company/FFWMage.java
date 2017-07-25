package com.company;

/**
 * Created by braxtonhathaway on 7/24/17.
 */
public class FFWMage extends Mage implements Healing {
    public String Healing() {
        return "Casting Holy!";
    }

    public String Grateful() {
        return "You have been Healed";
    }
    @Override
    public String speak() {
        return "I got 13 exp!";
    }
}
