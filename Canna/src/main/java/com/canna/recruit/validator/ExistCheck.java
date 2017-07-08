/**
 * 
 *	데이터 존재 여부 어노테이션 // 아아디 중복 검사
 *
 */
package com.canna.recruit.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistCheck {
	String message() default "{ExistCheck}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
