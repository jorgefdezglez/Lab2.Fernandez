package es.udc.psi.lab2fernandez;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragm2.MyInterface {


    Fragm1 fragm1 = new Fragm1();
    Fragm2 fragm2 = new Fragm2();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager1 = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
        fragmentTransaction1.add(R.id.frame1, fragm2);
        fragmentTransaction1.commit();
        FragmentTransaction fragmentTransaction2 = fragmentManager1.beginTransaction();
        fragmentTransaction2.add(R.id.frame2, fragm1);
        fragmentTransaction2.commit();

    }


    @Override
    public void actionButtonAB(String text) {
        fragm1.activityAB(text);
    }

    @Override
    public void actionButtonC(String text) {
        fragm1.activityC(text);
    }
}