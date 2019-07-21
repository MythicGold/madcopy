package sg.edu.np.s10178658.medicx;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AppMainActivity extends AppCompatActivity {
    Button btnTixNum;
    Button btnBook;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_main);

        btnTixNum = findViewById(R.id.btnTixNum);

        btnTixNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AppMainActivity.this, QueueTicket.class));
            }
        });




        btnBook = findViewById(R.id.btnBook);

        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AppMainActivity.this, SelectDateActivity.class));
            }
        });

    }
}
