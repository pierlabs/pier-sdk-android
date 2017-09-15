package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Detalhe da resposta do recurso de simular empr\u00C3\u00A9stimos/financiamentos
 **/
@ApiModel(description = "Detalhe da resposta do recurso de simular empr\u00C3\u00A9stimos/financiamentos")
public class PlanoParcelamentoEmprestimoResponse  {
  
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("valorParcelas")
  private BigDecimal valorParcelas = null;
  @SerializedName("taxaJuros")
  private BigDecimal taxaJuros = null;
  @SerializedName("valorPercentualCET")
  private BigDecimal valorPercentualCET = null;
  @SerializedName("valorTributosIOF")
  private BigDecimal valorTributosIOF = null;

  
  /**
   * N\u00C3\u00BAmeros de parcelas do empr\u00C3\u00A9stimo/financiamento
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmeros de parcelas do empr\u00C3\u00A9stimo/financiamento")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Valor da parcela
   **/
  @ApiModelProperty(value = "Valor da parcela")
  public BigDecimal getValorParcelas() {
    return valorParcelas;
  }
  public void setValorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
  }

  
  /**
   * Taxa de juros aplicado no empr\u00C3\u00A9stimo/financiamento
   **/
  @ApiModelProperty(value = "Taxa de juros aplicado no empr\u00C3\u00A9stimo/financiamento")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * valor percentual do Custo Efetivo Total, ao ano, do empr\u00C3\u00A9stimo / financiamento
   **/
  @ApiModelProperty(value = "valor percentual do Custo Efetivo Total, ao ano, do empr\u00C3\u00A9stimo / financiamento")
  public BigDecimal getValorPercentualCET() {
    return valorPercentualCET;
  }
  public void setValorPercentualCET(BigDecimal valorPercentualCET) {
    this.valorPercentualCET = valorPercentualCET;
  }

  
  /**
   * valor total estimado dos tributos do Imposto sobre Opera\u00C3\u00A7\u00C3\u00B5es Financeiras
   **/
  @ApiModelProperty(value = "valor total estimado dos tributos do Imposto sobre Opera\u00C3\u00A7\u00C3\u00B5es Financeiras")
  public BigDecimal getValorTributosIOF() {
    return valorTributosIOF;
  }
  public void setValorTributosIOF(BigDecimal valorTributosIOF) {
    this.valorTributosIOF = valorTributosIOF;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoEmprestimoResponse {\n");
    
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  valorParcelas: ").append(valorParcelas).append("\n");
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("  valorPercentualCET: ").append(valorPercentualCET).append("\n");
    sb.append("  valorTributosIOF: ").append(valorTributosIOF).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


