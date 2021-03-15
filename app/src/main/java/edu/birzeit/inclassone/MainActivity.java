package edu.birzeit.inclassone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtWeight;
    private EditText edtLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtLength = findViewById(R.id.edtTextLength);
        edtWeight = findViewById(R.id.edtTextWeight);
    }

    public void btnCalc_OnClick(View view){
        String Length = edtLength.getText().toString().trim();
        String Weight = edtWeight.getText().toString().trim();

        double ln = Double.parseDouble(Length);
        double we = Double.parseDouble(Weight);

        double bmi = we / (ln * ln);
        String s = "Your BMI is: " + bmi;
        if(!Length.isEmpty() && !Weight.isEmpty()){
            Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
        }

    }
}