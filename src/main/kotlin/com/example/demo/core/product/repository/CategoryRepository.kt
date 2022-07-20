package com.example.demo.core.product.repository

import com.example.demo.core.product.entity.Category
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by HoYoung on 2022/07/15.
 */
interface CategoryRepository : JpaRepository<Category, Long> {
}