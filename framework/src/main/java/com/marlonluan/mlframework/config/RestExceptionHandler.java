package com.marlonluan.mlframework.config;

import com.marlonluan.mlframework.util.NotFoundException;
import java.time.Instant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ProblemDetail handleNotFoundException(final NotFoundException exception) {
        final var problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND,
                exception.getLocalizedMessage());
        problemDetail.setProperty("timestamp", Instant.now());
        return problemDetail;
    }

    @ExceptionHandler(Exception.class)
    public ProblemDetail handleException(final Exception exception) {
        final var problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.INTERNAL_SERVER_ERROR,
                exception.getLocalizedMessage());
        problemDetail.setProperty("timestamp", Instant.now());
        return problemDetail;
    }

}
