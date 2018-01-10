package com.consumer.routeconsumer.service;

import com.consumer.routeconsumer.entity.Trajectory;
import org.springframework.stereotype.Component;

@Component
public class RouteServiceFallback implements RouteService {

    @Override
    public void transmissionTrajectoryData(Trajectory trajectory) {
        System.out.println("-------调用生产者方法失败--------");
    }
}
