package com.dasar_android.windows10.lat_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_DATA = "EXTRA_DATA";
    public static final String EXTRA_DATA2 = "EXTRA_DATA2";
    public static final String EXTRA_DATA3 = "EXTRA_DATA3";
    public static final String EXTRA_DATA4 = "EXTRA_DATA4";

    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private Button btnSendData;
    Button tambah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambah = (Button) findViewById(R.id.tambah);

        editText1 = (EditText) findViewById(R.id.username);
        editText2 = (EditText) findViewById(R.id.password);
        editText3 = (EditText) findViewById(R.id.alamat);
        editText4 = (EditText) findViewById(R.id.no_telp);
        btnSendData = (Button) findViewById(R.id.login);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_daftar);
            }
        });

        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data1 = editText1.getText().toString();
                String data2 = editText2.getText().toString();
                String data3 = editText3.getText().toString();
                String data4 = editText4.getText().toString();
                Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                intent.putExtra(EXTRA_DATA, data1);
                intent.putExtra(EXTRA_DATA2, data2);
                intent.putExtra(EXTRA_DATA3, data3);
                intent.putExtra(EXTRA_DATA4, data4);
                startActivity(intent);
            }
        });


    }
}
