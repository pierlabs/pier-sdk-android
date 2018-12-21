package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{plano_parcelamento_transferencia_credito_conta_bancaria_request_description}}}
 **/
@ApiModel(description = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_request_description}}}")
public class PlanoParcelamentoTransferenciaCreditoContaBancariaRequest  {
  
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("valorTransacao")
  private BigDecimal valorTransacao = null;
  @SerializedName("numeroMesesCarencia")
  private Integer numeroMesesCarencia = null;

  
  /**
   * {{{plano_parcelamento_transferencia_credito_conta_bancaria_request_id_cartao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_request_id_cartao_value}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{plano_parcelamento_transferencia_credito_conta_bancaria_request_valor_transacao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_request_valor_transacao_value}}}")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * {{{plano_parcelamento_transferencia_credito_conta_bancaria_request_numero_meses_carencia_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{plano_parcelamento_transferencia_credito_conta_bancaria_request_numero_meses_carencia_value}}}")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoTransferenciaCreditoContaBancariaRequest {\n");
    
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  valorTransacao: ").append(valorTransacao).append("\n");
    sb.append("  numeroMesesCarencia: ").append(numeroMesesCarencia).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
