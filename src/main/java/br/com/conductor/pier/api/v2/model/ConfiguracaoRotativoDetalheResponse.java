package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{configuracao_rotativo_detalhe_response_description}}}
 **/
@ApiModel(description = "{{{configuracao_rotativo_detalhe_response_description}}}")
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
   * {{{configuracao_rotativo_detalhe_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_rotativo_detalhe_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{configuracao_rotativo_detalhe_response_id_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_rotativo_detalhe_response_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{configuracao_rotativo_detalhe_response_compoe_oferta_valor_rotativo_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_rotativo_detalhe_response_compoe_oferta_valor_rotativo_value}}}")
  public Boolean getCompoeOfertaValorRotativo() {
    return compoeOfertaValorRotativo;
  }
  public void setCompoeOfertaValorRotativo(Boolean compoeOfertaValorRotativo) {
    this.compoeOfertaValorRotativo = compoeOfertaValorRotativo;
  }

  
  /**
   * {{{configuracao_rotativo_detalhe_response_compoe_oferta_valor_nao_financiavel_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_rotativo_detalhe_response_compoe_oferta_valor_nao_financiavel_value}}}")
  public Boolean getCompoeOfertaValorNaoFinanciavel() {
    return compoeOfertaValorNaoFinanciavel;
  }
  public void setCompoeOfertaValorNaoFinanciavel(Boolean compoeOfertaValorNaoFinanciavel) {
    this.compoeOfertaValorNaoFinanciavel = compoeOfertaValorNaoFinanciavel;
  }

  
  /**
   * {{{configuracao_rotativo_detalhe_response_compoe_oferta_valor_novos_lancamentos_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_rotativo_detalhe_response_compoe_oferta_valor_novos_lancamentos_value}}}")
  public Boolean getCompoeOfertaValorNovosLancamentos() {
    return compoeOfertaValorNovosLancamentos;
  }
  public void setCompoeOfertaValorNovosLancamentos(Boolean compoeOfertaValorNovosLancamentos) {
    this.compoeOfertaValorNovosLancamentos = compoeOfertaValorNovosLancamentos;
  }

  
  /**
   * {{{configuracao_rotativo_detalhe_response_recalcula_parcelamento_para_entrada_maior_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_rotativo_detalhe_response_recalcula_parcelamento_para_entrada_maior_value}}}")
  public Boolean getRecalculaParcelamentoParaEntradaMaior() {
    return recalculaParcelamentoParaEntradaMaior;
  }
  public void setRecalculaParcelamentoParaEntradaMaior(Boolean recalculaParcelamentoParaEntradaMaior) {
    this.recalculaParcelamentoParaEntradaMaior = recalculaParcelamentoParaEntradaMaior;
  }

  
  /**
   * {{{configuracao_rotativo_detalhe_response_minimo_parcelas_recalculo_parcelamento_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_rotativo_detalhe_response_minimo_parcelas_recalculo_parcelamento_value}}}")
  public Boolean getMinimoParcelasRecalculoParcelamento() {
    return minimoParcelasRecalculoParcelamento;
  }
  public void setMinimoParcelasRecalculoParcelamento(Boolean minimoParcelasRecalculoParcelamento) {
    this.minimoParcelasRecalculoParcelamento = minimoParcelasRecalculoParcelamento;
  }

  
  /**
   * {{{configuracao_rotativo_detalhe_response_recalcula_parcelamento_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_rotativo_detalhe_response_recalcula_parcelamento_value}}}")
  public Boolean getRecalculaParcelamento() {
    return recalculaParcelamento;
  }
  public void setRecalculaParcelamento(Boolean recalculaParcelamento) {
    this.recalculaParcelamento = recalculaParcelamento;
  }

  
  /**
   * {{{configuracao_rotativo_detalhe_response_numero_minimo_ofertas_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_rotativo_detalhe_response_numero_minimo_ofertas_value}}}")
  public Boolean getNumeroMinimoOfertas() {
    return numeroMinimoOfertas;
  }
  public void setNumeroMinimoOfertas(Boolean numeroMinimoOfertas) {
    this.numeroMinimoOfertas = numeroMinimoOfertas;
  }

  
  /**
   * {{{configuracao_rotativo_detalhe_response_aceita_pagamento_maior_que_entrada_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_rotativo_detalhe_response_aceita_pagamento_maior_que_entrada_value}}}")
  public Boolean getAceitaPagamentoMaiorQueEntrada() {
    return aceitaPagamentoMaiorQueEntrada;
  }
  public void setAceitaPagamentoMaiorQueEntrada(Boolean aceitaPagamentoMaiorQueEntrada) {
    this.aceitaPagamentoMaiorQueEntrada = aceitaPagamentoMaiorQueEntrada;
  }

  
  /**
   * {{{configuracao_rotativo_detalhe_response_antecipa_parcelamentos_abertos_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_rotativo_detalhe_response_antecipa_parcelamentos_abertos_value}}}")
  public Boolean getAntecipaParcelamentosAbertos() {
    return antecipaParcelamentosAbertos;
  }
  public void setAntecipaParcelamentosAbertos(Boolean antecipaParcelamentosAbertos) {
    this.antecipaParcelamentosAbertos = antecipaParcelamentosAbertos;
  }

  
  /**
   * {{{configuracao_rotativo_detalhe_response_valor_minimo_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_rotativo_detalhe_response_valor_minimo_parcela_value}}}")
  public BigDecimal getValorMinimoParcela() {
    return valorMinimoParcela;
  }
  public void setValorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
  }

  
  /**
   * {{{configuracao_rotativo_detalhe_response_percentual_limitar_valor_minimo_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_rotativo_detalhe_response_percentual_limitar_valor_minimo_parcela_value}}}")
  public BigDecimal getPercentualLimitarValorMinimoParcela() {
    return percentualLimitarValorMinimoParcela;
  }
  public void setPercentualLimitarValorMinimoParcela(BigDecimal percentualLimitarValorMinimoParcela) {
    this.percentualLimitarValorMinimoParcela = percentualLimitarValorMinimoParcela;
  }

  
  /**
   * {{{configuracao_rotativo_detalhe_response_id_regra_campanha_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_rotativo_detalhe_response_id_regra_campanha_value}}}")
  public Long getIdRegraCampanha() {
    return idRegraCampanha;
  }
  public void setIdRegraCampanha(Long idRegraCampanha) {
    this.idRegraCampanha = idRegraCampanha;
  }

  
  /**
   * {{{configuracao_rotativo_detalhe_response_parcelar_apenas_minimo_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_rotativo_detalhe_response_parcelar_apenas_minimo_value}}}")
  public Boolean getParcelarApenasMinimo() {
    return parcelarApenasMinimo;
  }
  public void setParcelarApenasMinimo(Boolean parcelarApenasMinimo) {
    this.parcelarApenasMinimo = parcelarApenasMinimo;
  }

  
  /**
   * {{{configuracao_rotativo_detalhe_response_usuario_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_rotativo_detalhe_response_usuario_value}}}")
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
