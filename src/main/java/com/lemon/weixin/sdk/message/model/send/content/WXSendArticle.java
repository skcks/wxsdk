package com.lemon.weixin.sdk.message.model.send.content;

import lombok.Data;

/**
 * Created by limeng0402 on 14-12-4.
 */
@Data
public class WXSendArticle {
    private String title;
    private String description;
    private String url;
    private String picurl;
}