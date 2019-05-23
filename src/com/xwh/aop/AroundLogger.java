package com.xwh.aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
/**
 * 环绕增强类
 * @author xwh
 *
 */
@Aspect
public class AroundLogger {
	private static final Logger logger=Logger.getLogger(AroundLogger.class);
	/**
	 * 环绕增强方法
	 * @param jp
	 * @return
	 * @throws Throwable
	 */
	@Around("execution(* com.xwh.service.UserService.*(..))")
	public Object aroundLogger(ProceedingJoinPoint jp) throws Throwable{
		logger.info("环绕增强====>调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法.方法入参"+Arrays.toString(jp.getArgs()));
		try {
			Object result=jp.proceed();	//执行目标方法并且获得返回值
			logger.info("环绕增强====>调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法.方法的返回值:"+result);
			//返回值
			return result;
		} catch (Throwable e) {
			logger.error("环绕增强====>"+jp.getSignature().getName()+"发生异常:"+e);
			throw e;
		}finally {
			logger.info("环绕增强====>"+jp.getSignature().getName()+"方法执行结束!");
		}
	}
}
