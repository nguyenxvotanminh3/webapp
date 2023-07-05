package com.movie.web.dao.service.data;

import com.movie.web.object.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepo extends JpaRepository<Data , Integer> {
}
