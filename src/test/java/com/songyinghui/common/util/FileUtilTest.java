package com.songyinghui.common.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
	    String extendName = FileUtil.getExtendName("aaa.jpg");
	    System.out.println(extendName);
	}

}
