package com.raul.termometro.sensorlist;

/**
 * Created by Raul on 13/05/2017.
 */

public class SensorBean {
    private String nombreSensor;
    private String fabricanteSensor;

    public SensorBean() {
        this.setNombreSensor("");
        this.setFabricanteSensor("");
    }

    public SensorBean(String nombreSensor, String fabricanteSensor) {
        this.setNombreSensor(nombreSensor);
        this.setFabricanteSensor(fabricanteSensor);
    }

    public String getNombreSensor() {
        return nombreSensor;
    }

    public void setNombreSensor(String nombreSensor) {
        this.nombreSensor = nombreSensor;
    }

    public String getFabricanteSensor() {
        return fabricanteSensor;
    }

    public void setFabricanteSensor(String fabricanteSensor) {
        this.fabricanteSensor = fabricanteSensor;
    }

    @Override
    public String toString() {
        return "SensorBean{" +
                "nombreSensor='" + this.nombreSensor + '\'' +
                ", fabricanteSensor='" + this.fabricanteSensor + '\'' +
                '}';
    }
}
