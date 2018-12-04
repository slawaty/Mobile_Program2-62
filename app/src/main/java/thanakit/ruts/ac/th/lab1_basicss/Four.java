package thanakit.ruts.ac.th.lab1_basicss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Four extends AppCompatActivity {

    TextView username, password, phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        username = (TextView)findViewById(R.id.textname);
        password = (TextView)findViewById(R.id.textpass);
        phone = (TextView)findViewById(R.id.textphone);

        username.setText(getIntent().getStringExtra("name"));
        password.setText(getIntent().getStringExtra("passwd"));
        phone.setText(getIntent().getStringExtra("phone"));
    }
}
