package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object account
 **/
@ApiModel(description = "Object account")
public class ConfiguracaoRotativoDetalheResponse  {
  
  @SerializedName("id")
  private Long id = null;
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
   * Identification Code of the ConfigurationRevolving (id)
   **/
  @ApiModelProperty(value = "Identification Code of the ConfigurationRevolving (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Product (idProduct)
   **/
  @ApiModelProperty(value = "Identification Code of the Product (idProduct)")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * When it is true, indicate that the value of the revolving must have the offer of the installment
   **/
  @ApiModelProperty(value = "When it is true, indicate that the value of the revolving must have the offer of the installment")
  public Boolean getCompoeOfertaValorRotativo() {
    return compoeOfertaValorRotativo;
  }
  public void setCompoeOfertaValorRotativo(Boolean compoeOfertaValorRotativo) {
    this.compoeOfertaValorRotativo = compoeOfertaValorRotativo;
  }

  
  /**
   * when it is true, indicate that the value not financigable must have the offer of installment
   **/
  @ApiModelProperty(value = "when it is true, indicate that the value not financigable must have the offer of installment")
  public Boolean getCompoeOfertaValorNaoFinanciavel() {
    return compoeOfertaValorNaoFinanciavel;
  }
  public void setCompoeOfertaValorNaoFinanciavel(Boolean compoeOfertaValorNaoFinanciavel) {
    this.compoeOfertaValorNaoFinanciavel = compoeOfertaValorNaoFinanciavel;
  }

  
  /**
   * when it is true, indicate that the value of new postings must have the offer of installment
   **/
  @ApiModelProperty(value = "when it is true, indicate that the value of new postings must have the offer of installment")
  public Boolean getCompoeOfertaValorNovosLancamentos() {
    return compoeOfertaValorNovosLancamentos;
  }
  public void setCompoeOfertaValorNovosLancamentos(Boolean compoeOfertaValorNovosLancamentos) {
    this.compoeOfertaValorNovosLancamentos = compoeOfertaValorNovosLancamentos;
  }

  
  /**
   * When it is true, indicate that it must recalculate the installment in case of the value paid of entrance be bigger than the value awaited
   **/
  @ApiModelProperty(value = "When it is true, indicate that it must recalculate the installment in case of the value paid of entrance be bigger than the value awaited")
  public Boolean getRecalculaParcelamentoParaEntradaMaior() {
    return recalculaParcelamentoParaEntradaMaior;
  }
  public void setRecalculaParcelamentoParaEntradaMaior(Boolean recalculaParcelamentoParaEntradaMaior) {
    this.recalculaParcelamentoParaEntradaMaior = recalculaParcelamentoParaEntradaMaior;
  }

  
  /**
   * Indicate the minimum of the parcels that will be obeyed in the recalculation of the installment
   **/
  @ApiModelProperty(value = "Indicate the minimum of the parcels that will be obeyed in the recalculation of the installment")
  public Boolean getMinimoParcelasRecalculoParcelamento() {
    return minimoParcelasRecalculoParcelamento;
  }
  public void setMinimoParcelasRecalculoParcelamento(Boolean minimoParcelasRecalculoParcelamento) {
    this.minimoParcelasRecalculoParcelamento = minimoParcelasRecalculoParcelamento;
  }

  
  /**
   * When it is true, indicate that the installment must be recalculated in case of the value calculated of the offer be less than the value configurated minimum of the invoioce (valueMinimumParcel) and the percentage opened
   **/
  @ApiModelProperty(value = "When it is true, indicate that the installment must be recalculated in case of the value calculated of the offer be less than the value configurated minimum of the invoioce (valueMinimumParcel) and the percentage opened")
  public Boolean getRecalculaParcelamento() {
    return recalculaParcelamento;
  }
  public void setRecalculaParcelamento(Boolean recalculaParcelamento) {
    this.recalculaParcelamento = recalculaParcelamento;
  }

  
  /**
   * Minimum number of parcels that will be obeyed in the recalculation of the offer
   **/
  @ApiModelProperty(value = "Minimum number of parcels that will be obeyed in the recalculation of the offer")
  public Boolean getNumeroMinimoOfertas() {
    return numeroMinimoOfertas;
  }
  public void setNumeroMinimoOfertas(Boolean numeroMinimoOfertas) {
    this.numeroMinimoOfertas = numeroMinimoOfertas;
  }

  
  /**
   * when it is true, indicate the paid values between the entrance value and the invoice minimum will be obeyed for the accession to the installment
   **/
  @ApiModelProperty(value = "when it is true, indicate the paid values between the entrance value and the invoice minimum will be obeyed for the accession to the installment")
  public Boolean getAceitaPagamentoMaiorQueEntrada() {
    return aceitaPagamentoMaiorQueEntrada;
  }
  public void setAceitaPagamentoMaiorQueEntrada(Boolean aceitaPagamentoMaiorQueEntrada) {
    this.aceitaPagamentoMaiorQueEntrada = aceitaPagamentoMaiorQueEntrada;
  }

  
  /**
   * When it is true, indicate that it must include the current values of the opened installment
   **/
  @ApiModelProperty(value = "When it is true, indicate that it must include the current values of the opened installment")
  public Boolean getAntecipaParcelamentosAbertos() {
    return antecipaParcelamentosAbertos;
  }
  public void setAntecipaParcelamentosAbertos(Boolean antecipaParcelamentosAbertos) {
    this.antecipaParcelamentosAbertos = antecipaParcelamentosAbertos;
  }

  
  /**
   * Minimum value of the parcel that must be accepted in the offer
   **/
  @ApiModelProperty(value = "Minimum value of the parcel that must be accepted in the offer")
  public BigDecimal getValorMinimoParcela() {
    return valorMinimoParcela;
  }
  public void setValorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
  }

  
  /**
   * Percentage on the values of previous installment opened that must be considered to limit valueMinimumParcel
   **/
  @ApiModelProperty(value = "Percentage on the values of previous installment opened that must be considered to limit valueMinimumParcel")
  public BigDecimal getPercentualLimitarValorMinimoParcela() {
    return percentualLimitarValorMinimoParcela;
  }
  public void setPercentualLimitarValorMinimoParcela(BigDecimal percentualLimitarValorMinimoParcela) {
    this.percentualLimitarValorMinimoParcela = percentualLimitarValorMinimoParcela;
  }

  
  /**
   * Identification Code of the Campaign Rule
   **/
  @ApiModelProperty(value = "Identification Code of the Campaign Rule")
  public Long getIdRegraCampanha() {
    return idRegraCampanha;
  }
  public void setIdRegraCampanha(Long idRegraCampanha) {
    this.idRegraCampanha = idRegraCampanha;
  }

  
  /**
   * When it is true, indicate the installment offered will have the minimum value of the transactions
   **/
  @ApiModelProperty(value = "When it is true, indicate the installment offered will have the minimum value of the transactions")
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
    sb.append("class ConfiguracaoRotativoDetalheResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
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
