/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation1;

/**
 *
 * @author zheny
 */
public class Player extends People {
    private int money;
    
    public Player(String name) {
        super(name);
        money = 100;
    }
    
    public void addMoney(int n) {
        money += n;
    }
}
