package pl.karolewski.lab1_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView)findViewById(R.id.square_text);
        View.OnClickListener listener_square = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SquareActivity.class);
                startActivity(i);
            }
        };
        t2 = (TextView) findViewById(R.id.circle_text);
        View.OnClickListener listener_circle = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CircleActivity.class);
                startActivity(i);
            }
        };
        t3 = (TextView) findViewById(R.id.trangle_text);
        View.OnClickListener listener_triangle = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CircleActivity.class);
                startActivity(i);
            }
        };
        t1.setOnClickListener(listener_square);
        t2.setOnClickListener(listener_circle);
        t3.setOnClickListener(listener_triangle);
    }
}