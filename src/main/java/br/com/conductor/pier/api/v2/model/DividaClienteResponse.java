package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{divida_cliente_response_description}}}
 **/
@ApiModel(description = "{{{divida_cliente_response_description}}}")
public class DividaClienteResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("dataVencimentoFaturaAtraso")
  private String dataVencimentoFaturaAtraso = null;
  @SerializedName("quantidadeDiasAtraso")
  private Long quantidadeDiasAtraso = null;
  @SerializedName("dataVencimentoAcordo")
  private String dataVencimentoAcordo = null;
  @SerializedName("quantidadeDiasAtrasoCorrigido")
  private Long quantidadeDiasAtrasoCorrigido = null;
  @SerializedName("valorSaldoDevedor")
  private BigDecimal valorSaldoDevedor = null;
  @SerializedName("taxaCorrecao")
  private BigDecimal taxaCorrecao = null;
  @SerializedName("valorCorrecao")
  private BigDecimal valorCorrecao = null;
  @SerializedName("valorIOF")
  private BigDecimal valorIOF = null;
  @SerializedName("valorSaldoCorrigido")
  private BigDecimal valorSaldoCorrigido = null;
  @SerializedName("idStatusConta")
  private Long idStatusConta = null;
  @SerializedName("descricaoStatusConta")
  private String descricaoStatusConta = null;
  @SerializedName("idStatusAcordo")
  private Long idStatusAcordo = null;
  @SerializedName("descricaoStatusAcordo")
  private String descricaoStatusAcordo = null;
  @SerializedName("idEscritorioCobranca")
  private Long idEscritorioCobranca = null;
  @SerializedName("nomeEscritorioCobranca")
  private String nomeEscritorioCobranca = null;
  @SerializedName("emailPessoaConta")
  private String emailPessoaConta = null;

  
  /**
   * {{{divida_cliente_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{divida_cliente_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{divida_cliente_response_data_vencimento_fatura_atraso_value}}}
   **/
  @ApiModelProperty(value = "{{{divida_cliente_response_data_vencimento_fatura_atraso_value}}}")
  public String getDataVencimentoFaturaAtraso() {
    return dataVencimentoFaturaAtraso;
  }
  public void setDataVencimentoFaturaAtraso(String dataVencimentoFaturaAtraso) {
    this.dataVencimentoFaturaAtraso = dataVencimentoFaturaAtraso;
  }

  
  /**
   * {{{divida_cliente_response_quantidade_dias_atraso_value}}}
   **/
  @ApiModelProperty(value = "{{{divida_cliente_response_quantidade_dias_atraso_value}}}")
  public Long getQuantidadeDiasAtraso() {
    return quantidadeDiasAtraso;
  }
  public void setQuantidadeDiasAtraso(Long quantidadeDiasAtraso) {
    this.quantidadeDiasAtraso = quantidadeDiasAtraso;
  }

  
  /**
   * {{{divida_cliente_response_data_vencimento_acordo_value}}}
   **/
  @ApiModelProperty(value = "{{{divida_cliente_response_data_vencimento_acordo_value}}}")
  public String getDataVencimentoAcordo() {
    return dataVencimentoAcordo;
  }
  public void setDataVencimentoAcordo(String dataVencimentoAcordo) {
    this.dataVencimentoAcordo = dataVencimentoAcordo;
  }

  
  /**
   * {{{divida_cliente_response_quantidade_dias_atraso_corrigido_value}}}
   **/
  @ApiModelProperty(value = "{{{divida_cliente_response_quantidade_dias_atraso_corrigido_value}}}")
  public Long getQuantidadeDiasAtrasoCorrigido() {
    return quantidadeDiasAtrasoCorrigido;
  }
  public void setQuantidadeDiasAtrasoCorrigido(Long quantidadeDiasAtrasoCorrigido) {
    this.quantidadeDiasAtrasoCorrigido = quantidadeDiasAtrasoCorrigido;
  }

  
  /**
   * {{{divida_cliente_response_valor_saldo_devedor_value}}}
   **/
  @ApiModelProperty(value = "{{{divida_cliente_response_valor_saldo_devedor_value}}}")
  public BigDecimal getValorSaldoDevedor() {
    return valorSaldoDevedor;
  }
  public void setValorSaldoDevedor(BigDecimal valorSaldoDevedor) {
    this.valorSaldoDevedor = valorSaldoDevedor;
  }

  
  /**
   * {{{divida_cliente_response_taxa_correcao_value}}}
   **/
  @ApiModelProperty(value = "{{{divida_cliente_response_taxa_correcao_value}}}")
  public BigDecimal getTaxaCorrecao() {
    return taxaCorrecao;
  }
  public void setTaxaCorrecao(BigDecimal taxaCorrecao) {
    this.taxaCorrecao = taxaCorrecao;
  }

  
  /**
   * {{{divida_cliente_response_valor_correcao_value}}}
   **/
  @ApiModelProperty(value = "{{{divida_cliente_response_valor_correcao_value}}}")
  public BigDecimal getValorCorrecao() {
    return valorCorrecao;
  }
  public void setValorCorrecao(BigDecimal valorCorrecao) {
    this.valorCorrecao = valorCorrecao;
  }

  
  /**
   * {{{divida_cliente_response_valor_i_o_f_value}}}
   **/
  @ApiModelProperty(value = "{{{divida_cliente_response_valor_i_o_f_value}}}")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * {{{divida_cliente_response_valor_saldo_corrigido_value}}}
   **/
  @ApiModelProperty(value = "{{{divida_cliente_response_valor_saldo_corrigido_value}}}")
  public BigDecimal getValorSaldoCorrigido() {
    return valorSaldoCorrigido;
  }
  public void setValorSaldoCorrigido(BigDecimal valorSaldoCorrigido) {
    this.valorSaldoCorrigido = valorSaldoCorrigido;
  }

  
  /**
   * {{{divida_cliente_response_id_status_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{divida_cliente_response_id_status_conta_value}}}")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * {{{divida_cliente_response_descricao_status_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{divida_cliente_response_descricao_status_conta_value}}}")
  public String getDescricaoStatusConta() {
    return descricaoStatusConta;
  }
  public void setDescricaoStatusConta(String descricaoStatusConta) {
    this.descricaoStatusConta = descricaoStatusConta;
  }

  
  /**
   * {{{divida_cliente_response_id_status_acordo_value}}}
   **/
  @ApiModelProperty(value = "{{{divida_cliente_response_id_status_acordo_value}}}")
  public Long getIdStatusAcordo() {
    return idStatusAcordo;
  }
  public void setIdStatusAcordo(Long idStatusAcordo) {
    this.idStatusAcordo = idStatusAcordo;
  }

  
  /**
   * {{{divida_cliente_response_descricao_status_acordo_value}}}
   **/
  @ApiModelProperty(value = "{{{divida_cliente_response_descricao_status_acordo_value}}}")
  public String getDescricaoStatusAcordo() {
    return descricaoStatusAcordo;
  }
  public void setDescricaoStatusAcordo(String descricaoStatusAcordo) {
    this.descricaoStatusAcordo = descricaoStatusAcordo;
  }

  
  /**
   * {{{divida_cliente_response_id_escritorio_cobranca_value}}}
   **/
  @ApiModelProperty(value = "{{{divida_cliente_response_id_escritorio_cobranca_value}}}")
  public Long getIdEscritorioCobranca() {
    return idEscritorioCobranca;
  }
  public void setIdEscritorioCobranca(Long idEscritorioCobranca) {
    this.idEscritorioCobranca = idEscritorioCobranca;
  }

  
  /**
   * {{{divida_cliente_response_nome_escritorio_cobranca_value}}}
   **/
  @ApiModelProperty(value = "{{{divida_cliente_response_nome_escritorio_cobranca_value}}}")
  public String getNomeEscritorioCobranca() {
    return nomeEscritorioCobranca;
  }
  public void setNomeEscritorioCobranca(String nomeEscritorioCobranca) {
    this.nomeEscritorioCobranca = nomeEscritorioCobranca;
  }

  
  /**
   * {{{divida_cliente_response_email_pessoa_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{divida_cliente_response_email_pessoa_conta_value}}}")
  public String getEmailPessoaConta() {
    return emailPessoaConta;
  }
  public void setEmailPessoaConta(String emailPessoaConta) {
    this.emailPessoaConta = emailPessoaConta;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DividaClienteResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  dataVencimentoFaturaAtraso: ").append(dataVencimentoFaturaAtraso).append("\n");
    sb.append("  quantidadeDiasAtraso: ").append(quantidadeDiasAtraso).append("\n");
    sb.append("  dataVencimentoAcordo: ").append(dataVencimentoAcordo).append("\n");
    sb.append("  quantidadeDiasAtrasoCorrigido: ").append(quantidadeDiasAtrasoCorrigido).append("\n");
    sb.append("  valorSaldoDevedor: ").append(valorSaldoDevedor).append("\n");
    sb.append("  taxaCorrecao: ").append(taxaCorrecao).append("\n");
    sb.append("  valorCorrecao: ").append(valorCorrecao).append("\n");
    sb.append("  valorIOF: ").append(valorIOF).append("\n");
    sb.append("  valorSaldoCorrigido: ").append(valorSaldoCorrigido).append("\n");
    sb.append("  idStatusConta: ").append(idStatusConta).append("\n");
    sb.append("  descricaoStatusConta: ").append(descricaoStatusConta).append("\n");
    sb.append("  idStatusAcordo: ").append(idStatusAcordo).append("\n");
    sb.append("  descricaoStatusAcordo: ").append(descricaoStatusAcordo).append("\n");
    sb.append("  idEscritorioCobranca: ").append(idEscritorioCobranca).append("\n");
    sb.append("  nomeEscritorioCobranca: ").append(nomeEscritorioCobranca).append("\n");
    sb.append("  emailPessoaConta: ").append(emailPessoaConta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


