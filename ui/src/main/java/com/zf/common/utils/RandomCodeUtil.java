package com.zf.common.utils;

import java.util.Random;

/**
 * 随机数生成
 * 
 * @author star
 * 
 */
public class RandomCodeUtil {

	public static int BOTH = 0;

	public static int UPPER = 1;

	public static int LOWER = 2;

	public static String getNumber(int length) {
		Random r = new Random();
		String n = "0123456789";
		String code = "";
		for (int i = 0; i < length; i++) {
			code += n.charAt(r.nextInt(n.length()));
		}
		return code;
	}

	public static String getLetter(int length, int caseType) {
		Random r = new Random();
		String l = "abcdefghijklmnopqrstuvwxyz";
		if (caseType == BOTH) {
			l += l.toUpperCase();
		}
		if (caseType == UPPER) {
			l = l.toUpperCase();
		}
		if (caseType == LOWER) {
			l = l.toLowerCase();
		}
		String code = "";
		for (int i = 0; i < length; i++) {
			code += l.charAt(r.nextInt(l.length()));
		}
		return code;
	}

	public static String getNumAndLetter(int length, int caseType) {
		Random r = new Random();
		String n = "0123456789";
		String l = "abcdefghijklmnopqrstuvwxyz";
		String nl = "";
		if (caseType == BOTH) {
			nl = n + l.toLowerCase() + l.toUpperCase();
		}
		if (caseType == UPPER) {
			nl = n + l.toUpperCase();
		}
		if (caseType == LOWER) {
			nl = n + l.toLowerCase();
		}
		String code = "";
		for (int i = 0; i < length; i++) {
			code += nl.charAt(r.nextInt(nl.length()));
		}
		return code;
	}

	/** 自定义进制(0,1没有加入,容易与o,l混淆) */
	private static final char[] r = new char[] { 'q', 'w', 'e', '8', 'a', 's', '2', 'd', 'z', 'x', '9', 'c', '7', 'p', '5', 'i', 'k', '3', 'm', 'j', 'u', 'f', 'r', '4', 'v', 'y',
			'l', 't', 'n', '6', 'b', 'g', 'h' };

	/** (不能与自定义进制有重复) */
	private static final char b = 'o';

	/** 进制长度 */
	private static final int binLen = r.length;

	/**
	 * 根据ID生成六位随机码
	 * 
	 * @param id
	 *            ID
	 * @return 随机码
	 */
	public static String idToCode(int id, int length) {
		char[] buf = new char[32];
		int charPos = 32;

		while ((id / binLen) > 0) {
			int ind = (int) (id % binLen);
			buf[--charPos] = r[ind];
			id /= binLen;
		}
		buf[--charPos] = r[(int) (id % binLen)];
		String str = new String(buf, charPos, (32 - charPos));
		if (str.length() < length) {
			StringBuilder sb = new StringBuilder();
			sb.append(b);
			Random rnd = new Random();
			for (int i = 1; i < length - str.length(); i++) {
				sb.append(r[rnd.nextInt(binLen)]);
			}
			str += sb.toString();
		}
		return str;
	}

	public static int codeToId(String code) {
		char chs[] = code.toCharArray();
		int res = 0;
		for (int i = 0; i < chs.length; i++) {
			int ind = 0;
			for (int j = 0; j < binLen; j++) {
				if (chs[i] == r[j]) {
					ind = j;
					break;
				}
			}
			if (chs[i] == b) {
				break;
			}
			if (i > 0) {
				res = res * binLen + ind;
			} else {
				res = ind;
			}
		}
		return res;
	}


}
