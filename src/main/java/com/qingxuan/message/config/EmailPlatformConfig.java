package com.qingxuan.message.config;

import lombok.*;

/** 
 * 邮箱配置
 * @author: 611001
 * @date: 2022/2/15 18:18
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailPlatformConfig extends PlatformConfig {

    /**
     * 邮件服务器的SMTP地址
     */
    private String host;

    /**
     * 邮件服务器的SMTP端口
     */
    private int port;

    /**
     * 发件人（邮箱地址）
     */
    private String from;

    /**
     * 用户名
     */
    private String user;

    /**
     * 密码
     */
    private String password;

}
