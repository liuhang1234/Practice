package com.lh.myapplication.http;

import android.util.ArrayMap;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface Api {

    @FormUrlEncoded
    @POST("api/token")
    Observable<BaseResponse<TokenBean>> postToken(@FieldMap ArrayMap<String, Object> map);

}
