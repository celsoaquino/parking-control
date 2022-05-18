package com.celsoaquino.parkingcontrol.controllers;

import com.celsoaquino.parkingcontrol.services.ParkingSpotService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(originPatterns = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
@AllArgsConstructor
public class ParkingSpotController {

    private final ParkingSpotService parkingSpotService;
}
