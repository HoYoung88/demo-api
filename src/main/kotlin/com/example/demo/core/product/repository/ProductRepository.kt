package com.example.demo.core.product.repository

import com.example.demo.core.product.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by HoYoung on 2022/07/18.
 */
interface ProductRepository : JpaRepository<Product, Long> {
}