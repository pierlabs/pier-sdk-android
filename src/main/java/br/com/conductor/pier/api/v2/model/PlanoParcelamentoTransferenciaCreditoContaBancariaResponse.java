package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ParcelamentoTransferenciaResponse;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{plano_parcelamento_transferencia_credito_conta_bancaria_response_description}}}
 **/
@ApiModel(description = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_response_description}}}")
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
   * {{{plano_parcelamento_transferencia_credito_conta_bancaria_response_numero_mascarado_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_response_numero_mascarado_cartao_value}}}")
  public String getNumeroMascaradoCartao() {
    return numeroMascaradoCartao;
  }
  public void setNumeroMascaradoCartao(String numeroMascaradoCartao) {
    this.numeroMascaradoCartao = numeroMascaradoCartao;
  }

  
  /**
   * {{{plano_parcelamento_transferencia_credito_conta_bancaria_response_vencimento_primeira_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_response_vencimento_primeira_parcela_value}}}")
  public String getVencimentoPrimeiraParcela() {
    return vencimentoPrimeiraParcela;
  }
  public void setVencimentoPrimeiraParcela(String vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
  }

  
  /**
   * {{{plano_parcelamento_transferencia_credito_conta_bancaria_response_valor_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_response_valor_transacao_value}}}")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * {{{plano_parcelamento_transferencia_credito_conta_bancaria_response_numero_meses_carencia_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_response_numero_meses_carencia_value}}}")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * {{{plano_parcelamento_transferencia_credito_conta_bancaria_response_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_response_parcelas_value}}}")
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
