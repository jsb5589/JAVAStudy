[확인문제 5] 다음과 같은 메소드가 있을때 예외를 잘못 처리한 것은 무엇입니까?
정답 : 3
해설 : 예외 클래스에서 상위 클래스는 catch의 뒤쪽(후순위)으로 기술해야 한다.

public void method1() throws NumberFormatException, ClassNotFoundException{...}

1. try { method1();} catch (Exception e) {}
2. void method2() throws Exception{method1();}
3. try{method1();} catch(Exception e) {} catch(ClassNotFoundException e){}
4. try{method1 ();} catch(ClassNotFoundException e) {} catch(NumberFormatException e) {}