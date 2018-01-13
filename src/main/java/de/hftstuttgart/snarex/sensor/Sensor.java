package de.hftstuttgart.snarex.sensor;

import de.hft.wiinf.cebarround.*;
import de.hftstuttgart.snarex.datapoint.Datapoint;
import de.hftstuttgart.snarex.model.Model;

/**
 * Wrapper class around de.hft.wiinf.cebarround.CeBarRoundDataSensorV2;
 *
 */
public class Sensor {

	CeBarRoundDataSensorV2 cebarsensor = new CeBarRoundDataSensorV2();

	/**
	 * basic constructor
	 */
	public Sensor() {

	}

	public void connect() {
		/**
		 * adds Listener and handles SensorEvents
		 */
		cebarsensor.addListener(new CeBarRoundObserver<SensorEvent>() {

			@Override
			public void sensorDataEventListener(SensorEvent sEvent) {
				Datapoint dp = new Datapoint(sEvent);

				synchronized (Model.dpQueue) {
					if (!Model.dpQueue.offer(dp)) {
						Model.dpQueue.offer(dp);
					}
					Model.dpQueue.notify();

				}
			}
			//deliver to Database / Database queue
			//deliver to Plot in view
		});
		cebarsensor.startMeasure();
	}


	/**
	 * closes connection and deletes all Listeners
	 */
	public void close() {

		cebarsensor.stopMeasure();
	}
}
