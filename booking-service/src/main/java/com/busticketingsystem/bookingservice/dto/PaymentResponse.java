package com.busticketingsystem.bookingservice.dto;

import com.busticketingsystem.bookingservice.model.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponse
{
	private Long id;
	private Long bookingId;
	private Double amount;
	private LocalDate paymentDate;
	private PaymentStatus status;
}
