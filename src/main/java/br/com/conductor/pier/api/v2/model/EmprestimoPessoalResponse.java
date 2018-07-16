package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PlanoParcelamentoEmprestimoResponse;
import java.math.BigDecimal;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{emprestimo_pessoal_response_description}}}
 **/
@ApiModel(description = "{{{emprestimo_pessoal_response_description}}}")
public class EmprestimoPessoalResponse  {
  
  @SerializedName("planosParcelamentos")
  private List<PlanoParcelamentoEmprestimoResponse> planosParcelamentos = null;
  @SerializedName("valorSolicitado")
  private BigDecimal valorSolicitado = null;
  @SerializedName("valorMaximoSolicitacao")
  private BigDecimal valorMaximoSolicitacao = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("valorMaximoParcela")
  private BigDecimal valorMaximoParcela = null;
  @SerializedName("dataPrimeiraParcela")
  private String dataPrimeiraParcela = null;
  @SerializedName("periodoTaxa")
  private String periodoTaxa = null;
  @SerializedName("sistemaAmortizacao")
  private String sistemaAmortizacao = null;
  @SerializedName("taxaJuros")
  private BigDecimal taxaJuros = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public List<PlanoParcelamentoEmprestimoResponse> getPlanosParcelamentos() {
    return planosParcelamentos;
  }
  public void setPlanosParcelamentos(List<PlanoParcelamentoEmprestimoResponse> planosParcelamentos) {
    this.planosParcelamentos = planosParcelamentos;
  }

  
  /**
   * {{{emprestimo_pessoal_response_valor_solicitado_value}}}
   **/
  @ApiModelProperty(value = "{{{emprestimo_pessoal_response_valor_solicitado_value}}}")
  public BigDecimal getValorSolicitado() {
    return valorSolicitado;
  }
  public void setValorSolicitado(BigDecimal valorSolicitado) {
    this.valorSolicitado = valorSolicitado;
  }

  
  /**
   * {{{emprestimo_pessoal_response_valor_maximo_solicitacao_value}}}
   **/
  @ApiModelProperty(value = "{{{emprestimo_pessoal_response_valor_maximo_solicitacao_value}}}")
  public BigDecimal getValorMaximoSolicitacao() {
    return valorMaximoSolicitacao;
  }
  public void setValorMaximoSolicitacao(BigDecimal valorMaximoSolicitacao) {
    this.valorMaximoSolicitacao = valorMaximoSolicitacao;
  }

  
  /**
   * {{{emprestimo_pessoal_response_numero_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{emprestimo_pessoal_response_numero_parcelas_value}}}")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * {{{emprestimo_pessoal_response_valor_maximo_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{emprestimo_pessoal_response_valor_maximo_parcela_value}}}")
  public BigDecimal getValorMaximoParcela() {
    return valorMaximoParcela;
  }
  public void setValorMaximoParcela(BigDecimal valorMaximoParcela) {
    this.valorMaximoParcela = valorMaximoParcela;
  }

  
  /**
   * {{{emprestimo_pessoal_response_data_primeira_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{emprestimo_pessoal_response_data_primeira_parcela_value}}}")
  public String getDataPrimeiraParcela() {
    return dataPrimeiraParcela;
  }
  public void setDataPrimeiraParcela(String dataPrimeiraParcela) {
    this.dataPrimeiraParcela = dataPrimeiraParcela;
  }

  
  /**
   * {{{emprestimo_pessoal_response_periodo_taxa_value}}}
   **/
  @ApiModelProperty(value = "{{{emprestimo_pessoal_response_periodo_taxa_value}}}")
  public String getPeriodoTaxa() {
    return periodoTaxa;
  }
  public void setPeriodoTaxa(String periodoTaxa) {
    this.periodoTaxa = periodoTaxa;
  }

  
  /**
   * {{{emprestimo_pessoal_response_sistema_amortizacao_value}}}
   **/
  @ApiModelProperty(value = "{{{emprestimo_pessoal_response_sistema_amortizacao_value}}}")
  public String getSistemaAmortizacao() {
    return sistemaAmortizacao;
  }
  public void setSistemaAmortizacao(String sistemaAmortizacao) {
    this.sistemaAmortizacao = sistemaAmortizacao;
  }

  
  /**
   * {{{emprestimo_pessoal_response_taxa_juros_value}}}
   **/
  @ApiModelProperty(value = "{{{emprestimo_pessoal_response_taxa_juros_value}}}")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmprestimoPessoalResponse {\n");
    
    sb.append("  planosParcelamentos: ").append(planosParcelamentos).append("\n");
    sb.append("  valorSolicitado: ").append(valorSolicitado).append("\n");
    sb.append("  valorMaximoSolicitacao: ").append(valorMaximoSolicitacao).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  valorMaximoParcela: ").append(valorMaximoParcela).append("\n");
    sb.append("  dataPrimeiraParcela: ").append(dataPrimeiraParcela).append("\n");
    sb.append("  periodoTaxa: ").append(periodoTaxa).append("\n");
    sb.append("  sistemaAmortizacao: ").append(sistemaAmortizacao).append("\n");
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


