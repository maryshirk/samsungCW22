package com.samsung.myapplication.rest;

import com.samsung.myapplication.domain.Name;

import retrofit2.*;


public class RetrofitService {

    @POST("")
    Call<Name> convertToLowerCase(@Body Name name);
}
