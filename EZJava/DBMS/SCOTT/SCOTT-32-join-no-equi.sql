--�� ����(non-equi join)

--��� ���̺�
SELECT*FROM emp;

--�޿���� ���̺�
SELECT*FROM salgrade;

--����� �޿��� ���
SELECT *
FROM emp e, salgrade s
WHERE e.sal between s.losal and s.hisal;

SELECT*
FROM emp e, salgrade s
WHERE e.sal>=s.losal AND e.sal<=s.hisal