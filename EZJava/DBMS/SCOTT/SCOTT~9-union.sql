--���տ�����
--UNION(������)
--�÷��� ������ �ڷ����� ��ġ
--�ߺ��Ǵ� �����ʹ� �ϳ��� ���õ�

--UNION
SELECT * FROM emp WHERE deptno = 10;
SELECT * FROM emp WHERE deptno = 20;

SELECT * FROM emp WHERE deptno IN(10, 20);

--UNION
--�÷��� ������ �ڷ����� ��ġ
SELECT * FROM emp WHERE deptno = 10
UNION
SELECT * FROM emp WHERE deptno = 20;

--�÷��� ��ġ�ؾ� �Ѵ�
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10
UNION
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 20;

-- �ߺ��Ǵ� �����ʹ� �ϳ��� ���õ�
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10 or deptno = 20
UNION
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 20;

--���� �ٸ��� ���õ�
SELECT empno, ename, sal, deptno FROM emp WHERE deptno = 10 or deptno = 20 --6���� ��
UNION
SELECT empno, ename, sal*12 as sal, deptno FROM emp WHERE deptno = 20; --3���� ��

--emp UNION emp2
SELECT * FROM emp UNION SELECT * FROM emp2;

SELECT * FROM emp WHERE empno in(7369, 7499)
