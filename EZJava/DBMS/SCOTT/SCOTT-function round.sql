-- 숫자 데이터 연산을위한 함수
-- round : 반올림
-- trunc : 버림
-- cell : 지정한 숫자보다 큰 정수 중에서 가장 적은 정수를 반환
-- floor : 지정한 숫자보다 작은 정수 중에서 가장 큰 정수를 반환
-- mod : 나머지

-- round(숫자, 반올림위치)
-- 반올림 위치를 지정하지 않으면 수숫점이하 첫째 자리에서 반올림
SELECT round(12.5678) FROM dual;
SELECT round(12.5678, 0) FROM dual;

-- 소숫점 첫째자리까지 표현(둘째 자리에서 반올림)
SELECT round(12.5678, 1) FROM dual;
SELECT round(12.44444, 1) FROM dual;
SELECT round(12.456555, 1) FROM dual;