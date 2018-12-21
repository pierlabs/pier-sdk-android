package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Revolving Configuration
 **/
@ApiModel(description = "Revolving Configuration")
public class ConfiguracaoRotativoPersist  {
  
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("compoeOfertaValorRotativo")
  private Boolean compoeOfertaValorRotativo = null;
  @SerializedName("compoeOfertaValorNaoFinanciavel")
  private Boolean compoeOfertaValorNaoFinanciavel = null;
  @SerializedName("compoeOfertaValorNovosLancamentos")
  private Boolean compoeOfertaValorNovosLancamentos = null;
  @SerializedName("recalculaParcelamentoParaEntradaMaior")
  private Boolean recalculaParcelamentoParaEntradaMaior = null;
  @SerializedName("minimoParcelasRecalculoParcelamento")
  private Boolean minimoParcelasRecalculoParcelamento = null;
  @SerializedName("recalculaParcelamento")
  private Boolean recalculaParcelamento = null;
  @SerializedName("numeroMinimoOfertas")
  private Boolean numeroMinimoOfertas = null;
  @SerializedName("aceitaPagamentoMaiorQueEntrada")
  private Boolean aceitaPagamentoMaiorQueEntrada = null;
  @SerializedName("antecipaParcelamentosAbertos")
  private Boolean antecipaParcelamentosAbertos = null;
  @SerializedName("valorMinimoParcela")
  private BigDecimal valorMinimoParcela = null;
  @SerializedName("percentualLimitarValorMinimoParcela")
  private BigDecimal percentualLimitarValorMinimoParcela = null;
  @SerializedName("idRegraCampanha")
  private Long idRegraCampanha = null;
  @SerializedName("parcelarApenasMinimo")
  private Boolean parcelarApenasMinimo = null;
  @SerializedName("usuario")
  private String usuario = null;

  
  /**
   * C?digo de Identifica??o do Produto (idProduto)
   **/
  @ApiModelProperty(value = "C?digo de Identifica??o do Produto (idProduto)")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * When it is true, indicates that the revolving value must compose the installment offer
   **/
  @ApiModelProperty(value = "When it is true, indicates that the revolving value must compose the installment offer")
  public Boolean getCompoeOfertaValorRotativo() {
    return compoeOfertaValorRotativo;
  }
  public void setCompoeOfertaValorRotativo(Boolean compoeOfertaValorRotativo) {
    this.compoeOfertaValorRotativo = compoeOfertaValorRotativo;
  }

  
  /**
   * When it is true, indicate that the non financing value must compose the offer of installment
   **/
  @ApiModelProperty(value = "When it is true, indicate that the non financing value must compose the offer of installment")
  public Boolean getCompoeOfertaValorNaoFinanciavel() {
    return compoeOfertaValorNaoFinanciavel;
  }
  public void setCompoeOfertaValorNaoFinanciavel(Boolean compoeOfertaValorNaoFinanciavel) {
    this.compoeOfertaValorNaoFinanciavel = compoeOfertaValorNaoFinanciavel;
  }

  
  /**
   * When it is true, indicate that the value of the new lauching must have the offer of installment
   **/
  @ApiModelProperty(value = "When it is true, indicate that the value of the new lauching must have the offer of installment")
  public Boolean getCompoeOfertaValorNovosLancamentos() {
    return compoeOfertaValorNovosLancamentos;
  }
  public void setCompoeOfertaValorNovosLancamentos(Boolean compoeOfertaValorNovosLancamentos) {
    this.compoeOfertaValorNovosLancamentos = compoeOfertaValorNovosLancamentos;
  }

  
  /**
   * When it is true, it indicates that must recalculate the installment in case the entrance paid value be higher than the expected value
   **/
  @ApiModelProperty(value = "When it is true, it indicates that must recalculate the installment in case the entrance paid value be higher than the expected value")
  public Boolean getRecalculaParcelamentoParaEntradaMaior() {
    return recalculaParcelamentoParaEntradaMaior;
  }
  public void setRecalculaParcelamentoParaEntradaMaior(Boolean recalculaParcelamentoParaEntradaMaior) {
    this.recalculaParcelamentoParaEntradaMaior = recalculaParcelamentoParaEntradaMaior;
  }

  
  /**
   * Indicate the minimum of parcels that will be abided by the recalculation of the installment
   **/
  @ApiModelProperty(value = "Indicate the minimum of parcels that will be abided by the recalculation of the installment")
  public Boolean getMinimoParcelasRecalculoParcelamento() {
    return minimoParcelasRecalculoParcelamento;
  }
  public void setMinimoParcelasRecalculoParcelamento(Boolean minimoParcelasRecalculoParcelamento) {
    this.minimoParcelasRecalculoParcelamento = minimoParcelasRecalculoParcelamento;
  }

  
  /**
   * when it is true, indicate that the installment must be recalculated in case the value calculated of the offer is inferior to the configurated minimum parcel value (valueMinimumParcel) and the opened percentage
   **/
  @ApiModelProperty(value = "when it is true, indicate that the installment must be recalculated in case the value calculated of the offer is inferior to the configurated minimum parcel value (valueMinimumParcel) and the opened percentage")
  public Boolean getRecalculaParcelamento() {
    return recalculaParcelamento;
  }
  public void setRecalculaParcelamento(Boolean recalculaParcelamento) {
    this.recalculaParcelamento = recalculaParcelamento;
  }

  
  /**
   * Minimum number of parcels that will be abided in the offer recalculate
   **/
  @ApiModelProperty(value = "Minimum number of parcels that will be abided in the offer recalculate")
  public Boolean getNumeroMinimoOfertas() {
    return numeroMinimoOfertas;
  }
  public void setNumeroMinimoOfertas(Boolean numeroMinimoOfertas) {
    this.numeroMinimoOfertas = numeroMinimoOfertas;
  }

  
  /**
   * When it is true, indicates that values paid between the entrance value and the minimum of the invoice will be abided to the accession of the installment
   **/
  @ApiModelProperty(value = "When it is true, indicates that values paid between the entrance value and the minimum of the invoice will be abided to the accession of the installment")
  public Boolean getAceitaPagamentoMaiorQueEntrada() {
    return aceitaPagamentoMaiorQueEntrada;
  }
  public void setAceitaPagamentoMaiorQueEntrada(Boolean aceitaPagamentoMaiorQueEntrada) {
    this.aceitaPagamentoMaiorQueEntrada = aceitaPagamentoMaiorQueEntrada;
  }

  
  /**
   * When it is true, indicates that mus include the value of the installment opened
   **/
  @ApiModelProperty(value = "When it is true, indicates that mus include the value of the installment opened")
  public Boolean getAntecipaParcelamentosAbertos() {
    return antecipaParcelamentosAbertos;
  }
  public void setAntecipaParcelamentosAbertos(Boolean antecipaParcelamentosAbertos) {
    this.antecipaParcelamentosAbertos = antecipaParcelamentosAbertos;
  }

  
  /**
   * Minimum value of the parcel must be accepted in the offer
   **/
  @ApiModelProperty(value = "Minimum value of the parcel must be accepted in the offer")
  public BigDecimal getValorMinimoParcela() {
    return valorMinimoParcela;
  }
  public void setValorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
  }

  
  /**
   * Percentage about the previous installment values opened that must be considered to limit valueMinimumParcel
   **/
  @ApiModelProperty(value = "Percentage about the previous installment values opened that must be considered to limit valueMinimumParcel")
  public BigDecimal getPercentualLimitarValorMinimoParcela() {
    return percentualLimitarValorMinimoParcela;
  }
  public void setPercentualLimitarValorMinimoParcela(BigDecimal percentualLimitarValorMinimoParcela) {
    this.percentualLimitarValorMinimoParcela = percentualLimitarValorMinimoParcela;
  }

  
  /**
   * C?digo de Identifica??o da regra de campanha
   **/
  @ApiModelProperty(value = "C?digo de Identifica??o da regra de campanha")
  public Long getIdRegraCampanha() {
    return idRegraCampanha;
  }
  public void setIdRegraCampanha(Long idRegraCampanha) {
    this.idRegraCampanha = idRegraCampanha;
  }

  
  /**
   * When it is true, indicate that the offered installment will have as value base the minimum value of the transactions
   **/
  @ApiModelProperty(value = "When it is true, indicate that the offered installment will have as value base the minimum value of the transactions")
  public Boolean getParcelarApenasMinimo() {
    return parcelarApenasMinimo;
  }
  public void setParcelarApenasMinimo(Boolean parcelarApenasMinimo) {
    this.parcelarApenasMinimo = parcelarApenasMinimo;
  }

  
  /**
   * Username
   **/
  @ApiModelProperty(value = "Username")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoRotativoPersist {\n");
    
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  compoeOfertaValorRotativo: ").append(compoeOfertaValorRotativo).append("\n");
    sb.append("  compoeOfertaValorNaoFinanciavel: ").append(compoeOfertaValorNaoFinanciavel).append("\n");
    sb.append("  compoeOfertaValorNovosLancamentos: ").append(compoeOfertaValorNovosLancamentos).append("\n");
    sb.append("  recalculaParcelamentoParaEntradaMaior: ").append(recalculaParcelamentoParaEntradaMaior).append("\n");
    sb.append("  minimoParcelasRecalculoParcelamento: ").append(minimoParcelasRecalculoParcelamento).append("\n");
    sb.append("  recalculaParcelamento: ").append(recalculaParcelamento).append("\n");
    sb.append("  numeroMinimoOfertas: ").append(numeroMinimoOfertas).append("\n");
    sb.append("  aceitaPagamentoMaiorQueEntrada: ").append(aceitaPagamentoMaiorQueEntrada).append("\n");
    sb.append("  antecipaParcelamentosAbertos: ").append(antecipaParcelamentosAbertos).append("\n");
    sb.append("  valorMinimoParcela: ").append(valorMinimoParcela).append("\n");
    sb.append("  percentualLimitarValorMinimoParcela: ").append(percentualLimitarValorMinimoParcela).append("\n");
    sb.append("  idRegraCampanha: ").append(idRegraCampanha).append("\n");
    sb.append("  parcelarApenasMinimo: ").append(parcelarApenasMinimo).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
