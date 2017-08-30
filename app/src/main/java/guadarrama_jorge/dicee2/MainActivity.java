package guadarrama_jorge.dicee2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton; // Tipo de variable Button
        rollButton = (Button) findViewById(R.id.Rollbutton);
        // Estamos intentando encontrar un Button

     final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);
        // Estamos intentando encontrar el ImageView y por eso los paréntesis

       final int[] diceArray = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Dicee","Button has been pressed!");

                Random randomNumber = new Random();

                int number = randomNumber.nextInt(6); // Between 0 and 5

                Log.d("Dicee", "The random number is: " + number);

                leftDice.setImageResource(diceArray[number]);

                number = randomNumber.nextInt(6);
                rightDice.setImageResource(diceArray[number]);
            }
        });

    }
}
