package com.celsoaquino.parkingcontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotRepository, UUID> {
}
