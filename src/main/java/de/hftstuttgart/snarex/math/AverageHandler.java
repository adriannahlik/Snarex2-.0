package de.hftstuttgart.snarex.math;

import de.hftstuttgart.snarex.datapoint.Datapoint;

import java.util.LinkedList;
import java.util.Queue;

public class AverageHandler {


    private double tempAvg = 0;
    private int queueLength = 10; //placeholder, to be connected to UI selector
    private boolean full = false;
    private Queue<Datapoint> dpQueue = new LinkedList<>();

    public int getQueueLength() {
        return queueLength;
    }

    public void setQueueLength(int queueLength) {
        this.queueLength = queueLength;
    }

    public double getTempAvg() {
        return tempAvg;
    }


    public void updateTemperature(Datapoint dp){

        tempAvg += dp.getTemperature()/queueLength;
        dpQueue.add(dp);
        if(full){
            Datapoint dpOld = dpQueue.remove();
            tempAvg-= dpOld.getTemperature()/queueLength;

        }
        else if(dpQueue.size()==queueLength-1){
                full = true;
        }
    }

}

