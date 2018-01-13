package de.hftstuttgart.snarex.datapoint;

import de.hft.wiinf.cebarround.SensorEvent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datapoint {

	private int id;
	private double temperature;
	private double pressure;
	private double revolutions;
	private String sekunden;
	private LocalDateTime date;

	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

	public Datapoint() {
	};

	public Datapoint(SensorEvent sEvent) {
		this.date = LocalDateTime.now();
		this.temperature = sEvent.getTemperature();
		this.pressure = sEvent.getPressure();
		this.revolutions = sEvent.getRevolutions();
		this.sekunden = date.format(formatter);
	}

	public Datapoint(double temperature, double pressure, double revolutions) { // ???
		this.temperature = temperature;
		this.pressure = pressure;
		this.revolutions = revolutions;
		this.date = LocalDateTime.now();
		this.sekunden = date.format(formatter);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getSekunden() {
		return sekunden;
	}

	public void setSekunden(String sekunden) {
		this.sekunden = sekunden;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	public double getRevolutions() {
		return revolutions;
	}

	public void setRevolutions(double revolutions) {
		this.revolutions = revolutions;
	}

	public double getTemperature() {

		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
}
