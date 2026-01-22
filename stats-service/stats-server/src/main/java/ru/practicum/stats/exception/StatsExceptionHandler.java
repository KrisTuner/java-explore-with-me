package ru.practicum.stats.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;

@RestControllerAdvice
public class StatsExceptionHandler {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ApiError> handleIllegalArgument(IllegalArgumentException exception) {
        ApiError apiError = new ApiError(
                Collections.emptyList(),
                exception.getMessage(),
                "Неверный запрос.",
                HttpStatus.BAD_REQUEST.name(),
                LocalDateTime.now().format(FORMATTER)
        );
        return new ResponseEntity<>(apiError, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ApiError> handleTypeMismatch(MethodArgumentTypeMismatchException exception) {
        ApiError apiError = new ApiError(
                Collections.emptyList(),
                "Неверный формат параметра: " + exception.getName(),
                "Неверный запрос.",
                HttpStatus.BAD_REQUEST.name(),
                LocalDateTime.now().format(FORMATTER)
        );
        return new ResponseEntity<>(apiError, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleOther(Exception exception) {
        ApiError apiError = new ApiError(
                Collections.emptyList(),
                exception.getMessage(),
                "Внутренняя ошибка.",
                HttpStatus.INTERNAL_SERVER_ERROR.name(),
                LocalDateTime.now().format(FORMATTER)
        );
        return new ResponseEntity<>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public static class ApiError {
        private final java.util.List<String> errors;
        private final String message;
        private final String reason;
        private final String status;
        private final String timestamp;

        public ApiError(java.util.List<String> errors, String message, String reason, String status, String timestamp) {
            this.errors = errors;
            this.message = message;
            this.reason = reason;
            this.status = status;
            this.timestamp = timestamp;
        }

        public java.util.List<String> getErrors() {
            return errors;
        }

        public String getMessage() {
            return message;
        }

        public String getReason() {
            return reason;
        }

        public String getStatus() {
            return status;
        }

        public String getTimestamp() {
            return timestamp;
        }
    }
}