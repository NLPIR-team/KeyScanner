package com.lingjoin.keyscan;

import com.sun.jna.Library;
import com.sun.jna.Native;
/**
 * DLL接口类
 * @author Pan
 *
 */
public interface CKeyScannerLibrary extends Library{

	CKeyScannerLibrary Instance= (CKeyScannerLibrary) Native.loadLibrary("KeyScanAPI.dll", CKeyScannerLibrary.class);
	
	public int KS_Init(String sInitDirPath, int encode, String sLicenceCode,String sDelimiter);

	public void KS_Exit();

	public int KS_NewInstance();

	public int KS_DeleteInstance(int handle);

	public int KS_ImportUserDict(String sFilename, boolean bOverwrite, int handle);

	public int KS_DeleteUserDict(String sFilename, int handle);

	public String KS_Scan(String Content, int handle);

	public String KS_ScanDetail(String sContent, int handle);

	public String KS_ScanFile(String sFilename, int handle);

	public String KS_ScanFileDetail(String sFilename, int handle);

	public int KS_ScanLine(String sFilename,String sResultFilename, int  handle, int bEncript);

	public int KS_ScanStat(String sResultFile, int handle);

	public int KS_ScanDir(String sInputDirPath,String sResultPath,int nThreadCount,int bEncript);

	public int KS_StatResultFilter(String sInputFilename,String sResultFilename, float fThreshold);

	public int KS_ScanResultFilter(String sInputFilename, String sResultFilename, float fThreshold);

	public int KS_Decrypt(String sInputDirPath, String sResultPath);

	public String KS_GetLastErrorMsg();

	public int KS_ExportDict(String sFilename,  int handle);
}
