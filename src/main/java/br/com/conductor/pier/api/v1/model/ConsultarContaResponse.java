package br.com.conductor.pier.api.v1.model;

import br.com.conductor.pier.api.v1.model.ContaCartaoResponse;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ConsultarContaResponse  {
  
  @SerializedName("codRetorno")
  private Integer codRetorno = null;
  @SerializedName("codigoRetorno")
  private Integer codigoRetorno = null;
  @SerializedName("contas")
  private List<ContaCartaoResponse> contas = null;
  @SerializedName("descricaoRetorno")
  private String descricaoRetorno = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCodRetorno() {
    return codRetorno;
  }
  public void setCodRetorno(Integer codRetorno) {
    this.codRetorno = codRetorno;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCodigoRetorno() {
    return codigoRetorno;
  }
  public void setCodigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<ContaCartaoResponse> getContas() {
    return contas;
  }
  public void setContas(List<ContaCartaoResponse> contas) {
    this.contas = contas;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricaoRetorno() {
    return descricaoRetorno;
  }
  public void setDescricaoRetorno(String descricaoRetorno) {
    this.descricaoRetorno = descricaoRetorno;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultarContaResponse {\n");
    
    sb.append("  codRetorno: ").append(codRetorno).append("\n");
    sb.append("  codigoRetorno: ").append(codigoRetorno).append("\n");
    sb.append("  contas: ").append(contas).append("\n");
    sb.append("  descricaoRetorno: ").append(descricaoRetorno).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


