package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta do recurso lotes de cart\u00F5es
 **/
@ApiModel(description = "Objeto de resposta do recurso lotes de cart\u00F5es")
public class LoteCartaoResponse  {
  
  @SerializedName("dataAgendamento")
  private String dataAgendamento = null;
  @SerializedName("dataHoraStatus")
  private String dataHoraStatus = null;
  @SerializedName("flagMultiApp")
  private Boolean flagMultiApp = null;
  @SerializedName("idContaDefault")
  private Long idContaDefault = null;
  @SerializedName("idImagem")
  private Long idImagem = null;
  @SerializedName("idLote")
  private Long idLote = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("idPlastico")
  private Long idPlastico = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idSolicitante")
  private Long idSolicitante = null;
  @SerializedName("qtdSolicitada")
  private Long qtdSolicitada = null;
  @SerializedName("statusLote")
  private Integer statusLote = null;
  @SerializedName("tipoLote")
  private Integer tipoLote = null;

  
  /**
   * Data e hora da gera\u00E7\u00E3o do lote
   **/
  @ApiModelProperty(value = "Data e hora da gera\u00E7\u00E3o do lote")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * Data e hora da modifica\u00E7\u00E3o do status do lote
   **/
  @ApiModelProperty(value = "Data e hora da modifica\u00E7\u00E3o do status do lote")
  public String getDataHoraStatus() {
    return dataHoraStatus;
  }
  public void setDataHoraStatus(String dataHoraStatus) {
    this.dataHoraStatus = dataHoraStatus;
  }

  
  /**
   * Indica se o lote ser\u00E1 de cart\u00F5es m\u00FAltiplos
   **/
  @ApiModelProperty(value = "Indica se o lote ser\u00E1 de cart\u00F5es m\u00FAltiplos")
  public Boolean getFlagMultiApp() {
    return flagMultiApp;
  }
  public void setFlagMultiApp(Boolean flagMultiApp) {
    this.flagMultiApp = flagMultiApp;
  }

  
  /**
   * C\u00F3digo identificador da conta padr\u00E3o, caso seja informado os cart\u00F5es do lote ser\u00E3o criados para o id informado
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da conta padr\u00E3o, caso seja informado os cart\u00F5es do lote ser\u00E3o criados para o id informado")
  public Long getIdContaDefault() {
    return idContaDefault;
  }
  public void setIdContaDefault(Long idContaDefault) {
    this.idContaDefault = idContaDefault;
  }

  
  /**
   * C\u00F3digo identificador do tipo pl\u00E1stico imagem
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do tipo pl\u00E1stico imagem")
  public Long getIdImagem() {
    return idImagem;
  }
  public void setIdImagem(Long idImagem) {
    this.idImagem = idImagem;
  }

  
  /**
   * Identificador do Lote
   **/
  @ApiModelProperty(value = "Identificador do Lote")
  public Long getIdLote() {
    return idLote;
  }
  public void setIdLote(Long idLote) {
    this.idLote = idLote;
  }

  
  /**
   * C\u00F3digo identificador da origem comercial
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da origem comercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * C\u00F3digo identificador do tipo pl\u00E1stico associado ao produto
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do tipo pl\u00E1stico associado ao produto")
  public Long getIdPlastico() {
    return idPlastico;
  }
  public void setIdPlastico(Long idPlastico) {
    this.idPlastico = idPlastico;
  }

  
  /**
   * Identificador do Produto
   **/
  @ApiModelProperty(value = "Identificador do Produto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identificador do Solicitante
   **/
  @ApiModelProperty(value = "Identificador do Solicitante")
  public Long getIdSolicitante() {
    return idSolicitante;
  }
  public void setIdSolicitante(Long idSolicitante) {
    this.idSolicitante = idSolicitante;
  }

  
  /**
   * Quantidade Solicitada
   **/
  @ApiModelProperty(value = "Quantidade Solicitada")
  public Long getQtdSolicitada() {
    return qtdSolicitada;
  }
  public void setQtdSolicitada(Long qtdSolicitada) {
    this.qtdSolicitada = qtdSolicitada;
  }

  
  /**
   * Status do Lote
   **/
  @ApiModelProperty(value = "Status do Lote")
  public Integer getStatusLote() {
    return statusLote;
  }
  public void setStatusLote(Integer statusLote) {
    this.statusLote = statusLote;
  }

  
  /**
   * Tipo do Lote
   **/
  @ApiModelProperty(value = "Tipo do Lote")
  public Integer getTipoLote() {
    return tipoLote;
  }
  public void setTipoLote(Integer tipoLote) {
    this.tipoLote = tipoLote;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoteCartaoResponse {\n");
    
    sb.append("  dataAgendamento: ").append(dataAgendamento).append("\n");
    sb.append("  dataHoraStatus: ").append(dataHoraStatus).append("\n");
    sb.append("  flagMultiApp: ").append(flagMultiApp).append("\n");
    sb.append("  idContaDefault: ").append(idContaDefault).append("\n");
    sb.append("  idImagem: ").append(idImagem).append("\n");
    sb.append("  idLote: ").append(idLote).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idPlastico: ").append(idPlastico).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idSolicitante: ").append(idSolicitante).append("\n");
    sb.append("  qtdSolicitada: ").append(qtdSolicitada).append("\n");
    sb.append("  statusLote: ").append(statusLote).append("\n");
    sb.append("  tipoLote: ").append(tipoLote).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
