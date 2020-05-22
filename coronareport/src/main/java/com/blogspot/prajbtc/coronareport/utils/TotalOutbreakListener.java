package com.blogspot.prajbtc.coronareport.utils;

import com.blogspot.prajbtc.coronareport.models.Response;

public interface TotalOutbreakListener {
  public void success(Response response);
  public void failed(String errorMessage);
}
