package com.dasar_android.windows10.lat_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EditNameActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "EXTRA_NAME";
    public static final String EXTRA_NAME2 = "EXTRA_NAME2";
    public static final String EXTRA_NAME3 = "EXTRA_NAME3";
    public static final String EXTRA_NAME4 = "EXTRA_NAME4";
    @BindView(R.id.username)
    EditText username;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.alamat)
    EditText alamat;
    @BindView(R.id.no_telp)
    EditText no_telp;
    @BindView(R.id.save)
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_name);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.save)
    public void onViewClicked(){
        String name = username.getText().toString();
        String name2 = password.getText().toString();
        String name3 = alamat.getText().toString();
        String name4 = no_telp.getText().toString();
        Intent i = new Intent();
        i.putExtra(EXTRA_NAME, name);
        i.putExtra(EXTRA_NAME2, name2);
        i.putExtra(EXTRA_NAME3, name3);
        i.putExtra(EXTRA_NAME4, name4);
        setResult(RESULT_OK,i);
        finish();
    }
}
