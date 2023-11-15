package com.zx.quant.klineproxy.model;

import java.util.NavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import lombok.Data;

/**
 * kline set key
 * @author flamhaze5946
 */
@Data
public class KlineSet {

  private final KlineSetKey key;

  private NavigableMap<Long, Kline> klineMap = new ConcurrentSkipListMap<>();

  public KlineSet(KlineSetKey key) {
    this.key = key;
  }
}
