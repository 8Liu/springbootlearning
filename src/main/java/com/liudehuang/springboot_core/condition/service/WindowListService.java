package com.liudehuang.springboot_core.condition.service;

public class WindowListService implements ListService {
    @Override
    public String shwoListCmd() {
        return "dir";
    }
}
