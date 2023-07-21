package com.movie.web.service.data;
import com.movie.web.model.Data;
import com.movie.web.repo.data.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DataServiceImpl implements DataService {
    private DataRepo dataRepo;

    @Autowired
    public DataServiceImpl(DataRepo dataRepo ) {

        this.dataRepo = dataRepo;
    }

    @Override
    public List<Data> findAll() {
        return dataRepo.findAll();
    }

    @Override
    public Optional<Data> findById(String theId) {
        return dataRepo.findById(theId);
    }

    @Override
    public Optional<Data> save(Data data) {
        return Optional.of(dataRepo.save(data));
    }
}
