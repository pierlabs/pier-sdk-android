package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Classe de representa\u00E7\u00E3o da response de documentosProposta
 **/
@ApiModel(description = "Classe de representa\u00E7\u00E3o da response de documentosProposta")
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
   * C\u00F3digo de identifica\u00E7\u00E3o do documento proposta(id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do documento proposta(id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da proposta(id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da proposta(id)")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o para o tipo do documento
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o para o tipo do documento")
  public Long getIdDocumentosCredito() {
    return idDocumentosCredito;
  }
  public void setIdDocumentosCredito(Long idDocumentosCredito) {
    this.idDocumentosCredito = idDocumentosCredito;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Status do documento cr\u00E9dito
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do Status do documento cr\u00E9dito")
  public Long getIdStatusDocumentosCredito() {
    return idStatusDocumentosCredito;
  }
  public void setIdStatusDocumentosCredito(Long idStatusDocumentosCredito) {
    this.idStatusDocumentosCredito = idStatusDocumentosCredito;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da condi\u00E7\u00E3o do documento cr\u00E9dito
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da condi\u00E7\u00E3o do documento cr\u00E9dito")
  public Long getIdCondicoesDocumentosCredito() {
    return idCondicoesDocumentosCredito;
  }
  public void setIdCondicoesDocumentosCredito(Long idCondicoesDocumentosCredito) {
    this.idCondicoesDocumentosCredito = idCondicoesDocumentosCredito;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo do documento cr\u00E9dito
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo do documento cr\u00E9dito")
  public Long getIdTipoDocumentoCredito() {
    return idTipoDocumentoCredito;
  }
  public void setIdTipoDocumentoCredito(Long idTipoDocumentoCredito) {
    this.idTipoDocumentoCredito = idTipoDocumentoCredito;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da pessoa f\u00EDsica
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da pessoa f\u00EDsica")
  public Long getIdPessoaFisica() {
    return idPessoaFisica;
  }
  public void setIdPessoaFisica(Long idPessoaFisica) {
    this.idPessoaFisica = idPessoaFisica;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Log de Atendimento
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do Log de Atendimento")
  public Long getIdLogAtendimento() {
    return idLogAtendimento;
  }
  public void setIdLogAtendimento(Long idLogAtendimento) {
    this.idLogAtendimento = idLogAtendimento;
  }

  
  /**
   * Respons\u00E1vel
   **/
  @ApiModelProperty(value = "Respons\u00E1vel")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * Indica se o documento ser\u00E1 digitalizado
   **/
  @ApiModelProperty(value = "Indica se o documento ser\u00E1 digitalizado")
  public Integer getFlagDocumentoDigitalizado() {
    return flagDocumentoDigitalizado;
  }
  public void setFlagDocumentoDigitalizado(Integer flagDocumentoDigitalizado) {
    this.flagDocumentoDigitalizado = flagDocumentoDigitalizado;
  }

  
  /**
   * Nome do documento digitalizado
   **/
  @ApiModelProperty(value = "Nome do documento digitalizado")
  public String getDocumentoDigitalizado() {
    return documentoDigitalizado;
  }
  public void setDocumentoDigitalizado(String documentoDigitalizado) {
    this.documentoDigitalizado = documentoDigitalizado;
  }

  
  /**
   * C\u00F3digo de sequ\u00EAncia de analise de condi\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de sequ\u00EAncia de analise de condi\u00E7\u00E3o")
  public Long getSeqAnaliseCondicao() {
    return seqAnaliseCondicao;
  }
  public void setSeqAnaliseCondicao(Long seqAnaliseCondicao) {
    this.seqAnaliseCondicao = seqAnaliseCondicao;
  }

  
  /**
   * Observa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Observa\u00E7\u00E3o")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * Data de status
   **/
  @ApiModelProperty(value = "Data de status")
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
