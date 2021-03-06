package com.github.diwakar1988.strings;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

import com.github.diwakar1988.strings.StringUtils;

public class StringUtilsTest {

	@Test
	public void testGetExcelColumnNumber() {
		Assert.assertEquals(1,StringUtils.getExcelColumnNumber("A"));
		Assert.assertEquals(4,StringUtils.getExcelColumnNumber("D"));
		Assert.assertEquals(27,StringUtils.getExcelColumnNumber("AA"));
		Assert.assertEquals(28,StringUtils.getExcelColumnNumber("AB"));
		Assert.assertEquals(703,StringUtils.getExcelColumnNumber("AAA"));
		Assert.assertEquals(2133,StringUtils.getExcelColumnNumber("CDA"));
	}
	@Test
	public void testGetExcelColumnTitle() {
		Assert.assertEquals("A",StringUtils.getExcelColumnTitle(1));
		Assert.assertEquals("D",StringUtils.getExcelColumnTitle(4));
		Assert.assertEquals("AA",StringUtils.getExcelColumnTitle(27));
		Assert.assertEquals("AB",StringUtils.getExcelColumnTitle(28));
		Assert.assertEquals("AAA",StringUtils.getExcelColumnTitle(703));
		Assert.assertEquals("CDA",StringUtils.getExcelColumnTitle(2133));
	}
	
	@Test
	public void testReverseWords() {
		Assert.assertEquals("I love my India",StringUtils.reverseWords("India my love I"));
	}
	@Test
	public void testAddBigNumbers() {
		Assert.assertEquals("146",StringUtils.addBigNumbers("123","23"));
		Assert.assertEquals("12346",StringUtils.addBigNumbers("12323","23"));
		Assert.assertEquals("198123",StringUtils.addBigNumbers("12","198111"));
	}
	@Test
	public void testGetPermutions() {
		ArrayList<String>listOutput=new ArrayList<>();
		listOutput.add("ABC");
		listOutput.add("ACB");
		listOutput.add("BAC");
		listOutput.add("BCA");
		listOutput.add("CBA");
		listOutput.add("CAB");
		Assert.assertTrue(StringUtils.getPermutions("ABC").size()==6);
		Assert.assertTrue(StringUtils.getPermutions("ABC").equals(listOutput));
	}


}
