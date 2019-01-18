package com.naidu.conversions;

public interface DataTransfer {
	
	public abstract String toDefaultLanguage(String input);

	public abstract String toSpecialLanguage(String input);
}
