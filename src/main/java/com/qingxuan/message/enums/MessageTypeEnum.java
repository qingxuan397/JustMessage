package com.qingxuan.message.enums;

import lombok.Getter;

/**
 * 消息类型枚举
 *
 * @author: 611001
 * @date: 2022/2/15 18:29
 */
@Getter
public enum MessageTypeEnum {

    EMAIL("普通邮件 ", MessageChannelEnum.EMAIL),

    // ================================短信====================================
    SMS_ALI("阿里云短信 ", MessageChannelEnum.SMS),
    SMS_TENCENT("腾讯云短信 ", MessageChannelEnum.SMS),
    SMS_HUAWEI("华为云短信 ", MessageChannelEnum.SMS),
    SMS_BAIDU("百度云短信 ", MessageChannelEnum.SMS),
    SMS_QINIU("七牛云短信 ", MessageChannelEnum.SMS),

    // ================================企业微信-应用====================================
    WECHAT_WORK_AGENT_TEXT("文本", MessageChannelEnum.WECHAT_WORK_AGENT),
    WECHAT_WORK_AGENT_IMAGE("图片", MessageChannelEnum.WECHAT_WORK_AGENT),
    WECHAT_WORK_AGENT_VIDEO("视频", MessageChannelEnum.WECHAT_WORK_AGENT),
    WECHAT_WORK_AGENT_FILE("文件", MessageChannelEnum.WECHAT_WORK_AGENT),
    WECHAT_WORK_AGENT_TEXTCARD("文本卡片", MessageChannelEnum.WECHAT_WORK_AGENT),
    WECHAT_WORK_AGENT_NEWS("图文消息", MessageChannelEnum.WECHAT_WORK_AGENT),
    WECHAT_WORK_AGENT_MARKDOWN("Markdown", MessageChannelEnum.WECHAT_WORK_AGENT),

    // ================================企业微信-群机器人====================================
    WECHAT_WORK_ROBOT_TEXT("文本", MessageChannelEnum.WECHAT_WORK_ROBOT),
    WECHAT_WORK_ROBOT_IMAGE("图片", MessageChannelEnum.WECHAT_WORK_ROBOT),
    WECHAT_WORK_ROBOT_NEWS("图文消息", MessageChannelEnum.WECHAT_WORK_ROBOT),
    WECHAT_WORK_ROBOT_MARKDOWN("Markdown", MessageChannelEnum.WECHAT_WORK_ROBOT),

    // ================================微信公众号====================================
    WECHAT_OFFICIAL_ACCOUNT_TEXT("文本", MessageChannelEnum.WECHAT_OFFICIAL_ACCOUNT),
    WECHAT_OFFICIAL_ACCOUNT_NEWS("图文消息", MessageChannelEnum.WECHAT_OFFICIAL_ACCOUNT),
    WECHAT_OFFICIAL_ACCOUNT_TEMPLATE("模板消息", MessageChannelEnum.WECHAT_OFFICIAL_ACCOUNT),

    // ================================微信小程序====================================
    WECHAT_MINI_PROGRAM_SUBSCRIBEMESSAGE("订阅消息", MessageChannelEnum.WECHAT_MINI_PROGRAM),

    // ================================钉钉-工作通知====================================
    DING_TALK_COPR_TEXT("文本", MessageChannelEnum.DING_TALK_CORP),
    DING_TALK_COPR_MARKDOWN("Markdown", MessageChannelEnum.DING_TALK_CORP),
    DING_TALK_COPR_LINK("链接消息", MessageChannelEnum.DING_TALK_CORP),
    DING_TALK_COPR_ACTION_CARD_SINGLE("卡片-单按钮", MessageChannelEnum.DING_TALK_CORP),
    DING_TALK_COPR_ACTION_CARD_MULTI("卡片-多按钮", MessageChannelEnum.DING_TALK_CORP),
    DING_TALK_COPR_OA("OA消息", MessageChannelEnum.DING_TALK_CORP),

    // ================================钉钉-群机器人====================================
    DING_TALK_ROBOT_TEXT("文本", MessageChannelEnum.DING_TALK_ROBOT),
    DING_TALK_ROBOT_MARKDOWN("Markdown", MessageChannelEnum.DING_TALK_ROBOT),
    DING_TALK_ROBOT_LINK("链接消息", MessageChannelEnum.DING_TALK_ROBOT),
    DING_TALK_ROBOT_ACTION_CARD_SINGLE("卡片-单按钮", MessageChannelEnum.DING_TALK_ROBOT),
    DING_TALK_ROBOT_ACTION_CARD_MULTI("卡片-多按钮", MessageChannelEnum.DING_TALK_ROBOT),
    DING_TALK_ROBOT_FEED_CARD("FeedCard", MessageChannelEnum.DING_TALK_ROBOT),

    ;

    /**
     * 名称
     */
    private final String name;

    /**
     * 所属平台
     */
    private final MessageChannelEnum platform;

    MessageTypeEnum(String name, MessageChannelEnum platform) {
        this.name = name;
        this.platform = platform;
    }
}
