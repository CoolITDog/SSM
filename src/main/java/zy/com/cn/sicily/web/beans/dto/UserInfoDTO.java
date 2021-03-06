package zy.com.cn.sicily.web.beans.dto;

import zy.com.cn.sicily.web.model.UserInfo;

/**
 * @title: UserInfoDTO
 * @description: 用户信息传输对象
 * @author: zhangyan
 * @date: 2020-03-17 15:20
 * @version: 1.0
 **/
public class UserInfoDTO extends UserInfo {

    private static final long serialVersionUID = 1L;

    /**
     * 小程序appId
     */
    private String appId;

    /**
     * 用于请求openId的code
     */
    private String code;

    private String nickName;

    private String purePhoneNumber;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPurePhoneNumber() {
        return purePhoneNumber;
    }

    public void setPurePhoneNumber(String purePhoneNumber) {
        this.purePhoneNumber = purePhoneNumber;
    }

    @Override
    public String toString() {
        return "UserInfoDTO{" +
                "appId='" + appId + '\'' +
                ", code='" + code + '\'' +
                "} " + super.toString();
    }
}