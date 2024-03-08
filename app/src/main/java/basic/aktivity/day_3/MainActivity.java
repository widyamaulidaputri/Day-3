package basic.aktivity.day_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button hondabt;
    Button yamahabt;
    Button suzukibt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button hondabt = findViewById(R.id.hondabt);
        Button yamahabt = findViewById(R.id.yamahabt);
        Button suzukibt = findViewById(R.id.suzukibt);

        hondabt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent honda = new Intent(MainActivity.this, HondaActivity.class);
                startActivity(honda);
            }

        });
        yamahabt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent yamaha = new Intent(MainActivity.this, YamahaActivity.class);
                startActivity(yamaha);
            }

        });
        suzukibt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent suzuki = new Intent(MainActivity.this, SuzukiActivity.class);
                startActivity(suzuki);
            }

        });


    }
}