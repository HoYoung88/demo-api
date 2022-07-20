package com.example.demo.core.product.entity

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToOne
import javax.persistence.PrimaryKeyJoinColumn
import javax.persistence.Table

/**
 * Created by HoYoung on 2022/07/18.
 */
@Entity
@Table(name = "Product")
class Product(name: String, sellerId: Long) : BaseTimeEntity() {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_id")
  var id: Long? = null

  @Column(nullable = false)
  var name: String = name
    private set

  @Column(nullable = false)
  var sellerId: Long = sellerId
    private set

  @OneToOne(mappedBy = "product", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
  @PrimaryKeyJoinColumn
  lateinit var detail: ProductDetail

  fun addDetail(detail: ProductDetail) {
    this.detail = detail;
    this.detail.product = this;
  }
}