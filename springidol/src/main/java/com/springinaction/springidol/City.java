package com.springinaction.springidol;

/**
 * SpEL 操作集合元素
 * Created by dujiang on 2016/4/25.
 */
public class City {
    private String name ;
    private String state;//州
    private int population;//人口

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
