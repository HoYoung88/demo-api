package com.example.demo.core.product.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.MapsId
import javax.persistence.OneToOne
import javax.persistence.Table

/**
 * Created by HoYoung on 2022/07/18.
 */
@Entity
@Table(name = "Product_Detail")
class ProductDetail : BaseTimeEntity() {
  @Id
  @Column(name = "product_id")
  var id: Long? = null

  @OneToOne
  @MapsId
  @JoinColumn(name = "product_id")
  lateinit var product: Product


}