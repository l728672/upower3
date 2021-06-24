package com.exam.vo;
/*
 * @Description:
 * @Author: 1013962464521.com
 * @Date: 2020/4/6
 * @param null:
 * @return: null
 **/
import com.exam.vo.base.BaseConditionVo;

public class ClassesConditionVo extends BaseConditionVo {

	private String className;
	
	private Integer insId;
	
	private Integer status;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getInsId() {
		return insId;
	}

	public void setInsId(Integer insId) {
		this.insId = insId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
