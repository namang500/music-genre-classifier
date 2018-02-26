package com.example.adityaaggarwal.audiofile_sender.Interface;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by Aditya Aggarwal on 20-11-2017.
 */

public interface FileUploadService {
    @Multipart
    @POST("/")
    Call<ResponseBody> upload(
            @Part("description") RequestBody description,
            @Part MultipartBody.Part file
    );
}