package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Request Parameters for validation of the cardholder dates
 **/
@ApiModel(description = "Request Parameters for validation of the cardholder dates")
public class DadosPortadorRequest  {
  
  @SerializedName("cartao")
  private String cartao = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("dataNascimento")
  private String dataNascimento = null;
  @SerializedName("cepResidencial")
  private String cepResidencial = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("telefone")
  private String telefone = null;

  
  /**
   * Number of the card
   **/
  @ApiModelProperty(required = true, value = "Number of the card")
  public String getCartao() {
    return cartao;
  }
  public void setCartao(String cartao) {
    this.cartao = cartao;
  }

  
  /**
   * CPF number
   **/
  @ApiModelProperty(required = true, value = "CPF number")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Cardholder name
   **/
  @ApiModelProperty(value = "Cardholder name")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Birth date of the cardholder
   **/
  @ApiModelProperty(value = "Birth date of the cardholder")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Zip code of the Cardholder residence of the account
   **/
  @ApiModelProperty(required = true, value = "Zip code of the Cardholder residence of the account")
  public String getCepResidencial() {
    return cepResidencial;
  }
  public void setCepResidencial(String cepResidencial) {
    this.cepResidencial = cepResidencial;
  }

  
  /**
   * E-mail of the cardholder
   **/
  @ApiModelProperty(required = true, value = "E-mail of the cardholder")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * DDD of the telephone number of the cardholder
   **/
  @ApiModelProperty(value = "DDD of the telephone number of the cardholder")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * Telephone Number of the cardholder
   **/
  @ApiModelProperty(value = "Telephone Number of the cardholder")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosPortadorRequest {\n");
    
    sb.append("  cartao: ").append(cartao).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  dataNascimento: ").append(dataNascimento).append("\n");
    sb.append("  cepResidencial: ").append(cepResidencial).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
