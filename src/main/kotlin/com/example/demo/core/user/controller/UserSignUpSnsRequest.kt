package com.example.demo.core.user.controller

import javax.validation.constraints.NotBlank

/**
 * Created by HoYoung on 2022/07/18.
 */
data class UserSignUpSnsRequest(
  @field:NotBlank
  val token: String
) {
}