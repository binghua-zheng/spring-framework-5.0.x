package com.binghuazheng.ioc.conditional.condition;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;

/**
 * @ClassName ConditionOnBean
 * @Description TODO
 * @Author Administrator
 * @Date 2020/11/24 22:11
 * @Version 1.0
 */
public class ConditionOnBean implements ConfigurationCondition {

	/**
	 * Return the {@link ConfigurationPhase} in which the condition should be evaluated.
	 */
	@Override
	public ConfigurationPhase getConfigurationPhase() {
		return ConfigurationPhase.PARSE_CONFIGURATION;
	}

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
