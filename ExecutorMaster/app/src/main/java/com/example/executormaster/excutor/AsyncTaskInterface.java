package com.example.executormaster.excutor;

/**
 * 异步任务接口
 * @author wuyue
 * @date 2016/06/27
 * @time 18:29
 */
public class AsyncTaskInterface {
    
    private volatile static AsyncTaskInterface sAsyncTaskInterface;

    private AsyncTaskDispatch mAsyncTaskDispatch;

    public static synchronized AsyncTaskInterface getInstance() {

        if (null == sAsyncTaskInterface){
            synchronized (AsyncTaskInterface.class){

                if (null == sAsyncTaskInterface){
                    sAsyncTaskInterface = new AsyncTaskInterface();
                }
            }
        }

        return sAsyncTaskInterface;
    }

    private AsyncTaskInterface() {
        mAsyncTaskDispatch = new AsyncTaskDispatch();
    }

    public void addAsyncTask(int asyncTaskType, AsyncTaskCallBack asyncTaskCallBack, Object... asyncTaskParams){
        mAsyncTaskDispatch.addAsyncTask(asyncTaskType, asyncTaskCallBack, asyncTaskParams);
    }

    public void removeAsyncTask(AsyncTaskCallBack asyncTaskCallBack){
        mAsyncTaskDispatch.removeAsyncTask(asyncTaskCallBack);
    }
}
