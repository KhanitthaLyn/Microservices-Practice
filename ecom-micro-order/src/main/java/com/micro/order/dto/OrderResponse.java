package com.micro.order.dto;

import com.micro.order.models.OrderItem;
import com.micro.order.models.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class OrderResponse {
    private Long id;
    private BigDecimal totalAmount;
    private OrderStatus status;
    private List<OrderItemDTO> Items;
    private LocalDateTime createdAt;
}
