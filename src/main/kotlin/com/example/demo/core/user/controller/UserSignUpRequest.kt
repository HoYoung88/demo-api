package com.example.demo.core.user.controller

import com.example.demo.core.user.entity.User

/**
 * Created by HoYoung on 2022/07/18.
 */
data class UserSignUpRequest(
  val email: String,
  val password: String,
  val name: String,
  val nickname: String
) {
  fun toUser() = User.newUser(this.email, this.password, this.name, this.nickname)
}