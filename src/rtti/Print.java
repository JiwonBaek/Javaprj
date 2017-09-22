package rtti;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//주석이 사라지지 않게 걸어두는 것,target은 한번 사용하면 사라진다 그럼을 방지
@Target(ElementType.METHOD)
public @interface Print {

	boolean enable() default true;//어노테이션의 속성 

}
