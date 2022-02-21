package com.cavanosa.tutorialandroidamplify;

import android.content.Context;
import android.util.Log;

import com.amplifyframework.auth.AuthUserAttributeKey;
import com.amplifyframework.auth.options.AuthSignUpOptions;
import com.amplifyframework.core.Amplify;

public class AmplifyCognito {

    private Context context;

    public AmplifyCognito(Context context) {
        this.context = context;
    }

    public void signUp(String email, String username, String password) {
        AuthSignUpOptions options = AuthSignUpOptions.builder()
                .userAttribute(AuthUserAttributeKey.email(), email)
                .build();
        Amplify.Auth.signUp(username, password, options,
                result -> Log.i("AuthQuickStart", "Result: " + result.toString()),
                error -> Log.e("AuthQuickStart", "Sign up failed", error));
    }
}
