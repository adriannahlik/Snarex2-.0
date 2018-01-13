package de.hftstuttgart.snarex.datapoint;

import java.io.IOException;

import de.hftstuttgart.snarex.controller.Controller;
import de.hftstuttgart.snarex.launcher.Launcher;
import de.hftstuttgart.snarex.model.Model;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.chart.XYChart;

public class DpConsumer extends Thread{

    public DpConsumer(){
        System.out.println("dpc created");
    }
    @Override
    public void run(){
        try{
            System.out.println("dpc running");
            synchronized (Model.dpQueue){
                while(!isInterrupted()) {
                    if (Model.dpQueue.isEmpty()) {
                        Model.dpQueue.wait();
                        }

                Datapoint dp = Model.dpQueue.take();
                graphPlotter(dp);
                }
            }
        }
        catch(InterruptedException e){
            interrupt();
            System.out.println(this.getClass().toString() + "was interrupted");
        }

    }
    public static XYChart.Series[] graphPlotter (Datapoint datapoint) {
    	
    
    	
        XYChart.Series series = new XYChart.Series();
        XYChart.Series series_1 = new XYChart.Series();
        XYChart.Series series_2 = new XYChart.Series();
     // System.out.println(datapoint.getSekunden() + Double.toString(datapoint.getPressure()));
        series.getData().add(new XYChart.Data<>(datapoint.getSekunden(), datapoint.getTemperature()));
        series_1.getData().add(new XYChart.Data<>(datapoint.getSekunden(), datapoint.getPressure()));
        series_2.getData().add(new XYChart.Data<>(datapoint.getSekunden(), datapoint.getRevolutions()));
//        controller.temperatureChart.getData().addAll(series);
//		controller.pressureChart.getData().addAll(series_1);
//		controller.rotationsChart.getData().addAll(series_2);
        XYChart.Series chartSeries[] = {series, series_1, series_2};
        
		return chartSeries;
		

        //XYChart.Series seriesArr[] = {series, series_1, series_2};
        //Launcher.c.finalPlotter(seriesArr);
    }


    
    
}
