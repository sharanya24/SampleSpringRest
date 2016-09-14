package com.cultuzz.accounting.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.cultuzz.accounting.exception.DataAccessException;

@Aspect
@Component
public class WriteDataManagerAspect {

	@Around("execution(* com.cultuzz.accounting.manager.write.*.*(..))")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		
		Object result = null;

		System.out.println("logAround() is running!");
		System.out.println("hijacked method : "
				+ joinPoint.getSignature().getName());

		System.out.println("Around before is running!");
		try {
			result = joinPoint.proceed(); // continue on the intercepted method
			System.out.println("result "+result);
			
			
		} catch (RuntimeException e) {
			System.out.println("exception find " + e.getMessage());
			throw new DataAccessException("Data Not Updated");
			
		}

		System.out.println("Around after is running!");

		System.out.println("******");
		
		return result;

	}
}

