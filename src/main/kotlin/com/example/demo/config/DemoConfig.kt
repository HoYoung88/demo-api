package com.example.demo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.filter.CommonsRequestLoggingFilter

/**
 * Created by HoYoung on 2022/07/19.
 */
@Configuration
class DemoConfig {
  @Bean
  fun requestLoggingFilter(): CommonsRequestLoggingFilter =
    CommonsRequestLoggingFilter().apply {
      setIncludeHeaders(true)
      setIncludeQueryString(true)
      setIncludePayload(true)
      setMaxPayloadLength(100)
      setIncludeClientInfo(true)
    }
}