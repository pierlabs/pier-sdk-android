package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{emprestimo_pessoal_request_description}}}
 **/
@ApiModel(description = "{{{emprestimo_pessoal_request_description}}}")
public class EmprestimoPessoalRequest  {
  
  @SerializedName("valorSolicitado")
  private BigDecimal valorSolicitado = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("taxaJuros")
  private BigDecimal taxaJuros = null;
  @SerializedName("periodoTaxa")
  private String periodoTaxa = null;
  @SerializedName("sistemaAmortizacao")
  private String sistemaAmortizacao = null;
  @SerializedName("numeroMesesCarencia")
  private Integer numeroMesesCarencia = null;

  
  /**
   * {{{emprestimo_pessoal_request_valor_solicitado_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{emprestimo_pessoal_request_valor_solicitado_value}}}")
  public BigDecimal getValorSolicitado() {
    return valorSolicitado;
  }
  public void setValorSolicitado(BigDecimal valorSolicitado) {
    this.valorSolicitado = valorSolicitado;
  }

  
  /**
   * {{{emprestimo_pessoal_request_numero_parcelas_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{emprestimo_pessoal_request_numero_parcelas_value}}}")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * {{{emprestimo_pessoal_request_taxa_juros_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{emprestimo_pessoal_request_taxa_juros_value}}}")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * {{{emprestimo_pessoal_request_periodo_taxa_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{emprestimo_pessoal_request_periodo_taxa_value}}}")
  public String getPeriodoTaxa() {
    return periodoTaxa;
  }
  public void setPeriodoTaxa(String periodoTaxa) {
    this.periodoTaxa = periodoTaxa;
  }

  
  /**
   * {{{emprestimo_pessoal_request_sistema_amortizacao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{emprestimo_pessoal_request_sistema_amortizacao_value}}}")
  public String getSistemaAmortizacao() {
    return sistemaAmortizacao;
  }
  public void setSistemaAmortizacao(String sistemaAmortizacao) {
    this.sistemaAmortizacao = sistemaAmortizacao;
  }

  
  /**
   * {{{emprestimo_pessoal_request_numero_meses_carencia_value}}}
   **/
  @ApiModelProperty(value = "{{{emprestimo_pessoal_request_numero_meses_carencia_value}}}")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmprestimoPessoalRequest {\n");
    
    sb.append("  valorSolicitado: ").append(valorSolicitado).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("  periodoTaxa: ").append(periodoTaxa).append("\n");
    sb.append("  sistemaAmortizacao: ").append(sistemaAmortizacao).append("\n");
    sb.append("  numeroMesesCarencia: ").append(numeroMesesCarencia).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
