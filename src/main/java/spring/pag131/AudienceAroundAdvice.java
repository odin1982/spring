package spring.pag131;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import spring.pag040.PerformanceException;
import spring.pag125.Audience;

public class AudienceAroundAdvice implements MethodInterceptor{
	private Audience audience;

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		try {
			audience.takeSeats();
			audience.turnOffCellPhones();
			Object returnValue = invocation.proceed();
			audience.applaud();
			return returnValue;
		} catch (PerformanceException throwable) {
			audience.demandRefund();
			throw throwable;
		}
	}
	
	public void setAudience(Audience audience) {
		this.audience = audience;
	}
	}
