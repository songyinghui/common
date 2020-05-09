package com.songyinghui.common.util;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

 

public class StreamUtil {
	public static void closeAll(Closeable... input) throws IOException {
		 for (Closeable closeable : input) {
			if(closeable!=null) {
				closeable.close();
			}
		}
	}

	public static String readTextFile(InputStream src) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(src,"utf-8"));
		String str = "";
		while ((str = bufferedReader.readLine()) != null) {
			return str;
		}
		bufferedReader.close();
		closeAll(src);
		return str;
	}

	public static String readTextFile(File txtFile) throws IOException {
       FileInputStream fileInputStream = new FileInputStream(txtFile );
       return readTextFile(fileInputStream);
	}
}
