/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resources;

import Entities.Entity;

/**
 *
 * @author Familia
 */
public interface Queue {

    int getId();

    int getSize();

    boolean isEmpty();

    void enqueue(Entity entity);

    Entity checkNext();

    Entity dequeue();

    //Entity checkLast();
    
}
