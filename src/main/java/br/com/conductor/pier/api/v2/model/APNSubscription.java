package br.com.conductor.pier.api.v2.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Represents a new subscription
 **/
@ApiModel(description = "Represents a new subscription")
public class APNSubscription  {
  
  @SerializedName("deviceToken")
  private String deviceToken = null;
  @SerializedName("idAplicacaoMobile")
  private Long idAplicacaoMobile = null;
  @SerializedName("idCartoes")
  private List<Long> idCartoes = null;

  
  /**
   * The device token
   **/
  @ApiModelProperty(value = "The device token")
  public String getDeviceToken() {
    return deviceToken;
  }
  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  
  /**
   * The mobile application id
   **/
  @ApiModelProperty(value = "The mobile application id")
  public Long getIdAplicacaoMobile() {
    return idAplicacaoMobile;
  }
  public void setIdAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
  }

  
  /**
   * List of card ids
   **/
  @ApiModelProperty(value = "List of card ids")
  public List<Long> getIdCartoes() {
    return idCartoes;
  }
  public void setIdCartoes(List<Long> idCartoes) {
    this.idCartoes = idCartoes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class APNSubscription {\n");
    
    sb.append("  deviceToken: ").append(deviceToken).append("\n");
    sb.append("  idAplicacaoMobile: ").append(idAplicacaoMobile).append("\n");
    sb.append("  idCartoes: ").append(idCartoes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
