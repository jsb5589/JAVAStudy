--비등가 조인(non-equi join)

--사원 테이블
SELECT*FROM emp;

--급여등급 테이블
SELECT*FROM salgrade;

--사원의 급여의 등급
SELECT *
FROM emp e, salgrade s
WHERE e.sal between s.losal and s.hisal;

SELECT*
FROM emp e, salgrade s
WHERE e.sal>=s.losal AND e.sal<=s.hisal