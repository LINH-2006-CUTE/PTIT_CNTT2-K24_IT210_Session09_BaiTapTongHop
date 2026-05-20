package com.example.session09_it210_baitonghop.controller;

import com.example.session09_it210_baitonghop.model.dto.OrderDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("orderDto") // annotation trên đầu class để giữ OrderDto sống sót qua 3 trang
public class OrderController {

    @ModelAttribute("orderDto")
    public OrderDto setUpOrderDto() {
        return new OrderDto();
    }

    @GetMapping("/page1")
    public String showStep1(@ModelAttribute("orderDto") OrderDto orderDto) {
        return "page1";
    }

    @GetMapping("/pqge2")
    public String showStep2(@ModelAttribute("orderDto") OrderDto orderDto) {
        return "page2";
    }
    @PostMapping("/checkout")
    public String handleCheckout(
            @ModelAttribute("orderDto") OrderDto orderDto,
            SessionStatus status) { // Inject SessionStatus

        // dọn dẹp sạch sẽ Session
        status.setComplete();

        return "success"; // đặt hàng thành công
    }
}