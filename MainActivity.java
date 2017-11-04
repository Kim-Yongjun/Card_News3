package com.example.gim_yongjun.card_news;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button g_btn = (Button) findViewById(R.id.genre_btn);
        g_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(1);
            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id) {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("주제");
        builder.setItems(R.array.genre, new DialogInterface.OnClickListener() {
            // 리스트 목록 클릭 이벤트
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        Intent intent=new Intent(MainActivity.this,Genre.class);
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "정치다 이놈아!", Toast.LENGTH_SHORT).show();break;
                    case 1:
                        Toast.makeText(MainActivity.this, getResources().getStringArray(R.array.genre)[which], Toast.LENGTH_SHORT).show();break;

                    case 2:
                        Toast.makeText(MainActivity.this, getResources().getStringArray(R.array.genre)[which], Toast.LENGTH_SHORT).show();break;

                    case 3:
                        Toast.makeText(MainActivity.this, getResources().getStringArray(R.array.genre)[which], Toast.LENGTH_SHORT).show();break;

                    case 4:
                        Toast.makeText(MainActivity.this, getResources().getStringArray(R.array.genre)[which], Toast.LENGTH_SHORT).show();break;

                    case 5:
                        Toast.makeText(MainActivity.this, getResources().getStringArray(R.array.genre)[which], Toast.LENGTH_SHORT).show();break;

                    case 6:
                        Toast.makeText(MainActivity.this, getResources().getStringArray(R.array.genre)[which], Toast.LENGTH_SHORT).show();break;



                }

            }

        });
        return builder.create();
       }
}
