package com.example.icecreamcake.formregistrasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nim, nama, alamat, TTL, email, pswd;
    //TextView txtView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menampilkan semua tampilan id
        findAllViewsId();

        button.setOnClickListener(this);

    }

    private void findAllViewsId()
    {
        button = (Button) findViewById(R.id.save);
        nim = (EditText) findViewById(R.id.nim);
        nama = (EditText) findViewById(R.id.nama);
        alamat = (EditText) findViewById(R.id.alamat);
        TTL = (EditText) findViewById(R.id.TTL);
        email = (EditText) findViewById(R.id.email);
        pswd = (EditText) findViewById(R.id.pswd);
    }

    @Override
    public void onClick(View v)
    {
        Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
        //Buat obyek bundle
        Bundle b = new Bundle();


        String nimValue = nim.getText().toString();
        //int myNim = Integer.parseInt(nimValue);

        //Menyisipkan tipe data string ke dalam objek bundle
        b.putString("nama",nama.getText().toString());
        b.putString("nim",nimValue);
        b.putString("alamat",alamat.getText().toString());
        b.putString("email",email.getText().toString());

        //Menambahkan bundle ke intent
        intent.putExtras(b);

        //Memulai activity ke dua
        startActivity(intent);

    }


}
