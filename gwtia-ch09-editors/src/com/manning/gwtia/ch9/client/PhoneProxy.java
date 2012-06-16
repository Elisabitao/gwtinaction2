package com.manning.gwtia.ch9.client;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyFor;

import com.manning.gwtia.ch9.server.Contact.Phone;

@ProxyFor(value = Phone.class)
public interface PhoneProxy extends EntityProxy {
	Long getId();

	Integer getVersion();

	void setId(Long id);

	Long getContactId();

	void setVersion(Integer version);

	String getType();

	void setContactId(Long contactId);

	void setType(String type);

	String getNumber();

	void setNumber(String number);
}
