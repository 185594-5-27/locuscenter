package com.produce.controller;

import com.produce.entity.Trajectory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
* 类描述：轨迹业务处理controller类
* @auther linzf
* @create 2018/1/9 0009 
*/
@RestController
public class RouteController {


    /**
     * 功能描述：提交轨迹数据，实现对轨迹数据进行相应的业务处理
     * @param trajectory
     */
    @RequestMapping(value = "/transmissionTrajectoryData", method= RequestMethod.POST)
    public String transmissionTrajectoryData(Trajectory trajectory){
           System.out.println("-------轨迹数据已接收到--------");
           return "接收到数据了";
    }

}
