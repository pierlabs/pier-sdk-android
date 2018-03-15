package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Fatura Consignada detalhe
 **/
@ApiModel(description = "Fatura Consignada detalhe")
public class FaturaConsignadaDetalheResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;
  @SerializedName("flagEmiteFatura")
  private Integer flagEmiteFatura = null;
  @SerializedName("limiteCompra")
  private BigDecimal limiteCompra = null;
  @SerializedName("dataVencimentoFatura")
  private String dataVencimentoFatura = null;
  @SerializedName("limiteParcelado")
  private BigDecimal limiteParcelado = null;
  @SerializedName("limiteParcelas")
  private BigDecimal limiteParcelas = null;
  @SerializedName("valorTotalFatura")
  private BigDecimal valorTotalFatura = null;
  @SerializedName("valorFaturaAnterior")
  private BigDecimal valorFaturaAnterior = null;
  @SerializedName("valorPagamentoMinimo")
  private BigDecimal valorPagamentoMinimo = null;
  @SerializedName("valorPagamentoConsignado")
  private BigDecimal valorPagamentoConsignado = null;
  @SerializedName("limiteSaqueGlobal")
  private BigDecimal limiteSaqueGlobal = null;
  @SerializedName("valorPagamentoComplementar")
  private BigDecimal valorPagamentoComplementar = null;
  @SerializedName("limiteSaquePeriodo")
  private BigDecimal limiteSaquePeriodo = null;
  @SerializedName("totalComprasNacionais")
  private BigDecimal totalComprasNacionais = null;
  @SerializedName("limiteConsignado")
  private BigDecimal limiteConsignado = null;
  @SerializedName("totalComprasInternacionas")
  private BigDecimal totalComprasInternacionas = null;
  @SerializedName("limiteInternacionalCompra")
  private BigDecimal limiteInternacionalCompra = null;
  @SerializedName("totalSaquesNacionais")
  private BigDecimal totalSaquesNacionais = null;
  @SerializedName("limiteInternacionalParcelado")
  private BigDecimal limiteInternacionalParcelado = null;
  @SerializedName("totalSaquesInternacionais")
  private BigDecimal totalSaquesInternacionais = null;
  @SerializedName("limiteInternacionalParcelas")
  private BigDecimal limiteInternacionalParcelas = null;
  @SerializedName("totalDebitosNacionais")
  private BigDecimal totalDebitosNacionais = null;
  @SerializedName("limiteInternacionalSaqueGlobal")
  private BigDecimal limiteInternacionalSaqueGlobal = null;
  @SerializedName("totalDebitosRecorrentes")
  private BigDecimal totalDebitosRecorrentes = null;
  @SerializedName("limiteInternacionalSaquePeriodo")
  private BigDecimal limiteInternacionalSaquePeriodo = null;
  @SerializedName("totalDebitosInternacionais")
  private BigDecimal totalDebitosInternacionais = null;
  @SerializedName("saldoDisponivelGlobal")
  private BigDecimal saldoDisponivelGlobal = null;
  @SerializedName("totalDebitosDiversosNacionais")
  private BigDecimal totalDebitosDiversosNacionais = null;
  @SerializedName("saldoDisponivelCompra")
  private BigDecimal saldoDisponivelCompra = null;
  @SerializedName("totalDebitosOpcionais")
  private BigDecimal totalDebitosOpcionais = null;
  @SerializedName("saldoDisponivelParcelado")
  private BigDecimal saldoDisponivelParcelado = null;
  @SerializedName("totalPagamentos")
  private BigDecimal totalPagamentos = null;
  @SerializedName("saldoDisponivelParcelas")
  private BigDecimal saldoDisponivelParcelas = null;
  @SerializedName("totalCreditosNacionais")
  private BigDecimal totalCreditosNacionais = null;
  @SerializedName("totalAjustes")
  private BigDecimal totalAjustes = null;
  @SerializedName("totalTarifas")
  private BigDecimal totalTarifas = null;
  @SerializedName("totalMulta")
  private BigDecimal totalMulta = null;
  @SerializedName("saldoDisponivelSaque")
  private BigDecimal saldoDisponivelSaque = null;
  @SerializedName("totalJuros")
  private BigDecimal totalJuros = null;
  @SerializedName("saldoPontosFidelidade")
  private BigDecimal saldoPontosFidelidade = null;
  @SerializedName("taxaRotativo")
  private BigDecimal taxaRotativo = null;
  @SerializedName("saldoDisponivelCompraInternacional")
  private BigDecimal saldoDisponivelCompraInternacional = null;
  @SerializedName("taxaSaque")
  private BigDecimal taxaSaque = null;
  @SerializedName("saldoDisponivelSaqueInternacional")
  private BigDecimal saldoDisponivelSaqueInternacional = null;
  @SerializedName("taxaMaximaProximoPeriodo")
  private BigDecimal taxaMaximaProximoPeriodo = null;
  @SerializedName("totalServicos")
  private BigDecimal totalServicos = null;

  
  /**
   * C\u00F3digo identificador da fatura.
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da fatura.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador da conta (id).
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da conta (id).")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Apresenta o valor do limite de cr\u00E9dito que o portador do cart\u00E3o possui.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o valor do limite de cr\u00E9dito que o portador do cart\u00E3o possui.")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * C\u00F3digo identificador da conta a qual a fatura se refere.
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da conta a qual a fatura se refere.")
  public Integer getFlagEmiteFatura() {
    return flagEmiteFatura;
  }
  public void setFlagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para uso exclusivo em Compras Nacionais.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para uso exclusivo em Compras Nacionais.")
  public BigDecimal getLimiteCompra() {
    return limiteCompra;
  }
  public void setLimiteCompra(BigDecimal limiteCompra) {
    this.limiteCompra = limiteCompra;
  }

  
  /**
   * Data de vencimento da fatura.
   **/
  @ApiModelProperty(value = "Data de vencimento da fatura.")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para realizar transa\u00E7\u00F5es de compras parceladas.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para realizar transa\u00E7\u00F5es de compras parceladas.")
  public BigDecimal getLimiteParcelado() {
    return limiteParcelado;
  }
  public void setLimiteParcelado(BigDecimal limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que portador pode acumular a partir da soma das parcelas das compras que forem realizadas nesta modalidade.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que portador pode acumular a partir da soma das parcelas das compras que forem realizadas nesta modalidade.")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Valor para pagamento total da fatura.
   **/
  @ApiModelProperty(value = "Valor para pagamento total da fatura.")
  public BigDecimal getValorTotalFatura() {
    return valorTotalFatura;
  }
  public void setValorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
  }

  
  /**
   * Valor total da fatura anterior.
   **/
  @ApiModelProperty(value = "Valor total da fatura anterior.")
  public BigDecimal getValorFaturaAnterior() {
    return valorFaturaAnterior;
  }
  public void setValorFaturaAnterior(BigDecimal valorFaturaAnterior) {
    this.valorFaturaAnterior = valorFaturaAnterior;
  }

  
  /**
   * Valor m\u00EDnimo para pagamento da fatura.
   **/
  @ApiModelProperty(value = "Valor m\u00EDnimo para pagamento da fatura.")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * Valor da fatura pago atrav\u00E9s de desconto em folha.
   **/
  @ApiModelProperty(value = "Valor da fatura pago atrav\u00E9s de desconto em folha.")
  public BigDecimal getValorPagamentoConsignado() {
    return valorPagamentoConsignado;
  }
  public void setValorPagamentoConsignado(BigDecimal valorPagamentoConsignado) {
    this.valorPagamentoConsignado = valorPagamentoConsignado;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Nacional.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Nacional.")
  public BigDecimal getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * Valor complementar para considerar o pagamento m\u00EDnimo da fatura.
   **/
  @ApiModelProperty(value = "Valor complementar para considerar o pagamento m\u00EDnimo da fatura.")
  public BigDecimal getValorPagamentoComplementar() {
    return valorPagamentoComplementar;
  }
  public void setValorPagamentoComplementar(BigDecimal valorPagamentoComplementar) {
    this.valorPagamentoComplementar = valorPagamentoComplementar;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Nacional dentro de cada ciclo de faturamento.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Nacional dentro de cada ciclo de faturamento.")
  public BigDecimal getLimiteSaquePeriodo() {
    return limiteSaquePeriodo;
  }
  public void setLimiteSaquePeriodo(BigDecimal limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
  }

  
  /**
   * Valor total das compras nacionais lan\u00E7adas na fatura.
   **/
  @ApiModelProperty(value = "Valor total das compras nacionais lan\u00E7adas na fatura.")
  public BigDecimal getTotalComprasNacionais() {
    return totalComprasNacionais;
  }
  public void setTotalComprasNacionais(BigDecimal totalComprasNacionais) {
    this.totalComprasNacionais = totalComprasNacionais;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor da margem de cr\u00E9dito que ele poder\u00E1 utilizar para ser cobrado de forma consignada (desconto em folha) em seu sal\u00E1rio/vencimentos.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor da margem de cr\u00E9dito que ele poder\u00E1 utilizar para ser cobrado de forma consignada (desconto em folha) em seu sal\u00E1rio/vencimentos.")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * Valor total das compras internacionais lan\u00E7adas na fatura.
   **/
  @ApiModelProperty(value = "Valor total das compras internacionais lan\u00E7adas na fatura.")
  public BigDecimal getTotalComprasInternacionas() {
    return totalComprasInternacionas;
  }
  public void setTotalComprasInternacionas(BigDecimal totalComprasInternacionas) {
    this.totalComprasInternacionas = totalComprasInternacionas;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para uso exclusivo em Compras Internacionais.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para uso exclusivo em Compras Internacionais.")
  public BigDecimal getLimiteInternacionalCompra() {
    return limiteInternacionalCompra;
  }
  public void setLimiteInternacionalCompra(BigDecimal limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
  }

  
  /**
   * Valor total dos saques nacionais lan\u00E7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos saques nacionais lan\u00E7ados na fatura.")
  public BigDecimal getTotalSaquesNacionais() {
    return totalSaquesNacionais;
  }
  public void setTotalSaquesNacionais(BigDecimal totalSaquesNacionais) {
    this.totalSaquesNacionais = totalSaquesNacionais;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para realizar transa\u00E7\u00F5es Internacionais de Compras Parceladas.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para realizar transa\u00E7\u00F5es Internacionais de Compras Parceladas.")
  public BigDecimal getLimiteInternacionalParcelado() {
    return limiteInternacionalParcelado;
  }
  public void setLimiteInternacionalParcelado(BigDecimal limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
  }

  
  /**
   * Valor total dos saques internacionais lan\u00E7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos saques internacionais lan\u00E7ados na fatura.")
  public BigDecimal getTotalSaquesInternacionais() {
    return totalSaquesInternacionais;
  }
  public void setTotalSaquesInternacionais(BigDecimal totalSaquesInternacionais) {
    this.totalSaquesInternacionais = totalSaquesInternacionais;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que portador pode acumular a partir da soma das parcelas das compras internacionais que forem realizadas nesta modalidade.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que portador pode acumular a partir da soma das parcelas das compras internacionais que forem realizadas nesta modalidade.")
  public BigDecimal getLimiteInternacionalParcelas() {
    return limiteInternacionalParcelas;
  }
  public void setLimiteInternacionalParcelas(BigDecimal limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
  }

  
  /**
   * Valor total dos d\u00E9bitos nacionais lan\u00E7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos d\u00E9bitos nacionais lan\u00E7ados na fatura.")
  public BigDecimal getTotalDebitosNacionais() {
    return totalDebitosNacionais;
  }
  public void setTotalDebitosNacionais(BigDecimal totalDebitosNacionais) {
    this.totalDebitosNacionais = totalDebitosNacionais;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Internacional.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Internacional.")
  public BigDecimal getLimiteInternacionalSaqueGlobal() {
    return limiteInternacionalSaqueGlobal;
  }
  public void setLimiteInternacionalSaqueGlobal(BigDecimal limiteInternacionalSaqueGlobal) {
    this.limiteInternacionalSaqueGlobal = limiteInternacionalSaqueGlobal;
  }

  
  /**
   * Valor total dos d\u00E9bitos recorrentes lan\u00E7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos d\u00E9bitos recorrentes lan\u00E7ados na fatura.")
  public BigDecimal getTotalDebitosRecorrentes() {
    return totalDebitosRecorrentes;
  }
  public void setTotalDebitosRecorrentes(BigDecimal totalDebitosRecorrentes) {
    this.totalDebitosRecorrentes = totalDebitosRecorrentes;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Internacional dentro de cada ciclo de faturamento.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Internacional dentro de cada ciclo de faturamento.")
  public BigDecimal getLimiteInternacionalSaquePeriodo() {
    return limiteInternacionalSaquePeriodo;
  }
  public void setLimiteInternacionalSaquePeriodo(BigDecimal limiteInternacionalSaquePeriodo) {
    this.limiteInternacionalSaquePeriodo = limiteInternacionalSaquePeriodo;
  }

  
  /**
   * Valor total dos d\u00E9bitos internacionais lan\u00E7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos d\u00E9bitos internacionais lan\u00E7ados na fatura.")
  public BigDecimal getTotalDebitosInternacionais() {
    return totalDebitosInternacionais;
  }
  public void setTotalDebitosInternacionais(BigDecimal totalDebitosInternacionais) {
    this.totalDebitosInternacionais = totalDebitosInternacionais;
  }

  
  /**
   * Apresenta o valor de cr\u00E9dito que o portador possui dispon\u00EDvel para realizar transa\u00E7\u00F5es.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o valor de cr\u00E9dito que o portador possui dispon\u00EDvel para realizar transa\u00E7\u00F5es.")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   * Valor total dos d\u00E9bitos diversos nacionais lan\u00E7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos d\u00E9bitos diversos nacionais lan\u00E7ados na fatura.")
  public BigDecimal getTotalDebitosDiversosNacionais() {
    return totalDebitosDiversosNacionais;
  }
  public void setTotalDebitosDiversosNacionais(BigDecimal totalDebitosDiversosNacionais) {
    this.totalDebitosDiversosNacionais = totalDebitosDiversosNacionais;
  }

  
  /**
   * Quando utilizado pelo emissor a modalidade limiteCompra, este campo apresentar\u00E1 o valor de cr\u00E9dito que o portador possui dispon\u00EDvel para realizar transa\u00E7\u00F5es de compra Nacional.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor a modalidade limiteCompra, este campo apresentar\u00E1 o valor de cr\u00E9dito que o portador possui dispon\u00EDvel para realizar transa\u00E7\u00F5es de compra Nacional.")
  public BigDecimal getSaldoDisponivelCompra() {
    return saldoDisponivelCompra;
  }
  public void setSaldoDisponivelCompra(BigDecimal saldoDisponivelCompra) {
    this.saldoDisponivelCompra = saldoDisponivelCompra;
  }

  
  /**
   * Valor total dos d\u00E9bitos diversos opcionais lan\u00E7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos d\u00E9bitos diversos opcionais lan\u00E7ados na fatura.")
  public BigDecimal getTotalDebitosOpcionais() {
    return totalDebitosOpcionais;
  }
  public void setTotalDebitosOpcionais(BigDecimal totalDebitosOpcionais) {
    this.totalDebitosOpcionais = totalDebitosOpcionais;
  }

  
  /**
   * Quando utilizado pelo emissor a modalidade limiteParcelado, este campo apresentar\u00E1 o valor de cr\u00E9dito que o portador possui dispon\u00EDvel para realizar transa\u00E7\u00F5es de compra Nacional.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor a modalidade limiteParcelado, este campo apresentar\u00E1 o valor de cr\u00E9dito que o portador possui dispon\u00EDvel para realizar transa\u00E7\u00F5es de compra Nacional.")
  public BigDecimal getSaldoDisponivelParcelado() {
    return saldoDisponivelParcelado;
  }
  public void setSaldoDisponivelParcelado(BigDecimal saldoDisponivelParcelado) {
    this.saldoDisponivelParcelado = saldoDisponivelParcelado;
  }

  
  /**
   * Valor total dos pagamentos lan\u00E7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos pagamentos lan\u00E7ados na fatura.")
  public BigDecimal getTotalPagamentos() {
    return totalPagamentos;
  }
  public void setTotalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
  }

  
  /**
   * Quando utilizado pelo emissor a modalidade limiteParcelas, este campo apresentar\u00E1 o valor de cr\u00E9dito que o portador possui dispon\u00EDvel para utilizar como valor de parcelas Nacionais em um determinado ciclo de faturamento.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor a modalidade limiteParcelas, este campo apresentar\u00E1 o valor de cr\u00E9dito que o portador possui dispon\u00EDvel para utilizar como valor de parcelas Nacionais em um determinado ciclo de faturamento.")
  public BigDecimal getSaldoDisponivelParcelas() {
    return saldoDisponivelParcelas;
  }
  public void setSaldoDisponivelParcelas(BigDecimal saldoDisponivelParcelas) {
    this.saldoDisponivelParcelas = saldoDisponivelParcelas;
  }

  
  /**
   * Valor total dos cr\u00E9ditos nacionais lan\u00E7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos cr\u00E9ditos nacionais lan\u00E7ados na fatura.")
  public BigDecimal getTotalCreditosNacionais() {
    return totalCreditosNacionais;
  }
  public void setTotalCreditosNacionais(BigDecimal totalCreditosNacionais) {
    this.totalCreditosNacionais = totalCreditosNacionais;
  }

  
  /**
   * Valor total dos ajustes lan\u00E7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos ajustes lan\u00E7ados na fatura.")
  public BigDecimal getTotalAjustes() {
    return totalAjustes;
  }
  public void setTotalAjustes(BigDecimal totalAjustes) {
    this.totalAjustes = totalAjustes;
  }

  
  /**
   * Valor total das tarifas lan\u00E7adas na fatura.
   **/
  @ApiModelProperty(value = "Valor total das tarifas lan\u00E7adas na fatura.")
  public BigDecimal getTotalTarifas() {
    return totalTarifas;
  }
  public void setTotalTarifas(BigDecimal totalTarifas) {
    this.totalTarifas = totalTarifas;
  }

  
  /**
   * Valor total da multa lan\u00E7ada na fatura.
   **/
  @ApiModelProperty(value = "Valor total da multa lan\u00E7ada na fatura.")
  public BigDecimal getTotalMulta() {
    return totalMulta;
  }
  public void setTotalMulta(BigDecimal totalMulta) {
    this.totalMulta = totalMulta;
  }

  
  /**
   * Quando utilizado pelo emissor a modalidade limiteSaque, este campo apresentar\u00E1 o valor de cr\u00E9dito que o portador possui dispon\u00EDvel para realizar transa\u00E7\u00F5es de Saque Nacional.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor a modalidade limiteSaque, este campo apresentar\u00E1 o valor de cr\u00E9dito que o portador possui dispon\u00EDvel para realizar transa\u00E7\u00F5es de Saque Nacional.")
  public BigDecimal getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   * Valor total dos juros de mora lan\u00E7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos juros de mora lan\u00E7ados na fatura.")
  public BigDecimal getTotalJuros() {
    return totalJuros;
  }
  public void setTotalJuros(BigDecimal totalJuros) {
    this.totalJuros = totalJuros;
  }

  
  /**
   * Quando utilizado um programa de fidelidade pelo emissor, este campo apresentar\u00E1 o saldo atual de pontos que o portador possui.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado um programa de fidelidade pelo emissor, este campo apresentar\u00E1 o saldo atual de pontos que o portador possui.")
  public BigDecimal getSaldoPontosFidelidade() {
    return saldoPontosFidelidade;
  }
  public void setSaldoPontosFidelidade(BigDecimal saldoPontosFidelidade) {
    this.saldoPontosFidelidade = saldoPontosFidelidade;
  }

  
  /**
   * Valor percentual da taxa de juros rotativos.
   **/
  @ApiModelProperty(value = "Valor percentual da taxa de juros rotativos.")
  public BigDecimal getTaxaRotativo() {
    return taxaRotativo;
  }
  public void setTaxaRotativo(BigDecimal taxaRotativo) {
    this.taxaRotativo = taxaRotativo;
  }

  
  /**
   * Quando utilizado pelo emissor a modalidade limiteCompraInternacional, este campo apresentar\u00E1 o valor de cr\u00E9dito que o portador possui dispon\u00EDvel para realizar transa\u00E7\u00F5es de Compra Internacional.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor a modalidade limiteCompraInternacional, este campo apresentar\u00E1 o valor de cr\u00E9dito que o portador possui dispon\u00EDvel para realizar transa\u00E7\u00F5es de Compra Internacional.")
  public BigDecimal getSaldoDisponivelCompraInternacional() {
    return saldoDisponivelCompraInternacional;
  }
  public void setSaldoDisponivelCompraInternacional(BigDecimal saldoDisponivelCompraInternacional) {
    this.saldoDisponivelCompraInternacional = saldoDisponivelCompraInternacional;
  }

  
  /**
   * Valor percentual da taxa de saque.
   **/
  @ApiModelProperty(value = "Valor percentual da taxa de saque.")
  public BigDecimal getTaxaSaque() {
    return taxaSaque;
  }
  public void setTaxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
  }

  
  /**
   * Quando utilizado pelo emissor a modalidade limiteSaqueInternacional, este campo apresentar\u00E1 o valor de cr\u00E9dito que o portador possui dispon\u00EDvel para realizar transa\u00E7\u00F5es de Saque Internacional.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor a modalidade limiteSaqueInternacional, este campo apresentar\u00E1 o valor de cr\u00E9dito que o portador possui dispon\u00EDvel para realizar transa\u00E7\u00F5es de Saque Internacional.")
  public BigDecimal getSaldoDisponivelSaqueInternacional() {
    return saldoDisponivelSaqueInternacional;
  }
  public void setSaldoDisponivelSaqueInternacional(BigDecimal saldoDisponivelSaqueInternacional) {
    this.saldoDisponivelSaqueInternacional = saldoDisponivelSaqueInternacional;
  }

  
  /**
   * Valor m\u00E1ximo percentual da taxa de encargos para o pr\u00F3ximo per\u00EDodo.
   **/
  @ApiModelProperty(value = "Valor m\u00E1ximo percentual da taxa de encargos para o pr\u00F3ximo per\u00EDodo.")
  public BigDecimal getTaxaMaximaProximoPeriodo() {
    return taxaMaximaProximoPeriodo;
  }
  public void setTaxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
  }

  
  /**
   * Apresenta a soma de todos os seguros cobrados na fatura do cliente.
   **/
  @ApiModelProperty(required = true, value = "Apresenta a soma de todos os seguros cobrados na fatura do cliente.")
  public BigDecimal getTotalServicos() {
    return totalServicos;
  }
  public void setTotalServicos(BigDecimal totalServicos) {
    this.totalServicos = totalServicos;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaConsignadaDetalheResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  flagEmiteFatura: ").append(flagEmiteFatura).append("\n");
    sb.append("  limiteCompra: ").append(limiteCompra).append("\n");
    sb.append("  dataVencimentoFatura: ").append(dataVencimentoFatura).append("\n");
    sb.append("  limiteParcelado: ").append(limiteParcelado).append("\n");
    sb.append("  limiteParcelas: ").append(limiteParcelas).append("\n");
    sb.append("  valorTotalFatura: ").append(valorTotalFatura).append("\n");
    sb.append("  valorFaturaAnterior: ").append(valorFaturaAnterior).append("\n");
    sb.append("  valorPagamentoMinimo: ").append(valorPagamentoMinimo).append("\n");
    sb.append("  valorPagamentoConsignado: ").append(valorPagamentoConsignado).append("\n");
    sb.append("  limiteSaqueGlobal: ").append(limiteSaqueGlobal).append("\n");
    sb.append("  valorPagamentoComplementar: ").append(valorPagamentoComplementar).append("\n");
    sb.append("  limiteSaquePeriodo: ").append(limiteSaquePeriodo).append("\n");
    sb.append("  totalComprasNacionais: ").append(totalComprasNacionais).append("\n");
    sb.append("  limiteConsignado: ").append(limiteConsignado).append("\n");
    sb.append("  totalComprasInternacionas: ").append(totalComprasInternacionas).append("\n");
    sb.append("  limiteInternacionalCompra: ").append(limiteInternacionalCompra).append("\n");
    sb.append("  totalSaquesNacionais: ").append(totalSaquesNacionais).append("\n");
    sb.append("  limiteInternacionalParcelado: ").append(limiteInternacionalParcelado).append("\n");
    sb.append("  totalSaquesInternacionais: ").append(totalSaquesInternacionais).append("\n");
    sb.append("  limiteInternacionalParcelas: ").append(limiteInternacionalParcelas).append("\n");
    sb.append("  totalDebitosNacionais: ").append(totalDebitosNacionais).append("\n");
    sb.append("  limiteInternacionalSaqueGlobal: ").append(limiteInternacionalSaqueGlobal).append("\n");
    sb.append("  totalDebitosRecorrentes: ").append(totalDebitosRecorrentes).append("\n");
    sb.append("  limiteInternacionalSaquePeriodo: ").append(limiteInternacionalSaquePeriodo).append("\n");
    sb.append("  totalDebitosInternacionais: ").append(totalDebitosInternacionais).append("\n");
    sb.append("  saldoDisponivelGlobal: ").append(saldoDisponivelGlobal).append("\n");
    sb.append("  totalDebitosDiversosNacionais: ").append(totalDebitosDiversosNacionais).append("\n");
    sb.append("  saldoDisponivelCompra: ").append(saldoDisponivelCompra).append("\n");
    sb.append("  totalDebitosOpcionais: ").append(totalDebitosOpcionais).append("\n");
    sb.append("  saldoDisponivelParcelado: ").append(saldoDisponivelParcelado).append("\n");
    sb.append("  totalPagamentos: ").append(totalPagamentos).append("\n");
    sb.append("  saldoDisponivelParcelas: ").append(saldoDisponivelParcelas).append("\n");
    sb.append("  totalCreditosNacionais: ").append(totalCreditosNacionais).append("\n");
    sb.append("  totalAjustes: ").append(totalAjustes).append("\n");
    sb.append("  totalTarifas: ").append(totalTarifas).append("\n");
    sb.append("  totalMulta: ").append(totalMulta).append("\n");
    sb.append("  saldoDisponivelSaque: ").append(saldoDisponivelSaque).append("\n");
    sb.append("  totalJuros: ").append(totalJuros).append("\n");
    sb.append("  saldoPontosFidelidade: ").append(saldoPontosFidelidade).append("\n");
    sb.append("  taxaRotativo: ").append(taxaRotativo).append("\n");
    sb.append("  saldoDisponivelCompraInternacional: ").append(saldoDisponivelCompraInternacional).append("\n");
    sb.append("  taxaSaque: ").append(taxaSaque).append("\n");
    sb.append("  saldoDisponivelSaqueInternacional: ").append(saldoDisponivelSaqueInternacional).append("\n");
    sb.append("  taxaMaximaProximoPeriodo: ").append(taxaMaximaProximoPeriodo).append("\n");
    sb.append("  totalServicos: ").append(totalServicos).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
