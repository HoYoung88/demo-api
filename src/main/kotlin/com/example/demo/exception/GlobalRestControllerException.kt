package com.example.demo.exception

import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

/**
 * Created by HoYoung on 2022/07/18.
 */
@RestControllerAdvice
class GlobalRestControllerException : ResponseEntityExceptionHandler() {
//  private val log: Logger = LoggerFactory.getLogger(this.javaClass)
//  override fun handleExceptionInternal(
//    ex: Exception,
//    body: Any?,
//    headers: HttpHeaders,
//    status: HttpStatus,
//    request: WebRequest
//  ): ResponseEntity<Any> {
//    return when(ex) {
//      is MethodArgumentNotValidException -> super.handleExceptionInternal(ex,
//        GlobalErrorResponse(ex.message), headers, status, request)
//
//      else -> super.handleExceptionInternal(ex,
//        ex.message?.let { GlobalErrorResponse(it) }, headers, status, request)
//    }
//  }

//  override fun handleMethodArgumentNotValid(
//    ex: MethodArgumentNotValidException,
//    headers: HttpHeaders,
//    status: HttpStatus,
//    request: WebRequest
//  ): ResponseEntity<Any> {
//
//    log.debug("{}", ex.parameter.parameterIndex)
//    log.debug("{}", ex.fieldError?.field)
//    log.debug("{}", ex.globalError)
//    log.debug("{}", ex.globalErrors)
//    log.debug("{}", ex.fieldError?.defaultMessage)
//    log.debug("{}", ex.fieldErrors)
//
//    val errorMessage = "${ex.fieldError?.field} ${ex.fieldError?.defaultMessage}"
//
//    return super.handleExceptionInternal(ex, errorMessage, headers, status, request)
//  }
}