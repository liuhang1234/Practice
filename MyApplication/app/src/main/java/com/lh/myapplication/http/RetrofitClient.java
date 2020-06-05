package com.lh.myapplication.http;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Api api;
    private static Converter.Factory gsonConverterFactory = GsonConverterFactory.create();
    public static final String S1 = "http://mdmtest.basewin.com:30160/";
    public static final String S2 = "http://mdm.basewin.com:30155/";
    private static OkHttpClient okHttpClient;
    public static Api getApi() {
        if (null == okHttpClient) {
            initOkhttpClient();
        }
        if (api == null) {

            Retrofit retrofit = new Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl(S1)
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(gsonConverterFactory)
                    .build();
            api = retrofit.create(Api.class);
        }
        return api;
    }

    private static void initOkhttpClient() {
        okHttpClient =initOkhttpClientFile() ;
    }

    public static OkHttpClient initOkhttpClientFile() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .writeTimeout(10, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .build();
        return okHttpClient;
    }
}
