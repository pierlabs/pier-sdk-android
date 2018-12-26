package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Resposta do recurso de inclus\u00E3o de registro da proposta para integra\u00E7\u00E3o
 **/
@ApiModel(description = "Resposta do recurso de inclus\u00E3o de registro da proposta para integra\u00E7\u00E3o")
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
   * C\u00F3digo de identifica\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Status do registro
   **/
  @ApiModelProperty(value = "Status do registro")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Observa\u00E7\u00E3o do registro
   **/
  @ApiModelProperty(value = "Observa\u00E7\u00E3o do registro")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * Flag selecionado
   **/
  @ApiModelProperty(value = "Flag selecionado")
  public Boolean getFlagSelecionado() {
    return flagSelecionado;
  }
  public void setFlagSelecionado(Boolean flagSelecionado) {
    this.flagSelecionado = flagSelecionado;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da proposta externa
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da proposta externa")
  public Long getIdPropostaExterna() {
    return idPropostaExterna;
  }
  public void setIdPropostaExterna(Long idPropostaExterna) {
    this.idPropostaExterna = idPropostaExterna;
  }

  
  /**
   * Data do evento
   **/
  @ApiModelProperty(value = "Data do evento")
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
