package com.javacockpit.spring.web.bean;

import org.springframework.stereotype.Component;

/**
 * Created by TCMBAS on 25.5.2016.
 */
@Component
public class AssetPojo
{
    private String Assetnum;
    private String Itemnum;
    private String Description;
    private String Location;

    public AssetPojo()
    {
    }

    public AssetPojo(String assetnum, String itemnum, String description, String location)
    {
        Assetnum = assetnum;
        Itemnum = itemnum;
        Description = description;
        Location = location;
    }

    public String getAssetnum()
    {
        return Assetnum;
    }

    public void setAssetnum(String assetnum)
    {
        Assetnum = assetnum;
    }

    public String getItemnum()
    {
        return Itemnum;
    }

    public void setItemnum(String itemnum)
    {
        Itemnum = itemnum;
    }

    public String getDescription()
    {
        return Description;
    }

    public void setDescription(String description)
    {
        Description = description;
    }

    public String getLocation()
    {
        return Location;
    }

    public void setLocation(String location)
    {
        Location = location;
    }

    @Override
    public String toString()
    {
        return "AssetPojo{" +
                "Assetnum='" + Assetnum + '\'' +
                ", Itemnum='" + Itemnum + '\'' +
                ", Description='" + Description + '\'' +
                ", Location='" + Location + '\'' +
                '}';
    }
}
