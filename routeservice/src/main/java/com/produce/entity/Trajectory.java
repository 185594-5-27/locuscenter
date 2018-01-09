package com.produce.entity;

/*
* 类描述：轨迹实体类
* @auther linzf
* @create 2018/1/9 0009 
*/
public class Trajectory {

       // 车牌号
       private String plateNo;

       // 区编码
       private String regionCode;

       // 位置信息
       private String positionInfo;

       // 经度
       private String longitude;

       // 纬度
       private String latitude;

       // 车速
       private String speed;

       // 上传时间
       private String uploadDate;


       public String getPlateNo() {
              return plateNo;
       }

       public void setPlateNo(String plateNo) {
              this.plateNo = plateNo;
       }

       public String getRegionCode() {
              return regionCode;
       }

       public void setRegionCode(String regionCode) {
              this.regionCode = regionCode;
       }

       public String getPositionInfo() {
              return positionInfo;
       }

       public void setPositionInfo(String positionInfo) {
              this.positionInfo = positionInfo;
       }

       public String getLongitude() {
              return longitude;
       }

       public void setLongitude(String longitude) {
              this.longitude = longitude;
       }

       public String getLatitude() {
              return latitude;
       }

       public void setLatitude(String latitude) {
              this.latitude = latitude;
       }

       public String getSpeed() {
              return speed;
       }

       public void setSpeed(String speed) {
              this.speed = speed;
       }

       public String getUploadDate() {
              return uploadDate;
       }

       public void setUploadDate(String uploadDate) {
              this.uploadDate = uploadDate;
       }
}
