//WordCRUD : ICURD를 구현한 구현체
package com.mycom.word;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD{		//뒷 내용 입력하고 WordCRUD 자리에 마우스 올리면 ICRUD에서 구현한 함수 불러옴
	ArrayList<Word> list;		//동적으로 데이터 관리할 수 있는 array		얘도 ArrayList import해줌
	Scanner s;	//입력받을거 선언	얘도 import

	/*
	 * 데이터 입력받음
	 * 입력 받은 데이터를 리스트에 저장 
	 */
	
	WordCRUD(Scanner s) {	//WordCRUD 생성자 만들 때 list 객체화
		list = new ArrayList<>();
		this.s = s;
	}

	@Override
	public Object add() {	 
		System.out.print("=> 난이도(1, 2, 3) & 새 단어 입력 : ");
		//예시 : 1 driveway	//?
		int level = s.nextInt();
		String word = s.nextLine();	//버퍼에 남은 엔터 공백 가져감 
		
		System.out.print("뜻 입력 : ");
		//예시 : 차고
		String meaning = s.nextLine();	//nextLine으로 해서 공백 포함
		
		return new Word(0, level, word, meaning);
	}
	
	public void addWord() {		//WordManager에서 호출할 함수 => list에 추가까지 돼야함
		Word one = (Word)add();	//add 리턴 타입 Word로 캐스팅
		list.add(one);			//list에 add로 받은 Word 추가
		System.out.println("새 단어가 단어장에 추가되었습니다.");
	}	//완성한 addWord 함수는 WordManager에서 호출

	@Override
	public int update(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void selectOne(int id) {
		// TODO Auto-generated method stub
		
	}	//implements ICURD - ICRUD구현
	
	public void listAll() {		//단어 리스트 전체 출력 함수
		System.out.println("--------------------------------");
		for (int i = 1; i < list.size(); ++i) {	//리스트 처음에 번호
			System.out.print(i + " ");
			System.out.println(list.get(i).toString());
		}
		System.out.println("--------------------------------");
		
	}

}
