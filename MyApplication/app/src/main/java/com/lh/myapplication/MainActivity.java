package com.lh.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Consumer;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;

import com.lh.myapplication.http.BaseResponse;
import com.lh.myapplication.http.RetrofitClient;
import com.lh.myapplication.http.TokenBean;
import com.lh.myapplication.utils.TokenUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getHah();
    }

    public void getHah(){
        RetrofitClient.getApi().postToken(TokenUtils.getMapAllDevInfo())
                .observeOn(Schedulers.io()).map(new Func1<BaseResponse<TokenBean>, TokenBean>() {
            @Override
            public TokenBean call(BaseResponse<TokenBean> tokenBeanBaseResponse) {
                return tokenBeanBaseResponse.getData();
            }
        });
    }
}
