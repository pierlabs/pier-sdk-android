package br.com.conductor.caas.api.v1.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class DesbloquearCartaoResponse  {
  
  @SerializedName("codigoRetorno")
  private Integer codigoRetorno = null;
  @SerializedName("descricaoRetorno")
  private String descricaoRetorno = null;

  
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
  public String getDescricaoRetorno() {
    return descricaoRetorno;
  }
  public void setDescricaoRetorno(String descricaoRetorno) {
    this.descricaoRetorno = descricaoRetorno;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DesbloquearCartaoResponse {\n");
    
    sb.append("  codigoRetorno: ").append(codigoRetorno).append("\n");
    sb.append("  descricaoRetorno: ").append(descricaoRetorno).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


