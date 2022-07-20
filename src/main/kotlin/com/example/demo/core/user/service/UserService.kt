package com.example.demo.core.user.service

import com.example.demo.core.user.entity.User
import com.example.demo.core.user.entity.UserDetail
import com.example.demo.core.user.entity.UserJoinType
import com.example.demo.core.user.repository.UserRepository
import org.springframework.stereotype.Service

/**
 * Created by HoYoung on 2022/07/18.
 */
@Service
class UserService(val userRepository: UserRepository) {

  fun createUser() {
    val user = User.newUser("demo@demo.com", "1234",
      "홍길동", "닉네임")
    user.addDetail(UserDetail("01012341234", UserJoinType.NORMAL))

    this.userRepository.save(user)
  }

}