package com.qingxuan.message.config;

import lombok.*;

/**
 * 企业微信-群机器人配置
 *
 * @author: 611001
 * @date: 2022/2/15 18:17
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WxCpRobotPlatformConfig extends PlatformConfig {

    /**
     * 群机器人的webhook
     */
    private String webhook;

}
