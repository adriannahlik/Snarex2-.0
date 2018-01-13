package de.hftstuttgart.snarex.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.layout.Pane;

public class Controller {

	@FXML
	private Pane pane;

	@FXML
	private Button btnCompare;

	@FXML
	private Button insert;

	@FXML
	private Button read;

	@FXML
	private Button delete;

	@FXML
	private BarChart<?, ?> barChart;

	@FXML
	private CheckBox cbTemperature;

	@FXML
	private CheckBox cbRotations;

	@FXML
	private CheckBox cbPressure;

	@FXML
	private Label lblSensor_1;

	@FXML
	private Label lblDataBase;

	@FXML
	private Label lblActiveAlerts;

	@FXML
	private Label lblSensor;

	@FXML
	private Label lblSensorName;

	@FXML
	private Label lblTimePeriod;

	@FXML
	private Spinner<?> timePeriodSet;

	@FXML
	private ColorPicker temperatureColor;

	@FXML
	private ColorPicker rotationsColor;

	@FXML
	private ColorPicker pressureColor;

	@FXML
	private ComboBox<?> graphType;

	@FXML
	private ComboBox<?> inputType;

	@FXML
	private ComboBox<?> sensorChoice;

	@FXML
	private ComboBox<?> databaseChoice;

	@FXML
	private ComboBox<?> alertChoice;

	@FXML
	void compareClick(ActionEvent event) {

	}

	@FXML
	void deleteClick(ActionEvent event) {

		System.out.println("Daten werden aus der Datenbank gelöscht.");

	}

	@FXML
	void insertClick(ActionEvent event) {

		System.out.println("Werte werden in die Datenbank geschrieben.");

	}

	@FXML
	void readClick(ActionEvent event) {

		System.out.println("Dateien werden aus der Datenbank ausgelesen");

	}

	@FXML
	void rotationsClick(ActionEvent event) {

	}

	@FXML
	void temperatureClick(ActionEvent event) {

	}

	@FXML
	void pressureClick(ActionEvent event) {

	}

}
