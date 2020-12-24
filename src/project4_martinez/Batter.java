/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4_martinez;

/**
 *
 * @author Ettienne Martinez
 */
class Batter {
    
    private String name;
    private String position;
    private double average;
    
    /**
     * 
     * @param name Name of the Batter.
     * @param position Position of the Batter.
     * @param average Batter's batting average.
     */
    public Batter(String name, String position, double average) {
        this.name = name;
        this.position = position;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}