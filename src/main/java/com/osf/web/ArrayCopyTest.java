package com.osf.web;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ArrayCopyTest {
		
	public static void main(String[] args) {
		String str1 = "1234";
		byte[] strBytes1 = str1.getBytes();
		String str2 = "abcd";
		byte[] strBytes2 = str2.getBytes();
		byte[] subBytes = new byte[strBytes1.length + strBytes2.length];
		System.arraycopy(strBytes1, 0, subBytes, 0, strBytes1.length);
		System.arraycopy(strBytes2, 0, subBytes, strBytes1.length, strBytes2.length);
//		for (int i = 0; i < subBytes.length; i++) {
//			log.info("b[{}] => {}", i, subBytes[i]);
//		}
		try {
			MessageDigest mDigest = MessageDigest.getInstance("SHA-256");
			subBytes = mDigest.digest(subBytes);
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < subBytes.length; i++) {
				String s = Integer.toString((subBytes[i] & 0xFF)+0x100,16).substring(1);
				sb.append(s);
			}
			log.info("encoding str => {}", sb.toString());
			log.info("encodig str length => {}", sb.toString().length());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
}
