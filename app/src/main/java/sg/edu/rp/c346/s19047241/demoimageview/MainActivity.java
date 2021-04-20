package sg.edu.rp.c346.s19047241.demoimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ivDay2, ivDay4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivDay2 = (ImageView)findViewById(R.id.imageView2);
        ivDay4 = (ImageView)findViewById(R.id.imageView4);

        ivDay2.setImageResource(R.drawable.day2);
        ivDay4.setImageResource(R.drawable.day4);


    }
}