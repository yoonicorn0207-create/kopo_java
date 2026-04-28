package com.kopo.kangseo.java_0427;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*학생 클래스 영역*/
class Student {

	/* 변수영역 */
	private String name;
	private int korean, english, math;

	/* Getter & Setter 영역 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public Student(String StuName, int kor, int eng, int mh) {
		this.name = StuName;
		this.korean = kor;
		this.english = eng;
		this.math = mh;
	}

	public int getTotal() {
		return korean + english + math;
	}

	public double getAvg() {
		return getTotal() / 3;
	}

	@Override
	public String toString() {
		return name + " : " + korean + " " + english + " " + math + " ▶ " + "총점 : " + getTotal() + " ▷ " + "평균 : "
				+ getAvg();
	}

}// Student

/* --- 오름&내림차순 정렬 규칙들 --- */
class KoreanComparator implements Comparator<Student> {
	int direction;

	public KoreanComparator(int choice) {
		this.direction = choice;
	}

	@Override
	public int compare(Student a, Student b) {
		// choice가 1일 때 내림차순
		if (direction == 1) {
			return b.getKorean() - a.getKorean();
		} else {
			// 그 외값일때 오름차순
			return a.getKorean() - b.getKorean();
		}
	}
}// 국어기준 오름&내림차순

class EngComparator implements Comparator<Student> {
	int direction;

	public EngComparator(int choice) {
		this.direction = choice;
	}

	@Override
	public int compare(Student a, Student b) {
		if (direction == 1) {
			return b.getEnglish() - a.getEnglish();
		} else {
			// 그 외값일때 오름차순
			return a.getEnglish() - b.getEnglish();
		}

	}
}// 영어기준 오름&내림차순

class MathComparator implements Comparator<Student> {
	int direction;

	public MathComparator(int choice) {
		this.direction = choice;
	}

	@Override
	public int compare(Student a, Student b) {
		if (direction == 1) {
			return b.getMath() - a.getMath();
		} else {
			// 그 외값일때 오름차순
			return a.getEnglish() - b.getEnglish();
		}

	}
}// 수학기준 오름&내림차순

public class reportCard_quiz {

	public static void main(String[] args) {

		// 객체를 ArrayList에 담기
		ArrayList<Student> stuList = new ArrayList();
		stuList.add(new Student("홍길동", 90, 70, 70));
		stuList.add(new Student("강감찬", 80, 80, 90));
		stuList.add(new Student("이순신", 100, 100, 100));
		stuList.add(new Student("유관순", 70, 90, 80));

		/* 확장과제[옵션2] : 정렬방향 선택 (오름차순 & 내림차순) */
		System.out.println("성적출력 타입을 선택하세요. [①내림차순 : 1번 ②오름차순 : Any Press]");
		Scanner sc = new Scanner(System.in);

		int choice = sc.nextInt();
		String type = "";
		if (choice == 1) {
			type = "내림차순";
		} else {
			type = "오름차순";
		}
		/* 확장과제[옵션2] : 정렬방향 선택 (오름차순 & 내림차순) */

		// [국어 정렬]
		System.out.println("--- 국어 " + type + " ---");
		Collections.sort(stuList, new KoreanComparator(choice));
		printAll(stuList);

		// [영어 정렬]
		System.out.println("\n--- 영어 " + type + " ---");
		Collections.sort(stuList, new EngComparator(choice));
		printAll(stuList);

		// [수학 정렬]
		System.out.println("\n--- 수학 " + type + " ---");
		Collections.sort(stuList, new MathComparator(choice));
//		stuList.sort(new MathComparator());
		printAll(stuList);

		/*
		 * 람다식 사용 버전
		 * 
		 * // 2. 국어 기준 내림차순 (람다식 사용: b - a) System.out.println("=== 국어 기준 내림차순 ===");
		 * stuList.sort((a, b) -> b.getKorean() - a.getKorean()); printAll(stuList);
		 * 
		 * 
		 * // 3. 영어 기준 내림차순 System.out.println("\n=== 영어 기준 내림차순 ===");
		 * stuList.sort((a,b) -> b.getEnglish() - a.getEnglish()); printAll(stuList);
		 * 
		 * // 4. 수학 기준 내림차순 System.out.println("\n=== 수학 기준 내림차순 ===");
		 * stuList.sort((a,b) -> b.getMath() - a.getMath()); printAll(stuList);
		 * 
		 * // 5. 총점 기준 내림차순 System.out.println("\n=== 총점 기준 내림차순 ===");
		 * stuList.sort((a,b) -> b.getTotal() - a.getTotal()); printAll(stuList);
		 */

		sc.close();
	}// main
	
//------------------------------------------------------------------------------------------------------------------------------
	
	/* 출력용 보조 메서드 */
	public static void printAll(ArrayList<Student> list) {
		for (int stu = 0; stu < list.size(); stu++) {
			Student s = list.get(stu);
			System.out.println(s);
		}
	}// 출력보조메서드

}// 성적표 출력
