package rtti;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//�ּ��� ������� �ʰ� �ɾ�δ� ��,target�� �ѹ� ����ϸ� ������� �׷��� ����
@Target(ElementType.METHOD)
public @interface Print {

	boolean enable() default true;//������̼��� �Ӽ� 

}
