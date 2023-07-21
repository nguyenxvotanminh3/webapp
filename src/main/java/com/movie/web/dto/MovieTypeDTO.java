package com.movie.web.dto;

import com.movie.web.model.*;

public record MovieTypeDTO (
        String movieId,
        String createdAt,
        Data data,
        String updatedAt) {
        
        }
