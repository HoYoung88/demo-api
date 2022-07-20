package com.example.demo.core.order.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by HoYoung on 2022/07/18.
 */
@RestController
@Tag(name = "주문")
class OrderController {

  @PostMapping(value = ["/orders/payment"])
  @Operation(summary = "상품 주문")
  fun createOrderPayment() {

  }
}