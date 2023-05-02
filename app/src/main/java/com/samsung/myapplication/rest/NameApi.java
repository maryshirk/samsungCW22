package com.samsung.myapplication.rest;

import com.samsung.myapplication.domain.Name;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NameApi {
    @GET("name")
    Call<Name> getName(@Query("name") String name, @Query("surname") String surname);
}
