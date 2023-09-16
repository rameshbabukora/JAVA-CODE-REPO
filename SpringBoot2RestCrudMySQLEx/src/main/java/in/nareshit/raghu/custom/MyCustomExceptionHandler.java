package in.nareshit.raghu.custom;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.nareshit.raghu.exception.ProductNotFoundException;
import in.nareshit.raghu.model.ErrorMessage;
import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class MyCustomExceptionHandler {

	/*@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> handleProductNotFoundException(
			ProductNotFoundException e
			) 
	{
		
		return new ResponseEntity<String>(
				e.getMessage(),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}*/
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleProductNotFoundException(
			ProductNotFoundException e
			) 
	{
		log.info("ENTERED INTO GLOBAL HANDLER");
		return new ResponseEntity<ErrorMessage>(
				new ErrorMessage(
						e.getMessage(),
						"PRODUCT",
						new Date().toString()
						),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
