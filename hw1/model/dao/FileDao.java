package com.hw1.model.dao;

import java.io.FileOutputStream;
import java.util.Scanner;

public class FileDao {

	Scanner sc = new Scanner(System.in);
	public void fileSave() {
		FileOutputStream fout = null;
		String a = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			if(a == "exit") {
				break;
			}
			sb = new StringBuilder(a);
		}
		System.out.print("저장하시겠습니까? : ");
		String b= sc.nextLine();
		
		
		
	}
	
	public void fileOpen() {
		
	}
	
	public void fileEdit() {
		
	}
}
