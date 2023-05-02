package com.samsung.myapplication.rest;

import retrofit2.Retrofit;

public class NameApiService {
    private static NameApi nameApi;

    public static NameApi getInstance() {
        if (nameApi == null)
            return create();
        return nameApi;
    }

    private static NameApi create() {
        return RetrofitService.getInstance().create(NameApi.class);
    }
}
