/*
 * ����� ���� ���� Ŭ����
 * RuntimeException�� ����ϰ� �Ǹ� ���� ����ó���� ���� ���� Ŭ����
 */
package userexception;

public class UserRuntimeException extends Exception{
	UserRuntimeException(){}
	UserRuntimeException(String message){
		super(message);
	}

}
