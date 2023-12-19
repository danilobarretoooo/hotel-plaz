package dev.danilobarreto.hotelreservationbackend.Repository;

import dev.danilobarreto.hotelreservationbackend.Model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
