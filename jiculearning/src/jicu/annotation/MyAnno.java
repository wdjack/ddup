package jicu.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * �Զ���ע��
 * @author timi
 * ע�Ᵽ������
 * RetentionPolicy.SOURCE:ֻ��Դ�ļ��б������ڱ����ڼ�ᱻ����
 * RetentionPolicy.CLASS:�ڱ���ʱ���洢��.class�ļ������ǣ�������ʱ�ù�jvm���ܵõ���Щע��
 * RetentionPolicy.RUNTIME:�ڱ���ʱ���洢��.class�ļ��У�����������ʱ����ͨ��jvm��ȡ��Щע��----�����õ�ע��
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str();
	int val();

}
