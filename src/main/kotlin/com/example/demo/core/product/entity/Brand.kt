package com.example.demo.core.product.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by HoYoung on 2022/07/18.
 */
@Entity
@Table(name = "Brand")
class Brand(name: String) : BaseTimeEntity() {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "brand_id")
  var id: Long? = null

  @Column(nullable = false)
  var name: String = name
    private set


}