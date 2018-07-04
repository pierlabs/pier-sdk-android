package br.com.conductor.pier.api.v2.model;

import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{inscricao_apn_persistencia_descricao}}}
 **/
@ApiModel(description = "{{{inscricao_apn_persistencia_descricao}}}")
public class InscricaoApnPersistencia  {
  
  @SerializedName("deviceToken")
  private String deviceToken = null;
  @SerializedName("idAplicacaoMobile")
  private Long idAplicacaoMobile = null;
  @SerializedName("idCartoes")
  private List<Long> idCartoes = null;

  
  /**
   * {{{inscricao_apn_persistencia_device_token_descricao}}}
   **/
  @ApiModelProperty(value = "{{{inscricao_apn_persistencia_device_token_descricao}}}")
  public String getDeviceToken() {
    return deviceToken;
  }
  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  
  /**
   * {{{inscricao_apn_persistencia_id_aplicacao_mobile_descricao}}}
   **/
  @ApiModelProperty(value = "{{{inscricao_apn_persistencia_id_aplicacao_mobile_descricao}}}")
  public Long getIdAplicacaoMobile() {
    return idAplicacaoMobile;
  }
  public void setIdAplicacaoMobile(Long idAplicacaoMobile) {
    this.idAplicacaoMobile = idAplicacaoMobile;
  }

  
  /**
   * {{{inscricao_apn_persistencia_id_cartoes_descricao}}}
   **/
  @ApiModelProperty(value = "{{{inscricao_apn_persistencia_id_cartoes_descricao}}}")
  public List<Long> getIdCartoes() {
    return idCartoes;
  }
  public void setIdCartoes(List<Long> idCartoes) {
    this.idCartoes = idCartoes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InscricaoApnPersistencia {\n");
    
    sb.append("  deviceToken: ").append(deviceToken).append("\n");
    sb.append("  idAplicacaoMobile: ").append(idAplicacaoMobile).append("\n");
    sb.append("  idCartoes: ").append(idCartoes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


