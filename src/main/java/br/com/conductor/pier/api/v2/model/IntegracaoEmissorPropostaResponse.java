package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{integracao_emissor_proposta_resposta_descricao}}}
 **/
@ApiModel(description = "{{{integracao_emissor_proposta_resposta_descricao}}}")
public class IntegracaoEmissorPropostaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("observacao")
  private String observacao = null;
  @SerializedName("flagSelecionado")
  private Boolean flagSelecionado = null;
  @SerializedName("idPropostaExterna")
  private Long idPropostaExterna = null;
  @SerializedName("dataEvento")
  private String dataEvento = null;

  
  /**
   * {{{integracao_emissor_proposta_resposta_id}}}
   **/
  @ApiModelProperty(value = "{{{integracao_emissor_proposta_resposta_id}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{integracao_emissor_proposta_resposta_id_conta}}}
   **/
  @ApiModelProperty(value = "{{{integracao_emissor_proposta_resposta_id_conta}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{integracao_emissor_proposta_resposta_status}}}
   **/
  @ApiModelProperty(value = "{{{integracao_emissor_proposta_resposta_status}}}")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * {{{integracao_emissor_proposta_resposta_observacao}}}
   **/
  @ApiModelProperty(value = "{{{integracao_emissor_proposta_resposta_observacao}}}")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * {{{integracao_emissor_proposta_resposta_flag_selecionado}}}
   **/
  @ApiModelProperty(value = "{{{integracao_emissor_proposta_resposta_flag_selecionado}}}")
  public Boolean getFlagSelecionado() {
    return flagSelecionado;
  }
  public void setFlagSelecionado(Boolean flagSelecionado) {
    this.flagSelecionado = flagSelecionado;
  }

  
  /**
   * {{{integracao_emissor_proposta_resposta_id_proposta_externa}}}
   **/
  @ApiModelProperty(value = "{{{integracao_emissor_proposta_resposta_id_proposta_externa}}}")
  public Long getIdPropostaExterna() {
    return idPropostaExterna;
  }
  public void setIdPropostaExterna(Long idPropostaExterna) {
    this.idPropostaExterna = idPropostaExterna;
  }

  
  /**
   * {{{integracao_emissor_proposta_resposta_data_evento}}}
   **/
  @ApiModelProperty(value = "{{{integracao_emissor_proposta_resposta_data_evento}}}")
  public String getDataEvento() {
    return dataEvento;
  }
  public void setDataEvento(String dataEvento) {
    this.dataEvento = dataEvento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegracaoEmissorPropostaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  observacao: ").append(observacao).append("\n");
    sb.append("  flagSelecionado: ").append(flagSelecionado).append("\n");
    sb.append("  idPropostaExterna: ").append(idPropostaExterna).append("\n");
    sb.append("  dataEvento: ").append(dataEvento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
