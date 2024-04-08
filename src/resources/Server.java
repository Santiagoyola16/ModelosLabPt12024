package resources;


import Entities.Entity;
import java.util.List;
import resources.Queue;



public abstract class Server {

    private int id;

    private Entity currentEntity;

    private List<Queue> queues;


    public Server() {}

    public Server(int id, List<Queue> queues) {
        this.id=id;
        this.queues=queues;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Entity getCurrentEntity() {
        return this.currentEntity;
    }

    public void setCurrentEntity(Entity currentEntity) {
        this.currentEntity = currentEntity;
    }

    public boolean isBusy() {
        return this.currentEntity!=null;
    }

    public List<Queue> getQueues(){
        return this.queues;
    }



}


