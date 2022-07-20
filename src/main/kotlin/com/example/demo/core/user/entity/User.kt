package com.example.demo.core.user.entity

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToOne
import javax.persistence.Table

/**
 * Created by HoYoung on 2022/07/18.
 */
@Entity
@Table(name = "Users")
class User(email: String, password: String, name: String,
           nickname: String, userType: UserType) : BaseTimeEntity() {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  var id: Long? = null

  @Column(nullable = false, columnDefinition = "varchar(100)")
  var email: String = email
    private set

  @Column(nullable = false)
  var password: String = password
    private set

  @Column(nullable = false, columnDefinition = "varchar(20)")
  var name: String = name
    private set

  @Column(columnDefinition = "varchar(100)")
  var nickname: String = nickname
    private set

  @Column
  @Enumerated(EnumType.STRING)
  var userType: UserType = userType
    private set

//  @Column(columnDefinition = "varchar(1)")
//  @Enumerated(EnumType.STRING)
//  var withdrawalYn: UserWithdrawal = withdrawal

  @OneToOne(mappedBy = "user", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
  lateinit var detail: UserDetail
    private set

  companion object {
    fun newUser(email: String, password: String, name: String, nickname: String): User {
      return User(email, password, name, nickname, UserType.NORMAL)
    }

    fun newSeller(email: String, password: String, name: String, nickname: String): User {
      return User(email, password, name, nickname, UserType.SELLER)
    }
  }

  fun addDetail(detail: UserDetail) {
    this.detail = detail;
    this.detail.user = this
  }
}