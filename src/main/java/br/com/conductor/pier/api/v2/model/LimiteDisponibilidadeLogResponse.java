package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta de um log de limite disponibilidade
 **/
@ApiModel(description = "Objeto de resposta de um log de limite disponibilidade")
public class LimiteDisponibilidadeLogResponse  {
  
  @SerializedName("dataAlteracao")
  private String dataAlteracao = null;
  @SerializedName("disponibilidadeCompraInternacional")
  private BigDecimal disponibilidadeCompraInternacional = null;
  @SerializedName("disponibilidadeCompraNacional")
  private BigDecimal disponibilidadeCompraNacional = null;
  @SerializedName("disponibilidadeGlobalCredito")
  private BigDecimal disponibilidadeGlobalCredito = null;
  @SerializedName("disponibilidadeParceladoNacional")
  private BigDecimal disponibilidadeParceladoNacional = null;
  @SerializedName("disponibilidadeParcelasNacional")
  private BigDecimal disponibilidadeParcelasNacional = null;
  @SerializedName("disponibilidadeSaqueInternacionalGlobal")
  private BigDecimal disponibilidadeSaqueInternacionalGlobal = null;
  @SerializedName("disponibilidadeSaqueNacionalGlobal")
  private BigDecimal disponibilidadeSaqueNacionalGlobal = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idEmissor")
  private Long idEmissor = null;
  @SerializedName("limiteCompraInternacional")
  private BigDecimal limiteCompraInternacional = null;
  @SerializedName("limiteCompraNacional")
  private BigDecimal limiteCompraNacional = null;
  @SerializedName("limiteGlobalCredito")
  private BigDecimal limiteGlobalCredito = null;
  @SerializedName("limiteParceladoInternacional")
  private BigDecimal limiteParceladoInternacional = null;
  @SerializedName("limiteParceladoNacional")
  private BigDecimal limiteParceladoNacional = null;
  @SerializedName("limiteParcelasInternacional")
  private BigDecimal limiteParcelasInternacional = null;
  @SerializedName("limiteParcelasNacional")
  private BigDecimal limiteParcelasNacional = null;
  @SerializedName("limitePontuacao")
  private BigDecimal limitePontuacao = null;
  @SerializedName("limiteSaqueInternacionalGlobal")
  private BigDecimal limiteSaqueInternacionalGlobal = null;
  @SerializedName("limiteSaqueInternacionalPeriodo")
  private BigDecimal limiteSaqueInternacionalPeriodo = null;
  @SerializedName("limiteSaqueNacionalGlobal")
  private BigDecimal limiteSaqueNacionalGlobal = null;
  @SerializedName("limiteSaqueNacionalPeriodo")
  private BigDecimal limiteSaqueNacionalPeriodo = null;
  @SerializedName("maquina")
  private String maquina = null;
  @SerializedName("margemConsignada")
  private BigDecimal margemConsignada = null;
  @SerializedName("ordemAtualizacao")
  private String ordemAtualizacao = null;
  @SerializedName("tipoAlteracao")
  private String tipoAlteracao = null;

  
  /**
   * Data de altera\u00E7\u00E3o do limite
   **/
  @ApiModelProperty(value = "Data de altera\u00E7\u00E3o do limite")
  public String getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  
  /**
   * Disponibilidade compra internacional
   **/
  @ApiModelProperty(value = "Disponibilidade compra internacional")
  public BigDecimal getDisponibilidadeCompraInternacional() {
    return disponibilidadeCompraInternacional;
  }
  public void setDisponibilidadeCompraInternacional(BigDecimal disponibilidadeCompraInternacional) {
    this.disponibilidadeCompraInternacional = disponibilidadeCompraInternacional;
  }

  
  /**
   * Disponibilidade compra nacional
   **/
  @ApiModelProperty(value = "Disponibilidade compra nacional")
  public BigDecimal getDisponibilidadeCompraNacional() {
    return disponibilidadeCompraNacional;
  }
  public void setDisponibilidadeCompraNacional(BigDecimal disponibilidadeCompraNacional) {
    this.disponibilidadeCompraNacional = disponibilidadeCompraNacional;
  }

  
  /**
   * Disponibilidade global cr\u00E9dito
   **/
  @ApiModelProperty(value = "Disponibilidade global cr\u00E9dito")
  public BigDecimal getDisponibilidadeGlobalCredito() {
    return disponibilidadeGlobalCredito;
  }
  public void setDisponibilidadeGlobalCredito(BigDecimal disponibilidadeGlobalCredito) {
    this.disponibilidadeGlobalCredito = disponibilidadeGlobalCredito;
  }

  
  /**
   * Disponibilidade parcelado nacional
   **/
  @ApiModelProperty(value = "Disponibilidade parcelado nacional")
  public BigDecimal getDisponibilidadeParceladoNacional() {
    return disponibilidadeParceladoNacional;
  }
  public void setDisponibilidadeParceladoNacional(BigDecimal disponibilidadeParceladoNacional) {
    this.disponibilidadeParceladoNacional = disponibilidadeParceladoNacional;
  }

  
  /**
   * Disponibilidade parcelas nacional
   **/
  @ApiModelProperty(value = "Disponibilidade parcelas nacional")
  public BigDecimal getDisponibilidadeParcelasNacional() {
    return disponibilidadeParcelasNacional;
  }
  public void setDisponibilidadeParcelasNacional(BigDecimal disponibilidadeParcelasNacional) {
    this.disponibilidadeParcelasNacional = disponibilidadeParcelasNacional;
  }

  
  /**
   * Disponibilidade saque internacional global
   **/
  @ApiModelProperty(value = "Disponibilidade saque internacional global")
  public BigDecimal getDisponibilidadeSaqueInternacionalGlobal() {
    return disponibilidadeSaqueInternacionalGlobal;
  }
  public void setDisponibilidadeSaqueInternacionalGlobal(BigDecimal disponibilidadeSaqueInternacionalGlobal) {
    this.disponibilidadeSaqueInternacionalGlobal = disponibilidadeSaqueInternacionalGlobal;
  }

  
  /**
   * Disponibilidade saque nacional global
   **/
  @ApiModelProperty(value = "Disponibilidade saque nacional global")
  public BigDecimal getDisponibilidadeSaqueNacionalGlobal() {
    return disponibilidadeSaqueNacionalGlobal;
  }
  public void setDisponibilidadeSaqueNacionalGlobal(BigDecimal disponibilidadeSaqueNacionalGlobal) {
    this.disponibilidadeSaqueNacionalGlobal = disponibilidadeSaqueNacionalGlobal;
  }

  
  /**
   * C\u00F3digo identificador do limite disponibilidade log
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do limite disponibilidade log")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador da conta
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo identificador do emissor
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do emissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * Limite de compra internacional
   **/
  @ApiModelProperty(value = "Limite de compra internacional")
  public BigDecimal getLimiteCompraInternacional() {
    return limiteCompraInternacional;
  }
  public void setLimiteCompraInternacional(BigDecimal limiteCompraInternacional) {
    this.limiteCompraInternacional = limiteCompraInternacional;
  }

  
  /**
   * Limite de compra nacional
   **/
  @ApiModelProperty(value = "Limite de compra nacional")
  public BigDecimal getLimiteCompraNacional() {
    return limiteCompraNacional;
  }
  public void setLimiteCompraNacional(BigDecimal limiteCompraNacional) {
    this.limiteCompraNacional = limiteCompraNacional;
  }

  
  /**
   * Limite global de credito do cliente
   **/
  @ApiModelProperty(value = "Limite global de credito do cliente")
  public BigDecimal getLimiteGlobalCredito() {
    return limiteGlobalCredito;
  }
  public void setLimiteGlobalCredito(BigDecimal limiteGlobalCredito) {
    this.limiteGlobalCredito = limiteGlobalCredito;
  }

  
  /**
   * Limite parcelado internacional
   **/
  @ApiModelProperty(value = "Limite parcelado internacional")
  public BigDecimal getLimiteParceladoInternacional() {
    return limiteParceladoInternacional;
  }
  public void setLimiteParceladoInternacional(BigDecimal limiteParceladoInternacional) {
    this.limiteParceladoInternacional = limiteParceladoInternacional;
  }

  
  /**
   * Limite parcelado nacional (valor contrato)
   **/
  @ApiModelProperty(value = "Limite parcelado nacional (valor contrato)")
  public BigDecimal getLimiteParceladoNacional() {
    return limiteParceladoNacional;
  }
  public void setLimiteParceladoNacional(BigDecimal limiteParceladoNacional) {
    this.limiteParceladoNacional = limiteParceladoNacional;
  }

  
  /**
   * Limite parcelas internacional
   **/
  @ApiModelProperty(value = "Limite parcelas internacional")
  public BigDecimal getLimiteParcelasInternacional() {
    return limiteParcelasInternacional;
  }
  public void setLimiteParcelasInternacional(BigDecimal limiteParcelasInternacional) {
    this.limiteParcelasInternacional = limiteParcelasInternacional;
  }

  
  /**
   * Limite parcelas nacional
   **/
  @ApiModelProperty(value = "Limite parcelas nacional")
  public BigDecimal getLimiteParcelasNacional() {
    return limiteParcelasNacional;
  }
  public void setLimiteParcelasNacional(BigDecimal limiteParcelasNacional) {
    this.limiteParcelasNacional = limiteParcelasNacional;
  }

  
  /**
   * Pontua\u00E7\u00E3o da conta
   **/
  @ApiModelProperty(value = "Pontua\u00E7\u00E3o da conta")
  public BigDecimal getLimitePontuacao() {
    return limitePontuacao;
  }
  public void setLimitePontuacao(BigDecimal limitePontuacao) {
    this.limitePontuacao = limitePontuacao;
  }

  
  /**
   * Limite de saque internacional global
   **/
  @ApiModelProperty(value = "Limite de saque internacional global")
  public BigDecimal getLimiteSaqueInternacionalGlobal() {
    return limiteSaqueInternacionalGlobal;
  }
  public void setLimiteSaqueInternacionalGlobal(BigDecimal limiteSaqueInternacionalGlobal) {
    this.limiteSaqueInternacionalGlobal = limiteSaqueInternacionalGlobal;
  }

  
  /**
   * Limite de saque internacional por per\u00EDodo
   **/
  @ApiModelProperty(value = "Limite de saque internacional por per\u00EDodo")
  public BigDecimal getLimiteSaqueInternacionalPeriodo() {
    return limiteSaqueInternacionalPeriodo;
  }
  public void setLimiteSaqueInternacionalPeriodo(BigDecimal limiteSaqueInternacionalPeriodo) {
    this.limiteSaqueInternacionalPeriodo = limiteSaqueInternacionalPeriodo;
  }

  
  /**
   * Limite de saque nacional global
   **/
  @ApiModelProperty(value = "Limite de saque nacional global")
  public BigDecimal getLimiteSaqueNacionalGlobal() {
    return limiteSaqueNacionalGlobal;
  }
  public void setLimiteSaqueNacionalGlobal(BigDecimal limiteSaqueNacionalGlobal) {
    this.limiteSaqueNacionalGlobal = limiteSaqueNacionalGlobal;
  }

  
  /**
   * Limite de saque nacional por per\u00EDodo
   **/
  @ApiModelProperty(value = "Limite de saque nacional por per\u00EDodo")
  public BigDecimal getLimiteSaqueNacionalPeriodo() {
    return limiteSaqueNacionalPeriodo;
  }
  public void setLimiteSaqueNacionalPeriodo(BigDecimal limiteSaqueNacionalPeriodo) {
    this.limiteSaqueNacionalPeriodo = limiteSaqueNacionalPeriodo;
  }

  
  /**
   * Nome da m\u00E1quina da altera\u00E7\u00E3o do limite
   **/
  @ApiModelProperty(value = "Nome da m\u00E1quina da altera\u00E7\u00E3o do limite")
  public String getMaquina() {
    return maquina;
  }
  public void setMaquina(String maquina) {
    this.maquina = maquina;
  }

  
  /**
   * Margem para emprestimos consignados
   **/
  @ApiModelProperty(value = "Margem para emprestimos consignados")
  public BigDecimal getMargemConsignada() {
    return margemConsignada;
  }
  public void setMargemConsignada(BigDecimal margemConsignada) {
    this.margemConsignada = margemConsignada;
  }

  
  /**
   * Ordem da altera\u00E7\u00E3o do limite (I - insert, U - update, D - delete)
   **/
  @ApiModelProperty(value = "Ordem da altera\u00E7\u00E3o do limite (I - insert, U - update, D - delete)")
  public String getOrdemAtualizacao() {
    return ordemAtualizacao;
  }
  public void setOrdemAtualizacao(String ordemAtualizacao) {
    this.ordemAtualizacao = ordemAtualizacao;
  }

  
  /**
   * Tipo da altera\u00E7\u00E3o do limite (I - insert, U - update, D - delete
   **/
  @ApiModelProperty(value = "Tipo da altera\u00E7\u00E3o do limite (I - insert, U - update, D - delete")
  public String getTipoAlteracao() {
    return tipoAlteracao;
  }
  public void setTipoAlteracao(String tipoAlteracao) {
    this.tipoAlteracao = tipoAlteracao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimiteDisponibilidadeLogResponse {\n");
    
    sb.append("  dataAlteracao: ").append(dataAlteracao).append("\n");
    sb.append("  disponibilidadeCompraInternacional: ").append(disponibilidadeCompraInternacional).append("\n");
    sb.append("  disponibilidadeCompraNacional: ").append(disponibilidadeCompraNacional).append("\n");
    sb.append("  disponibilidadeGlobalCredito: ").append(disponibilidadeGlobalCredito).append("\n");
    sb.append("  disponibilidadeParceladoNacional: ").append(disponibilidadeParceladoNacional).append("\n");
    sb.append("  disponibilidadeParcelasNacional: ").append(disponibilidadeParcelasNacional).append("\n");
    sb.append("  disponibilidadeSaqueInternacionalGlobal: ").append(disponibilidadeSaqueInternacionalGlobal).append("\n");
    sb.append("  disponibilidadeSaqueNacionalGlobal: ").append(disponibilidadeSaqueNacionalGlobal).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  limiteCompraInternacional: ").append(limiteCompraInternacional).append("\n");
    sb.append("  limiteCompraNacional: ").append(limiteCompraNacional).append("\n");
    sb.append("  limiteGlobalCredito: ").append(limiteGlobalCredito).append("\n");
    sb.append("  limiteParceladoInternacional: ").append(limiteParceladoInternacional).append("\n");
    sb.append("  limiteParceladoNacional: ").append(limiteParceladoNacional).append("\n");
    sb.append("  limiteParcelasInternacional: ").append(limiteParcelasInternacional).append("\n");
    sb.append("  limiteParcelasNacional: ").append(limiteParcelasNacional).append("\n");
    sb.append("  limitePontuacao: ").append(limitePontuacao).append("\n");
    sb.append("  limiteSaqueInternacionalGlobal: ").append(limiteSaqueInternacionalGlobal).append("\n");
    sb.append("  limiteSaqueInternacionalPeriodo: ").append(limiteSaqueInternacionalPeriodo).append("\n");
    sb.append("  limiteSaqueNacionalGlobal: ").append(limiteSaqueNacionalGlobal).append("\n");
    sb.append("  limiteSaqueNacionalPeriodo: ").append(limiteSaqueNacionalPeriodo).append("\n");
    sb.append("  maquina: ").append(maquina).append("\n");
    sb.append("  margemConsignada: ").append(margemConsignada).append("\n");
    sb.append("  ordemAtualizacao: ").append(ordemAtualizacao).append("\n");
    sb.append("  tipoAlteracao: ").append(tipoAlteracao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
