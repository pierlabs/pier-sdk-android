package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Acordo detalhado
 **/
@ApiModel(description = "Objeto Acordo detalhado")
public class AcordoDetalheResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("statusAcordo")
  private Long statusAcordo = null;
  @SerializedName("valorAcordo")
  private BigDecimal valorAcordo = null;
  @SerializedName("dataAcordo")
  private String dataAcordo = null;
  @SerializedName("quantidadeParcelas")
  private Integer quantidadeParcelas = null;
  @SerializedName("saldoAtualFinal")
  private BigDecimal saldoAtualFinal = null;
  @SerializedName("diasEmAtraso")
  private Integer diasEmAtraso = null;
  @SerializedName("statusConta")
  private Long statusConta = null;
  @SerializedName("assessoriaAtual")
  private String assessoriaAtual = null;
  @SerializedName("totalPagamentos")
  private BigDecimal totalPagamentos = null;
  @SerializedName("dataVencimentoCobranca")
  private String dataVencimentoCobranca = null;
  @SerializedName("dataQuebraAcordo")
  private String dataQuebraAcordo = null;
  @SerializedName("valorParcela1")
  private BigDecimal valorParcela1 = null;
  @SerializedName("valorParcelaN")
  private BigDecimal valorParcelaN = null;
  @SerializedName("parcelaPedida")
  private Integer parcelaPedida = null;
  @SerializedName("vencimentoParcelaPedida")
  private String vencimentoParcelaPedida = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do acordo (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do acordo (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da conta
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Status do acordo
   **/
  @ApiModelProperty(value = "Status do acordo")
  public Long getStatusAcordo() {
    return statusAcordo;
  }
  public void setStatusAcordo(Long statusAcordo) {
    this.statusAcordo = statusAcordo;
  }

  
  /**
   * Valor do Acordo
   **/
  @ApiModelProperty(value = "Valor do Acordo")
  public BigDecimal getValorAcordo() {
    return valorAcordo;
  }
  public void setValorAcordo(BigDecimal valorAcordo) {
    this.valorAcordo = valorAcordo;
  }

  
  /**
   * Data e Hora do acordo
   **/
  @ApiModelProperty(value = "Data e Hora do acordo")
  public String getDataAcordo() {
    return dataAcordo;
  }
  public void setDataAcordo(String dataAcordo) {
    this.dataAcordo = dataAcordo;
  }

  
  /**
   * Quantidade de parcelas do acordo
   **/
  @ApiModelProperty(value = "Quantidade de parcelas do acordo")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Saldo atual final
   **/
  @ApiModelProperty(value = "Saldo atual final")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * Dias em atraso
   **/
  @ApiModelProperty(value = "Dias em atraso")
  public Integer getDiasEmAtraso() {
    return diasEmAtraso;
  }
  public void setDiasEmAtraso(Integer diasEmAtraso) {
    this.diasEmAtraso = diasEmAtraso;
  }

  
  /**
   * Status da conta
   **/
  @ApiModelProperty(value = "Status da conta")
  public Long getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(Long statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * Assessoria atual
   **/
  @ApiModelProperty(value = "Assessoria atual")
  public String getAssessoriaAtual() {
    return assessoriaAtual;
  }
  public void setAssessoriaAtual(String assessoriaAtual) {
    this.assessoriaAtual = assessoriaAtual;
  }

  
  /**
   * Total de pagamentos
   **/
  @ApiModelProperty(value = "Total de pagamentos")
  public BigDecimal getTotalPagamentos() {
    return totalPagamentos;
  }
  public void setTotalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
  }

  
  /**
   * Data do vencimento da cobran\u00E7a
   **/
  @ApiModelProperty(value = "Data do vencimento da cobran\u00E7a")
  public String getDataVencimentoCobranca() {
    return dataVencimentoCobranca;
  }
  public void setDataVencimentoCobranca(String dataVencimentoCobranca) {
    this.dataVencimentoCobranca = dataVencimentoCobranca;
  }

  
  /**
   * Data da quebra do acordo
   **/
  @ApiModelProperty(value = "Data da quebra do acordo")
  public String getDataQuebraAcordo() {
    return dataQuebraAcordo;
  }
  public void setDataQuebraAcordo(String dataQuebraAcordo) {
    this.dataQuebraAcordo = dataQuebraAcordo;
  }

  
  /**
   * Valor da parcela 1
   **/
  @ApiModelProperty(value = "Valor da parcela 1")
  public BigDecimal getValorParcela1() {
    return valorParcela1;
  }
  public void setValorParcela1(BigDecimal valorParcela1) {
    this.valorParcela1 = valorParcela1;
  }

  
  /**
   * Valor da parcela N
   **/
  @ApiModelProperty(value = "Valor da parcela N")
  public BigDecimal getValorParcelaN() {
    return valorParcelaN;
  }
  public void setValorParcelaN(BigDecimal valorParcelaN) {
    this.valorParcelaN = valorParcelaN;
  }

  
  /**
   * Parcela pedida
   **/
  @ApiModelProperty(value = "Parcela pedida")
  public Integer getParcelaPedida() {
    return parcelaPedida;
  }
  public void setParcelaPedida(Integer parcelaPedida) {
    this.parcelaPedida = parcelaPedida;
  }

  
  /**
   * Data de vencimento da parcela pedida
   **/
  @ApiModelProperty(value = "Data de vencimento da parcela pedida")
  public String getVencimentoParcelaPedida() {
    return vencimentoParcelaPedida;
  }
  public void setVencimentoParcelaPedida(String vencimentoParcelaPedida) {
    this.vencimentoParcelaPedida = vencimentoParcelaPedida;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcordoDetalheResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  statusAcordo: ").append(statusAcordo).append("\n");
    sb.append("  valorAcordo: ").append(valorAcordo).append("\n");
    sb.append("  dataAcordo: ").append(dataAcordo).append("\n");
    sb.append("  quantidadeParcelas: ").append(quantidadeParcelas).append("\n");
    sb.append("  saldoAtualFinal: ").append(saldoAtualFinal).append("\n");
    sb.append("  diasEmAtraso: ").append(diasEmAtraso).append("\n");
    sb.append("  statusConta: ").append(statusConta).append("\n");
    sb.append("  assessoriaAtual: ").append(assessoriaAtual).append("\n");
    sb.append("  totalPagamentos: ").append(totalPagamentos).append("\n");
    sb.append("  dataVencimentoCobranca: ").append(dataVencimentoCobranca).append("\n");
    sb.append("  dataQuebraAcordo: ").append(dataQuebraAcordo).append("\n");
    sb.append("  valorParcela1: ").append(valorParcela1).append("\n");
    sb.append("  valorParcelaN: ").append(valorParcelaN).append("\n");
    sb.append("  parcelaPedida: ").append(parcelaPedida).append("\n");
    sb.append("  vencimentoParcelaPedida: ").append(vencimentoParcelaPedida).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
