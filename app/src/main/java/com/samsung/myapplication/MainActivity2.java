package com.samsung.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.samsung.myapplication.model.Product;
import com.samsung.myapplication.model.ProductService;

public class MainActivity2 extends AppCompatActivity {

    private ProductService productService;

    private Button button_searching;
    private EditText et_iter;
    private TextView tv_prod_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        productService = (ProductService) getIntent().getSerializableExtra("product_service");
        button_searching = findViewById(R.id.button_searching);
        et_iter = findViewById(R.id.et_vvod);
        tv_prod_info = findViewById(R.id.info);

        button_searching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product product = productService.findByName(et_iter.getText().toString());
                if (product == null) {
                    tv_prod_info.setText(R.string.nothing);
                }
                else {
                    tv_prod_info.setText(product.toString());
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}