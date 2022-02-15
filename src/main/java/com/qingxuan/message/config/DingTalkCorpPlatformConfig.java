package com.qingxuan.message.config;

import lombok.*;

/**
 * 钉钉工作通知配置
 *
 * @author: 611001
 * @date: 2022/2/15 18:13
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DingTalkCorpPlatformConfig extends PlatformConfig {

    /**
     * 应用appKey
     */
    private String appKey;

    /**
     * 应用Secret
     */
    private String AppSecret;

    /**
     * 应用agentId
     */
    private Integer agentId;

}
