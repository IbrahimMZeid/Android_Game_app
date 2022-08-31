package com.example.projecttry;

import static android.content.Context.MODE_PRIVATE;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import controller.DatabaseHandller;
import model.Users;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Profile_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Profile_Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    TextView nameTV, emailTV;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor prefEditor;
    String name, email, pass;
    TextInputLayout newUsernameTIL, currentPassTIL, newPassTIL, confirmPassTIL;
    Button changeUsernameBtn, confirmUsernameChangesBtn, changePassBtn, confirmChangePassBtn, logoutTV;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Profile_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Setting_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Profile_Fragment newInstance(String param1, String param2) {
        Profile_Fragment fragment = new Profile_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
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
        View view = inflater.inflate(R.layout.fragment_profile_, container, false);

        sharedPreferences = getActivity().getSharedPreferences("com.example.projecttry", MODE_PRIVATE);
//
        email = sharedPreferences.getString("email", "");
        pass = sharedPreferences.getString("pass", "");

        DatabaseHandller dbH = new DatabaseHandller(getActivity());
        Users user = dbH.getUser(email, pass);
//

        nameTV = view.findViewById(R.id.idTVProfileName);
        emailTV = view.findViewById(R.id.idTVProfileEmail);
        logoutTV = view.findViewById(R.id.idTVLogout);
        newUsernameTIL = view.findViewById(R.id.idETNewUsername);
        changeUsernameBtn = view.findViewById(R.id.idTVChangeUsername);
        confirmUsernameChangesBtn = view.findViewById(R.id.idConfirmUsername);
        currentPassTIL = view.findViewById(R.id.idETCurrentPass);
        newPassTIL = view.findViewById(R.id.idETNewPass);
        confirmPassTIL = view.findViewById(R.id.idETConfirmPass);
        changePassBtn = view.findViewById(R.id.idTVChangePass);
        confirmChangePassBtn = view.findViewById(R.id.idBtnConfirmPass);


        changeUsernameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (newUsernameTIL.getVisibility() != View.VISIBLE) {
                    newUsernameTIL.setVisibility(View.VISIBLE);
                    confirmUsernameChangesBtn.setVisibility(View.VISIBLE);
                } else {
                    newUsernameTIL.setVisibility(View.GONE);
                    confirmUsernameChangesBtn.setVisibility(View.GONE);
                }

            }
        });

        changePassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentPassTIL.getVisibility() != View.VISIBLE) {
                    currentPassTIL.setVisibility(View.VISIBLE);
                    newPassTIL.setVisibility(View.VISIBLE);
                    confirmPassTIL.setVisibility(View.VISIBLE);
                    confirmChangePassBtn.setVisibility(View.VISIBLE);
                } else {
                    currentPassTIL.setVisibility(View.GONE);
                    newPassTIL.setVisibility(View.GONE);
                    confirmPassTIL.setVisibility(View.GONE);
                    confirmChangePassBtn.setVisibility(View.GONE);
                }
            }
        });
//
        if (user != null) {
            nameTV.setText(user.getUsername());
            emailTV.setText(user.getEmail());
        }

        confirmChangePassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHandller dbH = new DatabaseHandller(getActivity());
                String currentPass = currentPassTIL.getEditText().getText().toString();
                String newPass = newPassTIL.getEditText().getText().toString();
                String confirmPass = confirmPassTIL.getEditText().getText().toString();
                currentPassTIL.setError("");
                newPassTIL.setError("");
                confirmPassTIL.setError("");
                if (!currentPass.equals(pass)) {
                    currentPassTIL.setError("Incorrect Password");
                } else if (newPass.length() < 8) {
                    newPassTIL.setError("at least 8");
                } else if (!newPass.equals(confirmPass)) {
                    confirmPassTIL.setError("Not Matched");
                } else {
                    String msg = dbH.updateUserPass(email, newPass);
                    if (msg.equals("Not Found")) {
                        message(msg);
                        return;
                    }
                    message(msg);
                    currentPassTIL.getEditText().setText("");
                    newPassTIL.getEditText().setText("");
                    confirmPassTIL.getEditText().setText("");
                }
            }
        });
        confirmUsernameChangesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseHandller dbH = new DatabaseHandller(getActivity());
                String newUsername = newUsernameTIL.getEditText().getText().toString();
                newUsernameTIL.setError("");
                if (newUsername.isEmpty()) {
                    newUsernameTIL.setError("This Filed is required");
                } else if (newUsername.length() < 5) {
                    newUsernameTIL.setError("at least 5");
                } else {
                    String msg = dbH.updateUserUsername(email, newUsername);
                    if (msg.equals("Not Found")) {
                        message(msg);
                        return;
                    }
                    message(msg);
                    nameTV.setText(newUsername);
                    newUsernameTIL.getEditText().setText("");
                }
            }
        });
        logoutTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharedPreferences = getActivity().getSharedPreferences("com.example.projecttry", MODE_PRIVATE);
                prefEditor = sharedPreferences.edit();
                prefEditor.putString("email", "");
                prefEditor.putString("pass", "");
                prefEditor.commit();
                startActivity(new Intent(getActivity(), MainActivity.class));
                getActivity().finish();
            }
        });


        return view;
    }

    public void message(String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }
}