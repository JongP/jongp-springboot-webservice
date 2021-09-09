package com.jongp.book.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) //assigning location where this annotation is located. PARAMETER means this will be used in Class assigned in method parameter
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {  //@interface assigns this interface as annotation
}
