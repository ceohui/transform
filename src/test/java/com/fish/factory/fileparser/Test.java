package com.fish.factory.fileparser;

import java.io.File;

import com.fish.fileparser.utils.ConverFile;
import com.fish.fileparser.utils.DateUtil;

public class Test {

	public static void main(String[] args) {
		String localPath = "C:\\Users\\Administrator\\Desktop\\123";
		
		File file = new File(localPath);
		File[] files = file.listFiles();
		for(File file2 : files) {
			if(file2.isFile()) {
				String fileUrls = file2.getPath();
				String outPutFile = "C:\\Users\\Administrator\\Desktop\\123\\out";
				
				String baseOutPutFilePath = outPutFile + File.separator + DateUtil.getYYYY() + File.separator + DateUtil.getMM() + 
						File.separator + DateUtil.getDD() + File.separator;
				
				try {
					outPutFile = ConverFile.converFile(baseOutPutFilePath, fileUrls);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}

	