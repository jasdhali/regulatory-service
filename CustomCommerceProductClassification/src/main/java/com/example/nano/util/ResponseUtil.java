package com.example.nano.util;

import com.example.nano.config.ResponseSchema;

/**
 * @author Krishna Chaitanya
 *
 */
public class ResponseUtil {

	private ResponseUtil() {
		// no-op
	}

	public static <T> ResponseSchema<T> buildSuccessResponse(T data, ResponseSchema<T> responseSchema) {
		responseSchema.setStatusCode(200);
		responseSchema.setMessage("success");
		responseSchema.setData(data);
		return responseSchema;
	}

	public static <T> ResponseSchema<T> buildFailedResponse(String failedMessage, T data, ResponseSchema<T> responseSchema) {
		responseSchema.setStatusCode(200);
		responseSchema.setMessage(failedMessage);
		responseSchema.setData(data);
		return responseSchema;
	}
	
	public static <T> ResponseSchema<T> buildRequestFailedResponse(T data, ResponseSchema<T> responseSchema) {
		responseSchema.setStatusCode(403);
		responseSchema.setMessage("Forbidden");
		responseSchema.setData(data);
		return responseSchema;
	}
	
	public static <T> ResponseSchema<T> buildBadRequestResponse(String message, ResponseSchema<T> responseSchema) {
		responseSchema.setStatusCode(400);
		responseSchema.setMessage(message);
		return responseSchema;
	}
}
