package com.example.demo.core.user.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.MapsId
import javax.persistence.OneToOne
import javax.persistence.Table

/**
 * Created by HoYoung on 2022/07/18.
 */
@Entity
@Table(name = "Users_Detail")
class UserDetail(mobile: String, userJoinType: UserJoinType) : BaseTimeEntity() {

  @Id
  @Column(name = "user_Id")
  var id: Long? = null

  @Column
  var mobile: String = mobile
    private set

  @Column
  @Enumerated(EnumType.STRING)
  var userJoinType: UserJoinType = userJoinType
    private set

  @OneToOne
  @MapsId
  @JoinColumn(name = "user_id")
  lateinit var user: User

}