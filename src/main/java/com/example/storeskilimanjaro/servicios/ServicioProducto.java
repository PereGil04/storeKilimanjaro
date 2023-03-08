package com.example.storeskilimanjaro.servicios;

import com.example.storeskilimanjaro.entidades.Producto;
import com.example.storeskilimanjaro.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ServicioProducto implements ServicioComun<Producto> {

    @Autowired
    ProductoRepositorio productoRepositorio;

    @Override
    public List<Producto> buscarTodos() throws Exception {
        try{
            List<Producto> productos=productoRepositorio.findAll();
            return productos;
        }catch (Exception error) {
            throw new Exception(error.getMessage());

        }

    }

    @Override
    public Producto buscarPorId(Integer id) throws Exception {
       try{
           Optional<Producto> producto=productoRepositorio.findById(id);
           return producto.get();
       }catch(Exception error){
           throw new Exception(error.getMessage());
       }
    }

    @Override
    public Producto agregar(Producto datos) throws Exception {
        try{
            datos=productoRepositorio.save(datos);
            return datos;

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
