package com.rohit.android.fragmentfactorymethod;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleFragment extends Fragment {

    public static final String MESSAGE_KEY = "message_key";

    public SimpleFragment() {
        // Required empty public constructor
    }



    // Factory method to pass the data Activity to fragment
    public static SimpleFragment newInstance(String  message) {
        // Bundle object
        Bundle args = new Bundle();

        // setting the data to bundle object
        args.putString(SimpleFragment.MESSAGE_KEY, message);

        // creating the fragment object
        SimpleFragment fragment = new SimpleFragment();

        // setting the argument
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple, container, false);

        Bundle arguments = getArguments();
        if (arguments != null) {
            String message = arguments.getString(MESSAGE_KEY);
            TextView tvMessage = (TextView) view.findViewById(R.id.message);
            tvMessage.setText(message);
        }

        return view;
    }

}
