package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{servico_conta_persist_description}}}
 **/
@ApiModel(description = "{{{servico_conta_persist_description}}}")
public class ServicoContaPersistValue  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTipoServico")
  private Long idTipoServico = null;

  
  /**
   * {{{servico_conta_persist_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{servico_conta_persist_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{servico_conta_persist_id_tipo_servico_value}}}
   **/
  @ApiModelProperty(value = "{{{servico_conta_persist_id_tipo_servico_value}}}")
  public Long getIdTipoServico() {
    return idTipoServico;
  }
  public void setIdTipoServico(Long idTipoServico) {
    this.idTipoServico = idTipoServico;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicoContaPersistValue {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoServico: ").append(idTipoServico).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
