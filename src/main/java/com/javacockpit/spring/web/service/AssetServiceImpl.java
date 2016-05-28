package com.javacockpit.spring.web.service;

import com.javacockpit.spring.web.bean.AssetPojo;
import com.javacockpit.spring.web.dao.AssetDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TCMBAS on 28.5.2016.
 */
@Service("assetService")
public class AssetServiceImpl implements IAssetService
{
    private AssetDAOImpl assetDao;

    @Autowired
    public void setAssetDao(AssetDAOImpl assetDao)
    {
        this.assetDao = assetDao;
    }

    @Override
    public List<AssetPojo> getCurrent()
    {
        return assetDao.getAssets();
    }

    @Override
    public boolean insert(AssetPojo assetItem)
    {
        return assetDao.insert(assetItem);
    }
}
