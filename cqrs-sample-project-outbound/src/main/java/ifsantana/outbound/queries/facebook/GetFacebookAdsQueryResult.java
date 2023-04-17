package ifsantana.outbound.queries.facebook;

import java.util.List;

public class GetFacebookAdsQueryResult {

  public List<FacebookPropertyDto> data;

  public GetFacebookAdsQueryResult() {
  }

  public GetFacebookAdsQueryResult(List<FacebookPropertyDto> data) {
    this.data = data;
  }

  public List<FacebookPropertyDto> getData() {
    return data;
  }

  public void setData(
      List<FacebookPropertyDto> data) {
    this.data = data;
  }

  public static class FacebookPropertyDto {
    private String marketingConsent;
    private String mobilePhone;
    private String email;
    private FacebookAddressDto primaryAddress;

    public FacebookPropertyDto() {
    }

    public FacebookPropertyDto(String marketingConsent, String mobilePhone, String email,
        FacebookAddressDto primaryAddress) {
      this.marketingConsent = marketingConsent;
      this.mobilePhone = mobilePhone;
      this.email = email;
      this.primaryAddress = primaryAddress;
    }

    public String getMarketingConsent() {
      return marketingConsent;
    }

    public void setMarketingConsent(String marketingConsent) {
      this.marketingConsent = marketingConsent;
    }

    public String getMobilePhone() {
      return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
      this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public FacebookAddressDto getPrimaryAddress() {
      return primaryAddress;
    }

    public void setPrimaryAddress(
        FacebookAddressDto primaryAddress) {
      this.primaryAddress = primaryAddress;
    }

    public static class FacebookAddressDto {
      private String buildingNumber;
      private String line1;
      private String line2;
      private String line3;
      private String postcode;

      public FacebookAddressDto() {
      }

      public FacebookAddressDto(String buildingNumber, String line1, String line2, String line3,
          String postcode) {
        this.buildingNumber = buildingNumber;
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.postcode = postcode;
      }

      public String getBuildingNumber() {
        return buildingNumber;
      }

      public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
      }

      public String getLine1() {
        return line1;
      }

      public void setLine1(String line1) {
        this.line1 = line1;
      }

      public String getLine2() {
        return line2;
      }

      public void setLine2(String line2) {
        this.line2 = line2;
      }

      public String getLine3() {
        return line3;
      }

      public void setLine3(String line3) {
        this.line3 = line3;
      }

      public String getPostcode() {
        return postcode;
      }

      public void setPostcode(String postcode) {
        this.postcode = postcode;
      }
    }
  }
}
