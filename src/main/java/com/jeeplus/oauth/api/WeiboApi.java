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
public class WeiboApi extends DefaultApi20{
	
	private static final String AUTHORIZE_URL = "https://api.weibo.com/oauth2/authorize?client_id=%s&redirect_uri=%s&response_type=code";
    private static final String SCOPED_AUTHORIZE_URL = AUTHORIZE_URL + "&scope=%s";
    private static final String ACCESS_TOKEN_URL = "https://api.weibo.com/oauth2/access_token?client_id=%s&client_secret=%s&grant_type=authorization_code&code=%s&redirect_uri=%s";
    
    private final String weiboState;
    
    
	public WeiboApi(String state){
		this.weiboState=state;
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
