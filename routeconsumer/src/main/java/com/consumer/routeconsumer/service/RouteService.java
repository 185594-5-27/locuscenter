package com.consumer.routeconsumer.service;

import com.consumer.routeconsumer.config.FullLogConfiguration;
import com.consumer.routeconsumer.entity.Trajectory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="ROUTE-SERVICE",fallback = RouteServiceFallback.class,configuration = FullLogConfiguration.class)
public interface RouteService {

    /**
     * 功能描述：调用生产者端的轨迹处理方法
     * @param trajectory
     */
    @RequestMapping(value = "/transmissionTrajectoryData" ,method = RequestMethod.POST)
    void transmissionTrajectoryData(@RequestBody Trajectory trajectory);

}
