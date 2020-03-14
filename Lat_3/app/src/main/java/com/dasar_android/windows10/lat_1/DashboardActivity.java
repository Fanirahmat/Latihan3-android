package com.dasar_android.windows10.lat_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DashboardActivity extends AppCompatActivity {

    private static final int RC_EDIT_NAME = 112;
    @BindView(R.id.username)
    TextView username;
    @BindView(R.id.password)
    TextView password;
    @BindView(R.id.alamat)
    TextView alamat;
    @BindView(R.id.no_telp)
    TextView no_telp;
    @BindView(R.id.editname)
    Button editname;

    private TextView Result1;
    private TextView Result2;
    private TextView Result3;
    private TextView Result4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ButterKnife.bind(this);

        Result1 = (TextView) findViewById(R.id.username);
        Result2 = (TextView) findViewById(R.id.password);
        Result3 = (TextView) findViewById(R.id.alamat);
        Result4 = (TextView) findViewById(R.id.no_telp);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //getdata
        if (getIntent().getExtras() != null) {
            String data1 = getIntent().getExtras().getString(MainActivity.EXTRA_DATA);
            Result1.setText(data1);
            String data2 = getIntent().getExtras().getString(MainActivity.EXTRA_DATA2);
            Result2.setText(data2);
            String data3 = getIntent().getExtras().getString(MainActivity.EXTRA_DATA3);
            Result3.setText(data3);
            String data4 = getIntent().getExtras().getString(MainActivity.EXTRA_DATA4);
            Result4.setText(data4);
        }
    }
    //intentResult
    @OnClick(R.id.editname)
    public void onViewClicked(){
        Intent i = new Intent( DashboardActivity.this, EditNameActivity.class);
        startActivityForResult(i,RC_EDIT_NAME);
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode, Intent data){
        if (requestCode == RC_EDIT_NAME && resultCode == RESULT_OK){
            String name1 = data.getExtras().getString(EditNameActivity.EXTRA_NAME);
            username.setText(name1);
            String name2 = data.getExtras().getString(EditNameActivity.EXTRA_NAME2);
            password.setText(name2);
            String name3 = data.getExtras().getString(EditNameActivity.EXTRA_NAME3);
            alamat.setText(name3);
            String name4 = data.getExtras().getString(EditNameActivity.EXTRA_NAME4);
            no_telp.setText(name4);
        }
    }

}
