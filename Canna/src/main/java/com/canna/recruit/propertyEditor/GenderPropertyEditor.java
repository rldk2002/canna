package com.canna.recruit.propertyEditor;

import java.beans.PropertyEditorSupport;

import com.canna.recruit.user.dto.Gender;

public class GenderPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		this.setValue(Gender.valueOf(Integer.parseInt(text.trim())));
	}

	@Override
	public String getAsText() {
		return this.getValue() == null ? null : String.valueOf(((Gender)this.getValue()).getId());
	}
	
}
