package basic.aktivity.day_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class YamahaActivity extends AppCompatActivity {
    ImageButton nmax;
    ImageButton miom3;
    ImageButton mioshoul;
    ImageButton mio;
    ImageButton vega;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_yamaha);

        ImageButton nmax = findViewById(R.id.nmax);
        ImageButton miom3 = findViewById(R.id.miom3);
        ImageButton mioshoul = findViewById(R.id.mioshoul);
        ImageButton mio = findViewById(R.id.mio);
        ImageButton vega = findViewById(R.id.vega);

        nmax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nmax = new Intent(YamahaActivity.this, DetailActivity.class);
                startActivity(nmax);
            }
        });
        miom3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent miom3 = new Intent(YamahaActivity.this, DetailActivity.class);
                startActivity(miom3);
            }
        });
        mioshoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mioshoul = new Intent(YamahaActivity.this, DetailActivity.class);
                startActivity(mioshoul);
            }
        });
        mio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mio= new Intent(YamahaActivity.this, DetailActivity.class);
                startActivity(mio);
            }
        });
        vega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vega = new Intent(YamahaActivity.this, DetailActivity.class);
                startActivity(vega);
            }
        });
    }
}
