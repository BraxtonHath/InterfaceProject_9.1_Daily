package com.company;

/**
 * Created by braxtonhathaway on 7/25/17.
 */
public interface Healer{
    String Grateful();
    default String AoeHealing() {
        return "All The Heals";
    }
}