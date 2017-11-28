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
        TextView TTL = (TextView) findViewById(R.id.resultLahir);
        TextView alamat = (TextView) findViewById(R.id.resultAlamat);
        TextView email = (TextView) findViewById(R.id.resultEmail);
        //menset nilai dari widget textview
        nim.setText(b.getCharSequence("nim"));
        nama.setText(b.getCharSequence("nama"));
        TTL.setText(b.getCharSequence("TTL"));
        alamat.setText(b.getCharSequence("alamat"));
        email.setText(b.getCharSequence("email"));
    }
}
