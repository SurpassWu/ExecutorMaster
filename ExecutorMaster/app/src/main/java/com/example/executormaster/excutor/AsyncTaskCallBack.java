package com.example.executormaster.excutor;

/**
 * 异步任务处理回调接口
 * @author wuyue
 * @date 2016/06/27
 * @time 18:29
 */

public interface AsyncTaskCallBack {
    Object onTaskExecute(int asyncTaskType, Object... asyncTaskParams);
    void onTaskComplete(int asyncThreadType, Object asyncTaskResult);
}
