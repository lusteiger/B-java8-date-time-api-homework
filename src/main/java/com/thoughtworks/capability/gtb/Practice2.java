package com.thoughtworks.capability.gtb;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

  public static LocalDate getNextWorkDate(LocalDate date) {
    LocalDate friday =date.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
    if (date.isAfter(friday) || date.equals(friday) )
      date = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
    else
      date = date.plusDays(1);
    return date;
  }
}
