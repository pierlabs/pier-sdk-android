package br.com.conductor.pier.api.v1_1.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Saldos
 **/
@ApiModel(description = "Saldos")
public class Saldos  {
  
  @SerializedName("id")
  private Long id = null;
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
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Limite Disponibilidade (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Limite Disponibilidade (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
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
    sb.append("class Saldos {\n");
    
    sb.append("  id: ").append(id).append("\n");
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


