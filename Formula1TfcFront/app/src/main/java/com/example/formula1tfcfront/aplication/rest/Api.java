package com.example.formula1tfcfront.aplication.rest;


import com.example.formula1tfcfront.aplication.rest.model.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.UUID;

public interface Api {
    @POST("/auth/login")
    Call<Usuario> loginWithToken(@Query(value="username")String mail,
                                 @Query(value="password")String password);



    @GET("/usuario/name/{username}")
    Call<Usuario> usuarioPorNombre(@Path("username") String username);

    @GET("/circuito/all")
    Call<List<Circuito>> obtenerTodosCircuitos();

    @GET("/noticia/all")
    Call<List<Noticia>> obtenerNoticias();

    @GET("/piloto/all")
    Call<List<Piloto>> obtenerPilotos();

    @GET("/circuito/all")
    Call<List<Circuito>> obtenerCircuitos();

    @GET("/clasificacion/all")
    Call<List<ClasificacionPiloto>> obtenerClasificacionPilotos();

    @POST("/usuario/save")
    Call<Usuario> crearUsuario(@Body Usuario usuario);

    @POST("/usuario/login")
    Call<Usuario> login(@Body LoginEntity login);






}
