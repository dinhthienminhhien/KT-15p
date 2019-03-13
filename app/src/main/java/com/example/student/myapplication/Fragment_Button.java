package com.example.student.myapplication;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment_Button extends Fragment {

    Button btn_a , btn_b , btn_c ;

    truyendl tdl ;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_button,container,false);


        btn_a = (Button) view.findViewById(R.id.btn_a);
        btn_b = (Button) view.findViewById(R.id.btn_b);
        btn_c = (Button) view.findViewById(R.id.btn_c);

        FragmentManager fragmentManager = getFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        tdl = (truyendl) getActivity();


        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               tdl.thaydoi ("This is A");

            }
        });

        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tdl.thaydoi("This is B");
            }
        });

        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tdl.thaydoi("This is C");
            }
        });
        return view ;
    }
}
