package com.zhao.mysql;

import com.zhao.data.DataSaveService;

/**
 * @author zzc
 * @date 2023/11/28 23:13
 */
public class MySQLSaveService implements DataSaveService {
    @Override
    public void saveData(String data) {
        System.out.println("=======MySQL保存数据："+data);
    }
}
