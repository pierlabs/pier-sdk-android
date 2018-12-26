package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{documento_proposta_response_description}}}
 **/
@ApiModel(description = "{{{documento_proposta_response_description}}}")
public class DocumentoPropostaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idProposta")
  private Long idProposta = null;
  @SerializedName("idDocumentosCredito")
  private Long idDocumentosCredito = null;
  @SerializedName("idStatusDocumentosCredito")
  private Long idStatusDocumentosCredito = null;
  @SerializedName("idCondicoesDocumentosCredito")
  private Long idCondicoesDocumentosCredito = null;
  @SerializedName("idTipoDocumentoCredito")
  private Long idTipoDocumentoCredito = null;
  @SerializedName("idPessoaFisica")
  private Long idPessoaFisica = null;
  @SerializedName("idLogAtendimento")
  private Long idLogAtendimento = null;
  @SerializedName("responsavel")
  private String responsavel = null;
  @SerializedName("flagDocumentoDigitalizado")
  private Integer flagDocumentoDigitalizado = null;
  @SerializedName("documentoDigitalizado")
  private String documentoDigitalizado = null;
  @SerializedName("seqAnaliseCondicao")
  private Long seqAnaliseCondicao = null;
  @SerializedName("observacao")
  private String observacao = null;
  @SerializedName("dataStatus")
  private String dataStatus = null;

  
  /**
   * {{{documento_proposta_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_proposta_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{documento_proposta_response_id_proposta_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_proposta_response_id_proposta_value}}}")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * {{{documento_proposta_response_id_tipo_documento_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_proposta_response_id_tipo_documento_value}}}")
  public Long getIdDocumentosCredito() {
    return idDocumentosCredito;
  }
  public void setIdDocumentosCredito(Long idDocumentosCredito) {
    this.idDocumentosCredito = idDocumentosCredito;
  }

  
  /**
   * {{{documento_proposta_response_id_status_documento_credito_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_proposta_response_id_status_documento_credito_value}}}")
  public Long getIdStatusDocumentosCredito() {
    return idStatusDocumentosCredito;
  }
  public void setIdStatusDocumentosCredito(Long idStatusDocumentosCredito) {
    this.idStatusDocumentosCredito = idStatusDocumentosCredito;
  }

  
  /**
   * {{{documento_proposta_response_id_condicao_documento_credito_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_proposta_response_id_condicao_documento_credito_value}}}")
  public Long getIdCondicoesDocumentosCredito() {
    return idCondicoesDocumentosCredito;
  }
  public void setIdCondicoesDocumentosCredito(Long idCondicoesDocumentosCredito) {
    this.idCondicoesDocumentosCredito = idCondicoesDocumentosCredito;
  }

  
  /**
   * {{{documento_proposta_response_id_tipo_documento_credito_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_proposta_response_id_tipo_documento_credito_value}}}")
  public Long getIdTipoDocumentoCredito() {
    return idTipoDocumentoCredito;
  }
  public void setIdTipoDocumentoCredito(Long idTipoDocumentoCredito) {
    this.idTipoDocumentoCredito = idTipoDocumentoCredito;
  }

  
  /**
   * {{{documento_proposta_response_id_pessoa_fisica_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_proposta_response_id_pessoa_fisica_value}}}")
  public Long getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   * {{{documento_proposta_response_id_log_atendimento_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_proposta_response_id_log_atendimento_value}}}")
  public Long getIdLogAtendimento() {
    return idLogAtendimento;
  }
  public void setIdLogAtendimento(Long idLogAtendimento) {
    this.idLogAtendimento = idLogAtendimento;
  }

  
  /**
   * {{{documento_proposta_response_responsavel_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_proposta_response_responsavel_value}}}")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * {{{documento_proposta_response_flag_documento_digitalizado_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_proposta_response_flag_documento_digitalizado_value}}}")
  public Integer getFlagDocumentoDigitalizado() {
    return flagDocumentoDigitalizado;
  }
  public void setFlagDocumentoDigitalizado(Integer flagDocumentoDigitalizado) {
    this.flagDocumentoDigitalizado = flagDocumentoDigitalizado;
  }

  
  /**
   * {{{documento_proposta_response_documento_digitalizado_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_proposta_response_documento_digitalizado_value}}}")
  public String getDocumentoDigitalizado() {
    return documentoDigitalizado;
  }
  public void setDocumentoDigitalizado(String documentoDigitalizado) {
    this.documentoDigitalizado = documentoDigitalizado;
  }

  
  /**
   * {{{documento_proposta_response_seq_analise_condicao_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_proposta_response_seq_analise_condicao_value}}}")
  public Long getSeqAnaliseCondicao() {
    return seqAnaliseCondicao;
  }
  public void setSeqAnaliseCondicao(Long seqAnaliseCondicao) {
    this.seqAnaliseCondicao = seqAnaliseCondicao;
  }

  
  /**
   * {{{documento_proposta_response_observacao_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_proposta_response_observacao_value}}}")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * {{{documento_proposta_response_data_status_value}}}
   **/
  @ApiModelProperty(value = "{{{documento_proposta_response_data_status_value}}}")
  public String getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoPropostaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idProposta: ").append(idProposta).append("\n");
    sb.append("  idDocumentosCredito: ").append(idDocumentosCredito).append("\n");
    sb.append("  idStatusDocumentosCredito: ").append(idStatusDocumentosCredito).append("\n");
    sb.append("  idCondicoesDocumentosCredito: ").append(idCondicoesDocumentosCredito).append("\n");
    sb.append("  idTipoDocumentoCredito: ").append(idTipoDocumentoCredito).append("\n");
    sb.append("  idPessoaFisica: ").append(idPessoaFisica).append("\n");
    sb.append("  idLogAtendimento: ").append(idLogAtendimento).append("\n");
    sb.append("  responsavel: ").append(responsavel).append("\n");
    sb.append("  flagDocumentoDigitalizado: ").append(flagDocumentoDigitalizado).append("\n");
    sb.append("  documentoDigitalizado: ").append(documentoDigitalizado).append("\n");
    sb.append("  seqAnaliseCondicao: ").append(seqAnaliseCondicao).append("\n");
    sb.append("  observacao: ").append(observacao).append("\n");
    sb.append("  dataStatus: ").append(dataStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
