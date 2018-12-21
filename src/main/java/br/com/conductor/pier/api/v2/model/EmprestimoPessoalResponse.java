package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PlanoParcelamentoEmprestimoResponse;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Resource Response of simulating loan/financing
 **/
@ApiModel(description = "Resource Response of simulating loan/financing")
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
   * Requested value of the loan/financing
   **/
  @ApiModelProperty(value = "Requested value of the loan/financing")
  public BigDecimal getValorSolicitado() {
    return valorSolicitado;
  }
  public void setValorSolicitado(BigDecimal valorSolicitado) {
    this.valorSolicitado = valorSolicitado;
  }

  
  /**
   * Maximum value of the loan for the limit value of the parcel
   **/
  @ApiModelProperty(value = "Maximum value of the loan for the limit value of the parcel")
  public BigDecimal getValorMaximoSolicitacao() {
    return valorMaximoSolicitacao;
  }
  public void setValorMaximoSolicitacao(BigDecimal valorMaximoSolicitacao) {
    this.valorMaximoSolicitacao = valorMaximoSolicitacao;
  }

  
  /**
   * Number of parcels requested
   **/
  @ApiModelProperty(value = "Number of parcels requested")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Maximum limit of allowed parcels
   **/
  @ApiModelProperty(value = "Maximum limit of allowed parcels")
  public BigDecimal getValorMaximoParcela() {
    return valorMaximoParcela;
  }
  public void setValorMaximoParcela(BigDecimal valorMaximoParcela) {
    this.valorMaximoParcela = valorMaximoParcela;
  }

  
  /**
   * Date of discount of the first parcel
   **/
  @ApiModelProperty(value = "Date of discount of the first parcel")
  public String getDataPrimeiraParcela() {
    return dataPrimeiraParcela;
  }
  public void setDataPrimeiraParcela(String dataPrimeiraParcela) {
    this.dataPrimeiraParcela = dataPrimeiraParcela;
  }

  
  /**
   * Application period of the interest taxes
   **/
  @ApiModelProperty(value = "Application period of the interest taxes")
  public String getPeriodoTaxa() {
    return periodoTaxa;
  }
  public void setPeriodoTaxa(String periodoTaxa) {
    this.periodoTaxa = periodoTaxa;
  }

  
  /**
   * System for amortization of the parcel values
   **/
  @ApiModelProperty(value = "System for amortization of the parcel values")
  public String getSistemaAmortizacao() {
    return sistemaAmortizacao;
  }
  public void setSistemaAmortizacao(String sistemaAmortizacao) {
    this.sistemaAmortizacao = sistemaAmortizacao;
  }

  
  /**
   * Percentage value of the interest taxes to be applied
   **/
  @ApiModelProperty(value = "Percentage value of the interest taxes to be applied")
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
