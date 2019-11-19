package mum.edu.leafhomestay.service;

import mum.edu.leafhomestay.domain.Homestay;

import java.util.List;

public interface HomestayService {

    Homestay addHomeStay(Homestay homestay);

    Homestay updateHomeStay(Homestay homestay);

    public void deleteHomeStay(Long id);

    public Homestay getHomeStay(Long id);

    public List<Homestay> getAllHomeStay();
}
