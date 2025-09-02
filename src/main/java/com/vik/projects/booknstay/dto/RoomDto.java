package com.vik.projects.booknstay.dto;

import com.vik.projects.booknstay.entity.Hotel;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
public class RoomDto {

    private Long id;

    private String roomType;

    private BigDecimal basePrice;

    private List<String> photos;

    private Set<String> amenities;

    private Integer numberOfAdults;

    private Integer numberOfRooms;
}
