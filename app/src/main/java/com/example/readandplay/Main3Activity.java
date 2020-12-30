package com.example.readandplay;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    Button button1, button2, button3, button4;
    private Question question=new Question();
    TextView question_text, score;
    private String answer;
    private int Score=0;
    private int questionlength=question.questions.length;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        random=new Random();
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);
        score=(TextView)findViewById(R.id.score);
        score.setText("Score:"+ Score);
        question_text=(TextView)findViewById(R.id.question);
        NextQuestion(random.nextInt(questionlength));
    }

    public void  onClick(View v) {
            switch(v.getId()){
            case R.id.button1:
                if(button1.getText()==answer){
                    Score++;
                    if(Score==6)
                        GameOver();
                    score.setText("Score:"+ Score);
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionlength));
                }else {
                    GameOver(); }
                break;
            case R.id.button2:
                if(button2.getText()==answer){
                    Score++;
                    if(Score==6)
                        GameOver();
                    score.setText("Score:"+ Score);
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionlength));
                }else {
                    GameOver(); }
                break;
            case R.id.button3:
                if(button3.getText()==answer){
                    Score++;
                    if(Score==6)
                        GameOver();
                    score.setText("Score:"+ Score);
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionlength));
                }else {
                    GameOver(); }
                break;
            case R.id.button4:
                if(button4.getText()==answer) {
                    Score++;
                    if(Score==6)
                        GameOver();
                    score.setText("Score:"+ Score);
                    Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
                    NextQuestion(random.nextInt(questionlength));
                }else {
                    GameOver(); }
                break;
                }
    }
    private void GameOver() {
        AlertDialog.Builder alertdialog=new AlertDialog.Builder(Main3Activity.this);
        alertdialog.setMessage("Game Over! Your score is " + Score + " points out of 6.")
                .setCancelable(false)
                .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), Main3Activity.class));
                    }
                }).setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                System.exit (0);
            }
        });
        alertdialog.show();
    }
    private void NextQuestion(int num){
            question_text.setText(question.getQuestion(num));
            button1.setText(question.getchoice1(num));
            button2.setText(question.getchoice2(num));
            button3.setText(question.getchoice3(num));
            button4.setText(question.getchoice4(num));
            answer = question.getCorrectAnswer(num);


    }
}