package com.samsung.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.samsung.myapplication.model.Product;
import com.samsung.myapplication.model.ProductService;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ProductService productService;

    private EditText et_name_product;
    private EditText et_date;
    private EditText et_amount;
    private EditText et_price;

    private Button button_searcher;
    private Button button_adder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productService = new ProductService();

        button_adder = findViewById(R.id.button_adder);
        button_searcher = findViewById(R.id.button_searcher);

        et_name_product = findViewById(R.id.et_name_product);
        et_date = findViewById(R.id.et_date);
        et_amount = findViewById(R.id.et_amount);
        et_price = findViewById(R.id.et_price);

        button_adder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product product = new Product(
                        et_name_product.getText().toString(),
                        et_date.getText().toString(),
                        Integer.parseInt(et_amount.getText().toString()),
                        Integer.parseInt(et_price.getText().toString()));
                Product needed_product = productService.findByName(product.getName_product());
                if (needed_product == null) {
                    productService.addProduct(product);
                } else {
                    needed_product.newInformation(product);
                }
            }
        });

        button_searcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("product_service", productService);
                startActivity(intent);
            }
        });
    }
}