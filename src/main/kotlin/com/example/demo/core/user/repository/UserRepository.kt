package com.example.demo.core.user.repository

import com.example.demo.core.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by HoYoung on 2022/07/18.
 */
interface UserRepository : JpaRepository<User, Long> {
}