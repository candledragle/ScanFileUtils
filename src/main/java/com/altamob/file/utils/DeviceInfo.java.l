package com.altamob.file.utils;

import java.io.Serializable;

public class DeviceInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	private String userAgent;
	private String androidId;
	private String androidAdid;
	private String imei;
	private String imsi;
	private String mac;
	private int mcc;
	private int mnc;
	private int osVersion; // 数字版本号
	private String osVersionName;
	private String kernelVersion;
	private int apkVersion;
	private String apkVersionName;
	private int otaVersion;
	private int screenWidth;
	private int screenHeight;
	private String screenSize;
	private String memoryTotal; //所有可用内存
	private String productBrand; // 手机品牌
	private String productName; // 手机正式(官方)名称
	private String productModel; // 手机代号，手机名
	private String fingerPrint; // 机身码
	private String buildDate; // 制作者及时间
	private String serialNumber; // 唯一标识号
	private int sdkInit;
	private String deviceType;
	private String manufacturer;
	private String cpuabi;
	private String buildName;
	private String display_id;
	private String abi;
	private String abi2;
	private String arch;
	private double latitude;
	private double longitude;
	private long timestap;
	private String operator;
	private String lanDisplay;
	private String device_Type;
	private String screenFormat;
	private String screenDensity;
	private String deviceCarrier;
	private String countryCode;
	private String simCode;
	private Object art;
	private Object meids;
	private Object imeis;
	private String ip;
	private Object carrier;
	private String net_Work;

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	private String device;

	@Override
	public String toString() {
		return  CommonUtils.dc("Wa/zq-1BktYKy8=="/*userAgent:*/) + userAgent + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("rtY-q7AjkSz-y8=="/*androidId:*/) + androidId + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("rtY-q7AjkS1-otl2"/*androidAdid:*/) + androidAdid + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("otmzoNQ="/*imei:*/) + imei + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("otmioNQ="/*imsi:*/) + imsi + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("Ht1Cy8=="/*mac:*/) + mac + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("Ht/Cy8=="/*mcc:*/) + mcc + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("HtYCy8=="/*mnc:*/) + mnc + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("Hf/tkaFiotAEy8=="/*osVersion:*/) + osVersion + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("Hf/tkaFiotAEN71wkNQ="/*osVersionName:*/) + osVersionName + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("oM3gH73O373gqMzPHCQ="/*kernelVersion:*/) + kernelVersion + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("rauh373gqMzPHCQ="/*apkVersion:*/) + apkVersion + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("rauh373gqMzPH-YJHte2"/*apkVersionName:*/) + apkVersionName + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("HfbJ373gqMzPHCQ="/*otaVersion:*/) + otaVersion + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("qM/gkt3E3Mz-WU82"/*screenWidth:*/) + screenWidth + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("qM/gkt3EnU3jkMJKy8=="/*screenHeight:*/) + screenHeight + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("qM/gkt3EeMz2kNQ="/*screenSize:*/) + screenSize + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("Ht3wHfFY3UAKrtI2"/*memoryTotal:*/) + memoryTotal + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("q9FPk93CWSFgrtY-y8=="/*productBrand:*/) + productBrand + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("q9FPk93CWSYJHte2"/*productName:*/) + productName + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("q9FPk93CWSmPkU3Oy8=="/*productModel:*/) + productModel + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("k7zEkM3ge9FjHBl2"/*fingerPrint:*/) + fingerPrint + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("rB3jHUbSrabzy8=="/*buildDate:*/) + buildDate + CommonUtils.dc("aUG="/*\n*/) +
				CommonUtils.dc("qM3got1ONB3wr73gy8=="/*serialNumber:*/) + serialNumber + CommonUtils.dc("aUG="/*\n*/);
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getAndroidId() {
		return androidId;
	}

	public void setAndroidId(String androidId) {
		this.androidId = androidId;
	}

	public String getAndroidAdid() {
		return androidAdid;
	}

	public void setAndroidAdid(String androidAdid) {
		this.androidAdid = androidAdid;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getImsi() {
		return imsi;
	}

	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public int getMcc() {
		return mcc;
	}

	public void setMcc(int mcc) {
		this.mcc = mcc;
	}

	public int getMnc() {
		return mnc;
	}

	public void setMnc(int mnc) {
		this.mnc = mnc;
	}

	public int getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(int osVersion) {
		this.osVersion = osVersion;
	}

	public String getOsVersionName() {
		return osVersionName;
	}

	public void setOsVersionName(String osVersionName) {
		this.osVersionName = osVersionName;
	}

	public String getKernelVersion() {
		return kernelVersion;
	}

	public void setKernelVersion(String kernelVersion) {
		this.kernelVersion = kernelVersion;
	}

	public int getApkVersion() {
		return apkVersion;
	}

	public void setApkVersion(int apkVersion) {
		this.apkVersion = apkVersion;
	}

	public String getApkVersionName() {
		return apkVersionName;
	}

	public void setApkVersionName(String apkVersionName) {
		this.apkVersionName = apkVersionName;
	}

	public int getOtaVersion() {
		return otaVersion;
	}

	public void setOtaVersion(int otaVersion) {
		this.otaVersion = otaVersion;
	}

	public int getScreenWidth() {
		return screenWidth;
	}

	public void setScreenWidth(int screenWidth) {
		this.screenWidth = screenWidth;
	}

	public int getScreenHeight() {
		return screenHeight;
	}

	public void setScreenHeight(int screenHeight) {
		this.screenHeight = screenHeight;
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getMemoryTotal() {
		return memoryTotal;
	}

	public void setMemoryTotal(String memoryTotal) {
		this.memoryTotal = memoryTotal;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public String getFingerPrint() {
		return fingerPrint;
	}

	public void setFingerPrint(String fingerPrint) {
		this.fingerPrint = fingerPrint;
	}

	public String getBuildDate() {
		return buildDate;
	}

	public void setBuildDate(String buildDate) {
		this.buildDate = buildDate;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public void setSdkInit(int sdkInit) {
		this.sdkInit = sdkInit;
	}

	public int getSdkInit() {
		return sdkInit;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setCpuabi(String cpuabi) {
		this.cpuabi = cpuabi;
	}

	public String getCpuabi() {
		return cpuabi;
	}

	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}

	public String getBuildName() {
		return buildName;
	}

	public void setDisplay_id(String display_id) {
		this.display_id = display_id;
	}

	public String getDisplay_id() {
		return display_id;
	}

	public void setAbi(String abi) {
		this.abi = abi;
	}

	public String getAbi() {
		return abi;
	}

	public void setAbi2(String abi2) {
		this.abi2 = abi2;
	}

	public String getAbi2() {
		return abi2;
	}

	public void setArch(String arch) {
		this.arch = arch;
	}

	public String getArch() {
		return arch;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setTimestap(long timestap) {
		this.timestap = timestap;
	}

	public long getTimestap() {
		return timestap;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperator() {
		return operator;
	}

	public void setLanDisplay(String lanDisplay) {
		this.lanDisplay = lanDisplay;
	}

	public String getLanDisplay() {
		return lanDisplay;
	}

	public void setDevice_Type(String device_Type) {
		this.device_Type = device_Type;
	}

	public String getDevice_Type() {
		return device_Type;
	}

	public void setScreenFormat(String screenFormat) {
		this.screenFormat = screenFormat;
	}

	public String getScreenFormat() {
		return screenFormat;
	}

	public void setScreenDensity(String screenDensity) {
		this.screenDensity = screenDensity;
	}

	public String getScreenDensity() {
		return screenDensity;
	}

	public void setDeviceCarrier(String deviceCarrier) {
		this.deviceCarrier = deviceCarrier;
	}

	public String getDeviceCarrier() {
		return deviceCarrier;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setSimCode(String simCode) {
		this.simCode = simCode;
	}

	public String getSimCode() {
		return simCode;
	}

	public void setArt(Object art) {
		this.art = art;
	}

	public Object getArt() {
		return art;
	}

	public void setMeids(Object meids) {
		this.meids = meids;
	}

	public Object getMeids() {
		return meids;
	}

	public void setImeis(Object imeis) {
		this.imeis = imeis;
	}

	public Object getImeis() {
		return imeis;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getIp() {
		return ip;
	}

	public void setCarrier(Object carrier) {
		this.carrier = carrier;
	}

	public Object getCarrier() {
		return carrier;
	}

	public void setNet_Work(String net_Work) {
		this.net_Work = net_Work;
	}

	public String getNet_Work() {
		return net_Work;
	}
}
