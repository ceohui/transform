package com.fish.fileparser.factory;

import org.apache.log4j.Logger;

import com.fish.fileparser.product.html.AbstractHtml;
import com.fish.fileparser.product.html.CSVHtml;
import com.fish.fileparser.product.pdf.AbstractPdf;
import com.fish.fileparser.product.pdf.CSVPdf;
import com.fish.fileparser.product.png.AbstractPng;
import com.fish.fileparser.product.png.CSVPng;
import com.fish.fileparser.product.txt.AbstractText;
import com.fish.fileparser.product.txt.CSVText;

public class CSVFactory implements AbstractFactory {

	private final static Logger log = Logger.getLogger(CSVFactory.class);
	
	@Override
	public void convert2Html(String fileName, String outPutFile) throws Exception {
		log.info("将csv转换为html文件开始,输出文件 [" + outPutFile + ".html]......");
		long startTime = System.currentTimeMillis();
		AbstractHtml html = new CSVHtml();
		html.createHtml(fileName, outPutFile);
		log.info("将csv转换为html文件......ok");
		log.info("Generate " + outPutFile + ".html with " + (System.currentTimeMillis() - startTime) + " ms.");
	}

	@Override
	public void convert2Png(String fileName, String outPutFile) throws Exception {
		log.info("将csv转换为png文件开始,输出文件 [" + outPutFile + "]......");
		long startTime = System.currentTimeMillis();
		AbstractPng png = new CSVPng();
		png.createPng(fileName, outPutFile);
		log.info("将csv转换为png文件......ok");
		log.info("Generate " + outPutFile + " with " + (System.currentTimeMillis() - startTime) + " ms.");
	}

	@Override
	public void convert2Text(String fileName, String outPutFile) throws Exception {
		log.info("将csv转换为txt文件开始,输出文件 [" + outPutFile + ".txt]......");
		long startTime = System.currentTimeMillis();
		AbstractText text = new CSVText();
		text.createTxt(fileName, outPutFile);
		log.info("将csv转换为txt文件......ok");
		log.info("Generate " + outPutFile + ".txt with " + (System.currentTimeMillis() - startTime) + " ms.");
	}

	@Override
	public boolean convert2Pdf(String fileName, String outPutFile) throws Exception {
		log.info("将csv转换为pdf文件开始,输出文件 [" + outPutFile + ".pdf]......");
		long startTime = System.currentTimeMillis();
		AbstractPdf html = new CSVPdf();
		html.createPdf(fileName, outPutFile);
		log.info("将csv转换为pdf文件......ok");
		log.info("Generate " + outPutFile + ".pdf with " + (System.currentTimeMillis() - startTime) + " ms.");
		return false;
	}

}

	