package mum.edu.leafhomestay.service;

import mum.edu.leafhomestay.domain.HomestayType;

import java.util.List;

public interface HomestayTypeService {
    List<HomestayType> findAll();
    HomestayType  getHomestayType(long id);
}
