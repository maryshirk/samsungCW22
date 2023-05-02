package com.samsung.myapplication.rest;

import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class RetrofitService {
    private static Retrofit retrofit;
    public static final String URL = "http://192.168.0.108:8080";

    public static Retrofit getInstance() {
        if (retrofit == null)
            return create();
        return retrofit;
    }

    private static Retrofit create() {
        return new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build();
    }
}
