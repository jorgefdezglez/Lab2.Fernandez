package es.udc.psi.lab2fernandez;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class Fragm1 extends Fragment {

    public void activityAB(String text){
        TextView textView =  getView().findViewById(R.id.tv1);
        textView.setText(text);
    }
    public void activityC(String text){
        WebView myWebView = (WebView)getActivity().findViewById(R.id.webview);
        myWebView.loadUrl("https://www.fic.udc.es/");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragm1, container, false);
    }
}