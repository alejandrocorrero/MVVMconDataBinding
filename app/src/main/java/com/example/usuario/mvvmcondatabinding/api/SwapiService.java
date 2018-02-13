package com.example.usuario.mvvmcondatabinding.api;


import com.example.usuario.mvvmcondatabinding.api.responses.PeopleResponse;

import retrofit2.Call;
import retrofit2.http.GET;
public interface SwapiService {
    @GET("people/1")
    Call<PeopleResponse> getPerson();
}
