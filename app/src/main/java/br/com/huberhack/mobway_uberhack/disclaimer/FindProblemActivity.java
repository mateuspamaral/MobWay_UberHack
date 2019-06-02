package br.com.huberhack.mobway_uberhack.disclaimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

import br.com.huberhack.mobway_uberhack.R;

public class FindProblemActivity extends AppCompatActivity {

    private Timer timer = new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_problem);

        ImageView imageViewLogo = findViewById(R.id.imageViewFindProblem);

        imageViewLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jump();
            }
        });

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                jump();
            }
        }, 3000);
    }

    private void jump() {
        timer.cancel();
        Intent intent = new Intent(FindProblemActivity.this, ReportProblemActivity.class);
        startActivity(intent);
        finish();
    }
}
