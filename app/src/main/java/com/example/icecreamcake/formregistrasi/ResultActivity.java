package com.example.icecreamcake.formregistrasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle b = getIntent().getExtras();
        //membuat objek dari widget textview
        TextView nim = (TextView) findViewById(R.id.resultNIM);
        TextView nama = (TextView) findViewById(R.id.resultNama);
        TextView alamat = (TextView) findViewById(R.id.resultAlamat);
        //menset nilai dari widget textview
        nim.setText(b.getCharSequence("nim"));
        nama.setText(b.getCharSequence("nama"));
        alamat.setText(b.getCharSequence("alamat"));
    }
}
