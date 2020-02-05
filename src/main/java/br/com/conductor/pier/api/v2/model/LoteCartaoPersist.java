package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto que representa o DTO persist do recurso lotes de cart\u00F5es
 **/
@ApiModel(description = "Objeto que representa o DTO persist do recurso lotes de cart\u00F5es")
public class LoteCartaoPersist  {
  
  @SerializedName("qtdSolicitada")
  private Integer qtdSolicitada = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idSolicitante")
  private Long idSolicitante = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("idPlastico")
  private Long idPlastico = null;
  @SerializedName("idImagem")
  private Long idImagem = null;
  @SerializedName("idContaDefault")
  private Long idContaDefault = null;
  @SerializedName("flagMultiApp")
  private Boolean flagMultiApp = null;
  @SerializedName("dataAgendamento")
  private String dataAgendamento = null;

  
  /**
   * Quantidade de cart\u00F5es a ser emitido
   **/
  @ApiModelProperty(required = true, value = "Quantidade de cart\u00F5es a ser emitido")
  public Integer getQtdSolicitada() {
    return qtdSolicitada;
  }
  public void setQtdSolicitada(Integer qtdSolicitada) {
    this.qtdSolicitada = qtdSolicitada;
  }

  
  /**
   * C\u00F3digo identificador do produto
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador do produto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00F3digo identificador do solicitante
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do solicitante")
  public Long getIdSolicitante() {
    return idSolicitante;
  }
  public void setIdSolicitante(Long idSolicitante) {
    this.idSolicitante = idSolicitante;
  }

  
  /**
   * C\u00F3digo identificador da origem comercial
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador da origem comercial")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * C\u00F3digo identificador do tipo pl\u00E1stico associado ao produto
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador do tipo pl\u00E1stico associado ao produto")
  public Long getIdPlastico() {
    return idPlastico;
  }
  public void setIdPlastico(Long idPlastico) {
    this.idPlastico = idPlastico;
  }

  
  /**
   * C\u00F3digo identificador do tipo pl\u00E1stico imagem
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador do tipo pl\u00E1stico imagem")
  public Long getIdImagem() {
    return idImagem;
  }
  public void setIdImagem(Long idImagem) {
    this.idImagem = idImagem;
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
   * Indica se o lote ser\u00E1 de cart\u00F5es m\u00FAltiplos
   **/
  @ApiModelProperty(required = true, value = "Indica se o lote ser\u00E1 de cart\u00F5es m\u00FAltiplos")
  public Boolean getFlagMultiApp() {
    return flagMultiApp;
  }
  public void setFlagMultiApp(Boolean flagMultiApp) {
    this.flagMultiApp = flagMultiApp;
  }

  
  /**
   * Data de agendamento da execu\u00E7\u00E3o do lote
   **/
  @ApiModelProperty(required = true, value = "Data de agendamento da execu\u00E7\u00E3o do lote")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoteCartaoPersist {\n");
    
    sb.append("  qtdSolicitada: ").append(qtdSolicitada).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idSolicitante: ").append(idSolicitante).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idPlastico: ").append(idPlastico).append("\n");
    sb.append("  idImagem: ").append(idImagem).append("\n");
    sb.append("  idContaDefault: ").append(idContaDefault).append("\n");
    sb.append("  flagMultiApp: ").append(flagMultiApp).append("\n");
    sb.append("  dataAgendamento: ").append(dataAgendamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
