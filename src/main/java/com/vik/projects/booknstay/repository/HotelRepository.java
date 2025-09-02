package com.vik.projects.booknstay.repository;

import com.vik.projects.booknstay.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
