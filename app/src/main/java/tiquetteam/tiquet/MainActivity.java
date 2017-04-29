package tiquetteam.tiquet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button      _buttonLogIn;
    Button      _buttonSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _buttonLogIn = (Button)findViewById(R.id.buttonLogIn);
        _buttonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ParkingActivity.class);
                startActivity(intent);
            }
        });

        _buttonSignIn = (Button)findViewById(R.id.buttonSignIn);
        _buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ParkingActivity.class);
                startActivity(intent);
            }
        });
    }
}
