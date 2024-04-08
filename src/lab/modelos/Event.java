/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.modelos;

import java.util.List;
import resources.Server;

/**
 *
 * @author Familia
 */
public abstract class Event {
    
     private final double clock;
     private final double entity;
     private final int order;

    public Event(double clock, double entity, int ordering) {
        this.clock = clock;
        this.entity = entity;
        this.order = ordering;
    }

    public double getClock() {
        return clock;
    }

    public double getEntity() {
        return entity;
    }
    
    public int getOrdering(){
        return this.order;
    }
    
    public abstract void planificate(FutureEventList fel, List<Server> server);
}
