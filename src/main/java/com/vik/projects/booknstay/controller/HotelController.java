package com.vik.projects.booknstay.controller;

import com.vik.projects.booknstay.dto.HotelDto;
import com.vik.projects.booknstay.service.HotelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/hotels")
@RequiredArgsConstructor
@Slf4j
public class HotelController {

    private final HotelService hotelService;

    @PostMapping("/create")
    public ResponseEntity<HotelDto> createNewHotel(@RequestBody HotelDto hotelDto) {
        log.info("Received request to create hotel: {}", hotelDto.getName());
        HotelDto createdHotel = hotelService.createHotel(hotelDto);
        log.info("Hotel created successfully with ID: {}", createdHotel.getId());
        return new ResponseEntity<>(createdHotel, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HotelDto> getHotelById(@PathVariable Long id) {
        log.info("Received request to fetch hotel with ID: {}", id);
        HotelDto hotelDto = hotelService.getHotelById(id);
        log.info("Hotel fetched successfully: {}", hotelDto.getName());
        return new ResponseEntity<>(hotelDto, HttpStatus.OK);
    }
}
