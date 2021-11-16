package com.maulanaahmad.praktek2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_utama, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.i_tambah:
                Toast.makeText(getApplicationContext(),"Tambah",Toast.LENGTH_LONG).show();
                return true;
            case R.id.i_refresh:
                Toast.makeText(getApplicationContext(),"Refresh",Toast.LENGTH_LONG).show();
                return true;
            case R.id.i_pengaturan:
                Toast.makeText(getApplicationContext(),"Pengaturan",Toast.
                        LENGTH_LONG).show();
                return true;
            case R.id.i_profil:
                Toast.makeText(getApplicationContext(),"Profil",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}