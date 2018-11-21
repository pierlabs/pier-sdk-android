package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{integracao_emissor_proposta_persist_descricao}}}
 **/
@ApiModel(description = "{{{integracao_emissor_proposta_persist_descricao}}}")
public class IntegracaoEmissorPropostaPersist  {
  
  @SerializedName("observacao")
  private String observacao = null;
  @SerializedName("idProposta")
  private Long idProposta = null;

  
  /**
   * {{{integracao_emissor_proposta_persist_observacao}}}
   **/
  @ApiModelProperty(value = "{{{integracao_emissor_proposta_persist_observacao}}}")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * {{{integracao_emissor_proposta_persist_id_proposta}}}
   **/
  @ApiModelProperty(value = "{{{integracao_emissor_proposta_persist_id_proposta}}}")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegracaoEmissorPropostaPersist {\n");
    
    sb.append("  observacao: ").append(observacao).append("\n");
    sb.append("  idProposta: ").append(idProposta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
