[Ȯ�ι��� 5] ������ ���� �޼ҵ尡 ������ ���ܸ� �߸� ó���� ���� �����Դϱ�?
���� : 3
�ؼ� : ���� Ŭ�������� ���� Ŭ������ catch�� ����(�ļ���)���� ����ؾ� �Ѵ�.

public void method1() throws NumberFormatException, ClassNotFoundException{...}

1. try { method1();} catch (Exception e) {}
2. void method2() throws Exception{method1();}
3. try{method1();} catch(Exception e) {} catch(ClassNotFoundException e){}
4. try{method1 ();} catch(ClassNotFoundException e) {} catch(NumberFormatException e) {}