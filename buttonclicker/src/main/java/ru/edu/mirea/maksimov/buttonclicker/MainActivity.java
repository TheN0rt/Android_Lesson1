package ru.edu.mirea.maksimov.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe ;
    private CheckBox chBoxSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewStudent = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        chBoxSubmit = findViewById(R.id.chBoxSubmit);

        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }
    View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            textViewStudent.setText("Мой номер по списку No 20");
            chBoxSubmit.setChecked(true);
        }
    };

    public void onMyButtonClick(View view)
    {
        textViewStudent.setText("Это не я!");
        chBoxSubmit.setChecked(false);
    }
}