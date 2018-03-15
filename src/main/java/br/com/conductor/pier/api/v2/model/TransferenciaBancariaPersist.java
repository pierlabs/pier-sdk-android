package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Transfer\u00EAncia banc\u00E1ria
 **/
@ApiModel(description = "Transfer\u00EAncia banc\u00E1ria")
public class TransferenciaBancariaPersist  {
  
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
   * Valor da transfer\u00EAncia
   **/
  @ApiModelProperty(required = true, value = "Valor da transfer\u00EAncia")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * Valor da transfer\u00EAncia
   **/
  @ApiModelProperty(required = true, value = "Valor da transfer\u00EAncia")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * N\u00FAmero do CPF ou CNPJ.
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero do CPF ou CNPJ.")
  public String getDocumentoFavorecido() {
    return documentoFavorecido;
  }
  public void setDocumentoFavorecido(String documentoFavorecido) {
    this.documentoFavorecido = documentoFavorecido;
  }

  
  /**
   * C\u00F3digo do banco
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo do banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * N\u00FAmero da ag\u00EAncia
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero da ag\u00EAncia")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * D\u00EDgito da ag\u00EAncia
   **/
  @ApiModelProperty(value = "D\u00EDgito da ag\u00EAncia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * N\u00FAmero da conta
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero da conta")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * D\u00EDgito da conta
   **/
  @ApiModelProperty(value = "D\u00EDgito da conta")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * Sinaliza se conta banc\u00E1ria \u00E9 poupan\u00E7a (1: Poupan\u00E7a, 0: Conta corrente)
   **/
  @ApiModelProperty(required = true, value = "Sinaliza se conta banc\u00E1ria \u00E9 poupan\u00E7a (1: Poupan\u00E7a, 0: Conta corrente)")
  public Integer getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * Apresenta o 'Nome Completo da PF' ou o 'Nome Completo da Raz\u00E3o Social (Nome Empresarial)'.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o 'Nome Completo da PF' ou o 'Nome Completo da Raz\u00E3o Social (Nome Empresarial)'.")
  public String getNomeFavorecido() {
    return nomeFavorecido;
  }
  public void setNomeFavorecido(String nomeFavorecido) {
    this.nomeFavorecido = nomeFavorecido;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaBancariaPersist {\n");
    
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
