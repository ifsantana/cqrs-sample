package ifsantana.inbound.commands.reapit;

public class ReapitEventDto {
  private String eventId;
  private String entityId;
  private String customerId;
  private String topicId;
  private ReapitPropertyChangeDto old;

  public ReapitEventDto() {
  }

  public ReapitEventDto(String eventId, String entityId, String customerId, String topicId,
      ReapitPropertyChangeDto old) {
    this.eventId = eventId;
    this.entityId = entityId;
    this.customerId = customerId;
    this.topicId = topicId;
    this.old = old;
  }

  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public String getTopicId() {
    return topicId;
  }

  public void setTopicId(String topicId) {
    this.topicId = topicId;
  }

  public ReapitPropertyChangeDto getOld() {
    return old;
  }

  public void setOld(ReapitPropertyChangeDto old) {
    this.old = old;
  }

  public static class ReapitPropertyChangeDto
  {

    public ReapitPropertyChangeDto() {
    }

    public ReapitPropertyChangeDto(String id, Boolean modified, String marketingConsent,
        String mobilePhone, String email, String identityCheck, Boolean active,
        ReapitAddressDto primaryAddress) {
      this.id = id;
      this.modified = modified;
      this.marketingConsent = marketingConsent;
      this.mobilePhone = mobilePhone;
      this.email = email;
      this.identityCheck = identityCheck;
      this.active = active;
      this.primaryAddress = primaryAddress;
    }

    private String id;
    private Boolean modified;
    private String marketingConsent;
    private String mobilePhone;
    private String email;
    private String identityCheck;
    private Boolean active;
    private ReapitAddressDto primaryAddress;


    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public Boolean getModified() {
      return modified;
    }

    public void setModified(Boolean modified) {
      this.modified = modified;
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

    public String getIdentityCheck() {
      return identityCheck;
    }

    public void setIdentityCheck(String identityCheck) {
      this.identityCheck = identityCheck;
    }

    public Boolean getActive() {
      return active;
    }

    public void setActive(Boolean active) {
      this.active = active;
    }

    public ReapitAddressDto getPrimaryAddress() {
      return primaryAddress;
    }

    public void setPrimaryAddress(
        ReapitAddressDto primaryAddress) {
      this.primaryAddress = primaryAddress;
    }

    public static class ReapitAddressDto {
      private String type;
      private String buildingName;
      private String buildingNumber;
      private String line1;
      private String line2;
      private String line3;
      private String line4;
      private String postcode;
      private String countryId;

      public ReapitAddressDto() {
      }

      public ReapitAddressDto(String type, String buildingName, String buildingNumber, String line1,
          String line2, String line3, String line4, String postcode, String countryId) {
        this.type = type;
        this.buildingName = buildingName;
        this.buildingNumber = buildingNumber;
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.line4 = line4;
        this.postcode = postcode;
        this.countryId = countryId;
      }

      public String getType() {
        return type;
      }

      public void setType(String type) {
        this.type = type;
      }

      public String getBuildingName() {
        return buildingName;
      }

      public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
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

      public String getLine4() {
        return line4;
      }

      public void setLine4(String line4) {
        this.line4 = line4;
      }

      public String getPostcode() {
        return postcode;
      }

      public void setPostcode(String postcode) {
        this.postcode = postcode;
      }

      public String getCountryId() {
        return countryId;
      }

      public void setCountryId(String countryId) {
        this.countryId = countryId;
      }
    }
  }
}
