package thanakit.ruts.ac.th.lab1_basicss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Third extends AppCompatActivity {
    Button btnNext;
    EditText username, password, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        username = (EditText)findViewById(R.id.edituser);
        password = (EditText)findViewById(R.id.editpass);
        phone = (EditText)findViewById(R.id.editphone);

        username.setText(getIntent().getStringExtra("name"));
        password.setText(getIntent().getStringExtra("passwd"));
        phone.setText(getIntent().getStringExtra("telephone"));


        btnNext = (Button)findViewById(R.id.btnnext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Third.this, Four.class);
                startActivity(intent);
            }
        });

    }

}
