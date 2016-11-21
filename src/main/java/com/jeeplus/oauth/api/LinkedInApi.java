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
public class LinkedInApi extends DefaultApi20 {
	
	private static final String AUTHORIZE_URL = "https://www.linkedin.com/uas/oauth2/authorization?response_type=code&client_id=%s&redirect_uri=%s&state=%s";
    private static final String SCOPED_AUTHORIZE_URL = AUTHORIZE_URL + "&scope=%s";
    private static final String ACCESS_TOKEN_URL = 
    		"https://www.linkedin.com/uas/oauth2/accessToken?grant_type=authorization_code&code=%s&redirect_uri=%s&client_id=%s&client_secret=%s";
    
    private final String linkedInState;
    
    public LinkedInApi(String state){
    	this.linkedInState=state;
    }

	@Override
	public String getAccessTokenEndpoint() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAuthorizationUrl(OAuthConfig arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
