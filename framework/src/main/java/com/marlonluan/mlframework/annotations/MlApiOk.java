package com.marlonluan.mlframework.annotations;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ApiResponse(responseCode = "200", description = "Sucesso")
@ResponseStatus(HttpStatus.OK)
@Retention(RetentionPolicy.RUNTIME)
public @interface MlApiOk {

}
