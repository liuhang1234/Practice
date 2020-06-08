package com.lh.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.lh.myapplication.http.BaseResponse;
import com.lh.myapplication.http.RetrofitClient;
import com.lh.myapplication.http.TokenBean;
import com.lh.myapplication.utils.TokenUtils;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getHah();
    }

    public void getHah(){
        RetrofitClient.getApi().postToken(TokenUtils.getMapAllDevInfo())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<BaseResponse<TokenBean>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(BaseResponse<TokenBean> tokenBeanBaseResponse) {
                        Log.d("onNext",tokenBeanBaseResponse.toString());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("onError",e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
