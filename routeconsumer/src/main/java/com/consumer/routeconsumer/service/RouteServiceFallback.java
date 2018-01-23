package com.consumer.routeconsumer.service;

import com.consumer.routeconsumer.entity.Trajectory;
import org.springframework.stereotype.Component;

@Component
public class RouteServiceFallback implements RouteService {

    @Override
    public String transmissionTrajectoryData(Trajectory trajectory) {
        System.out.println("-------调用生产者方法失败--------");
        return "调用失败";
    }
}
