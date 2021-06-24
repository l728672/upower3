package com.exam.vo;
/*
 * @Description:
 * @Author: 1013962464521.com
 * @Date: 2020/4/6
 * @param null:
 * @return: null
 **/

public class ChangePasswordVo {
    String oldPassword;
    String newPassword;
    String confirmNewPassword;

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmNewPassword() {
        return confirmNewPassword;
    }

    public void setConfirmNewPassword(String confirmNewPassword) {
        this.confirmNewPassword = confirmNewPassword;
    }
}
