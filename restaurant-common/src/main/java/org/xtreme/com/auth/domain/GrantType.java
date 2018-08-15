package org.xtreme.com.auth.domain;

public enum GrantType {
	REFRESH_TOKEN("refresh_token");
	private final String value;

	GrantType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
