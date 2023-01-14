package com.gestion_productos.productos.repository.crud;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion_productos.productos.models.Productos;

public interface ProductosCrudRepository extends JpaRepository<Productos, Integer> {

}
