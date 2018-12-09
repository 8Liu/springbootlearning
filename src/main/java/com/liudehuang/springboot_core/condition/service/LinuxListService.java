package com.liudehuang.springboot_core.condition.service;

public class LinuxListService implements ListService {
    @Override
    public String shwoListCmd() {
        return "ls";
    }
}
