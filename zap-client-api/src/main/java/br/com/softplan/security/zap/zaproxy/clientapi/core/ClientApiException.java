/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2012 The Zed Attack Proxy Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.softplan.security.zap.zaproxy.clientapi.core;


public class ClientApiException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private final String code;
	private final String detail;
	
	public ClientApiException(Exception e) {
		super(e);
		this.code = null;
		this.detail = null;
	}

	public ClientApiException(String s) {
		super(s);
		this.code = null;
		this.detail = null;
	}

	public ClientApiException(String message, String code, String detail) {
		super(message);
		this.code = code;
		this.detail = detail;
	}

	public String getCode() {
		return code;
	}

	public String getDetail() {
		return detail;
	}
	
}
