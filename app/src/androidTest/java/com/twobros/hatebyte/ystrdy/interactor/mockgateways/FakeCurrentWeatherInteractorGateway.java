package com.twobros.hatebyte.ystrdy.interactor.mockgateways;

import com.twobros.hatebyte.ystrdy.weatherreport.entity.RecordEntity;
import com.twobros.hatebyte.ystrdy.weatherreport.interactor.network.entitygateway.CurrentWeatherGateway;
import com.twobros.hatebyte.ystrdy.weatherreport.interactor.network.implementation.JSONEGI;

/**
 * Created by scott on 12/19/14.
 */
public class FakeCurrentWeatherInteractorGateway extends CurrentWeatherGateway {

    public boolean shouldReturnNull = false;

    public void setEntityGateway(JSONEGI implementation) {
        jsonGatewayImp = implementation;
    }

    public void setRecord(RecordEntity r) {
        recordEntity = r;
    }

    @Override
    public RecordEntity requestData(RecordEntity re) {
        if (shouldReturnNull) {
            return null;
        }
        re.temperature = 51.0f;
        re.regionName = "soho do";
        return re;
    }

}
