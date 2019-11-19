package mum.edu.leafhomestay.service.impl;

import mum.edu.leafhomestay.domain.HomestayType;
import mum.edu.leafhomestay.repository.HomestayTypeRespository;
import mum.edu.leafhomestay.service.HomestayTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomestayTypeServiceImpl implements HomestayTypeService {
    @Autowired
    HomestayTypeRespository homestayTypeRespository;

    @Override
    public List<HomestayType> findAll() {
        return (List<HomestayType>) homestayTypeRespository.findAll();
    }
}
