package org.eis.frontend.model;

import ch.qos.logback.classic.pattern.Abbreviator;
import jakarta.persistence.*;

@Table(name = "enterprise")
@Entity
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "RegisteredAddress")
    private String registeredAddress;

    @Column(name = "Type")
    private String type;

    @Column(name = "Date")
    private String date;

    @Column(name = "Year")
    private String year;

    @Column(name = "Province")
    private String province;

    @Column(name = "City")
    private String city;

    @Column(name = "District")
    private String district;

    @Column(name = "Industry")
    private String industry;

    @Column(name = "InsuredDivision")
    private String insuredDivision;

    @Column(name = "RegisteredCaptital")
    private String registeredCapital;

    @Column(name = "CaptitalDivision")
    private String captitalDivision;

    @Column(name = "Status")
    private String status;

    @Column(name = "FormerName")
    private String formerName;

    @Column(name = "CommunicationAddress")
    private String communicationAddress;

    @Column(name = "TaxpayerID")
    private String taxpayerID;

    @Column(name = "RegisterationID")
    private String registerationID;

    @Column(name = "OrganizationID")
    private String organizationID;

    @Column(name = "Introduction")
    private String introduction;

    @Column(name = "BusinessScope")
    private String businessScope;

    @Column(name = "ListedorNot")
    private String listedOrNot;

    @Column(name = "ListingType")
    private String listingType;

    @Column(name = "Abbreviation")
    private String abbreviation;

    @Column(name = "StockCode")
    private String stockCode;

    @Column(name = "Products")
    private String products;

    // 无参构造函数（JPA要求）
    public Enterprise() {
    }

    // 全参构造函数
    public Enterprise(Long id, String name, String registeredAddress, String type, String date, String year, String province,
                      String city, String district, String industry, String insuredDivision, String registeredCapital,
                      String captitalDivision, String status, String formerName, String communicationAddress, String taxpayerID,
                      String registerationID, String organizationID, String introduction, String businessScope, String listedOrNot,
                      String listingType, String abbreviation, String stockCode, String products) {
        this.id = id;
        this.name = name;
        this.registeredAddress = registeredAddress;
        this.type = type;
        this.date = date;
        this.year = year;
        this.province = province;
        this.city = city;
        this.district = district;
        this.industry = industry;
        this.insuredDivision = insuredDivision;
        this.registeredCapital = registeredCapital;
        this.captitalDivision = captitalDivision;
        this.status = status;
        this.formerName = formerName;
        this.communicationAddress = communicationAddress;
        this.taxpayerID = taxpayerID;
        this.registerationID = registerationID;
        this.organizationID = organizationID;
        this.introduction = introduction;
        this.businessScope = businessScope;
        this.listedOrNot = listedOrNot;
        this.listingType = listingType;
        this.abbreviation = abbreviation;
        this.stockCode = stockCode;
        this.products = products;
    }

    // Getters 和 Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getInsuredDivision() {
        return insuredDivision;
    }

    public void setInsuredDivision(String insuredDivision) {
        this.insuredDivision = insuredDivision;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getCaptitalDivision() {
        return captitalDivision;
    }

    public void setCaptitalDivision(String captitalDivision) {
        this.captitalDivision = captitalDivision;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFormerName() {
        return formerName;
    }

    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }

    public String getCommunicationAddress() {
        return communicationAddress;
    }

    public void setCommunicationAddress(String communicationAddress) {
        this.communicationAddress = communicationAddress;
    }

    public String getTaxpayerID() {
        return taxpayerID;
    }

    public void setTaxpayerID(String taxpayerID) {
        this.taxpayerID = taxpayerID;
    }

    public String getRegisterationID() {
        return registerationID;
    }

    public void setRegisterationID(String registerationID) {
        this.registerationID = registerationID;
    }

    public String getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(String organizationID) {
        this.organizationID = organizationID;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public String getListedOrNot() {
        return listedOrNot;
    }

    public void setListedOrNot(String listedOrNot) {
        this.listedOrNot = listedOrNot;
    }

    public String getListingType() {
        return listingType;
    }

    public void setListingType(String listingType) {
        this.listingType = listingType;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }
}

