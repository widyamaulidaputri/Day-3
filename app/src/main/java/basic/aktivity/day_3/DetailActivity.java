package basic.aktivity.day_3;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Button btnShare = findViewById(R.id.kirimbt);

        btnShare.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intentshare = new Intent();
        intentshare.setAction(Intent.ACTION_SEND);
        intentshare.putExtra(Intent.EXTRA_TEXT, "MERK MOTOR");
        intentshare.setType("plain/text");

        if (intentshare.resolveActivity(getPackageManager()) != null) {
            startActivity(intentshare);
            {

            }
        }
    }

}