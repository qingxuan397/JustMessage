package com.qingxuan.message.config;

import lombok.*;

/**
 * 钉钉群机器人消息配置
 *
 * @author: 611001
 * @date: 2022/2/15 18:14
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DingTalkRobotPlatformConfig extends PlatformConfig {

    /**
     * 群机器人的webhook
     */
    private String webhook;

}
