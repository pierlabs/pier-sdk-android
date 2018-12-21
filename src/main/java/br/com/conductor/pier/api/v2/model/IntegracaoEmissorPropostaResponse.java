package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response of the inclusion of the record of the proposal for integration
 **/
@ApiModel(description = "Response of the inclusion of the record of the proposal for integration")
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
   * Identification code
   **/
  @ApiModelProperty(value = "Identification code")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Account ID code
   **/
  @ApiModelProperty(value = "Account ID code")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Registration status
   **/
  @ApiModelProperty(value = "Registration status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Record notice
   **/
  @ApiModelProperty(value = "Record notice")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * Flag selected
   **/
  @ApiModelProperty(value = "Flag selected")
  public Boolean getFlagSelecionado() {
    return flagSelecionado;
  }
  public void setFlagSelecionado(Boolean flagSelecionado) {
    this.flagSelecionado = flagSelecionado;
  }

  
  /**
   * Identification code of the external proposal
   **/
  @ApiModelProperty(value = "Identification code of the external proposal")
  public Long getIdPropostaExterna() {
    return idPropostaExterna;
  }
  public void setIdPropostaExterna(Long idPropostaExterna) {
    this.idPropostaExterna = idPropostaExterna;
  }

  
  /**
   * Date of the event
   **/
  @ApiModelProperty(value = "Date of the event")
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
