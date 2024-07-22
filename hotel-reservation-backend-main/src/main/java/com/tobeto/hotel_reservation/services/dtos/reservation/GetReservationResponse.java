package com.tobeto.hotel_reservation.services.dtos.reservation;

import com.tobeto.hotel_reservation.entities.enums.ReservationStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetReservationResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private BigDecimal totalPrice;
    private ReservationStatus status;
    private Long userId;
    private Long roomId;
}
