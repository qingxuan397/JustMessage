package com.qingxuan.message.config;

import lombok.*;

/**
 * 微信小程序配置
 *
 * @Auther: 611001
 * @Date: 2021/9/18 10:33
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WxMiniPlatformConfig extends PlatformConfig {
    /**
     * 开发者ID
     */
    private String appId;

    /**
     * 开发者密码
     */
    private String appSecret;

}
