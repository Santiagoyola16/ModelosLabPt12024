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
public class Arrival extends Event {

    public Arrival(double clock) {
        super(clock, 0, 2);
    }

    @Override
    public void planificate(FutureEventList fel, List<Server> server) {
        
        
        //buscar server correcto
        
        
        Server s = server.get(0);
        
        if(s.isBusy()){
            s.getQueues().enqueue(this.getEntity());
        }
        else {
            fel.insert(new Departure(this.getClock()+tabla.getTiempo()));
            
            
        }
    }
}
