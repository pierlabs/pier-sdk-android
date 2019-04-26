package br.com.conductor.pier.api.v2.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de persist\u00EAncia para novas incri\u00E7\u00F5es
 **/
@ApiModel(description = "Objeto de persist\u00EAncia para novas incri\u00E7\u00F5es")
public class InscricaoAPN  {
  
  @SerializedName("deviceToken")
  private String deviceToken = null;
  @SerializedName("idAplicacaoMobile")
  private Long idAplicacaoMobile = null;
  @SerializedName("idCartoes")
  private List<Long> idCartoes = null;

  
  /**
   * Token do dispositivo
   **/
  @ApiModelProperty(value = "Token do dispositivo")
  public String getDeviceToken() {
    return deviceToken;
  }
  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  
  /**
   * Id da aplica\u00E7\u00E3o mobile
   **/
  @ApiModelProperty(value = "Id da aplica\u00E7\u00E3o mobile")
  public Long getIdAplicacaoMobile() {
    return idAplicacaoMobile;
  }
  public void setIdAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
  }

  
  /**
   * Lista de ids dos cart\u00F5es
   **/
  @ApiModelProperty(value = "Lista de ids dos cart\u00F5es")
  public List<Long> getIdCartoes() {
    return idCartoes;
  }
  public void setIdCartoes(List<Long> idCartoes) {
    this.idCartoes = idCartoes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InscricaoAPN {\n");
    
    sb.append("  deviceToken: ").append(deviceToken).append("\n");
    sb.append("  idAplicacaoMobile: ").append(idAplicacaoMobile).append("\n");
    sb.append("  idCartoes: ").append(idCartoes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
