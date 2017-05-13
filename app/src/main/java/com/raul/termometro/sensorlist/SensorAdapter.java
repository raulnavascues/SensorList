package com.raul.termometro.sensorlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raul on 13/05/2017.
 */

public class SensorAdapter extends ArrayAdapter<SensorBean> {

    public SensorAdapter(Context context, List<SensorBean> sensors){
        super(context,0, sensors);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        SensorBean sensor = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.sensoradapter,parent,false);
        }

        ((TextView) convertView.findViewById(R.id.txt_NombreSensor)).setText(sensor.getNombreSensor());
        ((TextView) convertView.findViewById(R.id.txt_Vendor)).setText(sensor.getFabricanteSensor());
        return convertView;
    }
}
