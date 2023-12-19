package dev.danilobarreto.hotelreservationbackend.Controller;

import dev.danilobarreto.hotelreservationbackend.Model.Reservation;
import dev.danilobarreto.hotelreservationbackend.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/reservations")
    public String showReservations(Model model) {
        List<Reservation> reservations = reservationService.getAllReservations();
        model.addAttribute("reservations", reservations);
        return "index";
    }

    @GetMapping("/reserve")
    public String showReservationForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "form";
    }

    @PostMapping("/reserve")
    public String handleReservationForm(Reservation reservation) {
        reservationService.saveReservation(reservation);
        return "redirect:/reservations";
    }
}
