package com.cg.usrsrvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cg.usrsrvc.payload.ApiResponse;

import jakarta.servlet.http.HttpServletRequest;


@RestControllerAdvice

public class GlobalExceptionalHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
   public ResponseEntity<ApiResponse> handleDealerNotExistingException(Exception e, HttpServletRequest req) {

       String uri = req.getRequestURI().toString();
       ApiResponse errorInfo = new ApiResponse(uri, e.getMessage());

      ResponseEntity<ApiResponse> responseEntity = new ResponseEntity<>(errorInfo, HttpStatus.NOT_FOUND);
      return responseEntity;
      
      
  }
    
}



//public class GlobalExceptionalHandler extends ResponseEntityExceptionHandler{
	
//	@ExceptionHandler(ResourceNotFoundException.class)
//	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex)
//	{
//		String message = ex.getMessage();
//	ApiResponse response =	new ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
//		
//		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
//	}
			
//}



