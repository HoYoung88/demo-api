package com.example.demo.core.product.controller

import com.example.demo.core.product.service.ProductService
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by HoYoung on 2022/07/15.
 */
@RestController
@Tag(name = "상품")
class ProductController(val productService: ProductService) {

  @GetMapping(value = ["/products"])
  fun findProduct() {

  }

  @PostMapping(value = ["/products"])
  fun createProduct() {
    this.productService.createProduct()
  }
}