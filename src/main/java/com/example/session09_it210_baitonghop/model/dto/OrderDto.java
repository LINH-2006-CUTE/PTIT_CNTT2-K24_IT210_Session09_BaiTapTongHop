package com.example.session09_it210_baitonghop.model.dto;

import java.util.List;

public class OrderDto {
    private String customerName;
    private String address;
    private List<String> items;

    public OrderDto(String customerName, String address, List<String> items) {
        this.customerName = customerName;
        this.address = address;
        this.items = items;
    }
    public OrderDto () {}

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
