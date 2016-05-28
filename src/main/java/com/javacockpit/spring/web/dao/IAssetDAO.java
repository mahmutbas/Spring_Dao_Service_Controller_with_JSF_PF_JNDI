package com.javacockpit.spring.web.dao;


import com.javacockpit.spring.web.bean.*;
import java.util.List;

/**
 * Created by TCMBAS on 25.5.2016.
 */
public interface IAssetDAO
{
    public List<AssetPojo> getAssets();
    public AssetPojo getAsset(String assetnum);
    public  boolean delete(String assetnum);
    public  boolean insert(AssetPojo assetItem);
    public  boolean update(AssetPojo assetItem);
    public int[] insert(List<AssetPojo> assetItems);

}
