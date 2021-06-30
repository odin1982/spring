package spring.pag083;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class TigerReplacer implements MethodReplacer{

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		return "A feroucious tiger";
	}

}
