package com.busticketingsystem.bookingservice.event;

import com.busticketingsystem.bookingservice.model.NotificationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingConfirmedEvent
{
	private Long bookingId;
	private Long userId;
	private NotificationType notificationType;
	private String email;
	private String phoneNumber;
}
