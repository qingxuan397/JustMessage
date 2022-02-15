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

    EMAIL("普通邮件 ", MessagePlatformEnum.EMAIL),
    SMS("普通短信 ", MessagePlatformEnum.SMS),

    // ================================企业微信-应用====================================
    WECHAT_WORK_AGENT_TEXT("文本", MessagePlatformEnum.WECHAT_WORK_AGENT),
    WECHAT_WORK_AGENT_IMAGE("图片", MessagePlatformEnum.WECHAT_WORK_AGENT),
    WECHAT_WORK_AGENT_VIDEO("视频", MessagePlatformEnum.WECHAT_WORK_AGENT),
    WECHAT_WORK_AGENT_FILE("文件", MessagePlatformEnum.WECHAT_WORK_AGENT),
    WECHAT_WORK_AGENT_TEXTCARD("文本卡片", MessagePlatformEnum.WECHAT_WORK_AGENT),
    WECHAT_WORK_AGENT_NEWS("图文消息", MessagePlatformEnum.WECHAT_WORK_AGENT),
    WECHAT_WORK_AGENT_MARKDOWN("Markdown", MessagePlatformEnum.WECHAT_WORK_AGENT),

    // ================================企业微信-群机器人====================================
    WECHAT_WORK_ROBOT_TEXT("文本", MessagePlatformEnum.WECHAT_WORK_ROBOT),
    WECHAT_WORK_ROBOT_IMAGE("图片", MessagePlatformEnum.WECHAT_WORK_ROBOT),
    WECHAT_WORK_ROBOT_NEWS("图文消息", MessagePlatformEnum.WECHAT_WORK_ROBOT),
    WECHAT_WORK_ROBOT_MARKDOWN("Markdown", MessagePlatformEnum.WECHAT_WORK_ROBOT),

    // ================================微信公众号====================================
    WECHAT_OFFICIAL_ACCOUNT_TEXT("文本", MessagePlatformEnum.WECHAT_OFFICIAL_ACCOUNT),
    WECHAT_OFFICIAL_ACCOUNT_NEWS("图文消息", MessagePlatformEnum.WECHAT_OFFICIAL_ACCOUNT),
    WECHAT_OFFICIAL_ACCOUNT_TEMPLATE("模板消息", MessagePlatformEnum.WECHAT_OFFICIAL_ACCOUNT),

    // ================================微信小程序====================================
    WECHAT_MINI_PROGRAM_SUBSCRIBEMESSAGE("订阅消息", MessagePlatformEnum.WECHAT_MINI_PROGRAM),

    // ================================钉钉-工作通知====================================
    DING_TALK_COPR_TEXT("文本", MessagePlatformEnum.DING_TALK_CORP),
    DING_TALK_COPR_MARKDOWN("Markdown", MessagePlatformEnum.DING_TALK_CORP),
    DING_TALK_COPR_LINK("链接消息", MessagePlatformEnum.DING_TALK_CORP),
    DING_TALK_COPR_ACTION_CARD_SINGLE("卡片-单按钮", MessagePlatformEnum.DING_TALK_CORP),
    DING_TALK_COPR_ACTION_CARD_MULTI("卡片-多按钮", MessagePlatformEnum.DING_TALK_CORP),
    DING_TALK_COPR_OA("OA消息", MessagePlatformEnum.DING_TALK_CORP),

    // ================================钉钉-群机器人====================================
    DING_TALK_ROBOT_TEXT("文本", MessagePlatformEnum.DING_TALK_ROBOT),
    DING_TALK_ROBOT_MARKDOWN("Markdown", MessagePlatformEnum.DING_TALK_ROBOT),
    DING_TALK_ROBOT_LINK("链接消息", MessagePlatformEnum.DING_TALK_ROBOT),
    DING_TALK_ROBOT_ACTION_CARD_SINGLE("卡片-单按钮", MessagePlatformEnum.DING_TALK_ROBOT),
    DING_TALK_ROBOT_ACTION_CARD_MULTI("卡片-多按钮", MessagePlatformEnum.DING_TALK_ROBOT),
    DING_TALK_ROBOT_FEED_CARD("FeedCard", MessagePlatformEnum.DING_TALK_ROBOT),

    ;

    /**
     * 所属平台
     */
    private final MessagePlatformEnum platform;
    private final String name;

    MessageTypeEnum(String name, MessagePlatformEnum platform) {
        this.name = name;
        this.platform = platform;
    }
}
