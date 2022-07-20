package com.example.demo.core.product.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by HoYoung on 2022/07/15.
 */
@Entity
@Table(name = "Category")
class Category(name: String, depth: Int, sort: Int, parent: Int) : BaseTimeEntity() {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "category_id")
  var id: Long? = null

  @Column(nullable = false)
  var name: String = name
    private set

  @Column(nullable = false)
  var depth: Int = depth
    private set

  @Column(nullable = false)
  var sort: Int = sort
    private set

  @Column(nullable = false)
  var parent: Int = parent
    private set

}