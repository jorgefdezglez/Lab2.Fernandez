package es.udc.psi.lab2fernandez;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * * create an instance of this fragment.
 */
public class Fragm2 extends Fragment {

    public interface MyInterface{
        public void actionButtonAB(String text);
        public void actionButtonC(String text);
    }

    MyInterface listener;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listener = (MyInterface) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement OnArticleSelectedListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragm2, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        Button botonA = getActivity().findViewById(R.id.button1);
        Button botonB = getActivity().findViewById(R.id.button2);
        Button botonC = getActivity().findViewById(R.id.button3);

        botonA.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                listener.actionButtonAB(getResources().getString(R.string.botonA));
            }
        });

        botonB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                listener.actionButtonAB(getResources().getString(R.string.botonB));
            }
        });

        botonC.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                listener.actionButtonC(Integer.valueOf(R.string.botonC).toString());
            }
        });
    }
}
