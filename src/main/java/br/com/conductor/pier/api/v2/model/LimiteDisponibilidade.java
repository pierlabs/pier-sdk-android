package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Limite Disponibilidade
 **/
@ApiModel(description = "Limite Disponibilidade")
public class LimiteDisponibilidade  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("limiteCompra")
  private Double limiteCompra = null;
  @SerializedName("limiteConsignado")
  private Double limiteConsignado = null;
  @SerializedName("limiteExterno")
  private Double limiteExterno = null;
  @SerializedName("limiteExtra")
  private Double limiteExtra = null;
  @SerializedName("limiteGlobal")
  private Double limiteGlobal = null;
  @SerializedName("limiteInternacionalCompra")
  private Double limiteInternacionalCompra = null;
  @SerializedName("limiteInternacionalParcelado")
  private Double limiteInternacionalParcelado = null;
  @SerializedName("limiteInternacionalParcelas")
  private Double limiteInternacionalParcelas = null;
  @SerializedName("limiteInternacionalSaqueGlobal")
  private Double limiteInternacionalSaqueGlobal = null;
  @SerializedName("limiteInternacionalSaquePeriodo")
  private Double limiteInternacionalSaquePeriodo = null;
  @SerializedName("limiteMensal")
  private Double limiteMensal = null;
  @SerializedName("limiteParcelado")
  private Double limiteParcelado = null;
  @SerializedName("limiteParcelas")
  private Double limiteParcelas = null;
  @SerializedName("limiteSaqueGlobal")
  private Double limiteSaqueGlobal = null;
  @SerializedName("limiteSaquePeriodo")
  private Double limiteSaquePeriodo = null;
  @SerializedName("saldoDisponivelCompra")
  private Double saldoDisponivelCompra = null;
  @SerializedName("saldoDisponivelCompraInternacional")
  private Double saldoDisponivelCompraInternacional = null;
  @SerializedName("saldoDisponivelExterno")
  private Double saldoDisponivelExterno = null;
  @SerializedName("saldoDisponivelExtra")
  private Double saldoDisponivelExtra = null;
  @SerializedName("saldoDisponivelGlobal")
  private Double saldoDisponivelGlobal = null;
  @SerializedName("saldoDisponivelMensal")
  private Double saldoDisponivelMensal = null;
  @SerializedName("saldoDisponivelParcelado")
  private Double saldoDisponivelParcelado = null;
  @SerializedName("saldoDisponivelParcelas")
  private Double saldoDisponivelParcelas = null;
  @SerializedName("saldoDisponivelSaque")
  private Double saldoDisponivelSaque = null;
  @SerializedName("saldoDisponivelSaqueInternacional")
  private Double saldoDisponivelSaqueInternacional = null;
  @SerializedName("saldoPontosFidelidade")
  private Double saldoPontosFidelidade = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o de Limite e Disponibilidade (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o de Limite e Disponibilidade (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Nacionais
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Nacionais")
  public Double getLimiteCompra() {
    return limiteCompra;
  }
  public void setLimiteCompra(Double limiteCompra) {
    this.limiteCompra = limiteCompra;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor da margem de cr\u00C3\u00A9dito que ele poder\u00C3\u00A1 utilizar para ser cobrado de forma consignada (desconto em folha) em seu sal\u00C3\u00A1rio/vencimentos.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor da margem de cr\u00C3\u00A9dito que ele poder\u00C3\u00A1 utilizar para ser cobrado de forma consignada (desconto em folha) em seu sal\u00C3\u00A1rio/vencimentos.")
  public Double getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(Double limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es fora da rede pr\u00C3\u00B3pria do emissor, tamb\u00C3\u00A9m chamado de limite para transa\u00C3\u00A7\u00C3\u00B5es off-us.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es fora da rede pr\u00C3\u00B3pria do emissor, tamb\u00C3\u00A9m chamado de limite para transa\u00C3\u00A7\u00C3\u00B5es off-us.")
  public Double getLimiteExterno() {
    return limiteExterno;
  }
  public void setLimiteExterno(Double limiteExterno) {
    this.limiteExterno = limiteExterno;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para utiliza\u00C3\u00A7\u00C3\u00A3o al\u00C3\u00A9m do valor do limiteGlobal. 
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para utiliza\u00C3\u00A7\u00C3\u00A3o al\u00C3\u00A9m do valor do limiteGlobal. ")
  public Double getLimiteExtra() {
    return limiteExtra;
  }
  public void setLimiteExtra(Double limiteExtra) {
    this.limiteExtra = limiteExtra;
  }

  
  /**
   * Apresenta o valor do limite de cr\u00C3\u00A9dito que o portador do cart\u00C3\u00A3o possui.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o valor do limite de cr\u00C3\u00A9dito que o portador do cart\u00C3\u00A3o possui.")
  public Double getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(Double limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Internacionais.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Internacionais.")
  public Double getLimiteInternacionalCompra() {
    return limiteInternacionalCompra;
  }
  public void setLimiteInternacionalCompra(Double limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es Internacionais de Compras Parceladas.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es Internacionais de Compras Parceladas.")
  public Double getLimiteInternacionalParcelado() {
    return limiteInternacionalParcelado;
  }
  public void setLimiteInternacionalParcelado(Double limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras internacionais que forem realizadas nesta modalidade.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras internacionais que forem realizadas nesta modalidade.")
  public Double getLimiteInternacionalParcelas() {
    return limiteInternacionalParcelas;
  }
  public void setLimiteInternacionalParcelas(Double limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLimiteInternacionalSaqueGlobal() {
    return limiteInternacionalSaqueGlobal;
  }
  public void setLimiteInternacionalSaqueGlobal(Double limiteInternacionalSaqueGlobal) {
    this.limiteInternacionalSaqueGlobal = limiteInternacionalSaqueGlobal;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLimiteInternacionalSaquePeriodo() {
    return limiteInternacionalSaquePeriodo;
  }
  public void setLimiteInternacionalSaquePeriodo(Double limiteInternacionalSaquePeriodo) {
    this.limiteInternacionalSaquePeriodo = limiteInternacionalSaquePeriodo;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que a fatura do portador pode ter em um determinado per\u00C3\u00ADodo.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que a fatura do portador pode ter em um determinado per\u00C3\u00ADodo.")
  public Double getLimiteMensal() {
    return limiteMensal;
  }
  public void setLimiteMensal(Double limiteMensal) {
    this.limiteMensal = limiteMensal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es de compras parceladas.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es de compras parceladas.")
  public Double getLimiteParcelado() {
    return limiteParcelado;
  }
  public void setLimiteParcelado(Double limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras que forem realizadas nesta modalidade.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras que forem realizadas nesta modalidade.")
  public Double getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(Double limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional.")
  public Double getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(Double limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   * Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional dentro de cada ciclo de faturamento.
   **/
  @ApiModelProperty(required = true, value = "Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional dentro de cada ciclo de faturamento.")
  public Double getLimiteSaquePeriodo() {
    return limiteSaquePeriodo;
  }
  public void setLimiteSaquePeriodo(Double limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getSaldoDisponivelCompra() {
    return saldoDisponivelCompra;
  }
  public void setSaldoDisponivelCompra(Double saldoDisponivelCompra) {
    this.saldoDisponivelCompra = saldoDisponivelCompra;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getSaldoDisponivelCompraInternacional() {
    return saldoDisponivelCompraInternacional;
  }
  public void setSaldoDisponivelCompraInternacional(Double saldoDisponivelCompraInternacional) {
    this.saldoDisponivelCompraInternacional = saldoDisponivelCompraInternacional;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getSaldoDisponivelExterno() {
    return saldoDisponivelExterno;
  }
  public void setSaldoDisponivelExterno(Double saldoDisponivelExterno) {
    this.saldoDisponivelExterno = saldoDisponivelExterno;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getSaldoDisponivelExtra() {
    return saldoDisponivelExtra;
  }
  public void setSaldoDisponivelExtra(Double saldoDisponivelExtra) {
    this.saldoDisponivelExtra = saldoDisponivelExtra;
  }

  
  /**
   * Campo que 
   **/
  @ApiModelProperty(required = true, value = "Campo que ")
  public Double getSaldoDisponivelGlobal() {
    return saldoDisponivelGlobal;
  }
  public void setSaldoDisponivelGlobal(Double saldoDisponivelGlobal) {
    this.saldoDisponivelGlobal = saldoDisponivelGlobal;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getSaldoDisponivelMensal() {
    return saldoDisponivelMensal;
  }
  public void setSaldoDisponivelMensal(Double saldoDisponivelMensal) {
    this.saldoDisponivelMensal = saldoDisponivelMensal;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getSaldoDisponivelParcelado() {
    return saldoDisponivelParcelado;
  }
  public void setSaldoDisponivelParcelado(Double saldoDisponivelParcelado) {
    this.saldoDisponivelParcelado = saldoDisponivelParcelado;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getSaldoDisponivelParcelas() {
    return saldoDisponivelParcelas;
  }
  public void setSaldoDisponivelParcelas(Double saldoDisponivelParcelas) {
    this.saldoDisponivelParcelas = saldoDisponivelParcelas;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getSaldoDisponivelSaque() {
    return saldoDisponivelSaque;
  }
  public void setSaldoDisponivelSaque(Double saldoDisponivelSaque) {
    this.saldoDisponivelSaque = saldoDisponivelSaque;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getSaldoDisponivelSaqueInternacional() {
    return saldoDisponivelSaqueInternacional;
  }
  public void setSaldoDisponivelSaqueInternacional(Double saldoDisponivelSaqueInternacional) {
    this.saldoDisponivelSaqueInternacional = saldoDisponivelSaqueInternacional;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getSaldoPontosFidelidade() {
    return saldoPontosFidelidade;
  }
  public void setSaldoPontosFidelidade(Double saldoPontosFidelidade) {
    this.saldoPontosFidelidade = saldoPontosFidelidade;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimiteDisponibilidade {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  limiteCompra: ").append(limiteCompra).append("\n");
    sb.append("  limiteConsignado: ").append(limiteConsignado).append("\n");
    sb.append("  limiteExterno: ").append(limiteExterno).append("\n");
    sb.append("  limiteExtra: ").append(limiteExtra).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteInternacionalCompra: ").append(limiteInternacionalCompra).append("\n");
    sb.append("  limiteInternacionalParcelado: ").append(limiteInternacionalParcelado).append("\n");
    sb.append("  limiteInternacionalParcelas: ").append(limiteInternacionalParcelas).append("\n");
    sb.append("  limiteInternacionalSaqueGlobal: ").append(limiteInternacionalSaqueGlobal).append("\n");
    sb.append("  limiteInternacionalSaquePeriodo: ").append(limiteInternacionalSaquePeriodo).append("\n");
    sb.append("  limiteMensal: ").append(limiteMensal).append("\n");
    sb.append("  limiteParcelado: ").append(limiteParcelado).append("\n");
    sb.append("  limiteParcelas: ").append(limiteParcelas).append("\n");
    sb.append("  limiteSaqueGlobal: ").append(limiteSaqueGlobal).append("\n");
    sb.append("  limiteSaquePeriodo: ").append(limiteSaquePeriodo).append("\n");
    sb.append("  saldoDisponivelCompra: ").append(saldoDisponivelCompra).append("\n");
    sb.append("  saldoDisponivelCompraInternacional: ").append(saldoDisponivelCompraInternacional).append("\n");
    sb.append("  saldoDisponivelExterno: ").append(saldoDisponivelExterno).append("\n");
    sb.append("  saldoDisponivelExtra: ").append(saldoDisponivelExtra).append("\n");
    sb.append("  saldoDisponivelGlobal: ").append(saldoDisponivelGlobal).append("\n");
    sb.append("  saldoDisponivelMensal: ").append(saldoDisponivelMensal).append("\n");
    sb.append("  saldoDisponivelParcelado: ").append(saldoDisponivelParcelado).append("\n");
    sb.append("  saldoDisponivelParcelas: ").append(saldoDisponivelParcelas).append("\n");
    sb.append("  saldoDisponivelSaque: ").append(saldoDisponivelSaque).append("\n");
    sb.append("  saldoDisponivelSaqueInternacional: ").append(saldoDisponivelSaqueInternacional).append("\n");
    sb.append("  saldoPontosFidelidade: ").append(saldoPontosFidelidade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


