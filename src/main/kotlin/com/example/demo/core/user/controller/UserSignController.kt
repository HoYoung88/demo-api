package com.example.demo.core.user.controller

import com.example.demo.core.user.service.UserSignService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by HoYoung on 2022/07/18.
 */
@RestController
@RequestMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
@Tag(name = "회원가입")
class UserSignController(val userSignService: UserSignService) {

  private val log: Logger = LoggerFactory.getLogger(this.javaClass)

  @PostMapping(value = ["/users/sign-up"])
  @Operation(summary = "회원가입")
  fun userSignUp(@Validated @RequestBody userSignUpRequest: UserSignUpRequest) {
    this.userSignService.signIn()
  }

  @PostMapping(value = ["/users/sign-in"])
  @Operation(summary = "로그인")
  fun userSignIn() {
    this.userSignService.signIn()
  }

//  @PostMapping(value = ["/users/oauth/token/kakao"])
//  @Operation(summary = "카카오 로그인")
//  fun userSignUpKakao(@RequestBody userSignUpSnsRequest: UserSignUpSnsRequest) {
//    this.userSignService.signInKakao()
//  }
//
//  @PostMapping(value = ["/users/oauth/token/naver"])
//  @Operation(summary = "네이버 로그인")
//  fun userSignUpNaver(@RequestBody userSignUpSnsRequest: UserSignUpSnsRequest) {
//    this.userSignService.signInNaver()
//  }
//
//  @PostMapping(value = ["/users/oauth/token/apple"])
//  @Operation(summary = "애플 로그인")
//  fun userSignUpApple(@RequestBody userSignUpSnsRequest: UserSignUpSnsRequest) {
//    this.userSignService.signInApple()
//  }
//
//  @PostMapping(value = ["/users/oauth/token/google"])
//  @Operation(summary = "구글 로그인")
//  fun userSignUpGoogle(@RequestBody userSignUpSnsRequest: UserSignUpSnsRequest) {
//    this.userSignService.signInGoogle()
//  }
}