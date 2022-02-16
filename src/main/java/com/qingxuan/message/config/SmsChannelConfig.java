package com.qingxuan.message.config;

import lombok.*;

/**
 * 短信平台配置
 *
 * @auther: 611001
 * @date: 2022/2/15 18:20
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SmsChannelConfig extends ChannelConfig {

    private String accessKeyId;

    private String accessKeySecret;

    /**
     * 短信签名
     */
    private String sign;
}
