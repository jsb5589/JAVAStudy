--length : 문자열 길이 구하기

SELECT ename, length(ename) FROM emp;

SELECT ename, length(ename) FROM emp WHERE length(ename) = 4;
SELECT ename, length(ename) FROM emp WHERE length(ename) >= 4;
SELECT ename, length(ename) FROM emp WHERE length(ename) <= 5;
SELECT ename, length(ename) FROM emp WHERE length(ename) < 7;

--dual은 오라클에서 제공하는 특수한 타이틀
SELECT length('한글') FROM dual;
SELECT sysdate FROM dual;

SELECT length('한글'), length('english') FROM dual;
SELECT length('韓梁'), length('english') FROM dual;

SELECT * FROM nls_database_parameters where parameter = 'NLS_CHARACTERSET';

desc emp;
desc dual;