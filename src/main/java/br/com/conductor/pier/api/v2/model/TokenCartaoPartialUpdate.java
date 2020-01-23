package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de atualiza\u00E7\u00E3o parcial TokenCartaoPartialUpdate
 **/
@ApiModel(description = "Objeto de atualiza\u00E7\u00E3o parcial TokenCartaoPartialUpdate")
public class TokenCartaoPartialUpdate  {
  
  @SerializedName("token")
  private String token = null;
  @SerializedName("requestorID")
  private String requestorID = null;
  @SerializedName("referenceID")
  private String referenceID = null;
  @SerializedName("panReferenceID")
  private String panReferenceID = null;
  @SerializedName("tipo")
  private String tipo = null;
  public enum StatusEnum {
     ATIVO,  INATIVO,  SUSPENSO,  EXCLUIDO, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  public enum UltimoStatusEnum {
     ATIVO,  INATIVO,  SUSPENSO,  EXCLUIDO, 
  };
  @SerializedName("ultimoStatus")
  private UltimoStatusEnum ultimoStatus = null;
  @SerializedName("codigoAtivacao")
  private String codigoAtivacao = null;
  @SerializedName("tentativasAtivacao")
  private Integer tentativasAtivacao = null;
  @SerializedName("qtdCodigosAtivacao")
  private Integer qtdCodigosAtivacao = null;
  @SerializedName("score")
  private Integer score = null;
  @SerializedName("resultadoAprovisionamento")
  private String resultadoAprovisionamento = null;
  @SerializedName("validade")
  private String validade = null;
  @SerializedName("dataAtualizacaoChaveDispositivo")
  private String dataAtualizacaoChaveDispositivo = null;

  
  /**
   * Token
   **/
  @ApiModelProperty(value = "Token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Identificador requestorID
   **/
  @ApiModelProperty(value = "Identificador requestorID")
  public String getRequestorID() {
    return requestorID;
  }
  public void setRequestorID(String requestorID) {
    this.requestorID = requestorID;
  }

  
  /**
   * Identificador referenceID
   **/
  @ApiModelProperty(value = "Identificador referenceID")
  public String getReferenceID() {
    return referenceID;
  }
  public void setReferenceID(String referenceID) {
    this.referenceID = referenceID;
  }

  
  /**
   * Indentificador panReferenceID
   **/
  @ApiModelProperty(value = "Indentificador panReferenceID")
  public String getPanReferenceID() {
    return panReferenceID;
  }
  public void setPanReferenceID(String panReferenceID) {
    this.panReferenceID = panReferenceID;
  }

  
  /**
   * Tipo do token
   **/
  @ApiModelProperty(value = "Tipo do token")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  
  /**
   * Status do token
   **/
  @ApiModelProperty(value = "Status do token")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Ultimo status do token
   **/
  @ApiModelProperty(value = "Ultimo status do token")
  public UltimoStatusEnum getUltimoStatus() {
    return ultimoStatus;
  }
  public void setUltimoStatus(UltimoStatusEnum ultimoStatus) {
    this.ultimoStatus = ultimoStatus;
  }

  
  /**
   * C\u00F3digo de ativa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de ativa\u00E7\u00E3o")
  public String getCodigoAtivacao() {
    return codigoAtivacao;
  }
  public void setCodigoAtivacao(String codigoAtivacao) {
    this.codigoAtivacao = codigoAtivacao;
  }

  
  /**
   * Tentativas de ativa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Tentativas de ativa\u00E7\u00E3o")
  public Integer getTentativasAtivacao() {
    return tentativasAtivacao;
  }
  public void setTentativasAtivacao(Integer tentativasAtivacao) {
    this.tentativasAtivacao = tentativasAtivacao;
  }

  
  /**
   * Quantidade de c\u00F3digos de ativa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Quantidade de c\u00F3digos de ativa\u00E7\u00E3o")
  public Integer getQtdCodigosAtivacao() {
    return qtdCodigosAtivacao;
  }
  public void setQtdCodigosAtivacao(Integer qtdCodigosAtivacao) {
    this.qtdCodigosAtivacao = qtdCodigosAtivacao;
  }

  
  /**
   * Score
   **/
  @ApiModelProperty(value = "Score")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }

  
  /**
   * Resultado do aprovisionamento
   **/
  @ApiModelProperty(value = "Resultado do aprovisionamento")
  public String getResultadoAprovisionamento() {
    return resultadoAprovisionamento;
  }
  public void setResultadoAprovisionamento(String resultadoAprovisionamento) {
    this.resultadoAprovisionamento = resultadoAprovisionamento;
  }

  
  /**
   * Data de validade
   **/
  @ApiModelProperty(value = "Data de validade")
  public String getValidade() {
    return validade;
  }
  public void setValidade(String validade) {
    this.validade = validade;
  }

  
  /**
   * Data de atualiza\u00E7\u00E3o da chave do dispositivo
   **/
  @ApiModelProperty(value = "Data de atualiza\u00E7\u00E3o da chave do dispositivo")
  public String getDataAtualizacaoChaveDispositivo() {
    return dataAtualizacaoChaveDispositivo;
  }
  public void setDataAtualizacaoChaveDispositivo(String dataAtualizacaoChaveDispositivo) {
    this.dataAtualizacaoChaveDispositivo = dataAtualizacaoChaveDispositivo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenCartaoPartialUpdate {\n");
    
    sb.append("  token: ").append(token).append("\n");
    sb.append("  requestorID: ").append(requestorID).append("\n");
    sb.append("  referenceID: ").append(referenceID).append("\n");
    sb.append("  panReferenceID: ").append(panReferenceID).append("\n");
    sb.append("  tipo: ").append(tipo).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  ultimoStatus: ").append(ultimoStatus).append("\n");
    sb.append("  codigoAtivacao: ").append(codigoAtivacao).append("\n");
    sb.append("  tentativasAtivacao: ").append(tentativasAtivacao).append("\n");
    sb.append("  qtdCodigosAtivacao: ").append(qtdCodigosAtivacao).append("\n");
    sb.append("  score: ").append(score).append("\n");
    sb.append("  resultadoAprovisionamento: ").append(resultadoAprovisionamento).append("\n");
    sb.append("  validade: ").append(validade).append("\n");
    sb.append("  dataAtualizacaoChaveDispositivo: ").append(dataAtualizacaoChaveDispositivo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
