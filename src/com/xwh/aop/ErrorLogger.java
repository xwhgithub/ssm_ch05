package com.xwh.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
/**
 * 异常抛出增强
 * @author xwh
 *
 */
@Aspect
public class ErrorLogger {
	
	private static final Logger logger=Logger.getLogger(ErrorLogger.class);
	/**
	 * 捕获异常的方法
	 * @param jp
	 * @param e
	 */
	@AfterThrowing(pointcut="execution(* com.xwh.service.UserService.*(..))",throwing="e")
	public void afterThrowing(JoinPoint jp,RuntimeException e){
		logger.error("异常===>:"+jp.getSignature().getName()+"方法异常"+e);
	}
}
