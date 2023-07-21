package com.movie.web.service.data;

import com.movie.web.models.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepo extends JpaRepository<Data , String> {
}
