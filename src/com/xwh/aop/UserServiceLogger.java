package com.xwh.aop;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
/**
 * 增强方法的javaBean
 * @author Administrator
 *
 */
/**
 * 使用注解定义切面
 * @author xwh
 *
 */
@Aspect
public class UserServiceLogger {
	private static final Logger logger=Logger.getLogger(UserServiceLogger.class);
	//定义统一切入点
	@Pointcut("execution(* com.xwh.service.UserService.*(..))")
	public void pointcut(){}
	/**
	 * 前置增强方法
	 * @param jp
	 */
	//示例25
	/*@Before("execution(* com.xwh.service.UserService.*(..))")*/
	@Before("pointcut()")
	public void before(JoinPoint jp){
		logger.info("前置增强====>调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法.方法入参:"+Arrays.toString(jp.getArgs()));
	}
	/**
	 * 后置增强的方法
	 * @param jp
	 * @param result
	 */
	//示例25
	/*@AfterReturning(pointcut="execution(* com.xwh.service.UserService.*(..))",returning="result")*/
	//示例26
	@AfterReturning(pointcut="pointcut()",returning="result")
	public void afterReturning(JoinPoint jp,Object result){
		logger.info("后置增强====>调用"+jp.getTarget()+"的"+jp.getSignature().getName()+"方法.方法的返回值:"+result);
	}
}
