[�������̽�]

�������̽�(interface)

1. ��ü�� ��� ����� ������ Ÿ���̴�.
2. ��ü�� ��ȯ���� ���� �ֱ� ���� ����
3. ��ü�� ��ü������ ����ϴ� ���� ����
4. �Լ��� ��(�ñ״�ó)�� ����


(���ÿ��)
1. IDL(Interface Definition Language)
2. API(Application Programming Interface)
3. Static Library
4. Dynamic Library(DLL)
5. Shared Library(SO)
6. RMI(Java Remote Method Invocation)

(�ڹ�)

interface name {
	type constant_name =value;				//����ʵ�
	type method(parameter, ...);			//�߻� �޼ҵ�
	
	//�ڹٿ� Ưȭ�� ���
	default type method(parameter, ...){}	//����Ʈ �޼ҵ�
	static type method(parameter, ...){}	//���� �޼ҵ�
}