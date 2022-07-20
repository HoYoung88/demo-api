package com.example.demo.config

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.filter.OncePerRequestFilter
import javax.servlet.FilterChain
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Created by HoYoung on 2022/07/19.
 */
//@Component
class ServiceExecutionTime : OncePerRequestFilter() {
  private val log: Logger = LoggerFactory.getLogger(this.javaClass)

  override fun doFilterInternal(
    request: HttpServletRequest,
    response: HttpServletResponse,
    filterChain: FilterChain
  ) {
//    val stopWatch = StopWatch()
//    stopWatch.start("api call")
    filterChain.doFilter(request, response)
//    stopWatch.stop()

//    log.debug("Task Name :: {} => {} millis", stopWatch.lastTaskName, stopWatch.totalTimeMillis)
  }
}