package com.zx.quant.klineproxy.client;

import com.zx.quant.klineproxy.client.model.BinanceFutureExchange;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BinanceFutureClient {

  @GET("fapi/v1/exchangeInfo")
  Call<BinanceFutureExchange> getExchange();

  @GET("fapi/v1/klines")
  Call<List<Object[]>> getKlines(
      @Query("symbol") String symbol,
      @Query("interval") String interval,
      @Query("startTime") Long startTime,
      @Query("endTime") Long endTime,
      @Query("limit") Integer limit
  );
}
