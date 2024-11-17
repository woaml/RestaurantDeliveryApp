package com.ana.restaurantApp.request;

import com.ana.restaurantApp.model.Address;
import lombok.Data;

@Data
public class OrderRequest {
    private Long restaurantId;
    private Address deliveryAddress;
}