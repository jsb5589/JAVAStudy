--length : ���ڿ� ���� ���ϱ�

SELECT ename, length(ename) FROM emp;

SELECT ename, length(ename) FROM emp WHERE length(ename) = 4;
SELECT ename, length(ename) FROM emp WHERE length(ename) >= 4;
SELECT ename, length(ename) FROM emp WHERE length(ename) <= 5;
SELECT ename, length(ename) FROM emp WHERE length(ename) < 7;

--dual�� ����Ŭ���� �����ϴ� Ư���� Ÿ��Ʋ
SELECT length('�ѱ�') FROM dual;
SELECT sysdate FROM dual;

SELECT length('�ѱ�'), length('english') FROM dual;
SELECT length('����'), length('english') FROM dual;

SELECT * FROM nls_database_parameters where parameter = 'NLS_CHARACTERSET';

desc emp;
desc dual;