package jicu.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 自定义注解
 * @author timi
 * 注解保留策略
 * RetentionPolicy.SOURCE:只在源文件中保留，在编译期间会被抛弃
 * RetentionPolicy.CLASS:在编译时被存储到.class文件，但是，在运行时用过jvm不能得到这些注解
 * RetentionPolicy.RUNTIME:在编译时被存储到.class文件中，并且在运行时可以通过jvm获取这些注解----最永久的注解
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str();
	int val();

}
