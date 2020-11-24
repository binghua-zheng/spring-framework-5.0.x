package com.binghuazheng.ioc.conditional.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;

/**
 * @ClassName ConditionOnClass
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/24 22:09
 * @Version 1.0
 */
public class ConditionOnClass implements Condition {

	/**
	 * Determine if the condition matches.
	 *
	 * @param context  the condition context
	 * @param metadata metadata of the {@link AnnotationMetadata class}
	 *                 or {@link MethodMetadata method} being checked
	 * @return {@code true} if the condition matches and the component can be registered,
	 * or {@code false} to veto the annotated component's registration
	 */
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return false;
	}
}
