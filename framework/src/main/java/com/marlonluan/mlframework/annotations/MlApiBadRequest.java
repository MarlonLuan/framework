package com.marlonluan.mlframework.annotations;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@ApiResponse(responseCode = "400", description = "Já possui ID")
@Retention(RetentionPolicy.RUNTIME)
public @interface MlApiBadRequest {

}
