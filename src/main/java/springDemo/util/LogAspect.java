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
    	logger.info(">>>>执行目标方法		: " + joinPoint.getSignature().getName());
    	logger.info(">>>>执行目标方法参数	: " + Arrays.toString(joinPoint.getArgs()));
    	
        Object returnValue;
		try {
			returnValue = joinPoint.proceed();
		} catch (Exception e) {
			logger.error("<<<<执行目标方法异常	: " + e.getMessage());
			throw e;
		}
		
		logger.info("<<<<执行目标方法返回值	: " + returnValue);
		return returnValue;
    }

}
