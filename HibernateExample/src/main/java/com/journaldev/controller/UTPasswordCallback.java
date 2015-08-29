package com.journaldev.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class UTPasswordCallback implements CallbackHandler {
	private Map<String, String> passwords = new HashMap<>();

	public UTPasswordCallback() {
		// TODO Auto-generated constructor stub
		passwords.put("Vineet", "Garg");
	}

	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		// TODO Auto-generated method stub

		for (Callback callback : callbacks) {
			WSPasswordCallback passwordCallback = WSPasswordCallback.class.cast(callback);

			String password = passwords.get(passwordCallback.getIdentifier());
			if (password != null && password.length() > 0) {
				passwordCallback.setPassword(password);
				return;
			}
		}
	}

}
