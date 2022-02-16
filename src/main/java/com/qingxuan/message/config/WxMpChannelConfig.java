package com.qingxuan.message.config;

import lombok.*;

/**
 * 微信公众号配置
 *
 * @author: 611001
 * @date: 2022/2/15 18:15
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WxMpChannelConfig extends ChannelConfig {

    private String appId;
    private String secret;

}
