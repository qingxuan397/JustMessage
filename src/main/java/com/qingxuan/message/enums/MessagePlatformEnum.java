package com.qingxuan.message.enums;

import com.qingxuan.message.config.*;
import lombok.Getter;

/**
 * 消息平台枚举
 *
 * @author: 611001
 * @date: 2022/2/15 18:10
 */
@Getter
public enum MessagePlatformEnum {

    EMAIL(EmailPlatformConfig.class, "邮箱"),
    SMS(SmsPlatformConfig.class, "短信"),
    WECHAT_WORK_AGENT(WxCpAgentPlatformConfig.class, "企业微信-应用消息"),
    WECHAT_WORK_ROBOT(WxCpRobotPlatformConfig.class, "企业微信-群机器人"),
    WECHAT_OFFICIAL_ACCOUNT(WxMpPlatformConfig.class, "微信公众号"),
    WECHAT_MINI_PROGRAM(WxMiniPlatformConfig.class, "微信小程序"),
    DING_TALK_CORP(DingTalkCorpPlatformConfig.class, "钉钉-工作通知"),
    DING_TALK_ROBOT(DingTalkRobotPlatformConfig.class, "钉钉-群机器人"),
    ;

    /**
     * 配置类型
     */
    private Class<? extends PlatformConfig> configType;
    private final String name;


    MessagePlatformEnum(Class<? extends PlatformConfig> configType, String name) {
        this.configType = configType;
        this.name = name;
    }
}
