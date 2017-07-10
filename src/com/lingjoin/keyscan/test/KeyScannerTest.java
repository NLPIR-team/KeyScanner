package com.lingjoin.keyscan.test;

import com.lingjoin.keyscan.KeyScanner;

public class KeyScannerTest {

	
	public static void main(String[] args){
		String text="习近ping的故事";
		KeyScanner ks=new KeyScanner();
		int handle=0;
		ks.intKeyScanner("", 1, "", "$");
		System.out.println(ks.scanDetail(text, handle));
	}
	
}
