package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ParcelamentoTransferenciaResponse;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Plano de Parcelamentos para Transfer\u00EAncia de cr\u00E9dito para contas banc\u00E1rias
 **/
@ApiModel(description = "Plano de Parcelamentos para Transfer\u00EAncia de cr\u00E9dito para contas banc\u00E1rias")
public class PlanoParcelamentoTransferenciaCreditoContaBancariaResponse  {
  
  @SerializedName("numeroMascaradoCartao")
  private String numeroMascaradoCartao = null;
  @SerializedName("vencimentoPrimeiraParcela")
  private String vencimentoPrimeiraParcela = null;
  @SerializedName("valorTransacao")
  private BigDecimal valorTransacao = null;
  @SerializedName("numeroMesesCarencia")
  private Integer numeroMesesCarencia = null;
  @SerializedName("parcelas")
  private List<ParcelamentoTransferenciaResponse> parcelas = null;

  
  /**
   * N\u00FAmero do Cart\u00E3o que originou a transa\u00E7\u00E3o em formato mascarado.
   **/
  @ApiModelProperty(value = "N\u00FAmero do Cart\u00E3o que originou a transa\u00E7\u00E3o em formato mascarado.")
  public String getNumeroMascaradoCartao() {
    return numeroMascaradoCartao;
  }
  public void setNumeroMascaradoCartao(String numeroMascaradoCartao) {
    this.numeroMascaradoCartao = numeroMascaradoCartao;
  }

  
  /**
   * Data de vencimento da primeira parcela.
   **/
  @ApiModelProperty(value = "Data de vencimento da primeira parcela.")
  public String getVencimentoPrimeiraParcela() {
    return vencimentoPrimeiraParcela;
  }
  public void setVencimentoPrimeiraParcela(String vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
  }

  
  /**
   * Valor da solicita\u00E7\u00E3o de saque.
   **/
  @ApiModelProperty(value = "Valor da solicita\u00E7\u00E3o de saque.")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * N\u00FAmero de meses para car\u00EAncia.
   **/
  @ApiModelProperty(value = "N\u00FAmero de meses para car\u00EAncia.")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * Lista com os planos de parcelamento.
   **/
  @ApiModelProperty(value = "Lista com os planos de parcelamento.")
  public List<ParcelamentoTransferenciaResponse> getParcelas() {
    return parcelas;
  }
  public void setParcelas(List<ParcelamentoTransferenciaResponse> parcelas) {
    this.parcelas = parcelas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoTransferenciaCreditoContaBancariaResponse {\n");
    
    sb.append("  numeroMascaradoCartao: ").append(numeroMascaradoCartao).append("\n");
    sb.append("  vencimentoPrimeiraParcela: ").append(vencimentoPrimeiraParcela).append("\n");
    sb.append("  valorTransacao: ").append(valorTransacao).append("\n");
    sb.append("  numeroMesesCarencia: ").append(numeroMesesCarencia).append("\n");
    sb.append("  parcelas: ").append(parcelas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
