package com.jspiders.project.data.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "hotel_info")
public class HotelInfoEntity {
    @Id//Mark this as Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_id")
    private Long hotelId;
    @Column(name = "hotelname")
    private String hotelName;
    @Column(name = "thumbnail")
    private String thumbNail;
    @Column(name = "providerfamily")
    private String providerFamily;
    @Column(name = "propertytype")
    private String propertyType;
    @Column(name = "rating")
    private Double rating;

    @OneToOne(cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY)
    private HotelContactInfoEntity hotelContactInfo;

    @OneToMany(cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<HotelRoomInfoEntity> hotelRoomInfoEntityList;

}