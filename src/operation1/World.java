/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation1;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author zheny
 */
public class World {
    private int populationCap;
    private int population;
    private int pollution;
    private int wealth;
    private List<Building> buildings;
    private List<Plant> plants;
    private List<People> people;
    private People player;
    
    
    public World() {
        populationCap = 2;
        population = 1;
        pollution = 25;
        wealth = 0; //make a formula to calculate, or just equal total money, including money spent, or just money spent
        buildings = new ArrayList<Building>();
        plants = new ArrayList<Plant>();
        people = new ArrayList<People>();
        player = new Player(); //edit constructor
        
    }
    
    public void incPopCap(int n) {
        populationCap += n;
    }
    
    public void addPopulation(int n) {
        if(population < populationCap) {
            population += n;
        }
    }
    
    public int getPopulation() {
        return population;
    }
    
    public void addPollution(int n) {
        pollution += n;
    }
    
    public int getPollution() {
        return pollution;
    }
    
    public void addWealth(int n) {
        wealth += n;
    }
    
    public int getWealth() {
        return wealth;
    }
    
    public void addBuilding(Building b) {
        buildings.add(b);
    }
    
    public Building getBuilding(int index) {
        return buildings.get(index);
    }    
    
    public int getBuildingNum() {
        return buildings.size();
    }
    
    public void addPlant(Plant p) {
        plants.add(p);
    }
    
    public Plant getPlant(int index) {
        return plants.get(index);
    }    
    
    public int getPlantNum() {
        return plants.size();
    }
    
    public void addPeople(People p) {
        people.add(p);
    }
    
    public People getPerson(int index) {
        return people.get(index);
    }
    
    public int getPeopleNum() {
        return people.size();
    }
    
    public People getPlayer() { //does this work, actual and apparent?
        return player;
    }
    
    
    
}
