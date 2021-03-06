package com.modularization.biz.module.renthouse;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.modularization.biz.service.renthouse.RentHouseProvider;
import com.modularization.biz.service.renthouse.RentHouseData;
import com.modularization.biz.service.renthouse.RentHouseRouterTable;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 */
@Route(path = RentHouseRouterTable.PATH_SERVICE_RENT_HOUSE)
public class RentHouseProviderImpl implements RentHouseProvider {

    @Override
    public void init(Context context) {

    }

    @Override
    public RentHouseData fetchRentHouseData() {
        RentHouseData data = new RentHouseData();
        data.setId("123123123");
        data.setBrokerName("王大仙");
        data.setAge(25);
        data.setAddress("上海市浦东新区东方路1217号88楼8801号");
        return data;
    }
}
