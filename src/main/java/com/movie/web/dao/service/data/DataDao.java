package com.movie.web.dao.service.data;

import com.movie.web.object.Data;

import java.util.List;
import java.util.Optional;

public interface DataDao {
    List<Data> findAll();
    Optional<Data> findById(int theId);

    Optional<Data> save(Data data);
}
