package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object BankingAccountCardholder
 **/
@ApiModel(description = "Object BankingAccountCardholder")
public class BankAccountCardholderUpdate  {
  
  @SerializedName("nomeAgencia")
  private String nomeAgencia = null;
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
  @SerializedName("flagAtivo")
  private Integer flagAtivo = null;
  @SerializedName("flagContaOrigemDoc")
  private Integer flagContaOrigemDoc = null;
  @SerializedName("flagContaPoupanca")
  private Integer flagContaPoupanca = null;
  @SerializedName("favorecido")
  private String favorecido = null;
  @SerializedName("numeroReceiraFederal")
  private String numeroReceiraFederal = null;
  @SerializedName("titularidade")
  private Integer titularidade = null;

  
  /**
   * Description of the agency
   **/
  @ApiModelProperty(value = "Description of the agency")
  public String getNomeAgencia() {
    return nomeAgencia;
  }
  public void setNomeAgencia(String nomeAgencia) {
    this.nomeAgencia = nomeAgencia;
  }

  
  /**
   * Bank Code
   **/
  @ApiModelProperty(required = true, value = "Bank Code")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * Agency Number
   **/
  @ApiModelProperty(required = true, value = "Agency Number")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * Digit of the agency
   **/
  @ApiModelProperty(value = "Digit of the agency")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * Number of the account
   **/
  @ApiModelProperty(required = true, value = "Number of the account")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * Account digit
   **/
  @ApiModelProperty(value = "Account digit")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * Signal whether the bank account is active or not: (1: Atcive, 0: Inactive)
   **/
  @ApiModelProperty(required = true, value = "Signal whether the bank account is active or not: (1: Atcive, 0: Inactive)")
  public Integer getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Integer flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Signal if the origin is DOC (1: DOC, 0: TED)
   **/
  @ApiModelProperty(required = true, value = "Signal if the origin is DOC (1: DOC, 0: TED)")
  public Integer getFlagContaOrigemDoc() {
    return flagContaOrigemDoc;
  }
  public void setFlagContaOrigemDoc(Integer flagContaOrigemDoc) {
    this.flagContaOrigemDoc = flagContaOrigemDoc;
  }

  
  /**
   * Signal if the account is a saving account (1: Saving Account, 0: Current Account)
   **/
  @ApiModelProperty(required = true, value = "Signal if the account is a saving account (1: Saving Account, 0: Current Account)")
  public Integer getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * Favored name
   **/
  @ApiModelProperty(required = true, value = "Favored name")
  public String getFavorecido() {
    return favorecido;
  }
  public void setFavorecido(String favorecido) {
    this.favorecido = favorecido;
  }

  
  /**
   * Document of the favored
   **/
  @ApiModelProperty(required = true, value = "Document of the favored")
  public String getNumeroReceiraFederal() {
    return numeroReceiraFederal;
  }
  public void setNumeroReceiraFederal(String numeroReceiraFederal) {
    this.numeroReceiraFederal = numeroReceiraFederal;
  }

  
  /**
   * Owner of the account (1:Cardholder is the owner, 0: Cardholder is not the owner.)
   **/
  @ApiModelProperty(value = "Owner of the account (1:Cardholder is the owner, 0: Cardholder is not the owner.)")
  public Integer getTitularidade() {
    return titularidade;
  }
  public void setTitularidade(Integer titularidade) {
    this.titularidade = titularidade;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccountCardholderUpdate {\n");
    
    sb.append("  nomeAgencia: ").append(nomeAgencia).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  digitoAgencia: ").append(digitoAgencia).append("\n");
    sb.append("  numeroConta: ").append(numeroConta).append("\n");
    sb.append("  digitoConta: ").append(digitoConta).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  flagContaOrigemDoc: ").append(flagContaOrigemDoc).append("\n");
    sb.append("  flagContaPoupanca: ").append(flagContaPoupanca).append("\n");
    sb.append("  favorecido: ").append(favorecido).append("\n");
    sb.append("  numeroReceiraFederal: ").append(numeroReceiraFederal).append("\n");
    sb.append("  titularidade: ").append(titularidade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
