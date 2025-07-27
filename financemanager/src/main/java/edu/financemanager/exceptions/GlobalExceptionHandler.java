package edu.financemanager.exceptions;

import edu.financemanager.data.ApiResponse;
import edu.financemanager.exceptions.Category.CategoryAlreadyExistsException;
import edu.financemanager.exceptions.Category.CategoryNotFoundException;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CategoryAlreadyExistsException.class)
    public ResponseEntity<ApiResponse<Void>> categoryAlreadyExistsException(CategoryAlreadyExistsException ex)
    {
        ApiResponse<Void> response = new ApiResponse<>();
        response.setMessage(ex.getMessage());
        response.setData(null);

        return new ResponseEntity<ApiResponse<Void>>(response, HttpStatusCode.valueOf(400));
    }

    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity<ApiResponse<Void>> categoryNotFoundException(CategoryNotFoundException ex)
    {
        ApiResponse<Void> response = new ApiResponse<>();
        response.setMessage(ex.getMessage());
        response.setData(null);

        return new ResponseEntity<>(response, HttpStatusCode.valueOf(404));
    }
}
