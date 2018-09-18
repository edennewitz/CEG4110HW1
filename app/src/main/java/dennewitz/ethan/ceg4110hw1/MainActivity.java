package dennewitz.ethan.ceg4110hw1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final Random RANDOM =  new Random();
    public View root;
    public Button button;
    public EditText text;
    public EditText textColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        root = findViewById(R.id.root);
        button = findViewById(R.id.button);
        text = findViewById(R.id.colorText);
        textColor = findViewById(R.id.colorName);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int red = RANDOM.nextInt(255);
                int green = RANDOM.nextInt(255);
                int blue = RANDOM.nextInt(255);

                int color = Color.rgb(red,green,blue);

                //root.setBackgroundColor(color);
                text.setTextColor(color);

                String hex = String.format("#%02X%02X%02X", red, green, blue);
                textColor.setText("COLOR: "+red+"r, "+green+"g, "+blue+"b, " + hex);

            }
        });

    }
}
