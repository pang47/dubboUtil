package com.tao.dubbo.core.entry;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.tao.dubbo.core.util.SystemConstant;

/**
 * 输出OBJECT
 * 
 * @author chentao
 *
 */
public class OutputObject<T> implements Serializable {
	private String retCode;
	private String retMsg;
	private Map<String, String> retParams;
	private List<T> retList;

	public OutputObject() {
		this.retCode = SystemConstant.SUCCESSCODE;
		this.retMsg = SystemConstant.SUCCESSMESG;
	}

	public String getRetCode() {
		return retCode;
	}

	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}

	public String getRetMsg() {
		return retMsg;
	}

	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}

	public Map<String, String> getRetParams() {
		return retParams;
	}

	public void setRetParams(Map<String, String> retParams) {
		this.retParams = retParams;
	}

	public List<T> getRetList() {
		return retList;
	}

	public void setRetList(List<T> retList) {
		this.retList = retList;
	}

}
