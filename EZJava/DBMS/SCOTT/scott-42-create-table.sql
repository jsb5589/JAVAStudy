/*
DDL(Data Definition Language)
������ ���� ���
�����ͺ��̽� �����͸� �����ϰ� �����ϱ� ���� �����Ǵ� ��ü��
����, ����, ����, �����ϴ� ����� ����
DDL�� ������ �������ڸ��� �����ͺ��̽��� ������ ������ ��ٷ� �ݿ�
���(ROLLBACK)�� �� �� ����.

[ ���̺� ����]
 CREATE TABLE ���̺��̸�( 
    �÷��� �ڷ���, 
    �÷��� �ڷ���, 
     ...   
    );

[ ���̺�, �÷� �̸� ���� ��Ģ ]
 1. �̸��� ���ڷ� ����
     -> �ѱ۵� ����
     -> Ư������($, #, _) ����
 2. �̸��� ���̴�(30����Ʈ ����)
 3. �̸��� �ߺ��� ������� ����
    -> ���̺� �̸�(������)
    -> �÷� �̸�(���̺�)
 4. SQL Ű����� ����� �� ����. (SELECT, INSERT, FROM, SET, ...)

[�ڷ���]
 1. ������: NUMBER(p, s) : �ִ� 38�ڸ�
      -> p : ��ü �ڸ���(�ִ� 38�ڸ�)
      -> s : �Ҽ������� �ڸ���
      ��1) NUMBER(6,2) : 1234.34, 1234.567(1234.57)
      ��2) NUMBER(3) : 123.4(123), 1234(����)
      ��3) NUMBER : 38 �ڸ� Ȯ��, 1234.56, 123456
      
 2. ������
      -> CHAR(s) : ��������, �ִ� 2000����Ʈ
           ��1) CHAR(10) : 'ABC'�� ������ ������ 7�ڸ��� ����ó��
      -> VARCHAR2(s) : ��������, �ִ� 4000����Ʈ,  ���ڿ��� ����
      
 3. ��¥��
      -> DATE : ��¥�� �ð�, �������� 7����Ʈ
      -> TIMESTAMP(f) : ��¥�� �ð�, DATE Ÿ���� Ȯ��
      -> INTERVAL(y) : ��¥�� �������� �Ⱓ ����
 4. BLOB
      -> RAW(s) : ���� ������, �ִ� 2000����Ʈ
      -> LONG RAW : ���� ������, �ִ� 2GB
      -> LONG : ū ���ڿ�, �ִ� 2GB, ��������
 5. LOB
      -> BLOB : ��������, �ִ� (4GB-1) * ����ũ��
      -> BFILE: ���� ������ �ܺο� ����, �ִ� 4GB
      -> CLOB, NCLOB : ���ڵ�����, �ִ� (4GB-1) * ����ũ��
 6. ROW
      -> ROWID : ���̺��� �� �ּ�
      -> UROWID : �࿡ ���� �������� �ּ�
      
      
   
 


*/