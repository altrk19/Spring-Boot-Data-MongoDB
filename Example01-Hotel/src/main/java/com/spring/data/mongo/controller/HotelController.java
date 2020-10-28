package com.spring.data.mongo.controller;

import com.spring.data.mongo.model.Hotel;
import com.spring.data.mongo.repository.HotelRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    private HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/all")
    public List<Hotel> getAll() {
        return this.hotelRepository.findAll();
    }

    @PostMapping
    public void update(@RequestBody Hotel hotel) {
        this.hotelRepository.save(hotel);
    }

    @GetMapping("/{id}")
    public Hotel getById(@PathVariable("id") String id) {
        return hotelRepository.findById(id).orElse(null);
    }

    @GetMapping("/price/{maxPrice}")
    public List<Hotel> getByPricePerNight(@PathVariable("maxPrice") int maxPrice) {
        return hotelRepository.findByPricePerNightLessThan(maxPrice);
    }

    @GetMapping("/address/{city}")
    public List<Hotel> getByCity(@PathVariable("city") String city) {
        return hotelRepository.findByCity(city);
    }

}