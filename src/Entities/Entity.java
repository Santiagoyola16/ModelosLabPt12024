/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import java.util.List;
import lab.modelos.Event;
import resources.Server;

/**
 *
 * @author Familia
 */
public abstract class Entity {

    private final int id;

    private Server server;
    private List<Event> events;

    public Entity(int id, Server server, List<Event> events) {
        this.id = id;
        this.server = server;
        this.events = events;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
   
    


}

    
    
    
    
    
    
    
    
    

