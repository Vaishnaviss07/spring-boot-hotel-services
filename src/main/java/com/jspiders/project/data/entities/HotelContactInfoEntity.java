package com.jspiders.project.data.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "hotel_contact_info")
public class HotelContactInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long hotelId;

    //    @OneToOne
//    @JoinColumn(name = "hotel_id")
//    private HotelInfoEntity hotelInfoEntity;
    private String address;
    private String city;
    private String cityCode;
    private String country;
    private String countryCode;
    private String postalCode;
    private String stateCode;
    private String phones;
    private String email;
    private String fax;

}