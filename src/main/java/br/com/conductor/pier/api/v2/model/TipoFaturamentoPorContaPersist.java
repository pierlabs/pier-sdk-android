package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * TipoFaturamentoPorContaPersist
 **/
@ApiModel(description = "TipoFaturamentoPorContaPersist")
public class TipoFaturamentoPorContaPersist  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTipoFaturamento")
  private Long idTipoFaturamento = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta relacionada
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o da conta relacionada")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento relacionada
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento relacionada")
  public Long getIdTipoFaturamento() {
    return idTipoFaturamento;
  }
  public void setIdTipoFaturamento(Long idTipoFaturamento) {
    this.idTipoFaturamento = idTipoFaturamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoFaturamentoPorContaPersist {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoFaturamento: ").append(idTipoFaturamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
