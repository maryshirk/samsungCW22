package com.samsung.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.samsung.myapplication.domain.Name;
import com.samsung.myapplication.rest.NameApiService;
import com.samsung.myapplication.rest.RetrofitService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private EditText firstNameEditText;
    private EditText lastNameEditText;
    private TextView resultTextView;
    private Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNameEditText = findViewById(R.id.firstNameEditText);
        lastNameEditText = findViewById(R.id.lastNameEditText);
        resultTextView = findViewById(R.id.resultTextView);
        sendButton = findViewById(R.id.sendButton);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NameApiService.getInstance().getName(
                                firstNameEditText.getText().toString(),
                                lastNameEditText.getText().toString())
                        .enqueue(new Callback<Name>() {
                            @Override
                            public void onResponse(Call<Name> call, Response<Name> response) {
                                resultTextView.setText(response.body().toString());
                                Log.d("REST", response.body().toString());
                            }

                            @Override
                            public void onFailure(Call<Name> call, Throwable t) {
                                resultTextView.setText(t.getMessage());
                                Log.d("REST", t.getMessage());
                            }
                        });
            }
        });
    }
}
