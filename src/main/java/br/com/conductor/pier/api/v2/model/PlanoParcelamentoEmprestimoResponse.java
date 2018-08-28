package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{plano_parcelamento_emprestimo_response_description}}}
 **/
@ApiModel(description = "{{{plano_parcelamento_emprestimo_response_description}}}")
public class PlanoParcelamentoEmprestimoResponse  {
  
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("valorParcelas")
  private BigDecimal valorParcelas = null;
  @SerializedName("taxaJuros")
  private BigDecimal taxaJuros = null;
  @SerializedName("valorTributosIOF")
  private BigDecimal valorTributosIOF = null;
  @SerializedName("valorPercentualCET")
  private BigDecimal valorPercentualCET = null;

  
  /**
   * {{{plano_parcelamento_emprestimo_response_numero_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_emprestimo_response_numero_parcelas_value}}}")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * {{{plano_parcelamento_emprestimo_response_valor_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_emprestimo_response_valor_parcelas_value}}}")
  public BigDecimal getValorParcelas() {
    return valorParcelas;
  }
  public void setValorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
  }

  
  /**
   * {{{plano_parcelamento_emprestimo_response_taxa_juros_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_emprestimo_response_taxa_juros_value}}}")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * {{{plano_parcelamento_emprestimo_response_valor_tributos_i_o_f_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_emprestimo_response_valor_tributos_i_o_f_value}}}")
  public BigDecimal getValorTributosIOF() {
    return valorTributosIOF;
  }
  public void setValorTributosIOF(BigDecimal valorTributosIOF) {
    this.valorTributosIOF = valorTributosIOF;
  }

  
  /**
   * {{{plano_parcelamento_emprestimo_response_valor_percentual_c_e_t_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_emprestimo_response_valor_percentual_c_e_t_value}}}")
  public BigDecimal getValorPercentualCET() {
    return valorPercentualCET;
  }
  public void setValorPercentualCET(BigDecimal valorPercentualCET) {
    this.valorPercentualCET = valorPercentualCET;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoEmprestimoResponse {\n");
    
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  valorParcelas: ").append(valorParcelas).append("\n");
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("  valorTributosIOF: ").append(valorTributosIOF).append("\n");
    sb.append("  valorPercentualCET: ").append(valorPercentualCET).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
