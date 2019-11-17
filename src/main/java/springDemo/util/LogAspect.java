package springDemo.util;



import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Aspect
public class LogAspect { 
	private  static  final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Around("execution(* springDemo..*(..))")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
    	logger.info(">>>>target function: " + joinPoint.getSignature().getName());
    	logger.info(">>>>arguments		: " + Arrays.toString(joinPoint.getArgs()));
    	
        Object returnValue;
		try {
			returnValue = joinPoint.proceed();
		} catch (Exception e) {
			logger.error("<<<<function exception: " + e.getMessage());
			throw e;
		}
		
		logger.info("<<<<function return: " + returnValue);
		return returnValue;
    }

}
