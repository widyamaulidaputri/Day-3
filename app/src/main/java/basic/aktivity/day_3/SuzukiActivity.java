package basic.aktivity.day_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class SuzukiActivity extends AppCompatActivity {

    ImageButton gsx;
    ImageButton satria;
    ImageButton raider;
    ImageButton shogun;
    ImageButton avenis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_suzuki);

        ImageButton gsx = findViewById(R.id.gsx);
        ImageButton satria = findViewById(R.id.satria);
        ImageButton raider = findViewById(R.id.raider);
        ImageButton shogun = findViewById(R.id.shogun);
        ImageButton avenis = findViewById(R.id.avenis);

        gsx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gsx = new Intent(SuzukiActivity.this, DetailActivity.class);
                startActivity(gsx);
            }
        });
        satria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent satria = new Intent(SuzukiActivity.this, DetailActivity.class);
                startActivity(satria);
            }
        });
        raider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent raider = new Intent(SuzukiActivity.this, DetailActivity.class);
                startActivity(raider);
            }
        });
        shogun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shogun = new Intent(SuzukiActivity.this, DetailActivity.class);
                startActivity(shogun);
            }
        });
        avenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent avenis = new Intent(SuzukiActivity.this, DetailActivity.class);
                startActivity(avenis);
            }
        });
    }
}
