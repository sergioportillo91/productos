package com.gestion_productos.productos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gestion_productos.productos.models.Productos;
import com.gestion_productos.productos.repository.crud.ProductosCrudRepository;

@Repository
public class ProductosRepository {

    @Autowired
    private ProductosCrudRepository productosCrudRepository;

    public List<Productos> getProducts() {

        return productosCrudRepository.findAll();
    }

    public Optional<Productos> getProducto(int id) {

        return productosCrudRepository.findById(id);
    }

    public Productos guardar(Productos producto) {
        return productosCrudRepository.save(producto);

    }

    public void eliminar(int id) {

        productosCrudRepository.deleteById(id);
    }
}
