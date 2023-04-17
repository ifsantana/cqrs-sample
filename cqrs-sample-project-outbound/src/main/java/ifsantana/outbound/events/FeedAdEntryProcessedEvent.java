package ifsantana.outbound.events;

public class FeedAdEntryProcessedEvent {
  public AdModelDto adModel;

  public FeedAdEntryProcessedEvent() {
  }

  public FeedAdEntryProcessedEvent(AdModelDto adModel) {
    this.adModel = adModel;
  }

  public AdModelDto getAdModel() {
    return adModel;
  }

  public void setAdModel(AdModelDto adModel) {
    this.adModel = adModel;
  }

  public static class AdModelDto {
    private String marketingConsent;
    private String mobilePhone;
    private String email;
    private AddressDto primaryAddress;

    public AdModelDto() {
    }

    public AdModelDto(String marketingConsent, String mobilePhone, String email,
        AddressDto primaryAddress) {
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

    public AddressDto getPrimaryAddress() {
      return primaryAddress;
    }

    public void setPrimaryAddress(
        AddressDto primaryAddress) {
      this.primaryAddress = primaryAddress;
    }

    public static class AddressDto {
      private String buildingNumber;
      private String line1;
      private String line2;
      private String line3;
      private String postcode;

      public AddressDto() {
      }

      public AddressDto(String buildingNumber, String line1, String line2, String line3,
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
