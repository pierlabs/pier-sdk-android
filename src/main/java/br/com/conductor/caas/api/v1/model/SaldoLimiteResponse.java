package br.com.conductor.caas.api.v1.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class SaldoLimiteResponse  {
  
  @SerializedName("disponibCompraNac")
  private Double disponibCompraNac = null;
  @SerializedName("disponibGlobalCredito")
  private Double disponibGlobalCredito = null;
  @SerializedName("disponibParceladoNac")
  private Double disponibParceladoNac = null;
  @SerializedName("disponibParcelasNac")
  private Double disponibParcelasNac = null;
  @SerializedName("disponibSaqueNacGlobal")
  private Double disponibSaqueNacGlobal = null;
  @SerializedName("flagAntecipacao")
  private Boolean flagAntecipacao = null;
  @SerializedName("limiteCompraNac")
  private Double limiteCompraNac = null;
  @SerializedName("limiteCreditoConcedido")
  private Double limiteCreditoConcedido = null;
  @SerializedName("limiteCreditoDisponivel")
  private Double limiteCreditoDisponivel = null;
  @SerializedName("limiteGlobalCredito")
  private Double limiteGlobalCredito = null;
  @SerializedName("limiteParceladoNac")
  private Double limiteParceladoNac = null;
  @SerializedName("limiteParcelasNac")
  private Double limiteParcelasNac = null;
  @SerializedName("limitePontuacao")
  private Double limitePontuacao = null;
  @SerializedName("limiteSaqueNacGlobal")
  private Double limiteSaqueNacGlobal = null;
  @SerializedName("numeroCiclo")
  private Integer numeroCiclo = null;
  @SerializedName("pontosConcedidos")
  private Double pontosConcedidos = null;
  @SerializedName("pontosRemanescentes")
  private Double pontosRemanescentes = null;
  @SerializedName("proximoVencimentoPadrao")
  private String proximoVencimentoPadrao = null;
  @SerializedName("proximoVencimentoReal")
  private String proximoVencimentoReal = null;
  @SerializedName("saldoAtualFinal")
  private Double saldoAtualFinal = null;
  @SerializedName("saldoCredor")
  private Double saldoCredor = null;
  @SerializedName("saldoDevedor")
  private Double saldoDevedor = null;
  @SerializedName("saldoDevedorOneroso")
  private Double saldoDevedorOneroso = null;
  @SerializedName("saldoDevedorTotal")
  private Double saldoDevedorTotal = null;
  @SerializedName("saltaExtratoAnterior")
  private Double saltaExtratoAnterior = null;
  @SerializedName("totalDisponivelUtilizacao")
  private Double totalDisponivelUtilizacao = null;
  @SerializedName("totalFuturo")
  private Double totalFuturo = null;
  @SerializedName("valorMinimoExtrato")
  private Double valorMinimoExtrato = null;
  @SerializedName("valorMinimoExtratoOriginal")
  private Double valorMinimoExtratoOriginal = null;
  @SerializedName("vencimentoPadraoAnterior")
  private String vencimentoPadraoAnterior = null;
  @SerializedName("vencimentoPosProx")
  private String vencimentoPosProx = null;
  @SerializedName("vencimentoRealAnterior")
  private String vencimentoRealAnterior = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDisponibCompraNac() {
    return disponibCompraNac;
  }
  public void setDisponibCompraNac(Double disponibCompraNac) {
    this.disponibCompraNac = disponibCompraNac;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDisponibGlobalCredito() {
    return disponibGlobalCredito;
  }
  public void setDisponibGlobalCredito(Double disponibGlobalCredito) {
    this.disponibGlobalCredito = disponibGlobalCredito;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDisponibParceladoNac() {
    return disponibParceladoNac;
  }
  public void setDisponibParceladoNac(Double disponibParceladoNac) {
    this.disponibParceladoNac = disponibParceladoNac;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDisponibParcelasNac() {
    return disponibParcelasNac;
  }
  public void setDisponibParcelasNac(Double disponibParcelasNac) {
    this.disponibParcelasNac = disponibParcelasNac;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDisponibSaqueNacGlobal() {
    return disponibSaqueNacGlobal;
  }
  public void setDisponibSaqueNacGlobal(Double disponibSaqueNacGlobal) {
    this.disponibSaqueNacGlobal = disponibSaqueNacGlobal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagAntecipacao() {
    return flagAntecipacao;
  }
  public void setFlagAntecipacao(Boolean flagAntecipacao) {
    this.flagAntecipacao = flagAntecipacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLimiteCompraNac() {
    return limiteCompraNac;
  }
  public void setLimiteCompraNac(Double limiteCompraNac) {
    this.limiteCompraNac = limiteCompraNac;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLimiteCreditoConcedido() {
    return limiteCreditoConcedido;
  }
  public void setLimiteCreditoConcedido(Double limiteCreditoConcedido) {
    this.limiteCreditoConcedido = limiteCreditoConcedido;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLimiteCreditoDisponivel() {
    return limiteCreditoDisponivel;
  }
  public void setLimiteCreditoDisponivel(Double limiteCreditoDisponivel) {
    this.limiteCreditoDisponivel = limiteCreditoDisponivel;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLimiteGlobalCredito() {
    return limiteGlobalCredito;
  }
  public void setLimiteGlobalCredito(Double limiteGlobalCredito) {
    this.limiteGlobalCredito = limiteGlobalCredito;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLimiteParceladoNac() {
    return limiteParceladoNac;
  }
  public void setLimiteParceladoNac(Double limiteParceladoNac) {
    this.limiteParceladoNac = limiteParceladoNac;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLimiteParcelasNac() {
    return limiteParcelasNac;
  }
  public void setLimiteParcelasNac(Double limiteParcelasNac) {
    this.limiteParcelasNac = limiteParcelasNac;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLimitePontuacao() {
    return limitePontuacao;
  }
  public void setLimitePontuacao(Double limitePontuacao) {
    this.limitePontuacao = limitePontuacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLimiteSaqueNacGlobal() {
    return limiteSaqueNacGlobal;
  }
  public void setLimiteSaqueNacGlobal(Double limiteSaqueNacGlobal) {
    this.limiteSaqueNacGlobal = limiteSaqueNacGlobal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumeroCiclo() {
    return numeroCiclo;
  }
  public void setNumeroCiclo(Integer numeroCiclo) {
    this.numeroCiclo = numeroCiclo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPontosConcedidos() {
    return pontosConcedidos;
  }
  public void setPontosConcedidos(Double pontosConcedidos) {
    this.pontosConcedidos = pontosConcedidos;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPontosRemanescentes() {
    return pontosRemanescentes;
  }
  public void setPontosRemanescentes(Double pontosRemanescentes) {
    this.pontosRemanescentes = pontosRemanescentes;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getProximoVencimentoPadrao() {
    return proximoVencimentoPadrao;
  }
  public void setProximoVencimentoPadrao(String proximoVencimentoPadrao) {
    this.proximoVencimentoPadrao = proximoVencimentoPadrao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getProximoVencimentoReal() {
    return proximoVencimentoReal;
  }
  public void setProximoVencimentoReal(String proximoVencimentoReal) {
    this.proximoVencimentoReal = proximoVencimentoReal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(Double saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSaldoCredor() {
    return saldoCredor;
  }
  public void setSaldoCredor(Double saldoCredor) {
    this.saldoCredor = saldoCredor;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSaldoDevedor() {
    return saldoDevedor;
  }
  public void setSaldoDevedor(Double saldoDevedor) {
    this.saldoDevedor = saldoDevedor;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSaldoDevedorOneroso() {
    return saldoDevedorOneroso;
  }
  public void setSaldoDevedorOneroso(Double saldoDevedorOneroso) {
    this.saldoDevedorOneroso = saldoDevedorOneroso;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSaldoDevedorTotal() {
    return saldoDevedorTotal;
  }
  public void setSaldoDevedorTotal(Double saldoDevedorTotal) {
    this.saldoDevedorTotal = saldoDevedorTotal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getSaltaExtratoAnterior() {
    return saltaExtratoAnterior;
  }
  public void setSaltaExtratoAnterior(Double saltaExtratoAnterior) {
    this.saltaExtratoAnterior = saltaExtratoAnterior;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTotalDisponivelUtilizacao() {
    return totalDisponivelUtilizacao;
  }
  public void setTotalDisponivelUtilizacao(Double totalDisponivelUtilizacao) {
    this.totalDisponivelUtilizacao = totalDisponivelUtilizacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTotalFuturo() {
    return totalFuturo;
  }
  public void setTotalFuturo(Double totalFuturo) {
    this.totalFuturo = totalFuturo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getValorMinimoExtrato() {
    return valorMinimoExtrato;
  }
  public void setValorMinimoExtrato(Double valorMinimoExtrato) {
    this.valorMinimoExtrato = valorMinimoExtrato;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getValorMinimoExtratoOriginal() {
    return valorMinimoExtratoOriginal;
  }
  public void setValorMinimoExtratoOriginal(Double valorMinimoExtratoOriginal) {
    this.valorMinimoExtratoOriginal = valorMinimoExtratoOriginal;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getVencimentoPadraoAnterior() {
    return vencimentoPadraoAnterior;
  }
  public void setVencimentoPadraoAnterior(String vencimentoPadraoAnterior) {
    this.vencimentoPadraoAnterior = vencimentoPadraoAnterior;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getVencimentoPosProx() {
    return vencimentoPosProx;
  }
  public void setVencimentoPosProx(String vencimentoPosProx) {
    this.vencimentoPosProx = vencimentoPosProx;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getVencimentoRealAnterior() {
    return vencimentoRealAnterior;
  }
  public void setVencimentoRealAnterior(String vencimentoRealAnterior) {
    this.vencimentoRealAnterior = vencimentoRealAnterior;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaldoLimiteResponse {\n");
    
    sb.append("  disponibCompraNac: ").append(disponibCompraNac).append("\n");
    sb.append("  disponibGlobalCredito: ").append(disponibGlobalCredito).append("\n");
    sb.append("  disponibParceladoNac: ").append(disponibParceladoNac).append("\n");
    sb.append("  disponibParcelasNac: ").append(disponibParcelasNac).append("\n");
    sb.append("  disponibSaqueNacGlobal: ").append(disponibSaqueNacGlobal).append("\n");
    sb.append("  flagAntecipacao: ").append(flagAntecipacao).append("\n");
    sb.append("  limiteCompraNac: ").append(limiteCompraNac).append("\n");
    sb.append("  limiteCreditoConcedido: ").append(limiteCreditoConcedido).append("\n");
    sb.append("  limiteCreditoDisponivel: ").append(limiteCreditoDisponivel).append("\n");
    sb.append("  limiteGlobalCredito: ").append(limiteGlobalCredito).append("\n");
    sb.append("  limiteParceladoNac: ").append(limiteParceladoNac).append("\n");
    sb.append("  limiteParcelasNac: ").append(limiteParcelasNac).append("\n");
    sb.append("  limitePontuacao: ").append(limitePontuacao).append("\n");
    sb.append("  limiteSaqueNacGlobal: ").append(limiteSaqueNacGlobal).append("\n");
    sb.append("  numeroCiclo: ").append(numeroCiclo).append("\n");
    sb.append("  pontosConcedidos: ").append(pontosConcedidos).append("\n");
    sb.append("  pontosRemanescentes: ").append(pontosRemanescentes).append("\n");
    sb.append("  proximoVencimentoPadrao: ").append(proximoVencimentoPadrao).append("\n");
    sb.append("  proximoVencimentoReal: ").append(proximoVencimentoReal).append("\n");
    sb.append("  saldoAtualFinal: ").append(saldoAtualFinal).append("\n");
    sb.append("  saldoCredor: ").append(saldoCredor).append("\n");
    sb.append("  saldoDevedor: ").append(saldoDevedor).append("\n");
    sb.append("  saldoDevedorOneroso: ").append(saldoDevedorOneroso).append("\n");
    sb.append("  saldoDevedorTotal: ").append(saldoDevedorTotal).append("\n");
    sb.append("  saltaExtratoAnterior: ").append(saltaExtratoAnterior).append("\n");
    sb.append("  totalDisponivelUtilizacao: ").append(totalDisponivelUtilizacao).append("\n");
    sb.append("  totalFuturo: ").append(totalFuturo).append("\n");
    sb.append("  valorMinimoExtrato: ").append(valorMinimoExtrato).append("\n");
    sb.append("  valorMinimoExtratoOriginal: ").append(valorMinimoExtratoOriginal).append("\n");
    sb.append("  vencimentoPadraoAnterior: ").append(vencimentoPadraoAnterior).append("\n");
    sb.append("  vencimentoPosProx: ").append(vencimentoPosProx).append("\n");
    sb.append("  vencimentoRealAnterior: ").append(vencimentoRealAnterior).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


