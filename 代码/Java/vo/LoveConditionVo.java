package com.exam.vo;
/*
 * @Description:
 * @Author: 1013962464521.com
 * @Date: 2020/4/6
 * @param null:
 * @return: null
 **/
import com.exam.vo.base.BaseConditionVo;

public class LoveConditionVo extends BaseConditionVo {
	
	private Integer supId;
	
	private String userId;
	
	private Integer loveType;
	
	private String userIp;

	public Integer getSupId() {
		return supId;
	}

	public void setSupId(Integer supId) {
		this.supId = supId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getLoveType() {
		return loveType;
	}

	public void setLoveType(Integer loveType) {
		this.loveType = loveType;
	}

	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	
}
