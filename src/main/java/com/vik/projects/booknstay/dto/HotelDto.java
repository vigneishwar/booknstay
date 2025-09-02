package com.vik.projects.booknstay.dto;

import com.vik.projects.booknstay.entity.HotelContactInfo;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
public class HotelDto {

    private Long id;

    private String name;

    private String city;

    private List<String> photos;

    private Set<String> amenities;

    private HotelContactInfoDto contactInfo;

    private Boolean active;
}
