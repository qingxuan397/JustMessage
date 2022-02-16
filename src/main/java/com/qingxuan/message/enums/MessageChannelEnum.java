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
public enum MessageChannelEnum {

    EMAIL(EmailChannelConfig.class, "邮箱"),
    SMS(SmsChannelConfig.class, "短信"),
    WECHAT_WORK_AGENT(WxCpAgentChannelConfig.class, "企业微信-应用消息"),
    WECHAT_WORK_ROBOT(WxCpRobotChannelConfig.class, "企业微信-群机器人"),
    WECHAT_OFFICIAL_ACCOUNT(WxMpChannelConfig.class, "微信公众号"),
    WECHAT_MINI_PROGRAM(WxMiniChannelConfig.class, "微信小程序"),
    DING_TALK_CORP(DingTalkCorpChannelConfig.class, "钉钉-工作通知"),
    DING_TALK_ROBOT(DingTalkRobotChannelConfig.class, "钉钉-群机器人"),
    ;

    /**
     * 配置类型
     */
    private Class<? extends ChannelConfig> configType;
    private final String name;


    MessageChannelEnum(Class<? extends ChannelConfig> configType, String name) {
        this.configType = configType;
        this.name = name;
    }
}
