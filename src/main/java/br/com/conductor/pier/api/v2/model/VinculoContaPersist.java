package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto para persist\u00EAncia de v\u00EDnculos entre contas
 **/
@ApiModel(description = "Objeto para persist\u00EAncia de v\u00EDnculos entre contas")
public class VinculoContaPersist  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTipoVinculo")
  private Long idTipoVinculo = null;

  
  /**
   * Id da subconta
   **/
  @ApiModelProperty(value = "Id da subconta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Id do tipo de v\u00EDnculo entre as duas contas
   **/
  @ApiModelProperty(value = "Id do tipo de v\u00EDnculo entre as duas contas")
  public Long getIdTipoVinculo() {
    return idTipoVinculo;
  }
  public void setIdTipoVinculo(Long idTipoVinculo) {
    this.idTipoVinculo = idTipoVinculo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VinculoContaPersist {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoVinculo: ").append(idTipoVinculo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
