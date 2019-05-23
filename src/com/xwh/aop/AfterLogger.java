package com.xwh.aop;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
/**
 * 最终增强类
 * @author xwh
 *
 */
@Aspect
public class AfterLogger {
	private static final Logger logger=Logger.getLogger(AfterLogger.class);
	/**
	 * 最终增强方法
	 * @param jp
	 */
	@After("execution(* com.xwh.service.UserService.*(..))")
	public void afterLogger(JoinPoint jp){
		logger.info("最终增强===>:"+jp.getSignature().getName()+"方法执行结束.");
	}
}
