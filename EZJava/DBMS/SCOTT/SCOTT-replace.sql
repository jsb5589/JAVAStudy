--replace : ���ڿ��� ��ü(�ٲ�)
--replace(���ڿ�, ã�¹��ڿ�, ��ü���ڿ�)

SELECT '010-1234-5678' tel, replace('010-1234-5678', '-', '.') telno FROM dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', '.') as telno FROM dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', '.') as telno FROM dual;

--��ü���ڿ��� ������� ������ ����ȿ��
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-') as telno FROM dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', '') as telno FROM dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', ' ') as telno FROM dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', '/') as telno FROM dual;
SELECT '010-1234-5678' as tel, replace('010-1234-5678', '-', '���') as telno FROM dual;

SELECT ename, replace(ename, 'E', '-') FROM emp;