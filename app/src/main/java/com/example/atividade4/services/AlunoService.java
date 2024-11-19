package com.example.atividade4.services;

import com.example.atividade4.models.Aluno;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AlunoService {

    @POST("aluno")
    Call<Aluno> adicionaAluno(@Body Aluno aluno);

    @GET("aluno")
    Call<List<Aluno>> listaAlunos();
}
