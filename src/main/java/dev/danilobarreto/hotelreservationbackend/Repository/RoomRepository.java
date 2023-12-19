package dev.danilobarreto.hotelreservationbackend.Repository;

import dev.danilobarreto.hotelreservationbackend.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
