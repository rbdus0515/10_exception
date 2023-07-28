package ude.kh.exception.model.service;

import java.util.Scanner;

public class ExceptionService {
	
	// 예외(Exception) : 소스 코드의 수정으로 해결 가능한 오류
	
	// 예외는 두 종류로 구분됨
	// 1) Unchecked Exception : 선택적으로 예외처리
	// 2) Checked Exception : 필수적으로 예외처리
	
	private Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		System.out.print("두 정수를 입력받아 나누기한 몫 출력");
		
		System.out.print("정수 1입력 : ");
		int input1 = sc.nextInt();
		
		System.out.print("정수 2입력 : ");
		int input2 = sc.nextInt();
		
		try {
			System.out.println("결과 : " + input1 / input2);
			// 산술적예외로 0으로 나눌 수 없다.
			
		} catch(ArithmeticException e ) {
			// try에서 던져진 예외를 catch문 매개변수 e로 잡음
			
			System.out.println("infinity");
		}
		
		if(input2 != 0) {
			System.out.println("결과 : " + input1 / input2);
		} else {
			System.out.println("infinity");
		}
		
		// 발생하는 예외 중 일부 예외는 try-catch
		
		
	}
	
	public void ex2() {
		// 여러가지 예외에 대한 처리 방법
		
//		System.out.print("입력1 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("입력2 : ");
//		int num2 = sc.nextInt();
//		
//		System.out.println("결과 : " + num1 / num2);
//		
//		
//		
//		String str = null;
//		
//		System.out.println(str.charAt(0));
//		//  java.lang.NullPointerException : 참조하지 않는 참조변수를 이용해서 코드 수행시 발생
		
		
		try {
			
			System.out.print("입력1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("입력2 : ");
			int num2 = sc.nextInt();
			
			System.out.println("결과 : " + num1 / num2);
			
			
			
			String str = null;
			
			System.out.println(str.charAt(0));
			// java.lang.NullPointerException : 참조하지 않는 참조변수를 이용해서 코드 수행시 발생
			
		} catch(Exception e) {
			System.out.println("뭔지 모르겠으나 예외가 발생해서 처리함");
		
			// 예외처리 + 다형성
			
			// Exception 클래스 : 모든 예외의 최상위 부모
			// 다형성 - 업캐스팅 : 부모타입 참조변수로 자식객체를 참조
			
			// 상위 타입 예외 클래스를 catch문에 작성하면
			// 다형성 업캐스팅에 의해 모두 잡아서 사용가능
			
			
			
			
		
		}
		
		
		
		
		
		
	}
	
	public void ex3() {
		// 1) try - catch - finally
		// finally : try 구문에서 예외가 발생하든 말든 무조건 마지막에 수행
		
		try {
			
			System.out.println(4/0);
			
		} catch (ArithmeticException e) {
			System.out.println("예외처리됨");
			
			// 2) catch문 매개변수 활용
			// 메게변수 e : 예외 관련된 정보 + 예외 관련 기능
			
			System.out.println( e.getClass()); // 어떤 예외 클래스인가?
			// class java.lang.ArithmeticException

			System.out.println( e.getMessage()); // 예외 발생시 출력된 내용
			// / by zero
			
			System.out.println( e ); // e.toString();
			// java.lang.ArithmeticException: / by zero
			
			e.printStackTrace();
			
		} finally {
			System.out.println("무조건 수행 됨");
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}

















