package com.movie.web.service.data;

import com.movie.web.model.Data;

import java.util.List;
import java.util.Optional;

public interface DataService {
    List<Data> findAll();
    Optional<Data> findById(String theId);

    Optional<Data> save(Data data);
}
