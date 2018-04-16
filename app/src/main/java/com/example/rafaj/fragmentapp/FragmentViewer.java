package com.example.rafaj.fragmentapp;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rafaj on 8/4/2018.
 */

public class FragmentViewer extends Fragment {
    ImageView imagen;
    TextView text1;
    TextView text2;
    TextView text3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewer_fragment, container, false);

        text1 = view.findViewById(R.id.textId1);
        text2 = view.findViewById(R.id.textId2);
        text3 = view.findViewById(R.id.textId3);
        imagen = view.findViewById(R.id.img);
        Bundle bundle = this.getArguments();


        if(bundle != null){
            Carro carro = (Carro)bundle.getSerializable("CAR");
            Toast.makeText(getActivity(), "Item: " + carro.getMarca(), Toast.LENGTH_SHORT).show();
            imagen.setImageResource(carro.getImagen());
            text1.setText(carro.getMarca());
            text2.setText(carro.getModelo());
            text3.setText(carro.getAño());
        }

        return view;
    }


}
