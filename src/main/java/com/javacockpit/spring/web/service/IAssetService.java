package com.javacockpit.spring.web.service;

import com.javacockpit.spring.web.bean.AssetPojo;

import java.util.List;

/**
 * Created by TCMBAS on 28.5.2016.
 */
public interface IAssetService
{
    public List<AssetPojo> getCurrent();
    public  boolean insert(AssetPojo assetItem);
}
