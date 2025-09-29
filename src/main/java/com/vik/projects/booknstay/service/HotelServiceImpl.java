package com.vik.projects.booknstay.service;

import com.vik.projects.booknstay.config.MapperConfig;
import com.vik.projects.booknstay.dto.HotelDto;
import com.vik.projects.booknstay.entity.Hotel;
import com.vik.projects.booknstay.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService{

    private final HotelRepository hotelRepository;

    private final ModelMapper modelMapper;

    @Override
    public HotelDto createHotel(HotelDto hotelDto) {
        log.info("Creating hotel: {}", hotelDto.getName());
        Hotel hotel = modelMapper.map(hotelDto, Hotel.class);
        hotel.setIsActive(false);
        hotel = hotelRepository.save(hotel);
        log.info("Hotel created with ID: {}", hotel.getId());
        return modelMapper.map(hotel, HotelDto.class);
    }

    @Override
    public HotelDto getHotelById(Long id) {
        log.info("Fetching hotel with ID: {}", id);
        Hotel hotel = hotelRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hotel not found with ID: " + id));
        return modelMapper.map(hotel, HotelDto.class);
    }
}
