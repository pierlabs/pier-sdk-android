package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{tipo_faturamento_por_conta_persist_description}}}
 **/
@ApiModel(description = "{{{tipo_faturamento_por_conta_persist_description}}}")
public class TipoFaturamentoPorContaPersistValue  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTipoFaturamento")
  private Long idTipoFaturamento = null;

  
  /**
   * {{{tipo_faturamento_por_conta_persist_id_conta_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_faturamento_por_conta_persist_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{tipo_faturamento_por_conta_persist_id_tipo_faturamento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_faturamento_por_conta_persist_id_tipo_faturamento_value}}}")
  public Long getIdTipoFaturamento() {
    return idTipoFaturamento;
  }
  public void setIdTipoFaturamento(Long idTipoFaturamento) {
    this.idTipoFaturamento = idTipoFaturamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoFaturamentoPorContaPersistValue {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoFaturamento: ").append(idTipoFaturamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
