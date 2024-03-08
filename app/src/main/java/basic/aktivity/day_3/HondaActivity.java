package basic.aktivity.day_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class HondaActivity extends AppCompatActivity {

    ImageButton beat;
    ImageButton scopy;
    ImageButton pcx;
    ImageButton vario;
    ImageButton cbr;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_honda);

        ImageButton beat = findViewById(R.id.beat);
        ImageButton scopy = findViewById(R.id.scopy);
        ImageButton pcx = findViewById(R.id.pcx);
        ImageButton vario = findViewById(R.id.vario);
        ImageButton cbr = findViewById(R.id.cbr);

        beat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent beat = new Intent(HondaActivity.this, DetailActivity.class);
                startActivity(beat);
            }
        });

        scopy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent scopy = new Intent(HondaActivity.this, DetailActivity.class);
                startActivity(scopy);
            }
        });

        pcx.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent pcx = new Intent(HondaActivity.this, DetailActivity.class);
                startActivity(pcx);
            }
        });
        vario.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent vario = new Intent(HondaActivity.this, DetailActivity.class);
                startActivity(vario);
            }
        });
        cbr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cbr = new Intent(HondaActivity.this, DetailActivity.class);
                startActivity(cbr);
            }
        });

    }
}
