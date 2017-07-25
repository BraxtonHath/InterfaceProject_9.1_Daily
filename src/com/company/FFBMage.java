package com.company;

/**
 * Created by braxtonhathaway on 7/24/17.
 */
public class FFBMage extends Mage implements VictoryLine{
        public void Aim() {
            System.out.println("Casting Flare");
        }
        public void HitSuccessful() {
            System.out.println("Target sent to the void");
        }
        public String VictoryString() {
            return "I got 12 exp!";
        }
    }

