package com.vik.projects.booknstay.service;

import com.vik.projects.booknstay.dto.HotelDto;
import com.vik.projects.booknstay.entity.Hotel;

public interface HotelService {
    HotelDto createHotel(HotelDto hotelDto);
    HotelDto getHotelById(Long id);
}
