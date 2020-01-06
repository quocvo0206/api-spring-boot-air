package jum.air.service;

import jum.air.Repository.HotelRepository;
import jum.air.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;

@Service
public class HotelService {
    @Autowired
    private  HotelRepository hotelRepository;

    public List<Hotel> getHotel(){
        return hotelRepository.findAll();
    }
}
