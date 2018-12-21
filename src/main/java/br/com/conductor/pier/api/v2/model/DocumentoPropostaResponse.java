package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * DocumentoProposta response representation
 **/
@ApiModel(description = "DocumentoProposta response representation")
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
   * Idenfitication code of the document proposal
   **/
  @ApiModelProperty(value = "Idenfitication code of the document proposal")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Idenfitication code of the proposal
   **/
  @ApiModelProperty(value = "Idenfitication code of the proposal")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * Idenfitication code of the type of document
   **/
  @ApiModelProperty(value = "Idenfitication code of the type of document")
  public Long getIdDocumentosCredito() {
    return idDocumentosCredito;
  }
  public void setIdDocumentosCredito(Long idDocumentosCredito) {
    this.idDocumentosCredito = idDocumentosCredito;
  }

  
  /**
   * Idenfitication code of credit document status
   **/
  @ApiModelProperty(value = "Idenfitication code of credit document status")
  public Long getIdStatusDocumentosCredito() {
    return idStatusDocumentosCredito;
  }
  public void setIdStatusDocumentosCredito(Long idStatusDocumentosCredito) {
    this.idStatusDocumentosCredito = idStatusDocumentosCredito;
  }

  
  /**
   * Idenfitication code of credit credit condition
   **/
  @ApiModelProperty(value = "Idenfitication code of credit credit condition")
  public Long getIdCondicoesDocumentosCredito() {
    return idCondicoesDocumentosCredito;
  }
  public void setIdCondicoesDocumentosCredito(Long idCondicoesDocumentosCredito) {
    this.idCondicoesDocumentosCredito = idCondicoesDocumentosCredito;
  }

  
  /**
   * Idenfitication code of credit document type
   **/
  @ApiModelProperty(value = "Idenfitication code of credit document type")
  public Long getIdTipoDocumentoCredito() {
    return idTipoDocumentoCredito;
  }
  public void setIdTipoDocumentoCredito(Long idTipoDocumentoCredito) {
    this.idTipoDocumentoCredito = idTipoDocumentoCredito;
  }

  
  /**
   * Idenfitication code of person
   **/
  @ApiModelProperty(value = "Idenfitication code of person")
  public Long getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   * Idenfitication code of log
   **/
  @ApiModelProperty(value = "Idenfitication code of log")
  public Long getIdLogAtendimento() {
    return idLogAtendimento;
  }
  public void setIdLogAtendimento(Long idLogAtendimento) {
    this.idLogAtendimento = idLogAtendimento;
  }

  
  /**
   * Responsible
   **/
  @ApiModelProperty(value = "Responsible")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * Flag for digitalization of the document
   **/
  @ApiModelProperty(value = "Flag for digitalization of the document")
  public Integer getFlagDocumentoDigitalizado() {
    return flagDocumentoDigitalizado;
  }
  public void setFlagDocumentoDigitalizado(Integer flagDocumentoDigitalizado) {
    this.flagDocumentoDigitalizado = flagDocumentoDigitalizado;
  }

  
  /**
   * Name of the digital document
   **/
  @ApiModelProperty(value = "Name of the digital document")
  public String getDocumentoDigitalizado() {
    return documentoDigitalizado;
  }
  public void setDocumentoDigitalizado(String documentoDigitalizado) {
    this.documentoDigitalizado = documentoDigitalizado;
  }

  
  /**
   * Analytical Sequence code
   **/
  @ApiModelProperty(value = "Analytical Sequence code")
  public Long getSeqAnaliseCondicao() {
    return seqAnaliseCondicao;
  }
  public void setSeqAnaliseCondicao(Long seqAnaliseCondicao) {
    this.seqAnaliseCondicao = seqAnaliseCondicao;
  }

  
  /**
   * Note
   **/
  @ApiModelProperty(value = "Note")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * Status Date
   **/
  @ApiModelProperty(value = "Status Date")
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
