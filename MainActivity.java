package com.smarttab.relativelayout_create_login;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout main;
    EditText edtusername, edtpassword;
    TextView message, txtname, txtpasswrdd;
    LayoutParams messageparams, userNameParamas, userEditParams, passwordParams, Passwordeditparamas, Buttonparmas;
    Button login;

    int paddingValue = 10;
    int messageId = 1, userNameId = 2, userNameValue = 3, passwordNameId = 4, passwordNameValue = 5, loginbtn = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        createMessageTextView();
        createUserNameTextView();
        createUserEdit();
        createPasswordNameTextView();
        createPasswordEdit();
        createButton();
        main.addView(message, messageparams);
        main.addView(txtname, userNameParamas);
        main.addView(edtusername, userEditParams);
        main.addView(txtpasswrdd, passwordParams);
        main.addView(edtpassword, Passwordeditparamas);
        main.addView(login, Buttonparmas);
        setContentView(main);
    }

    private void init() {
        main = new RelativeLayout(this);
        edtusername = new EditText(this);
        edtpassword = new EditText(this);
        txtname = new TextView(this);
        txtpasswrdd = new TextView(this);
        message = new TextView(this);
        login = new Button(this);

        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);

        main.setBackgroundColor(Color.BLACK);
        main.setLayoutParams(params);

    }

    private void createMessageTextView() {

        Log.d("Tag", "createMessageTextView");
        messageparams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        messageparams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        messageparams.addRule(RelativeLayout.CENTER_IN_PARENT);
        message.setPadding(paddingValue, 100, 100, paddingValue);
        message.setText("Please Login First");
        message.setId(messageId);
        message.setTextSize(20);
        message.setTextColor(Color.WHITE);
        message.setLayoutParams(messageparams);

    }

    private void createUserNameTextView() {
        userNameParamas = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        userNameParamas.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        userNameParamas.addRule(RelativeLayout.BELOW, messageId);

        txtname.setPadding(paddingValue, 10, 10, paddingValue);
        txtname.setText("User Name");

        txtname.setTextColor(Color.WHITE);
        txtname.setId(userNameId);
        txtname.setLayoutParams(userNameParamas);
    }

    private void createUserEdit() {
        userEditParams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        userEditParams.addRule(RelativeLayout.RIGHT_OF, userNameId);
        userEditParams.addRule(RelativeLayout.BELOW, messageId);
        userEditParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        userEditParams.addRule(RelativeLayout.ALIGN_BASELINE, userNameId);
        edtusername.setInputType(1);

        edtusername.setBackgroundColor(Color.WHITE);
        edtusername.setTextColor(Color.WHITE);
        edtusername.setPadding(paddingValue, paddingValue, paddingValue, paddingValue);
        edtusername.setId(userNameValue);
        edtusername.setLayoutParams(userEditParams);
    }

    private void createPasswordNameTextView() {
        passwordParams = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        passwordParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        passwordParams.addRule(RelativeLayout.BELOW, userNameValue);
        passwordParams.setMargins(0,10,10,10);

        txtpasswrdd.setTextColor(Color.WHITE);
        txtpasswrdd.setText("Password");
        txtpasswrdd.setPadding(paddingValue,paddingValue, paddingValue, paddingValue);
        txtpasswrdd.setId(passwordNameId);
        txtpasswrdd.setLayoutParams(passwordParams);
    }

    private void createPasswordEdit() {
        Passwordeditparamas = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        Passwordeditparamas.addRule(RelativeLayout.RIGHT_OF, passwordNameId);
        Passwordeditparamas.addRule(RelativeLayout.BELOW, userNameValue);
        Passwordeditparamas.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        Passwordeditparamas.addRule(RelativeLayout.ALIGN_BASELINE, passwordNameId);


        edtpassword.setTextColor(Color.WHITE);
        edtpassword.setBackgroundColor(Color.WHITE);
        edtpassword.setPadding(paddingValue, paddingValue,paddingValue, paddingValue);
        edtpassword.setInputType(2);
        edtpassword.setId(passwordNameValue);
        edtpassword.setLayoutParams(Passwordeditparamas);
    }

    private void createButton() {
        Buttonparmas = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        Buttonparmas.addRule(RelativeLayout.BELOW, passwordNameValue);
        Buttonparmas.addRule(RelativeLayout.CENTER_VERTICAL);
        Buttonparmas.addRule(RelativeLayout.BELOW, passwordNameValue);
        Buttonparmas.addRule(RelativeLayout.CENTER_IN_PARENT);
        Buttonparmas.setMargins(0,10,10,10);

        login.setText("Login");
        login.setBackgroundResource(R.drawable.shape);
        login.setLayoutParams(Buttonparmas);
    }
}
