package com.qingxuan.message.config;

import lombok.*;

/**
 * 企业微信配置
 *
 * @author: 611001
 * @date: 2022/2/15 18:16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WxCpAgentChannelConfig extends ChannelConfig {

    /**
     * 企业ID
     * 在此页面查看：https://work.weixin.qq.com/wework_admin/frame#profile
     */
    private String corpId;

    /**
     * 应用Secret
     */
    private String secret;

    /**
     * 应用agentId
     */
    private Integer agentId;

}
