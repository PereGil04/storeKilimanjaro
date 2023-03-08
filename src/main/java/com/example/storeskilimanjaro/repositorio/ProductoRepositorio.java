package com.example.storeskilimanjaro.repositorio;

import com.example.storeskilimanjaro.entidades.Producto;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository

public interface ProductoRepositorio extends JpaRepository<Producto,Integer> {



    }