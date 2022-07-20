package com.example.demo.core.user.controller

import com.example.demo.core.user.service.UserService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by HoYoung on 2022/07/18.
 */
@RestController
@Tag(name = "유저")
class UserController(val userService: UserService) {

  @GetMapping(value = ["/users/me"])
  @Operation(summary = "로그인한 사용자 정보")
  fun findUser() {
    this.userService.createUser()
  }

}