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
  @SerializedName("valorTotal")
  private BigDecimal valorTotal = null;
  @SerializedName("sistemaAmortizacao")
  private String sistemaAmortizacao = null;
  @SerializedName("periodoTaxa")
  private String periodoTaxa = null;
  @SerializedName("dataPrimeiraParcela")
  private String dataPrimeiraParcela = null;

  
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
   * Valor total do empr\u00C3\u00A9stimo/financiamento
   **/
  @ApiModelProperty(value = "Valor total do empr\u00C3\u00A9stimo/financiamento")
  public BigDecimal getValorTotal() {
    return valorTotal;
  }
  public void setValorTotal(BigDecimal valorTotal) {
    this.valorTotal = valorTotal;
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
   * Data da primeira parcela do empr\u00C3\u00A9stimo/financiamento
   **/
  @ApiModelProperty(value = "Data da primeira parcela do empr\u00C3\u00A9stimo/financiamento")
  public String getDataPrimeiraParcela() {
    return dataPrimeiraParcela;
  }
  public void setDataPrimeiraParcela(String dataPrimeiraParcela) {
    this.dataPrimeiraParcela = dataPrimeiraParcela;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmprestimoPessoalResponse {\n");
    
    sb.append("  planosParcelamentos: ").append(planosParcelamentos).append("\n");
    sb.append("  valorSolicitado: ").append(valorSolicitado).append("\n");
    sb.append("  valorTotal: ").append(valorTotal).append("\n");
    sb.append("  sistemaAmortizacao: ").append(sistemaAmortizacao).append("\n");
    sb.append("  periodoTaxa: ").append(periodoTaxa).append("\n");
    sb.append("  dataPrimeiraParcela: ").append(dataPrimeiraParcela).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


