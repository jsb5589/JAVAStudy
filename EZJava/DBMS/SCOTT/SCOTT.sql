--������� ��ȸ: ������(Selection)
SELECT * from emp;

--�������� ��ȸ�ϴ� ��������(Projection)
SELECT empno, ename, deptno From emp;

--����(Join) : emp.deptno = dept.deptno
SELECT emp.empno, emp.ename, emp.deptno, dept.dname, dept.loc
FROM emp, dept
WHERE emp.deptno = dept.deptno;

SELECT empno, ename, deptno FROM emp WHERE empno = 7369;
SELECT * FROM dept WHERE deptno = 20;