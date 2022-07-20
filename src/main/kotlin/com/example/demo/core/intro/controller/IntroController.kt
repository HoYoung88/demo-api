package com.example.demo.core.intro.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

/**
 * Created by HoYoung on 2022/07/19.
 */
@RestController
@RequestMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
class IntroController {

  private val log: Logger = LoggerFactory.getLogger(this.javaClass)

  @GetMapping(value = ["/intros"])
  fun findIntroConfig(locale: Locale): ResponseEntity<String> {
    log.debug("{}", locale)
    return ResponseEntity.ok().body("12312")
  }
}