package com.canna.recruit.propertyEditor;

import java.beans.PropertyEditorSupport;

import com.canna.recruit.user.domain.Authority;

public class AuthorityPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		this.setValue(Authority.valueOf(Integer.parseInt(text.trim())));
	}

	@Override
	public String getAsText() {
		return this.getValue() == null ? null : String.valueOf(((Authority)this.getValue()).getId());
	}

	
}
