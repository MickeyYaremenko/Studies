package by.htp.homelibrary.domain;

import java.util.ArrayList;


public class Library {
	ArrayList<PrintedEdition> lib = new ArrayList<>();
	
	
//	PrintedEdition[] editions = new PrintedEdition[0]; 

	public Library(){} 

	public void addNewEdition(PrintedEdition edition){
		lib.add(edition);
	}
	/*
	public void addNewEdition(PrintedEdition edition){ 
		editions = Arrays.copyOf(editions, editions.length+1); 
		editions[editions.length - 1] = edition; 
	}
*/
	public void showLibrary(){
		for (int i = 0; i <lib.size(); i++){
		System.out.println(lib.get(i));
		}
	}
//	public void showLibrary(){ 
//		for (int i = 0; i < editions.length; i++){
//			System.out.println(editions[i].toString()); 
//		}
//	}
	public void showALib(){
		for (int i = 0;i<lib.size();i++){
			if(lib.get(i).showAPrintedEdition()){
				System.out.println(lib.get(i));
			}
		}
	}
//	public void showALib(){ 
//		for (int i = 0; i < editions.length; i++){
//			if (editions[i].showAPrintedEdition())
//			System.out.println(editions[i]); 
//			}
//		}
}
	

/* ����� �������� ���� �����, � ������� ���� ��������
 * �������� �����, ������� ������� �� ������� ��� �������� �������, ��� ���������/������ ������� ���������� �� � 
 * � ����������� ��������������� ������
 * */
