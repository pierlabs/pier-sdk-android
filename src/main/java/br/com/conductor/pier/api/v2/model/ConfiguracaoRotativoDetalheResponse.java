package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto conta
 **/
@ApiModel(description = "Objeto conta")
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
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o de ConfiguracaoRotativo (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o de ConfiguracaoRotativo (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (idProduto).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (idProduto).")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Quando verdadeiro, indica que o valor do rotativo deve compor a oferta de parcelamento.
   **/
  @ApiModelProperty(value = "Quando verdadeiro, indica que o valor do rotativo deve compor a oferta de parcelamento.")
  public Boolean getCompoeOfertaValorRotativo() {
    return compoeOfertaValorRotativo;
  }
  public void setCompoeOfertaValorRotativo(Boolean compoeOfertaValorRotativo) {
    this.compoeOfertaValorRotativo = compoeOfertaValorRotativo;
  }

  
  /**
   * Quando verdadeiro, indica que o valor n\u00C3\u00A3o financi\u00C3\u00A1vel deve compor a oferta de parcelamento.
   **/
  @ApiModelProperty(value = "Quando verdadeiro, indica que o valor n\u00C3\u00A3o financi\u00C3\u00A1vel deve compor a oferta de parcelamento.")
  public Boolean getCompoeOfertaValorNaoFinanciavel() {
    return compoeOfertaValorNaoFinanciavel;
  }
  public void setCompoeOfertaValorNaoFinanciavel(Boolean compoeOfertaValorNaoFinanciavel) {
    this.compoeOfertaValorNaoFinanciavel = compoeOfertaValorNaoFinanciavel;
  }

  
  /**
   * Quando verdadeiro, indica que o valor de novos lan\u00C3\u00A7amentos deve compor a oferta de parcelamento
   **/
  @ApiModelProperty(value = "Quando verdadeiro, indica que o valor de novos lan\u00C3\u00A7amentos deve compor a oferta de parcelamento")
  public Boolean getCompoeOfertaValorNovosLancamentos() {
    return compoeOfertaValorNovosLancamentos;
  }
  public void setCompoeOfertaValorNovosLancamentos(Boolean compoeOfertaValorNovosLancamentos) {
    this.compoeOfertaValorNovosLancamentos = compoeOfertaValorNovosLancamentos;
  }

  
  /**
   * Quando verdadeiro, indica que deve recalcular o parcelamento caso o valor pago de entrada seja maior que o valor esperado
   **/
  @ApiModelProperty(value = "Quando verdadeiro, indica que deve recalcular o parcelamento caso o valor pago de entrada seja maior que o valor esperado")
  public Boolean getRecalculaParcelamentoParaEntradaMaior() {
    return recalculaParcelamentoParaEntradaMaior;
  }
  public void setRecalculaParcelamentoParaEntradaMaior(Boolean recalculaParcelamentoParaEntradaMaior) {
    this.recalculaParcelamentoParaEntradaMaior = recalculaParcelamentoParaEntradaMaior;
  }

  
  /**
   * Indica o m\u00C3\u00ADnimo de parcelas que ser\u00C3\u00A1 acatado no rec\u00C3\u00A1lculo do parcelamento.
   **/
  @ApiModelProperty(value = "Indica o m\u00C3\u00ADnimo de parcelas que ser\u00C3\u00A1 acatado no rec\u00C3\u00A1lculo do parcelamento.")
  public Boolean getMinimoParcelasRecalculoParcelamento() {
    return minimoParcelasRecalculoParcelamento;
  }
  public void setMinimoParcelasRecalculoParcelamento(Boolean minimoParcelasRecalculoParcelamento) {
    this.minimoParcelasRecalculoParcelamento = minimoParcelasRecalculoParcelamento;
  }

  
  /**
   * Quando verdadeiro, indica que o parcelamento deve ser recalculado caso o valor calculado da oferta seja inferior ao valor configurado m\u00C3\u00ADnimo da parcela (valorMinimoParcela) e de percentual aberto
   **/
  @ApiModelProperty(value = "Quando verdadeiro, indica que o parcelamento deve ser recalculado caso o valor calculado da oferta seja inferior ao valor configurado m\u00C3\u00ADnimo da parcela (valorMinimoParcela) e de percentual aberto")
  public Boolean getRecalculaParcelamento() {
    return recalculaParcelamento;
  }
  public void setRecalculaParcelamento(Boolean recalculaParcelamento) {
    this.recalculaParcelamento = recalculaParcelamento;
  }

  
  /**
   * N\u00C3\u00BAmero m\u00C3\u00ADnimo de parcelas que ser\u00C3\u00A1 acatado no recalculo da oferta.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero m\u00C3\u00ADnimo de parcelas que ser\u00C3\u00A1 acatado no recalculo da oferta.")
  public Boolean getNumeroMinimoOfertas() {
    return numeroMinimoOfertas;
  }
  public void setNumeroMinimoOfertas(Boolean numeroMinimoOfertas) {
    this.numeroMinimoOfertas = numeroMinimoOfertas;
  }

  
  /**
   * Quando verdadeiro, indica que valores pagos entre o valor da entrada e o m\u00C3\u00ADnimo da fatura ser\u00C3\u00A3o acatados para a ades\u00C3\u00A3o ao parcelamento
   **/
  @ApiModelProperty(value = "Quando verdadeiro, indica que valores pagos entre o valor da entrada e o m\u00C3\u00ADnimo da fatura ser\u00C3\u00A3o acatados para a ades\u00C3\u00A3o ao parcelamento")
  public Boolean getAceitaPagamentoMaiorQueEntrada() {
    return aceitaPagamentoMaiorQueEntrada;
  }
  public void setAceitaPagamentoMaiorQueEntrada(Boolean aceitaPagamentoMaiorQueEntrada) {
    this.aceitaPagamentoMaiorQueEntrada = aceitaPagamentoMaiorQueEntrada;
  }

  
  /**
   * Quando verdadeiro, indica que deve-se incluir o valor presente dos parcelamentos em aberto.
   **/
  @ApiModelProperty(value = "Quando verdadeiro, indica que deve-se incluir o valor presente dos parcelamentos em aberto.")
  public Boolean getAntecipaParcelamentosAbertos() {
    return antecipaParcelamentosAbertos;
  }
  public void setAntecipaParcelamentosAbertos(Boolean antecipaParcelamentosAbertos) {
    this.antecipaParcelamentosAbertos = antecipaParcelamentosAbertos;
  }

  
  /**
   * Valor m\u00C3\u00ADnimo da parcela que deve ser aceito na oferta.
   **/
  @ApiModelProperty(value = "Valor m\u00C3\u00ADnimo da parcela que deve ser aceito na oferta.")
  public BigDecimal getValorMinimoParcela() {
    return valorMinimoParcela;
  }
  public void setValorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
  }

  
  /**
   * Percentual sobre os valores de parcelamento anteriores em aberto que deve ser considerado para limitar valorMinimoParcela.
   **/
  @ApiModelProperty(value = "Percentual sobre os valores de parcelamento anteriores em aberto que deve ser considerado para limitar valorMinimoParcela.")
  public BigDecimal getPercentualLimitarValorMinimoParcela() {
    return percentualLimitarValorMinimoParcela;
  }
  public void setPercentualLimitarValorMinimoParcela(BigDecimal percentualLimitarValorMinimoParcela) {
    this.percentualLimitarValorMinimoParcela = percentualLimitarValorMinimoParcela;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da regra de campanha.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da regra de campanha.")
  public Long getIdRegraCampanha() {
    return idRegraCampanha;
  }
  public void setIdRegraCampanha(Long idRegraCampanha) {
    this.idRegraCampanha = idRegraCampanha;
  }

  
  /**
   * Quando verdadeiro, indica que parcelamento ofertado ter\u00C3\u00A1 como valor base o valor m\u00C3\u00ADnimo das transa\u00C3\u00A7\u00C3\u00B5es.
   **/
  @ApiModelProperty(value = "Quando verdadeiro, indica que parcelamento ofertado ter\u00C3\u00A1 como valor base o valor m\u00C3\u00ADnimo das transa\u00C3\u00A7\u00C3\u00B5es.")
  public Boolean getParcelarApenasMinimo() {
    return parcelarApenasMinimo;
  }
  public void setParcelarApenasMinimo(Boolean parcelarApenasMinimo) {
    this.parcelarApenasMinimo = parcelarApenasMinimo;
  }

  
  /**
   * Nome do usu\u00C3\u00A1rio.
   **/
  @ApiModelProperty(value = "Nome do usu\u00C3\u00A1rio.")
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


