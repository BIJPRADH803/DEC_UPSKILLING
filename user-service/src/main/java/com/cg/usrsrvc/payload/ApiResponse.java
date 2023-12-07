package com.cg.usrsrvc.payload;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiResponse {
	
	
	private String uri;
    private String message;

    public ApiResponse(String uri, String message) {
        super();
        this.uri = uri;
        this.message = message;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
	
//	private String message;
//	
//	private boolean success;
//	
//	private HttpStatus status;
//
//	public String getMessage() {
//		return message;
//	}
//
//	public void setMessage(String message) {
//		this.message = message;
//	}
//
//	public boolean isSuccess() {
//		return success;
//	}
//
//	public void setSuccess(boolean success) {
//		this.success = success;
//	}
//
//	public HttpStatus getStatus() {
//		return status;
//	}
//
//	public void setStatus(HttpStatus status) {
//		this.status = status;
//	}
//
//	public ApiResponse(String message, boolean success, HttpStatus status) {
//		super();
//		this.message = message;
//		this.success = success;
//		this.status = status;
//	}

	
	
	
	
	 
	
}