package com.example.lab6.Repositories;

import com.example.lab6.Repositories.Entities.TvEntity;

import org.springframework.data.repository.CrudRepository;



public interface TvRepository extends CrudRepository<TvEntity, Integer> {
}
