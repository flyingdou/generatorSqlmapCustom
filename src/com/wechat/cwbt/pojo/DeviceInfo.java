package com.wechat.cwbt.pojo;

import java.util.Date;

public class DeviceInfo {
    private Integer id;

    private String name;

    private String specificationModel;

    private String code;

    private String primaryCode;

    private String manufacturer;

    private Date productionDate;

    private Date useDate;

    private Double deviceWorth;

    private String drawingNumber;

    private String designUnit;

    private String usePosition;

    private String mainTechnicalParameters;

    private Integer professionalAttribute;

    private Integer specialAttribute;

    private String belongShip;

    private Integer isDel;

    private Date autoDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSpecificationModel() {
        return specificationModel;
    }

    public void setSpecificationModel(String specificationModel) {
        this.specificationModel = specificationModel == null ? null : specificationModel.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPrimaryCode() {
        return primaryCode;
    }

    public void setPrimaryCode(String primaryCode) {
        this.primaryCode = primaryCode == null ? null : primaryCode.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Date getUseDate() {
        return useDate;
    }

    public void setUseDate(Date useDate) {
        this.useDate = useDate;
    }

    public Double getDeviceWorth() {
        return deviceWorth;
    }

    public void setDeviceWorth(Double deviceWorth) {
        this.deviceWorth = deviceWorth;
    }

    public String getDrawingNumber() {
        return drawingNumber;
    }

    public void setDrawingNumber(String drawingNumber) {
        this.drawingNumber = drawingNumber == null ? null : drawingNumber.trim();
    }

    public String getDesignUnit() {
        return designUnit;
    }

    public void setDesignUnit(String designUnit) {
        this.designUnit = designUnit == null ? null : designUnit.trim();
    }

    public String getUsePosition() {
        return usePosition;
    }

    public void setUsePosition(String usePosition) {
        this.usePosition = usePosition == null ? null : usePosition.trim();
    }

    public String getMainTechnicalParameters() {
        return mainTechnicalParameters;
    }

    public void setMainTechnicalParameters(String mainTechnicalParameters) {
        this.mainTechnicalParameters = mainTechnicalParameters == null ? null : mainTechnicalParameters.trim();
    }

    public Integer getProfessionalAttribute() {
        return professionalAttribute;
    }

    public void setProfessionalAttribute(Integer professionalAttribute) {
        this.professionalAttribute = professionalAttribute;
    }

    public Integer getSpecialAttribute() {
        return specialAttribute;
    }

    public void setSpecialAttribute(Integer specialAttribute) {
        this.specialAttribute = specialAttribute;
    }

    public String getBelongShip() {
        return belongShip;
    }

    public void setBelongShip(String belongShip) {
        this.belongShip = belongShip == null ? null : belongShip.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getAutoDate() {
        return autoDate;
    }

    public void setAutoDate(Date autoDate) {
        this.autoDate = autoDate;
    }
}