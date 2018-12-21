package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Consignated Invoice detail
 **/
@ApiModel(description = "Consignated Invoice detail")
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
   * Identifier Code of the invoice
   **/
  @ApiModelProperty(value = "Identifier Code of the invoice")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identifier Code of the Account (id)
   **/
  @ApiModelProperty(value = "Identifier Code of the Account (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * show the limit credit value that the cardholder has
   **/
  @ApiModelProperty(required = true, value = "show the limit credit value that the cardholder has")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Identifier Code of the account which the invoice refers to
   **/
  @ApiModelProperty(value = "Identifier Code of the account which the invoice refers to")
  public Integer getFlagEmiteFatura() {
    return flagEmiteFatura;
  }
  public void setFlagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
  }

  
  /**
   * When it is used by the issuer, this field shows the limit credit value that the cardholder has to use exclusively in National Purchases
   **/
  @ApiModelProperty(required = true, value = "When it is used by the issuer, this field shows the limit credit value that the cardholder has to use exclusively in National Purchases")
  public BigDecimal getLimiteCompra() {
    return limiteCompra;
  }
  public void setLimiteCompra(BigDecimal limiteCompra) {
    this.limiteCompra = limiteCompra;
  }

  
  /**
   * Expiration date of the invoice
   **/
  @ApiModelProperty(value = "Expiration date of the invoice")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * When it is used by the issuer, this field presents the limit credit value that the cardholder has to make transactions of parceled shops
   **/
  @ApiModelProperty(required = true, value = "When it is used by the issuer, this field presents the limit credit value that the cardholder has to make transactions of parceled shops")
  public BigDecimal getLimiteParcelado() {
    return limiteParcelado;
  }
  public void setLimiteParcelado(BigDecimal limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
  }

  
  /**
   * When it is used by the issuer, this field shows the limit credit value that the cardholder can accumulate since the suum of the shop parcels that they were made in this modality
   **/
  @ApiModelProperty(required = true, value = "When it is used by the issuer, this field shows the limit credit value that the cardholder can accumulate since the suum of the shop parcels that they were made in this modality")
  public BigDecimal getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(BigDecimal limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Value for total payment of the invoice
   **/
  @ApiModelProperty(value = "Value for total payment of the invoice")
  public BigDecimal getValorTotalFatura() {
    return valorTotalFatura;
  }
  public void setValorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
  }

  
  /**
   * Total Value of the previous invoice
   **/
  @ApiModelProperty(value = "Total Value of the previous invoice")
  public BigDecimal getValorFaturaAnterior() {
    return valorFaturaAnterior;
  }
  public void setValorFaturaAnterior(BigDecimal valorFaturaAnterior) {
    this.valorFaturaAnterior = valorFaturaAnterior;
  }

  
  /**
   * Minimum value for the invoice payment
   **/
  @ApiModelProperty(value = "Minimum value for the invoice payment")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * Invoice value paid through the discount in payroll
   **/
  @ApiModelProperty(value = "Invoice value paid through the discount in payroll")
  public BigDecimal getValorPagamentoConsignado() {
    return valorPagamentoConsignado;
  }
  public void setValorPagamentoConsignado(BigDecimal valorPagamentoConsignado) {
    this.valorPagamentoConsignado = valorPagamentoConsignado;
  }

  
  /**
   * When it is used by the issuer, this field presents the limit credit value that the cardholder can use to make National Withdrawal Transactions
   **/
  @ApiModelProperty(required = true, value = "When it is used by the issuer, this field presents the limit credit value that the cardholder can use to make National Withdrawal Transactions")
  public BigDecimal getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(BigDecimal limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * Additional Value to consider the minimum payment of the invoice
   **/
  @ApiModelProperty(value = "Additional Value to consider the minimum payment of the invoice")
  public BigDecimal getValorPagamentoComplementar() {
    return valorPagamentoComplementar;
  }
  public void setValorPagamentoComplementar(BigDecimal valorPagamentoComplementar) {
    this.valorPagamentoComplementar = valorPagamentoComplementar;
  }

  
  /**
   * When it is used by the issuer, this field presents the limit credit value that the cardholder can use to National Withdrawal Transactions inside of each billing cycle
   **/
  @ApiModelProperty(required = true, value = "When it is used by the issuer, this field presents the limit credit value that the cardholder can use to National Withdrawal Transactions inside of each billing cycle")
  public BigDecimal getLimiteSaquePeriodo() {
    return limiteSaquePeriodo;
  }
  public void setLimiteSaquePeriodo(BigDecimal limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
  }

  
  /**
   * Total value of the national shops launched in the invoice
   **/
  @ApiModelProperty(value = "Total value of the national shops launched in the invoice")
  public BigDecimal getTotalComprasNacionais() {
    return totalComprasNacionais;
  }
  public void setTotalComprasNacionais(BigDecimal totalComprasNacionais) {
    this.totalComprasNacionais = totalComprasNacionais;
  }

  
  /**
   * when it is used by the issuer, this field presents the value of the credit margin that can be used to be charged as a consignated form (discount in payroll) in the wage/expiration
   **/
  @ApiModelProperty(required = true, value = "when it is used by the issuer, this field presents the value of the credit margin that can be used to be charged as a consignated form (discount in payroll) in the wage/expiration")
  public BigDecimal getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(BigDecimal limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * Total value of the international shops launched in the invoice
   **/
  @ApiModelProperty(value = "Total value of the international shops launched in the invoice")
  public BigDecimal getTotalComprasInternacionas() {
    return totalComprasInternacionas;
  }
  public void setTotalComprasInternacionas(BigDecimal totalComprasInternacionas) {
    this.totalComprasInternacionas = totalComprasInternacionas;
  }

  
  /**
   * When it is used by the issuer, this field presents the limit credit value that the cardholder can use for International Shops
   **/
  @ApiModelProperty(required = true, value = "When it is used by the issuer, this field presents the limit credit value that the cardholder can use for International Shops")
  public BigDecimal getLimiteInternacionalCompra() {
    return limiteInternacionalCompra;
  }
  public void setLimiteInternacionalCompra(BigDecimal limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
  }

  
  /**
   * Total Value of the National Withdrawals launched in the invoice
   **/
  @ApiModelProperty(value = "Total Value of the National Withdrawals launched in the invoice")
  public BigDecimal getTotalSaquesNacionais() {
    return totalSaquesNacionais;
  }
  public void setTotalSaquesNacionais(BigDecimal totalSaquesNacionais) {
    this.totalSaquesNacionais = totalSaquesNacionais;
  }

  
  /**
   * When it is used by the issuer, this field presents the limit credit value that the cardholder has to make International transactions of parceled shops
   **/
  @ApiModelProperty(required = true, value = "When it is used by the issuer, this field presents the limit credit value that the cardholder has to make International transactions of parceled shops")
  public BigDecimal getLimiteInternacionalParcelado() {
    return limiteInternacionalParcelado;
  }
  public void setLimiteInternacionalParcelado(BigDecimal limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
  }

  
  /**
   * Total value of the international withdrawals launched in the invoice
   **/
  @ApiModelProperty(value = "Total value of the international withdrawals launched in the invoice")
  public BigDecimal getTotalSaquesInternacionais() {
    return totalSaquesInternacionais;
  }
  public void setTotalSaquesInternacionais(BigDecimal totalSaquesInternacionais) {
    this.totalSaquesInternacionais = totalSaquesInternacionais;
  }

  
  /**
   * When it is used by the issuer, this field presents the limit credit value that the cardholder can accumulate since the sum of parcels of the international shops that they were made in this modality
   **/
  @ApiModelProperty(required = true, value = "When it is used by the issuer, this field presents the limit credit value that the cardholder can accumulate since the sum of parcels of the international shops that they were made in this modality")
  public BigDecimal getLimiteInternacionalParcelas() {
    return limiteInternacionalParcelas;
  }
  public void setLimiteInternacionalParcelas(BigDecimal limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
  }

  
  /**
   * Total Value of the national debits launched in the invoice
   **/
  @ApiModelProperty(value = "Total Value of the national debits launched in the invoice")
  public BigDecimal getTotalDebitosNacionais() {
    return totalDebitosNacionais;
  }
  public void setTotalDebitosNacionais(BigDecimal totalDebitosNacionais) {
    this.totalDebitosNacionais = totalDebitosNacionais;
  }

  
  /**
   * When it is used by the issuer, this field shows the credit value that the cardholder can use to make International withdrawal transactions
   **/
  @ApiModelProperty(required = true, value = "When it is used by the issuer, this field shows the credit value that the cardholder can use to make International withdrawal transactions")
  public BigDecimal getLimiteInternacionalSaqueGlobal() {
    return limiteInternacionalSaqueGlobal;
  }
  public void setLimiteInternacionalSaqueGlobal(BigDecimal limiteInternacionalSaqueGlobal) {
    this.limiteInternacionalSaqueGlobal = limiteInternacionalSaqueGlobal;
  }

  
  /**
   * Total Value of the recurrent values launched in the invoice
   **/
  @ApiModelProperty(value = "Total Value of the recurrent values launched in the invoice")
  public BigDecimal getTotalDebitosRecorrentes() {
    return totalDebitosRecorrentes;
  }
  public void setTotalDebitosRecorrentes(BigDecimal totalDebitosRecorrentes) {
    this.totalDebitosRecorrentes = totalDebitosRecorrentes;
  }

  
  /**
   * Whenn it is used by the issuer, this field presents the limit credit value that the cardholder can use to make National withdrawal Transactions inside of each billing cycle
   **/
  @ApiModelProperty(required = true, value = "Whenn it is used by the issuer, this field presents the limit credit value that the cardholder can use to make National withdrawal Transactions inside of each billing cycle")
  public BigDecimal getLimiteInternacionalSaquePeriodo() {
    return limiteInternacionalSaquePeriodo;
  }
  public void setLimiteInternacionalSaquePeriodo(BigDecimal limiteInternacionalSaquePeriodo) {
    this.limiteInternacionalSaquePeriodo = limiteInternacionalSaquePeriodo;
  }

  
  /**
   * Total value of the international debits launched in the invoice
   **/
  @ApiModelProperty(value = "Total value of the international debits launched in the invoice")
  public BigDecimal getTotalDebitosInternacionais() {
    return totalDebitosInternacionais;
  }
  public void setTotalDebitosInternacionais(BigDecimal totalDebitosInternacionais) {
    this.totalDebitosInternacionais = totalDebitosInternacionais;
  }

  
  /**
   * Show the value of credit that the cardholder has able to make trasanction
   **/
  @ApiModelProperty(required = true, value = "Show the value of credit that the cardholder has able to make trasanction")
  public BigDecimal getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(BigDecimal saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   * Total Value of the several national debits launched in the invoice
   **/
  @ApiModelProperty(value = "Total Value of the several national debits launched in the invoice")
  public BigDecimal getTotalDebitosDiversosNacionais() {
    return totalDebitosDiversosNacionais;
  }
  public void setTotalDebitosDiversosNacionais(BigDecimal totalDebitosDiversosNacionais) {
    this.totalDebitosDiversosNacionais = totalDebitosDiversosNacionais;
  }

  
  /**
   * When it is used by the issuer, this field presents the limit credit value that the cardholder has to make transactions of National Shop
   **/
  @ApiModelProperty(required = true, value = "When it is used by the issuer, this field presents the limit credit value that the cardholder has to make transactions of National Shop")
  public BigDecimal getSaldoDisponivelCompra() {
    return saldoDisponivelCompra;
  }
  public void setSaldoDisponivelCompra(BigDecimal saldoDisponivelCompra) {
    this.saldoDisponivelCompra = saldoDisponivelCompra;
  }

  
  /**
   * Total Value of the several optional debits launched in the invoice
   **/
  @ApiModelProperty(value = "Total Value of the several optional debits launched in the invoice")
  public BigDecimal getTotalDebitosOpcionais() {
    return totalDebitosOpcionais;
  }
  public void setTotalDebitosOpcionais(BigDecimal totalDebitosOpcionais) {
    this.totalDebitosOpcionais = totalDebitosOpcionais;
  }

  
  /**
   * When it is used by the issuer the limitParcel modality, this field will present the credit value that the cardholder has available to make National Shop Transactions
   **/
  @ApiModelProperty(required = true, value = "When it is used by the issuer the limitParcel modality, this field will present the credit value that the cardholder has available to make National Shop Transactions")
  public BigDecimal getSaldoDisponivelParcelado() {
    return saldoDisponivelParcelado;
  }
  public void setSaldoDisponivelParcelado(BigDecimal saldoDisponivelParcelado) {
    this.saldoDisponivelParcelado = saldoDisponivelParcelado;
  }

  
  /**
   * Total VAlue of the payments launched in the invoice
   **/
  @ApiModelProperty(value = "Total VAlue of the payments launched in the invoice")
  public BigDecimal getTotalPagamentos() {
    return totalPagamentos;
  }
  public void setTotalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
  }

  
  /**
   * When it is used by the issuer the limitparcels modality, this field will present the credit value that the cardholder can used as a value of National parcels in a determined billing cycle
   **/
  @ApiModelProperty(required = true, value = "When it is used by the issuer the limitparcels modality, this field will present the credit value that the cardholder can used as a value of National parcels in a determined billing cycle")
  public BigDecimal getSaldoDisponivelParcelas() {
    return saldoDisponivelParcelas;
  }
  public void setSaldoDisponivelParcelas(BigDecimal saldoDisponivelParcelas) {
    this.saldoDisponivelParcelas = saldoDisponivelParcelas;
  }

  
  /**
   * Total National Credit Values launched in the invoice
   **/
  @ApiModelProperty(value = "Total National Credit Values launched in the invoice")
  public BigDecimal getTotalCreditosNacionais() {
    return totalCreditosNacionais;
  }
  public void setTotalCreditosNacionais(BigDecimal totalCreditosNacionais) {
    this.totalCreditosNacionais = totalCreditosNacionais;
  }

  
  /**
   * Total Value of the adjustments launched in the invoice
   **/
  @ApiModelProperty(value = "Total Value of the adjustments launched in the invoice")
  public BigDecimal getTotalAjustes() {
    return totalAjustes;
  }
  public void setTotalAjustes(BigDecimal totalAjustes) {
    this.totalAjustes = totalAjustes;
  }

  
  /**
   * Total value of the taxes launched in the invoice
   **/
  @ApiModelProperty(value = "Total value of the taxes launched in the invoice")
  public BigDecimal getTotalTarifas() {
    return totalTarifas;
  }
  public void setTotalTarifas(BigDecimal totalTarifas) {
    this.totalTarifas = totalTarifas;
  }

  
  /**
   * Total value of the fine launched in the invoice
   **/
  @ApiModelProperty(value = "Total value of the fine launched in the invoice")
  public BigDecimal getTotalMulta() {
    return totalMulta;
  }
  public void setTotalMulta(BigDecimal totalMulta) {
    this.totalMulta = totalMulta;
  }

  
  /**
   * When it is used by the issuer the LimitWithdrawal modality, this fiel will show the credit value that the cardholder has able to make transactions of National Withdrawal
   **/
  @ApiModelProperty(required = true, value = "When it is used by the issuer the LimitWithdrawal modality, this fiel will show the credit value that the cardholder has able to make transactions of National Withdrawal")
  public BigDecimal getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(BigDecimal saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   * Total value of the interest launched in the invoice
   **/
  @ApiModelProperty(value = "Total value of the interest launched in the invoice")
  public BigDecimal getTotalJuros() {
    return totalJuros;
  }
  public void setTotalJuros(BigDecimal totalJuros) {
    this.totalJuros = totalJuros;
  }

  
  /**
   * When it is used a fidelity program by the issuer, this field will show the current balance of the points the cardholder has
   **/
  @ApiModelProperty(required = true, value = "When it is used a fidelity program by the issuer, this field will show the current balance of the points the cardholder has")
  public BigDecimal getSaldoPontosFidelidade() {
    return saldoPontosFidelidade;
  }
  public void setSaldoPontosFidelidade(BigDecimal saldoPontosFidelidade) {
    this.saldoPontosFidelidade = saldoPontosFidelidade;
  }

  
  /**
   * Percentage value of the Revolving interest taxes
   **/
  @ApiModelProperty(value = "Percentage value of the Revolving interest taxes")
  public BigDecimal getTaxaRotativo() {
    return taxaRotativo;
  }
  public void setTaxaRotativo(BigDecimal taxaRotativo) {
    this.taxaRotativo = taxaRotativo;
  }

  
  /**
   * When it is used by the issuer the limitShopInternational modality, this field will present the credit value that the cardholder has able to make International Shopping Transactions
   **/
  @ApiModelProperty(required = true, value = "When it is used by the issuer the limitShopInternational modality, this field will present the credit value that the cardholder has able to make International Shopping Transactions")
  public BigDecimal getSaldoDisponivelCompraInternacional() {
    return saldoDisponivelCompraInternacional;
  }
  public void setSaldoDisponivelCompraInternacional(BigDecimal saldoDisponivelCompraInternacional) {
    this.saldoDisponivelCompraInternacional = saldoDisponivelCompraInternacional;
  }

  
  /**
   * Percentage Value of the withdrawal taxe
   **/
  @ApiModelProperty(value = "Percentage Value of the withdrawal taxe")
  public BigDecimal getTaxaSaque() {
    return taxaSaque;
  }
  public void setTaxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
  }

  
  /**
   * When it is used by the issuer the limitWithdrawalInternational modality, this field will show the credit value that the cardholder has able to make trasactions of International Withdrawal
   **/
  @ApiModelProperty(required = true, value = "When it is used by the issuer the limitWithdrawalInternational modality, this field will show the credit value that the cardholder has able to make trasactions of International Withdrawal")
  public BigDecimal getSaldoDisponivelSaqueInternacional() {
    return saldoDisponivelSaqueInternacional;
  }
  public void setSaldoDisponivelSaqueInternacional(BigDecimal saldoDisponivelSaqueInternacional) {
    this.saldoDisponivelSaqueInternacional = saldoDisponivelSaqueInternacional;
  }

  
  /**
   * Maximum percentage value of the charge taxes for the next period
   **/
  @ApiModelProperty(value = "Maximum percentage value of the charge taxes for the next period")
  public BigDecimal getTaxaMaximaProximoPeriodo() {
    return taxaMaximaProximoPeriodo;
  }
  public void setTaxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
  }

  
  /**
   * Show the sum of all insurance charged in the invoice of the client
   **/
  @ApiModelProperty(required = true, value = "Show the sum of all insurance charged in the invoice of the client")
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
