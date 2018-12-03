package com.tao.dubbo.core.entry;

import java.io.Serializable;
import java.util.Map;
/**
 * 请求OBJECT
 * @author chentao
 *
 */
public class InputObject implements Serializable {
	private String service;
	private String method;
	private Map<String, String> params;

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

}
