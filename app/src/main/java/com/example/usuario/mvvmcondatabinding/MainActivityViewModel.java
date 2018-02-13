package com.example.usuario.mvvmcondatabinding;


import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;

import com.example.usuario.mvvmcondatabinding.api.SwapiClient;
import com.example.usuario.mvvmcondatabinding.api.SwapiService;
import com.example.usuario.mvvmcondatabinding.api.responses.PeopleResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityViewModel extends ViewModel {
    public ObservableField<String> persona = new ObservableField<>();
    private SwapiService swapiService;



    public void obtenerPersona() {
        swapiService = SwapiClient.getInstance().getService();
        Call<PeopleResponse> llamada = swapiService.getPerson();
        llamada.enqueue(new Callback<PeopleResponse>() {
            @Override
            public void onResponse(Call<PeopleResponse> call, Response<PeopleResponse> response) {
                if (response != null && response.isSuccessful()) {
                    PeopleResponse peopleResponse = response.body();
                    persona.set(peopleResponse.getName());
                }
            }

            @Override
            public void onFailure(Call<PeopleResponse> call, Throwable t) {

            }
        });
    }
}