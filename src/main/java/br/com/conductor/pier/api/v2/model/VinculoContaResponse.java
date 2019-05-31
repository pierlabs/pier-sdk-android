package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Descri\u00E7\u00E3o do objeto de resposta do recurso para v\u00EDnculo entre contas
 **/
@ApiModel(description = "Descri\u00E7\u00E3o do objeto de resposta do recurso para v\u00EDnculo entre contas")
public class VinculoContaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idContaPai")
  private Long idContaPai = null;
  @SerializedName("idTipoVinculo")
  private Long idTipoVinculo = null;

  
  /**
   * C\u00F3digo identificador do v\u00EDnculo de contas (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do v\u00EDnculo de contas (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
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
   * Id da conta pai
   **/
  @ApiModelProperty(value = "Id da conta pai")
  public Long getIdContaPai() {
    return idContaPai;
  }
  public void setIdContaPai(Long idContaPai) {
    this.idContaPai = idContaPai;
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
    sb.append("class VinculoContaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idContaPai: ").append(idContaPai).append("\n");
    sb.append("  idTipoVinculo: ").append(idTipoVinculo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
