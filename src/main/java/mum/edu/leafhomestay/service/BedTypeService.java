package mum.edu.leafhomestay.service;

import mum.edu.leafhomestay.domain.BedType;

import java.util.List;

public interface BedTypeService {
    List<BedType> findAll();
    BedType getBedType(long id);
}
