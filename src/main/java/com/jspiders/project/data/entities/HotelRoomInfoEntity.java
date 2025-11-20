package com.jspiders.project.data.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "hotel_room_info")
public class HotelRoomInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;
    private String roomType;
    private Integer maxGuestAllowed;
    private Integer maxAdultAllowed;
    private Integer maxChildrenAllowed;
    private Double roomRate;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private HotelInfoEntity hotelInfoEntity;

}