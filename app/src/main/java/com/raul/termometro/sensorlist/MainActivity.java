package com.raul.termometro.sensorlist;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private ArrayList<SensorBean> mArrayListSensores;
    private SensorAdapter mSensorAdapter;
    private ListView mListSensores;
    private SensorManager mSensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArrayListSensores = new ArrayList<SensorBean>();
        /*mArrayListSensores.add("S1");
        mArrayListSensores.add("S2");
        mArrayListSensores.add("S3");
        mArrayListSensores.add("S4");
        mArrayListSensores.add("S5");
        mArrayListSensores.add("S6");
        mArrayListSensores.add("S7");
        mArrayListSensores.add("S8");
        mArrayListSensores.add("S9");
        mArrayListSensores.add("S10");*/
        mArrayListSensores=getSensores();

        mSensorAdapter = new SensorAdapter(this, mArrayListSensores);

        mListSensores = (ListView) findViewById(R.id.listSensores);

        mListSensores.setAdapter(mSensorAdapter);

    }


    public ArrayList<SensorBean> getSensores() {

// Get the SensorManager
        mSensorManager= (SensorManager) getSystemService(SENSOR_SERVICE);

        // List of Sensors Available
        List<Sensor> msensorList = mSensorManager.getSensorList(Sensor.TYPE_ALL);

        ArrayList<SensorBean> sSensList =new ArrayList<SensorBean>();
        Sensor tmp;
        int x,i;
        for (i=0;i<msensorList.size();i++){
            tmp = msensorList.get(i);
            //Toast.makeText(this, tmp.getMaxDelay(),Toast.LENGTH_LONG);
            sSensList.add(new SensorBean(tmp.getName().toString(),tmp.getVendor())); // Add the sensor name to the string of sensors available
        }
        return sSensList;
    }


}
