package com.celsoaquino.parkingcontrol.services;

import com.celsoaquino.parkingcontrol.repositories.ParkingSpotRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ParkingSpotService {

    private final ParkingSpotRepository parkingSpotRepository;
}
