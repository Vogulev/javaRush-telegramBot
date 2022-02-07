package com.github.vogulev.jrtb.service;

import com.github.vogulev.jrtb.javarushclient.dto.StatisticDTO;

/**
 * Service for getting bot statistics.
 */
public interface StatisticsService {
    StatisticDTO countBotStatistic();
}
