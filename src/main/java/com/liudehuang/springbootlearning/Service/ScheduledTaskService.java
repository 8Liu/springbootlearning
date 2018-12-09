package com.liudehuang.springbootlearning.Service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    /**
     * 通过@Scheduled声明该方法是计划任务，使用fixedRate属性每隔固定时间执行
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每5秒执行一次"+sdf.format(new Date()));
    }

    @Scheduled(cron = "0 28 11 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间"+sdf.format(new Date())+"执行");
    }
}
