package ca.cambrian.android.project.aaa.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Detail extends AppCompatActivity {


    TextView title,subtitle,context;
    ImageView imageView ;
    Button buy_btn ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        title = (TextView) findViewById(R.id.textView8);
        subtitle = (TextView) findViewById(R.id.textView9);
        imageView = (ImageView)findViewById(R.id.imageView9);
        context = (TextView) findViewById(R.id.textView10);
        buy_btn = (Button) findViewById(R.id.button);


        Intent intent = getIntent();
        String val = intent.getStringExtra("param");

        Toast.makeText(this, "param: " + val, Toast.LENGTH_SHORT).show();


        if (val.equals("1")) {
            title.setText("Banff");
            subtitle.setText(getString(R.string.banff_subtitle));
            imageView.setImageResource(R.drawable.banff);
            context.setText(getString(R.string.banff_content));
        }
        else if (val.equals("2")) {
            title.setText("Orland");
            subtitle.setText(getString(R.string.orland_subtitle));
            imageView.setImageResource(R.drawable.olando);
            context.setText(getString(R.string.orland_content));

        }else if (val.equals("3")) {
            title.setText("Montreal");
            subtitle.setText(getString(R.string.banff_subtitle));
            imageView.setImageResource(R.drawable.montreal);
            context.setText(getString(R.string.montral_content));
        }



//
//        back_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Intent i = new Intent(Detail.this, MainActivity2.class);
////                startActivity(i);
//
////                Intent i = new Intent(Detail.this, Purchase.class);
////                startActivity(i);
//            }
//        });
    }


}
