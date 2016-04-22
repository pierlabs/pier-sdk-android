package br.com.conductor.caas.api.v1.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class CancelarCartaoResponse  {
  
  @SerializedName("codigoRetorno")
  private Integer codigoRetorno = null;
  @SerializedName("descricaoRetorno")
  private String descricaoRetorno = null;
  @SerializedName("idCartao")
  private Integer idCartao = null;
  @SerializedName("idConta")
  private Integer idConta = null;

  
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

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Integer idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdConta() {
    return idConta;
  }
  public void setIdConta(Integer idConta) {
    this.idConta = idConta;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelarCartaoResponse {\n");
    
    sb.append("  codigoRetorno: ").append(codigoRetorno).append("\n");
    sb.append("  descricaoRetorno: ").append(descricaoRetorno).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


