/*
 * Made With Love
 * Author @Moh Husni Mubaraq
 * Not for Commercial Purpose
 */

package com.example.covid19_putri.service;

import java.util.List;

import com.example.covid19_putri.model.HistoryModel;
import com.example.covid19_putri.model.IndonesiaProvinsiModel;
import com.example.covid19_putri.model.IndonesiaSummaryModel;
import com.example.covid19_putri.model.WorldSummaryModel;
import com.example.covid19_putri.model.news.NewsResponse;
import com.example.covid19_putri.utilities.AppUtils;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiEndpoint {
    //Endpoint riwayat
    @GET(AppUtils.END_POINT_WORLD_HISTORY)
    Call<List<HistoryModel>> getHistoryList(@Path("date") String date);

    //Endpointt Ringkasan Dunia
    @GET(AppUtils.END_POINT_SUMMARY_WORLD)
    Call<WorldSummaryModel> getSummaryWorld();

    //Endpoint Ringkasan Indonesia
    @GET(AppUtils.ENDPOINT_SUMMARY_INDONESIA)
    Call<List<IndonesiaSummaryModel>> getSummaryIdn();

    //Endpoint Provinsi Indonesia
    @GET(AppUtils.ENDPOINT_INDONESIA_PROVINSI)
    Call<List<IndonesiaProvinsiModel>> getProvince();

    @GET(AppUtils.ENDPOINT_TOP_HEADLINE_NEWS)
    Call<NewsResponse> getNews(@Query("country") String countryCode,
                               @Query("category") String category,
                               @Query("apiKey") String apiKey);

}
