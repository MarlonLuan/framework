package com.marlonluan.mlframework.annotations;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@ApiResponse(responseCode = "404", description = "Não Encontrado")
@Retention(RetentionPolicy.RUNTIME)
public @interface MlApiNotFound {

}
