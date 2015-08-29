package com.journaldev.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "CreateProductResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class CreateProductResponse {
	private boolean success;

	public CreateProductResponse() {
		// TODO Auto-generated constructor stub
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}
