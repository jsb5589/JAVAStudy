/*
 * Stack(����)
 * 	- ���Լ��� : ���߿� ���� ���� ���� ����
 * 	- LIFO(Last In First Out)
 * 	- JVM ���� �޸�
 */
package stacks;

import java.util.Stack;

public class StackCoin2 {

	public static void main(String[] args) {
		Stack<Coin> coins = new Stack<Coin>();

		// push() : ��ü�� ���ÿ� ����
		coins.push(new Coin(90));
		coins.push(new Coin(60));
		coins.push(new Coin(40));
		coins.push(new Coin(30));
		coins.push(new Coin(10));
		
		peekStack(coins);
		popStack(coins);
		
		}
	
	// pop() : ���ÿ��� ��ü�� ���� �� ����
	static void popStack(Stack<Coin> coins) {
		System.out.println("Stack: size=" + coins.size());
	
		while(coins.isEmpty() != true) {
			Coin coin = coins.pop();
			System.out.println(coin.getValue());
		}
	}
	
	//peak() : ���ÿ��� �� ���� �ִ� ��ü�� �������� ���������� �ʴ´�.
	static void peekStack(Stack<Coin> coins) {
		System.out.println("Stack:peek -> size=" + coins.size());
		
		Coin coin = coins.peek();
		System.out.println(coin.getValue());
	}
}