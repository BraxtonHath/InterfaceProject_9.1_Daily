package com.company;

/**
 * Created by braxtonhathaway on 7/24/17.
 */
public abstract class Mage {
    private String name;
    private String rank;
    private Integer serialNumber;

    Mage(String name, String rank, Integer serialNumber) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
    }

    public Mage() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void sleep() {
        System.out.println("snore");
    }

    public void eat() {
        System.out.println("chew");
    }

    public void trudge() {
        System.out.println("trudge");
    }
    // Speak will be extended
    public String speak() {
       return "Reporting in";
    }
}
