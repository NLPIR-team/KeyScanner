package com.lingjoin.keyscan;

import com.lingjoin.keyscan.CKeyScannerLibrary;
import com.lingjoin.keyscan.exception.InitFailedException;;

/**
 * 二次封装类
 * @author Pan
 *
 */
public class KeyScanner {

	private int state=0;
	
	public int intKeyScanner(String sInitDirPath, int encode, String sLicenceCode,String sDelimiter){
		state=CKeyScannerLibrary.Instance.KS_Init(sInitDirPath, 1, sLicenceCode, sDelimiter);
		if(state==0)
			try {
				throw new InitFailedException("初始化失败！");
			} catch (InitFailedException e) {
				e.printStackTrace();
			}
		return state;
	}
	
	public int newInstance(){
		if(state==0)
			try {
				throw new InitFailedException("未初始化组件！");
			} catch (InitFailedException e) {
				e.printStackTrace();
			}
		return CKeyScannerLibrary.Instance.KS_NewInstance();
	}
	
	
	public int deleteInstance(int handle){
		if(state==0)
			try {
				throw new InitFailedException("未初始化组件！");
			} catch (InitFailedException e) {
				e.printStackTrace();
			}
		return  CKeyScannerLibrary.Instance.KS_DeleteInstance(handle);
	}
	
	public int importUserDict(String sFilename, boolean bOverwrite, int handle){
		if(state==0)
			try {
				throw new InitFailedException("未初始化组件！");
			} catch (InitFailedException e) {
				e.printStackTrace();
			}
		return  CKeyScannerLibrary.Instance.KS_ImportUserDict(sFilename, bOverwrite, handle);
	}
	
	public int deleteUserDict(String sFilename, int handle){
		if(state==0)
			try {
				throw new InitFailedException("未初始化组件！");
			} catch (InitFailedException e) {
				e.printStackTrace();
			}
		return CKeyScannerLibrary.Instance.KS_DeleteUserDict(sFilename, handle);
	}
	
	public String scan(String Content, int handle){
		if(state==0)
			try {
				throw new InitFailedException("未初始化组件！");
			} catch (InitFailedException e) {
				e.printStackTrace();
			}
		return CKeyScannerLibrary.Instance.KS_Scan(Content, handle);
	}
	
	public String scanDetail(String sContent, int handle){
		if(state==0)
			try {
				throw new InitFailedException("未初始化组件！");
			} catch (InitFailedException e) {
				e.printStackTrace();
			}
		return CKeyScannerLibrary.Instance.KS_ScanDetail(sContent, handle);
	}
	
	public String scanFile(String sFilename, int handle){
		if(state==0)
			try {
				throw new InitFailedException("未初始化组件！");
			} catch (InitFailedException e) {
				e.printStackTrace();
			}
		return CKeyScannerLibrary.Instance.KS_ScanFile(sFilename, handle);
	}
	
	public String scanFileDetail(String sFilename, int handle){
		if(state==0)
			try {
				throw new InitFailedException("未初始化组件！");
			} catch (InitFailedException e) {
				e.printStackTrace();
			}
		return CKeyScannerLibrary.Instance.KS_ScanFileDetail(sFilename, handle);
	}
	
	public int scanLine(String sFilename,String sResultFilename, int  handle, int bEncript){
		if(state==0)
			try {
				throw new InitFailedException("未初始化组件！");
			} catch (InitFailedException e) {
				e.printStackTrace();
			}
		return CKeyScannerLibrary.Instance.KS_ScanLine(sFilename, sResultFilename, handle, bEncript);
	}
	
	public int scanStat(String sResultFile, int handle){
		if(state==0)
			try {
				throw new InitFailedException("未初始化组件！");
			} catch (InitFailedException e) {
				e.printStackTrace();
			}
		return CKeyScannerLibrary.Instance.KS_ScanStat(sResultFile, handle);
	}
	
	public int scanDir(String sInputDirPath,String sResultPath,int nThreadCount,int bEncript){
		if(state==0)
			try {
				throw new InitFailedException("未初始化组件！");
			} catch (InitFailedException e) {
				e.printStackTrace();
			}
		return CKeyScannerLibrary.Instance.KS_ScanDir(sInputDirPath, sResultPath, nThreadCount, bEncript);
	}
	
	public int statResultFilter(String sInputFilename,String sResultFilename, float fThreshold){
		if(state==0)
			try {
				throw new InitFailedException("未初始化组件！");
			} catch (InitFailedException e) {
				e.printStackTrace();
			}
		return CKeyScannerLibrary.Instance.KS_StatResultFilter(sInputFilename, sResultFilename, fThreshold);
	}
	
	public int scanResultFilter(String sInputFilename, String sResultFilename, float fThreshold){
		if(state==0)
			try {
				throw new InitFailedException("未初始化组件！");
			} catch (InitFailedException e) {
				e.printStackTrace();
			}
		return CKeyScannerLibrary.Instance.KS_ScanResultFilter(sInputFilename, sResultFilename, fThreshold);
	}
	
	public int decrypt(String sInputDirPath, String sResultPath){
		if(state==0)
			try {
				throw new InitFailedException("未初始化组件！");
			} catch (InitFailedException e) {
				e.printStackTrace();
			}
		return CKeyScannerLibrary.Instance.KS_Decrypt(sInputDirPath, sResultPath);
	}
	
	public String getLastErrorMsg(){
		return CKeyScannerLibrary.Instance.KS_GetLastErrorMsg();
	}
	
	public int exportDict(String sFilename,  int handle){
		if(state==0)
			try {
				throw new InitFailedException("未初始化组件！");
			} catch (InitFailedException e) {
				e.printStackTrace();
			}
		return CKeyScannerLibrary.Instance.KS_ExportDict(sFilename, handle);
	}
	
	public void exit(){
		CKeyScannerLibrary.Instance.KS_Exit();
	}
	
	public static void main(String[] args){
		String text="习近ping的故事";
		KeyScanner ks=new KeyScanner();
		int handle=0;
		ks.intKeyScanner("", 1, "", "$");
		System.out.println(ks.scanDetail(text, handle));
		
	}
}
