package com.movie.web.service.data;

import com.movie.web.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepo extends JpaRepository<Data , String> {
}
