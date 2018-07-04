package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{transferencia_bancaria_persist_description}}}
 **/
@ApiModel(description = "{{{transferencia_bancaria_persist_description}}}")
public class TransferenciaBancariaPersistValue  {
  
  @SerializedName("valorCompra")
  private BigDecimal valorCompra = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("documentoFavorecido")
  private String documentoFavorecido = null;
  @SerializedName("banco")
  private Long banco = null;
  @SerializedName("numeroAgencia")
  private String numeroAgencia = null;
  @SerializedName("digitoAgencia")
  private String digitoAgencia = null;
  @SerializedName("numeroConta")
  private String numeroConta = null;
  @SerializedName("digitoConta")
  private String digitoConta = null;
  @SerializedName("flagContaPoupanca")
  private Integer flagContaPoupanca = null;
  @SerializedName("nomeFavorecido")
  private String nomeFavorecido = null;

  
  /**
   * {{{transferencia_bancaria_persist_valor_compra_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transferencia_bancaria_persist_valor_compra_value}}}")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * {{{transferencia_bancaria_persist_valor_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transferencia_bancaria_persist_valor_value}}}")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{transferencia_bancaria_persist_documento_favorecido_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transferencia_bancaria_persist_documento_favorecido_value}}}")
  public String getDocumentoFavorecido() {
    return documentoFavorecido;
  }
  public void setDocumentoFavorecido(String documentoFavorecido) {
    this.documentoFavorecido = documentoFavorecido;
  }

  
  /**
   * {{{transferencia_bancaria_persist_banco_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transferencia_bancaria_persist_banco_value}}}")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * {{{transferencia_bancaria_persist_numero_agencia_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transferencia_bancaria_persist_numero_agencia_value}}}")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{transferencia_bancaria_persist_digito_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_persist_digito_agencia_value}}}")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * {{{transferencia_bancaria_persist_numero_conta_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transferencia_bancaria_persist_numero_conta_value}}}")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * {{{transferencia_bancaria_persist_digito_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_persist_digito_conta_value}}}")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * {{{transferencia_bancaria_persist_flag_conta_poupanca_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transferencia_bancaria_persist_flag_conta_poupanca_value}}}")
  public Integer getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * {{{transferencia_bancaria_persist_nome_favorecido_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{transferencia_bancaria_persist_nome_favorecido_value}}}")
  public String getNomeFavorecido() {
    return nomeFavorecido;
  }
  public void setNomeFavorecido(String nomeFavorecido) {
    this.nomeFavorecido = nomeFavorecido;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaBancariaPersistValue {\n");
    
    sb.append("  valorCompra: ").append(valorCompra).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  documentoFavorecido: ").append(documentoFavorecido).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  digitoAgencia: ").append(digitoAgencia).append("\n");
    sb.append("  numeroConta: ").append(numeroConta).append("\n");
    sb.append("  digitoConta: ").append(digitoConta).append("\n");
    sb.append("  flagContaPoupanca: ").append(flagContaPoupanca).append("\n");
    sb.append("  nomeFavorecido: ").append(nomeFavorecido).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


