package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Response de SMSConta
 **/
@ApiModel(description = "Objeto Response de SMSConta")
public class SMSContaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;
  @SerializedName("dataAtivacao")
  private String dataAtivacao = null;
  @SerializedName("dataCancelamento")
  private String dataCancelamento = null;
  @SerializedName("origem")
  private String origem = null;
  @SerializedName("idSMSTipoServico")
  private Long idSMSTipoServico = null;
  @SerializedName("idLoginAtivacao")
  private Long idLoginAtivacao = null;
  @SerializedName("idLoginCancelamento")
  private Long idLoginCancelamento = null;
  @SerializedName("idPlataformaAtivacao")
  private Long idPlataformaAtivacao = null;
  @SerializedName("idPlataformaCancelamento")
  private Long idPlataformaCancelamento = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do SMSConta
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do SMSConta")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Codigo de identifica\u00E7\u00E3o da conta
   **/
  @ApiModelProperty(value = "Codigo de identifica\u00E7\u00E3o da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Flag de habilitar ou desabilitar SMSConta
   **/
  @ApiModelProperty(value = "Flag de habilitar ou desabilitar SMSConta")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Data de Ativa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data de Ativa\u00E7\u00E3o")
  public String getDataAtivacao() {
    return dataAtivacao;
  }
  public void setDataAtivacao(String dataAtivacao) {
    this.dataAtivacao = dataAtivacao;
  }

  
  /**
   * Data de Cancelamento
   **/
  @ApiModelProperty(value = "Data de Cancelamento")
  public String getDataCancelamento() {
    return dataCancelamento;
  }
  public void setDataCancelamento(String dataCancelamento) {
    this.dataCancelamento = dataCancelamento;
  }

  
  /**
   * Origem da Solicita\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Origem da Solicita\u00E7\u00E3o")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * Codigo de identifica\u00E7\u00E3o do Tipo Servi\u00E7o SMS
   **/
  @ApiModelProperty(value = "Codigo de identifica\u00E7\u00E3o do Tipo Servi\u00E7o SMS")
  public Long getIdSMSTipoServico() {
    return idSMSTipoServico;
  }
  public void setIdSMSTipoServico(Long idSMSTipoServico) {
    this.idSMSTipoServico = idSMSTipoServico;
  }

  
  /**
   * Codigo de identifica\u00E7\u00E3o do login que realizou a ativa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Codigo de identifica\u00E7\u00E3o do login que realizou a ativa\u00E7\u00E3o")
  public Long getIdLoginAtivacao() {
    return idLoginAtivacao;
  }
  public void setIdLoginAtivacao(Long idLoginAtivacao) {
    this.idLoginAtivacao = idLoginAtivacao;
  }

  
  /**
   * Codigo de identifica\u00E7\u00E3o do login que realizou o cancelamento
   **/
  @ApiModelProperty(value = "Codigo de identifica\u00E7\u00E3o do login que realizou o cancelamento")
  public Long getIdLoginCancelamento() {
    return idLoginCancelamento;
  }
  public void setIdLoginCancelamento(Long idLoginCancelamento) {
    this.idLoginCancelamento = idLoginCancelamento;
  }

  
  /**
   * Codigo de identifica\u00E7\u00E3o da plataforma que realizou a ativa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Codigo de identifica\u00E7\u00E3o da plataforma que realizou a ativa\u00E7\u00E3o")
  public Long getIdPlataformaAtivacao() {
    return idPlataformaAtivacao;
  }
  public void setIdPlataformaAtivacao(Long idPlataformaAtivacao) {
    this.idPlataformaAtivacao = idPlataformaAtivacao;
  }

  
  /**
   * Codigo de identifica\u00E7\u00E3o da plataforma que realizou o cancelamento
   **/
  @ApiModelProperty(value = "Codigo de identifica\u00E7\u00E3o da plataforma que realizou o cancelamento")
  public Long getIdPlataformaCancelamento() {
    return idPlataformaCancelamento;
  }
  public void setIdPlataformaCancelamento(Long idPlataformaCancelamento) {
    this.idPlataformaCancelamento = idPlataformaCancelamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMSContaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  dataAtivacao: ").append(dataAtivacao).append("\n");
    sb.append("  dataCancelamento: ").append(dataCancelamento).append("\n");
    sb.append("  origem: ").append(origem).append("\n");
    sb.append("  idSMSTipoServico: ").append(idSMSTipoServico).append("\n");
    sb.append("  idLoginAtivacao: ").append(idLoginAtivacao).append("\n");
    sb.append("  idLoginCancelamento: ").append(idLoginCancelamento).append("\n");
    sb.append("  idPlataformaAtivacao: ").append(idPlataformaAtivacao).append("\n");
    sb.append("  idPlataformaCancelamento: ").append(idPlataformaCancelamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
