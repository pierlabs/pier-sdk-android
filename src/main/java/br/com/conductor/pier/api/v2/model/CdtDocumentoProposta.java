package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CdtDocumentoProposta  {
  
  @SerializedName("dataStatus")
  private String dataStatus = null;
  @SerializedName("documentoDigitalizado")
  private String documentoDigitalizado = null;
  @SerializedName("flagDocumentoDigitalizado")
  private Integer flagDocumentoDigitalizado = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idCondicoesDocumentosCredito")
  private Long idCondicoesDocumentosCredito = null;
  @SerializedName("idDocumentosCredito")
  private Long idDocumentosCredito = null;
  @SerializedName("idLogAtendimento")
  private Long idLogAtendimento = null;
  @SerializedName("idPessoaFisica")
  private Long idPessoaFisica = null;
  @SerializedName("idProposta")
  private Long idProposta = null;
  @SerializedName("idStatusDocumentosCredito")
  private Long idStatusDocumentosCredito = null;
  @SerializedName("idTipoDocumentoCredito")
  private Long idTipoDocumentoCredito = null;
  @SerializedName("observacao")
  private String observacao = null;
  @SerializedName("responsavel")
  private String responsavel = null;
  @SerializedName("seqAnaliseCondicao")
  private Integer seqAnaliseCondicao = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataStatus() {
    return dataStatus;
  }
  public void setDataStatus(String dataStatus) {
    this.dataStatus = dataStatus;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDocumentoDigitalizado() {
    return documentoDigitalizado;
  }
  public void setDocumentoDigitalizado(String documentoDigitalizado) {
    this.documentoDigitalizado = documentoDigitalizado;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getFlagDocumentoDigitalizado() {
    return flagDocumentoDigitalizado;
  }
  public void setFlagDocumentoDigitalizado(Integer flagDocumentoDigitalizado) {
    this.flagDocumentoDigitalizado = flagDocumentoDigitalizado;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdCondicoesDocumentosCredito() {
    return idCondicoesDocumentosCredito;
  }
  public void setIdCondicoesDocumentosCredito(Long idCondicoesDocumentosCredito) {
    this.idCondicoesDocumentosCredito = idCondicoesDocumentosCredito;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdDocumentosCredito() {
    return idDocumentosCredito;
  }
  public void setIdDocumentosCredito(Long idDocumentosCredito) {
    this.idDocumentosCredito = idDocumentosCredito;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdLogAtendimento() {
    return idLogAtendimento;
  }
  public void setIdLogAtendimento(Long idLogAtendimento) {
    this.idLogAtendimento = idLogAtendimento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdStatusDocumentosCredito() {
    return idStatusDocumentosCredito;
  }
  public void setIdStatusDocumentosCredito(Long idStatusDocumentosCredito) {
    this.idStatusDocumentosCredito = idStatusDocumentosCredito;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdTipoDocumentoCredito() {
    return idTipoDocumentoCredito;
  }
  public void setIdTipoDocumentoCredito(Long idTipoDocumentoCredito) {
    this.idTipoDocumentoCredito = idTipoDocumentoCredito;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSeqAnaliseCondicao() {
    return seqAnaliseCondicao;
  }
  public void setSeqAnaliseCondicao(Integer seqAnaliseCondicao) {
    this.seqAnaliseCondicao = seqAnaliseCondicao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdtDocumentoProposta {\n");
    
    sb.append("  dataStatus: ").append(dataStatus).append("\n");
    sb.append("  documentoDigitalizado: ").append(documentoDigitalizado).append("\n");
    sb.append("  flagDocumentoDigitalizado: ").append(flagDocumentoDigitalizado).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idCondicoesDocumentosCredito: ").append(idCondicoesDocumentosCredito).append("\n");
    sb.append("  idDocumentosCredito: ").append(idDocumentosCredito).append("\n");
    sb.append("  idLogAtendimento: ").append(idLogAtendimento).append("\n");
    sb.append("  idPessoaFisica: ").append(idPessoaFisica).append("\n");
    sb.append("  idProposta: ").append(idProposta).append("\n");
    sb.append("  idStatusDocumentosCredito: ").append(idStatusDocumentosCredito).append("\n");
    sb.append("  idTipoDocumentoCredito: ").append(idTipoDocumentoCredito).append("\n");
    sb.append("  observacao: ").append(observacao).append("\n");
    sb.append("  responsavel: ").append(responsavel).append("\n");
    sb.append("  seqAnaliseCondicao: ").append(seqAnaliseCondicao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
