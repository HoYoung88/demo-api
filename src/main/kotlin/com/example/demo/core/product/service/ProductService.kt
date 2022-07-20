package com.example.demo.core.product.service

import com.example.demo.core.product.entity.Product
import com.example.demo.core.product.entity.ProductDetail
import com.example.demo.core.product.repository.ProductRepository
import org.springframework.stereotype.Service

/**
 * Created by HoYoung on 2022/07/18.
 */
@Service
class ProductService(val productRepository: ProductRepository) {

  fun createProduct() {
    val product: Product = Product("aaaa", 1111);
    product.addDetail(ProductDetail())
    this.productRepository.save(product);
  }
}