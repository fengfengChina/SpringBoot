package com.zf.base.utils;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyUtils {

	@Value("${FTP_URL}")
	private String URL;

	@Value("${FTP_USERNAME}")
	private String NAME;

	@Value("${FTP_PASS}")
	private String PASS;


	private static String FTP_URL;

	private static String FTP_USERNAME;

	private static String FTP_PASS;


	@PostConstruct
	public void init() {
		FTP_URL = URL;
		FTP_USERNAME = NAME;
		FTP_PASS = PASS;
	}

	public static String getFTP_URL() {
		return FTP_URL;
	}

	public static String getFTP_USERNAME() {
		return FTP_USERNAME;
	}

	public static String getFTP_PASS() {
		return FTP_PASS;
	}


}
