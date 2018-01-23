package com.consumer.routeconsumer.controller;

import com.consumer.routeconsumer.entity.Trajectory;
import com.consumer.routeconsumer.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {


    @Autowired
    private RouteService routeService;

    /**
     * 功能描述：提交轨迹数据，实现调用轨迹数据处理逻辑
     * @param trajectory
     */
    @RequestMapping(value = "/transmissionTrajectoryData", method = RequestMethod.POST)
    public String transmissionTrajectoryData(Trajectory trajectory){
        return routeService.transmissionTrajectoryData(trajectory);
    }



    }
