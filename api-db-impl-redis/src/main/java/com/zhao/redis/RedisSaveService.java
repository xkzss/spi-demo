package com.zhao.redis;

import com.zhao.data.DataSaveService;

/**
 * @author zzc
 * @date 2023/11/28 23:13
 */
public class RedisSaveService implements DataSaveService {
    @Override
    public void saveData(String data) {
        System.out.println("=======Redis保存数据："+data);
    }
}
