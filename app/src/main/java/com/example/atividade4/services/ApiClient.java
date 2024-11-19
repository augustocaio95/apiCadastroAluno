package com.example.atividade4.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {private static String BASE_URL_MOCKAPI = "https://673be4fc96b8dcd5f3f7ceb5.mockapi.io/";
    private static String BASE_URL_VIACEP = "https://viacep.com.br/ws/";

    private static Retrofit retrofitMockApi, retrofitViaCep;


    public static Retrofit getRetrofitMockApi() {
        if (retrofitMockApi == null) {
            retrofitMockApi = new Retrofit.Builder()
                    .baseUrl(BASE_URL_MOCKAPI)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitMockApi;
    }


    public static Retrofit getRetrofitViaCep() {
        if (retrofitViaCep == null) {
            retrofitViaCep = new Retrofit.Builder()
                    .baseUrl(BASE_URL_VIACEP)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofitViaCep;
    }


    public static AlunoService getAlunoService() {
        return getRetrofitMockApi().create(AlunoService.class);
    }

    public static ViaCepService getViaCepService() {
        return getRetrofitViaCep().create(ViaCepService.class);
    }
}