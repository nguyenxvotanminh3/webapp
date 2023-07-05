package com.movie.web.dao.service.data;

import com.movie.web.dao.service.rating.RatingService;
import com.movie.web.object.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DataService implements DataDao {
    private DataRepo dataRepo;
    private RatingService ratingService;
    @Autowired
    public DataService(DataRepo dataRepo , RatingService ratingService) {
        this.ratingService = ratingService;
        this.dataRepo = dataRepo;
    }

    @Override
    public List<Data> findAll() {
        return dataRepo.findAll();
    }

    @Override
    public Optional<Data> findById(int theId) {
        return dataRepo.findById(theId);
    }

    @Override
    public Optional<Data> save(Data data) {
        return Optional.of(dataRepo.save(data));
    }
}
