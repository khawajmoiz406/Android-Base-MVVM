package com.centerpoint.connect.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0006\u0010\b\u001a\u00020\t\u001a\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r\u001a\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0005\u00a8\u0006\u0011"}, d2 = {"createAllNewsApi", "Lcom/centerpoint/connect/api/Apis;", "retrofit", "Lretrofit2/Retrofit;", "createMasterKey", "Landroidx/security/crypto/MasterKey;", "context", "Landroid/content/Context;", "createOkHttpClient", "Lokhttp3/OkHttpClient;", "createRetrofit", "okHttpClient", "url", "", "creteEncryptedSharedPref", "Landroid/content/SharedPreferences;", "masterKeyAlias", "app_debug"})
public final class ModuleHelperKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.security.crypto.MasterKey createMasterKey(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.SharedPreferences creteEncryptedSharedPref(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.security.crypto.MasterKey masterKeyAlias) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final okhttp3.OkHttpClient createOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final retrofit2.Retrofit createRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.centerpoint.connect.api.Apis createAllNewsApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}