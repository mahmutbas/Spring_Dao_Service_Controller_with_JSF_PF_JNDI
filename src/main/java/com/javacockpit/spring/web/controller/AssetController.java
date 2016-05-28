package com.javacockpit.spring.web.controller;

import com.javacockpit.spring.web.bean.AssetPojo;
import com.javacockpit.spring.web.service.AssetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;

/**
 * Created by TCMBAS on 28.5.2016.
 */
@Controller
@ManagedBean(name = "assetController")
@RequestScoped
public class AssetController implements Serializable
{

    private AssetServiceImpl assetService;

    private AssetPojo assetItem;

    @Autowired
    public void setAssetService(AssetServiceImpl assetService)
    {
        this.assetService = assetService;
    }

    public AssetServiceImpl getAssetService()
    {
        return assetService;
    }

    public void addAssetItem()
    {
       if(assetService.insert(assetItem))
        addMessage("Your informations saved to Grid.");
    }

    public void addMessage(String summary)
    {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public AssetPojo getAssetItem()
    {
        return assetItem;
    }

    @Autowired
    public void setAssetItem(AssetPojo assetItem)
    {
        this.assetItem = assetItem;
    }


}
