package com.lh.myapplication.http;

import android.util.ArrayMap;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface Api {

    @FormUrlEncoded
    @POST("api/token")
    Observable<BaseResponse<TokenBean>> postToken(@FieldMap ArrayMap<String, Object> map);

}
