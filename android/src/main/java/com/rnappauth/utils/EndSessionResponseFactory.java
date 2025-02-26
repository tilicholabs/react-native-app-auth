package com.rnappauth.utils;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.rnappauth.appauth.EndSessionResponse;



public final class EndSessionResponseFactory {
    /*
     * Read raw end session response into a React Native map to be passed down the bridge
     */
    public static final WritableMap endSessionResponseToMap(EndSessionResponse response) {
        WritableMap map = Arguments.createMap();

        map.putString("state", response.state);
        map.putString("idTokenHint", response.request.idTokenHint);
        if (response.request.postLogoutRedirectUri != null) {
            map.putString("postLogoutRedirectUri", response.request.postLogoutRedirectUri.toString());
        }

        return map;
    }
}
