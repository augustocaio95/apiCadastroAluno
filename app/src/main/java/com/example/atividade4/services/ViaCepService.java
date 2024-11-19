package com.example.atividade4.services;

import com.example.atividade4.models.Endereco;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ViaCepService {

    @GET("{cep}/json/")
    Call<Endereco> buscaDadosDoCep(@Path("cep") String cep);
}
