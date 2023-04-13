package com.centerpoint.connect.di

import android.content.Context
import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import com.centerpoint.connect.BuildConfig
import com.centerpoint.connect.api.Apis
import com.centerpoint.connect.constants.KEY_PREF_NAME
import com.centerpoint.connect.constants.connectionTimeOut
import com.centerpoint.connect.constants.readTimeOut
import com.centerpoint.connect.util.NetworkInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

fun createMasterKey(context: Context): MasterKey {
    return MasterKey.Builder(context, MasterKey.DEFAULT_MASTER_KEY_ALIAS)
        .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
        .build()
}

fun creteEncryptedSharedPref(
    context: Context,
    masterKeyAlias: MasterKey
): SharedPreferences {

    return EncryptedSharedPreferences.create(
        context,
        KEY_PREF_NAME,
        masterKeyAlias,
        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
    )
}


fun createOkHttpClient(): OkHttpClient {
    val httpLoggingInterceptor = HttpLoggingInterceptor()
    httpLoggingInterceptor.level = if (BuildConfig.DEBUG) {
        HttpLoggingInterceptor.Level.BODY
    } else {
        HttpLoggingInterceptor.Level.NONE
    }
    return OkHttpClient.Builder()
        .connectTimeout(connectionTimeOut, TimeUnit.SECONDS)
        .readTimeout(readTimeOut, TimeUnit.SECONDS)
        .addInterceptor(httpLoggingInterceptor)
        .addInterceptor(NetworkInterceptor())

        .build()
}

fun createRetrofit(okHttpClient: OkHttpClient, url: String): Retrofit {
    return Retrofit.Builder()
        .baseUrl(url)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}

fun createAllNewsApi(retrofit: Retrofit): Apis = retrofit.create(Apis::class.java)