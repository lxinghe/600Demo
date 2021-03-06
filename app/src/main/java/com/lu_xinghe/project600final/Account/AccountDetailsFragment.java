package com.lu_xinghe.project600final.Account;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.lu_xinghe.project600final.R;


public class AccountDetailsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private  String userName,  email,  major,  about,  status;
    TextView userNameIV,  emailIV,  majorIV,  aboutIV,  statusIV;
    Button btnLogOut;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public AccountDetailsFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static AccountDetailsFragment newInstance(String userName, String email, String major, String about, String status) {
        AccountDetailsFragment fragment = new AccountDetailsFragment();
        Bundle args = new Bundle();
        args.putString("userName", userName);
        args.putString("email", email);
        args.putString("major", major);
        args.putString("about", about);
        args.putString("status", status);
        /*args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);*/
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_account_details, container, false);
        userName = getArguments().getString("userName");
        about = getArguments().getString("about");
        status = getArguments().getString("status");
        major = getArguments().getString("major");
        email = getArguments().getString("email");
        //getActivity().getSupportActionBar().setTitle(userName);
       setText(view);
        btnLogOut = (Button)view.findViewById(R.id.btn_logOut);
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonPressed();
            }
        });
        return view;
    }

    private void setText(View view){
        userNameIV = (TextView)view.findViewById(R.id.userName_details);
        userNameIV.setText(userName);
        emailIV = (TextView)view.findViewById(R.id.email_details);
        emailIV.setText(email);
        majorIV = (TextView)view.findViewById(R.id.major_details);
        majorIV.setText(major);
        aboutIV = (TextView)view.findViewById(R.id.about_details);
        aboutIV.setText(about);
        statusIV = (TextView)view.findViewById(R.id.status_details);
        statusIV.setText(status);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed() {
        if (mListener != null) {
            mListener.onFragmentInteraction();
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    /*@Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }*/


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction();
    }
}
