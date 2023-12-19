package dev.danilobarreto.hotelreservationbackend.Service;

import dev.danilobarreto.hotelreservationbackend.Model.Room;
import dev.danilobarreto.hotelreservationbackend.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
}
