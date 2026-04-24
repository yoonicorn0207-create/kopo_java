package com.kopo.kangseo.java_0414;

import java.util.Random;
import java.util.Scanner;

public class RPS_game {

	public static void main(String[] args) {

		
		//0. 입력설정
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇번 게임을 진행 하시겠습니까? :");
		int max_game = sc.nextInt(); //사용자 설정(원하는 게임횟수)
		System.out.println(max_game + "회 진행");
		
		//변수설정
		int game_count = 0; //게임횟수
		int userWin = 0; //사용자 이긴횟수
		int ComWin = 0; //컴퓨터 이긴횟수
		int draw = 0; //무승부 횟수

		// 1. 게임 횟수 반복
		while (game_count <= max_game) {

			System.out.println("값을 입력하세요. [0 : 가위 | 1: 바위 | 2 : 보]");
			int user_num = sc.nextInt();

			// 입력값 유효성 검사 (0, 1, 2가 아니면 다시 입력)
			if (user_num < 0 || user_num > 2) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}// if(유효성 검사)

//			//2. 사용자(USER)의 가위,바위, 보 기능
			switch (user_num) {
			case 0:
				System.out.println("사용자 : 가위");
				break;
			case 1:
				System.out.println("사용자 : 바위");
				break;
			case 2:
				System.out.println("사용자 : 보");
				break;

			default:
				System.out.println("잘못된 입력");
				break;
			}// switch(USER)

		    //3. Computer의 가위,바위, 보 기능
			Random rdm = new Random();
			int com_num = rdm.nextInt(3);
			System.out.println("컴퓨터 입력 : " + com_num);

			switch (com_num) {
			case 0:
				System.out.println("컴퓨터 : 가위");
				break;
			case 1:
				System.out.println("컴퓨터 : 바위");
				break;
			case 2:
				System.out.println("컴퓨터 : 보");
				break;

			default:
				System.out.println("잘못된 입력");
				break;
			}// switch(컴터)

		    //4. 승패판정 로직
			if (user_num == 0 && com_num == 2 || user_num == 1 && com_num == 0 || user_num == 2 && com_num == 1) {
				System.out.println("★USER 승리★");
				userWin++;
			} else if (user_num == com_num) {
				System.out.println("○무승부○");
				draw++;
			} else {
				System.out.println("컴퓨터 승리");
				ComWin++;
			} // if(승패판정)

			game_count++; //게임진행 횟수증가
			
			// 5. 게임횟수 설정에 따른 종료
			if (max_game <= game_count) {
				break;
			}//원하는 게임횟수 채우면 종료
			
			
			//6.종료의사 묻기
			System.out.println("게임을 종료하시겠습니까?[Y/N]");
			sc.nextLine();
			String cnt_gameCmd = sc.nextLine();

			if (cnt_gameCmd.equals("Y")) {
				break;
			}//게임종료

		} // while

			System.out.println("User 승리횟수 : " + userWin + "회");
			System.out.println("컴퓨터 승리횟수 : " + ComWin + "회");
			System.out.println("무승부 : " + draw + "회");
			System.out.println("게임을 종료합니다.");
			
			sc.close();

	} // main

}// CLASS
