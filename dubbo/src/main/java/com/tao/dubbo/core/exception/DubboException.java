package com.tao.dubbo.core.exception;

import com.tao.dubbo.core.util.SystemConstant;

public class DubboException extends Exception {
	private String errCode;
	private String errMsg;

	public DubboException(String message) {
		super(message);
		this.errCode = SystemConstant.ERRORCODE;
	}
	
	public DubboException(Exception e) {
		super(e);
		this.errCode = SystemConstant.ERRORCODE;
	}

	public DubboException(String errCode, String errMsg) {
		super(errCode);
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

}
