package dev.danilobarreto.hotelreservationbackend.Service;

import dev.danilobarreto.hotelreservationbackend.Model.Reservation;
import dev.danilobarreto.hotelreservationbackend.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public void saveReservation(Reservation reservation) {
        reservationRepository.save(reservation);
    }
}
