package com.example.yego.Repository.Service;

import com.example.yego.Repository.Modelo.GsonCategoria_producto_empresa;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface Categoria_producto_empresaService {

    @GET("/categoriaProductoEmpresa/ListaCategoria/{idempresa}")
    Call<GsonCategoria_producto_empresa> searchCategoriaProductoEmpresa(@Header("Authorization")String auth,@Path("idempresa")int idempresa);
}
