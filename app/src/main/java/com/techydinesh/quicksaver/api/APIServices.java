package com.techydinesh.quicksaver.api;

import com.techydinesh.quicksaver.model.TiktokModel;
import com.techydinesh.quicksaver.model.TwitterResponse;
import com.techydinesh.quicksaver.model.story.FullDetailModel;
import com.techydinesh.quicksaver.model.story.StoryModel;
import com.google.gson.JsonObject;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface APIServices {
    @GET
    Observable<JsonObject> callResult(@Url String Value, @Header("Cookie") String cookie, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST
    Observable<TwitterResponse> callTwitter(@Url String Url, @Field("id") String id);

    @POST
    Observable<TiktokModel> getTiktokData(@Url String Url, @Body HashMap<String, String> hashMap);

    @GET
    Observable<StoryModel> getStoriesApi(@Url String Value, @Header("Cookie") String cookie, @Header("User-Agent") String userAgent);

    @GET
    Observable<FullDetailModel> getFullDetailInfoApi(@Url String Value, @Header("Cookie") String cookie, @Header("User-Agent") String userAgent);
}