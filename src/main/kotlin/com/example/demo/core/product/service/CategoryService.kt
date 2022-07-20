package com.example.demo.core.product.service

import com.example.demo.core.product.repository.CategoryRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

/**
 * Created by HoYoung on 2022/07/15.
 */
@Service
class CategoryService(val categoryRepository: CategoryRepository) {
  val log: Logger = LoggerFactory.getLogger(this.javaClass)

  fun addCategory() {
  }
}