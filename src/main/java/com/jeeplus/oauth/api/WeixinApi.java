/**
 * 
 */
package com.jeeplus.oauth.api;

import org.scribe.builder.api.DefaultApi20;
import org.scribe.model.OAuthConfig;

/**
 * @author yuzp17311
 * @date 2016年11月21日
 * @version v1.0
 */
public class WeixinApi extends DefaultApi20 {
	
	
	private static final String AUTHORIZE_URL="https://open.weixin.qq.com/connect/qrconnect?appid=%s&redirect_uri=%s&response_type=code&scope=snsapi_login&state=%s#wechat_redirect";
	private static final String SCOPED_AUTHORIZE_URL = AUTHORIZE_URL + "&scope=%s";
    private static final String ACCESS_TOKEN_URL = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=%s&secret=%s&code=%s&grant_type=authorization_code";
    
    private final String weixinState;
    
    public WeixinApi(String state){
    	this.weixinState=state;
    }

	@Override
	public String getAccessTokenEndpoint() {
		return null;
	}

	@Override
	public String getAuthorizationUrl(OAuthConfig config) {
		if(config.hasScope()){
			
		}
		return null;
	}

}
