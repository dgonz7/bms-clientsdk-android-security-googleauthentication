/*
   Copyright 2015 IBM Corp.
    Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
        http://www.apache.org/licenses/LICENSE-2.0
    Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package com.ibm.mobileclientaccess.clientsdk.android.auth.google;

import android.content.Intent;

/**
 * Created by iklein on 8/5/15.
 */
public interface MCAGoogleAuthentication {

    /**
     * Signs-in to Google and sends the Google access token back to the authentication handler.
     *
     * @param appId                 The Google app id.
     */
    void handleAuthentication(String appId);

    /**
     *
     * @param requestCode
     * @param resultCode
     * @param data
     */
    void onActivityResultCalled(int requestCode, int resultCode, Intent data);
}