package mum.edu.leafhomestay.service.impl;

import mum.edu.leafhomestay.domain.BedType;
import mum.edu.leafhomestay.repository.BedTypeRepository;
import mum.edu.leafhomestay.service.BedTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BedTypeServiceImpl implements BedTypeService {

    @Autowired
    BedTypeRepository bedTypeRepository;

    @Override
    public List<BedType> findAll() {
        return (List<BedType>) bedTypeRepository.findAll();
    }

    @Override
    public BedType getBedType(long id) {
        return bedTypeRepository.findById(id).orElse(null);
    }
}
