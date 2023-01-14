package com.gestion_productos.productos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion_productos.productos.models.Productos;
import com.gestion_productos.productos.repository.ProductosRepository;

@Service
public class ProductosService {

    @Autowired
    private ProductosRepository productosRepository;

    public List<Productos> getAll() {
        return productosRepository.getProducts();
    }

    public Optional<Productos> getProductoById(int id) {
        return productosRepository.getProducto(id);
    }

    public Productos save(Productos producto) {

        return productosRepository.guardar(producto);
    }

    public void eliminar(int id) {
        productosRepository.eliminar(id);
    }

}
