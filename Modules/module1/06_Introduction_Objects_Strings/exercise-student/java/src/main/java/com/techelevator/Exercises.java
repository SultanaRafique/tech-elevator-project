package com.techelevator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercises {

	/*
	 Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	 helloName("Bob") → "Hello Bob!"
	 helloName("Alice") → "Hello Alice!"
	 helloName("X") → "Hello X!"
	 */
	public String helloName(String name) {
		return "Hello " + name +"!" ;
	}

	/*
	 Given two strings, a and b, return the result of putting them together in the order abba,
	 e.g. "Hi" and "Bye" returns "HiByeByeHi".
	 makeAbba("Hi", "Bye") → "HiByeByeHi"
	 makeAbba("Yo", "Alice") → "YoAliceAliceYo"
	 makeAbba("What", "Up") → "WhatUpUpWhat"
	 */
	public String makeAbba(String a, String b) {

		return a + b + b + a;
	}

	/*
	 The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example,
	 the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the
	 HTML string with tags around the word, e.g. "<i>Yay</i>".
	 makeTags("i", "Yay") → "<i>Yay</i>"
	 makeTags("i", "Hello") → "<i>Hello</i>"
	 makeTags("cite", "Yay") → "<cite>Yay</cite>"
	 */
	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "<" + "/" + tag + ">";
	}

	/*
	 Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the
	 middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting
	 at index i and going up to but not including index j.
	 makeOutWord("<<>>", "Yay") → "<<Yay>>"
	 makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
	 makeOutWord("[[]]", "word") → "[[word]]"
	 */
	public String makeOutWord(String out, String word) {

		return out.substring(0, 2) + word + out.substring(2, 4);
	}

	/*
	 Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string
	 length will be at least 2.
	 extraEnd("Hello") → "lololo"
	 extraEnd("ab") → "ababab"
	 extraEnd("Hi") → "HiHiHi"
	 */
	public String extraEnd(String str) {
		int len = str.length();
		String subString = str.substring(len - 2, len);
		return subString + subString + subString;
	}

	/*
	 Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the
	 string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string ""
	 yields the empty string "". Note that str.length() returns the length of a string.
	 firstTwo("Hello") → "He"
	 firstTwo("abcdefg") → "ab"
	 firstTwo("ab") → "ab"
	 */
	public String firstTwo(String str) {
		int len = str.length();
		if(len < 2){
			return str;
		}
		String subString = str.substring(0, 2);
		return subString;
	}

	/*
	 Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
	 firstHalf("WooHoo") → "Woo"
	 firstHalf("HelloThere") → "Hello"
	 firstHalf("abcdef") → "abc"
	 */
	public String firstHalf(String str) {
		int len = str.length();
		int endIndex = len / 2;
		String subString = str.substring(0, endIndex);
		return subString;
	}



	/*
	 Given a string, return a version without the first and last char, so "Hello" yields "ell".
	 The string length will be at least 2.
	 withoutEnd("Hello") → "ell"
	 withoutEnd("java") → "av"
	 withoutEnd("coding") → "odin"
	 */
	public String withoutEnd(String str) {
		int startIndex = 1;
		int endIndex = str.length() - 1;
		String subString = str.substring(startIndex, endIndex);
		return subString;
	}

	/*
	 Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string
	 on the outside and the longer string on the inside. The strings will not be the same length, but
	 they may be empty (length 0).
	 comboString("Hello", "hi") → "hiHellohi"
	 comboString("hi", "Hello") → "hiHellohi"
	 comboString("aaa", "b") → "baaab"
	 */
	public String comboString(String a, String b) {
		int aLen = a.length();
		int bLen = b.length();

		if(aLen < bLen){
			return a + b + a;
		}else{
			return b + a + b;
		}
	}

	/*
	 Given 2 strings, return their concatenation, except omit the first char of each. The strings will
	 be at least length 1.
	 nonStart("Hello", "There") → "ellohere"
	 nonStart("java", "code") → "avaode"
	 nonStart("shotl", "java") → "hotlava"
	 */
	public String nonStart(String a, String b) {

		String aSubString = a.substring(1);
		String bSubString = b.substring(1);
		return aSubString + bSubString;
	}

	/*
	 Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
	 The string length will be at least 2.
	 left2("Hello") → "lloHe"
	 left2("java") → "vaja"
	 left2("Hi") → "Hi"
	 */
	public String left2(String str) {
		String left2String = "";
		int len = str.length();
		for(int i = 0; i < len; i++){

			int index = ((i + 2) % (len));
			left2String += str.charAt(index);
		}
		return left2String;
	}

	/*
	 Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
	 The string length will be at least 2.
	 right2("Hello") → "loHel"
	 right2("java") → "vaja"
	 right2("Hi") → "Hi"
	 */
	public String right2(String str) {
		int len = str.length();
		int rightSteps = len - 2;
		String right2String = "";
		for (int i = 0; i < len; i++){
			int index = (i + rightSteps) % len;
			right2String +=str.charAt(index) ;
		}
		return right2String ;
	}

	/*
	 Given a string, return a string length 1 from its front, unless front is false, in which case
	 return a string length 1 from its back. The string will be non-empty.
	 theEnd("Hello", true) → "H"
	 theEnd("Hello", false) → "o"
	 theEnd("oh", true) → "o"
	 */
	public String theEnd(String str, boolean front) {
		if(front){
			return String.valueOf(str.charAt(0));
		}
		else{
			return String.valueOf(str.charAt(str.length() - 1));
		}
	}

	/*
	 Given a string, return a version without both the first and last char of the string. The string
	 may be any length, including 0.
	 withoutEnd2("Hello") → "ell"
	 withoutEnd2("abc") → "b"
	 withoutEnd2("ab") → ""
	 */
	public String withoutEnd2(String str) {
		int len = str.length();
		int beginIndex = 1;
		int endIndex = len - 1;

		if(len <= 2){
			return "";
		}
		return str.substring(beginIndex, endIndex);
	}

	/*
	 Given a string of even length, return a string made of the middle two chars, so the string "string"
	 yields "ri". The string length will be at least 2.
	 middleTwo("string") → "ri"
	 middleTwo("code") → "od"
	 middleTwo("Practice") → "ct"
	 */
	public String middleTwo(String str) {
		int len = str.length();
		int middleLen = (len - 1) / 2;
		return str.substring(middleLen, middleLen + 2);
	}

	/*
	 Given a string, return true if it ends in "ly".
	 endsLy("oddly") → true
	 endsLy("y") → false
	 endsLy("oddy") → false
	 */
	public boolean endsLy(String str) {
		return str.endsWith("ly");
	}

	/*
	 Given a string and an int n, return a string made of the first and last n chars from the string. The
	 string length will be at least n.
	 nTwice("Hello", 2) → "Helo"
	 nTwice("Chocolate", 3) → "Choate"
	 nTwice("Chocolate", 1) → "Ce"
	 */
	public String nTwice(String str, int n) {
		int len = str.length();
		String beginSubString = str.substring(0, n);
		String endSubString = str.substring(len - n, len);

		return beginSubString + endSubString;

	}

	/*
	 Given a string and an index, return a string length 2 starting at the given index. If the index is
	 too big or too small to define a string length 2, use the first 2 chars. The string length will be
	 at least 2.
	 twoChar("java", 0) → "ja"
	 twoChar("java", 2) → "va"
	 twoChar("java", 3) → "ja"
	 */
	public String twoChar(String str, int index) {
		int len = str.length();
		boolean bigIndex = index + 1 >  len - 1;
		boolean smallIndex = index < 0;

		if (bigIndex || smallIndex) {
			String result = str.substring(0, 2);
			return result;
		} else {
			String result = str.substring(index, index + 2);
			return result;
		}

	}

	/*
	 Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
	 The string length will be at least 3.
	 middleThree("Candy") → "and"
	 middleThree("and") → "and"
	 middleThree("solving") → "lvi"
	 */
	public String middleThree(String str) {
		int len = str.length();
		int middleIndex = len / 2;

		return str.substring(middleIndex - 1, middleIndex + 2);
	}

	/*
	 Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with
	 "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals()
	 to compare 2 strings.
	 hasBad("badxx") → true
	 hasBad("xbadxx") → true
	 hasBad("xxbadxx") → false
	 */
	public boolean hasBad(String str) {

		int len = str.length();
		if(len == 3) {
			String begin02 = str.substring(0, 3);
			return begin02.equals("bad");

		}else if(len > 3) {
			String begin02 = str.substring(0, 3);
			String begin13 = str.substring(1, 4);

			boolean badEquals02 = begin02.equals("bad");
			boolean badEquals13 = begin13.equals("bad");

			return badEquals02 || badEquals13 ;
		}
		return false;
	}

	/*
	 Given a string and a non-negative int n, return a larger string that is n copies of the original string.
	 stringTimes("Hi", 2) → "HiHi"
	 stringTimes("Hi", 3) → "HiHiHi"
	 stringTimes("Hi", 1) → "Hi"
	 */
	public String stringTimes(String str, int n) {
		String StringTime = "";

		while(n > 0){
			StringTime += str;
			n--;
		}
		return StringTime;
	}

	/*
	 Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or
	 whatever is there if the string is less than length 3. Return n copies of the front;
	 frontTimes("Chocolate", 2) → "ChoCho"
	 frontTimes("Chocolate", 3) → "ChoChoCho"
	 frontTimes("Abc", 3) → "AbcAbcAbc"
	 */
	public String frontTimes(String str, int n) {
		int len = str.length();
		String frontTimes = "";

		if (len < 3 ){
			while(n > 0){
				frontTimes += str;
				n--;
			}
			return frontTimes;
		}else{
			String front3 = str.substring(0, 3);
			while(n > 0){
				frontTimes += front3;
				n--;
			}
			return frontTimes;
		}

	}

	/*
	 Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
	 countXX("abcxx") → 1
	 countXX("xxx") → 2
	 countXX("xxxx") →
	 */
	public int countXX(String str) {
		int len = str.length();
		Pattern pattern = Pattern.compile("xx");
		int count = 0;

		for(int i = 0; i < len - 1; i++){
			String strxx = str.substring(i, i+2);
			Matcher matcher = pattern.matcher(strxx);
			boolean matchFound = matcher.find();
			if( matchFound){
				count++;
			}
		}
		return count;
	}

	/*
	 Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
	 doubleX("axxbb") → true
	 doubleX("axaxax") → false
	 doubleX("xxxxx") → true
	 */
	public boolean doubleX(String str) {
		int len = str.length();

		for(int i = 0; i < len - 1; i++){
			boolean charX = str.charAt(i) == 'x';
			if(charX){
				boolean charXX = str.charAt(i + 1) == 'x';
				if(charXX){
					return true;
				}else{
					return false;
				}
			}
		}
		return false;
	}

	/*
	 Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
	 stringBits("Hello") → "Hlo"
	 stringBits("Hi") → "H"
	 stringBits("Heeololeo") → "Hello"
	 */
	public String stringBits(String str) {
		int len = str.length();
		String stringOtherBit = "";
		for(int i = 0; i < len; i++){
			boolean IisEven = (i % 2) == 0;
			if( IisEven){
				stringOtherBit += str.charAt(i);
			}
		}
		return stringOtherBit;
	}

	/*
	 Given a non-empty string like "Code" return a string like "CCoCodCode".
	 stringSplosion("Code") → "CCoCodCode"
	 stringSplosion("abc") → "aababc"
	 stringSplosion("ab") → "aab"
	 */
	public String stringSplosion(String str) {
		int len = str.length();
		String increasingStr = "";
		for(int i = 0; i < len; i++){
			for(int j = 0; j <= i ; j++){
				increasingStr += str.charAt(j);
			}
		}
		return increasingStr;
	}

	/*
	 Given a string, return the count of the number of times that a substring length 2 appears in the string and
	 also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
	 last2("hixxhi") → 1
	 last2("xaxxaxaxx") → 1
	 last2("axxxaaxx") → 2
	 */
	public int last2(String str) {
		int len = str.length();
		if(len < 2){
			return 0;
		}
		String endSubString = str.substring(len - 2);
		int count = 0;

		for(int i = 0; i < len - 2; i++){
			String thisSubString = str.substring(i, i + 2);
			if(endSubString.equals(thisSubString)){
				count++;
			}

		}
		return count;
	}

	/*
	 Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end
	 should not be removed.
	 stringX("xxHxix") → "xHix"
	 stringX("abxxxcd") → "abcd"
	 stringX("xabxxxcdx") → "xabcdx"
	 */
	public String stringX(String str) {
		int len = str.length();
		String noXString = "";

			for (int i = 0; i < len; i++){
				boolean beginIndex = i > 0;
				boolean endIndex = i < len - 1;
				boolean beginNend = beginIndex && endIndex;
				String xString = str.substring(i, i+1);
				if(!(beginNend && xString.equals("x"))){
					noXString += str.charAt(i);
				}

			}
		return noXString ;
	}

	/*
	 Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
	 altPairs("kitten") → "kien"
	 altPairs("Chocolate") → "Chole"
	 altPairs("CodingHorror") → "Congrr"
	 */
	public String altPairs(String str) {
		int len = str.length();
		String altPair = "";
		for(int i = 0; i < len; i++){
			altPair += str.charAt(i);
			boolean isOdd = i % 2 != 0;
			if(isOdd){
				i += 2;
			}
		}
		return altPair;
	}

	/*
	 Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed.
	 The "yak" strings will not overlap.
	 stringYak("yakpak") → "pak"
	 stringYak("pakyak") → "pak"
	 stringYak("yak123ya") → "123ya"
	 */
	public String stringYak(String str) {
		String noYakStr = str.replaceAll("yak", "");
		return noYakStr;
	}
}
