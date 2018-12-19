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
public abstract class People {
    private String name;
    
    public People(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
