package com.example.myprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to the TextViews
        TextView profilSayaTextView = findViewById(R.id.profilSaya);
        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView ttlTextView = findViewById(R.id.ttlTextView);
        TextView heightTextView = findViewById(R.id.heightTextView);
        TextView weightTextView = findViewById(R.id.weightTextView);
        TextView addressTextView = findViewById(R.id.addressTextView);
        TextView phoneTextView = findViewById(R.id.phoneTextView);

        // Set the text of the TextViews
        profilSayaTextView.setText("Profil Saya");
        nameTextView.setText("Nama: Eli Khotimahtun Avianingtiyas");
        ttlTextView.setText("TTL: Banyumas, 30 Juli 2002");
        heightTextView.setText("Tinggi Badan: 155 cm");
        weightTextView.setText("Berat Badan: 46 kg");
        addressTextView.setText("Alamat: klapagading RT 04 RW 011, Wangon, banyumas, jawa tengah 53176");
        phoneTextView.setText("No.hp: 085713346545");
    }
}