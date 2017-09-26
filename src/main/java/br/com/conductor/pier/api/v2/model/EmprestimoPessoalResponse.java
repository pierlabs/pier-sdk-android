package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PlanoParcelamentoEmprestimoResponse;
import java.math.BigDecimal;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Resposta do recurso de simular empr\u00C3\u00A9stimos/financiamentos
 **/
@ApiModel(description = "Resposta do recurso de simular empr\u00C3\u00A9stimos/financiamentos")
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
   * Valor solicitado do empr\u00C3\u00A9stimo/financiamento
   **/
  @ApiModelProperty(value = "Valor solicitado do empr\u00C3\u00A9stimo/financiamento")
  public BigDecimal getValorSolicitado() {
    return valorSolicitado;
  }
  public void setValorSolicitado(BigDecimal valorSolicitado) {
    this.valorSolicitado = valorSolicitado;
  }

  
  /**
   * Valor m\u00C3\u00A1ximo de empr\u00C3\u00A9stimo pelo valor limite de parcela
   **/
  @ApiModelProperty(value = "Valor m\u00C3\u00A1ximo de empr\u00C3\u00A9stimo pelo valor limite de parcela")
  public BigDecimal getValorMaximoSolicitacao() {
    return valorMaximoSolicitacao;
  }
  public void setValorMaximoSolicitacao(BigDecimal valorMaximoSolicitacao) {
    this.valorMaximoSolicitacao = valorMaximoSolicitacao;
  }

  
  /**
   * N\u00C3\u00BAmero de parcelas solicitado
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero de parcelas solicitado")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Limite m\u00C3\u00A1ximo de parcela permitido
   **/
  @ApiModelProperty(value = "Limite m\u00C3\u00A1ximo de parcela permitido")
  public BigDecimal getValorMaximoParcela() {
    return valorMaximoParcela;
  }
  public void setValorMaximoParcela(BigDecimal valorMaximoParcela) {
    this.valorMaximoParcela = valorMaximoParcela;
  }

  
  /**
   * Data do desconto da primeira parcela
   **/
  @ApiModelProperty(value = "Data do desconto da primeira parcela")
  public String getDataPrimeiraParcela() {
    return dataPrimeiraParcela;
  }
  public void setDataPrimeiraParcela(String dataPrimeiraParcela) {
    this.dataPrimeiraParcela = dataPrimeiraParcela;
  }

  
  /**
   * Per\u00C3\u00ADodo de aplica da taxa de juros
   **/
  @ApiModelProperty(value = "Per\u00C3\u00ADodo de aplica da taxa de juros")
  public String getPeriodoTaxa() {
    return periodoTaxa;
  }
  public void setPeriodoTaxa(String periodoTaxa) {
    this.periodoTaxa = periodoTaxa;
  }

  
  /**
   * Sistema para amortiza\u00C3\u00A7\u00C3\u00A3o do valor das parcelas
   **/
  @ApiModelProperty(value = "Sistema para amortiza\u00C3\u00A7\u00C3\u00A3o do valor das parcelas")
  public String getSistemaAmortizacao() {
    return sistemaAmortizacao;
  }
  public void setSistemaAmortizacao(String sistemaAmortizacao) {
    this.sistemaAmortizacao = sistemaAmortizacao;
  }

  
  /**
   * Valor percentual da taxa de juros a ser aplicada
   **/
  @ApiModelProperty(value = "Valor percentual da taxa de juros a ser aplicada")
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


