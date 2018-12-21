package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Represents the response of the resource
 **/
@ApiModel(description = "Represents the response of the resource")
public class UsuarioTokenResponse  {
  
  @SerializedName("ativo")
  private Boolean ativo = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("dataInclusao")
  private String dataInclusao = null;
  @SerializedName("dataNascimento")
  private String dataNascimento = null;
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("telefone")
  private String telefone = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("validade")
  private String validade = null;

  
  /**
   * Indicates if the token is active
   **/
  @ApiModelProperty(value = "Indicates if the token is active")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * Represents the CPF number of the user
   **/
  @ApiModelProperty(value = "Represents the CPF number of the user")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * The token inclusion date
   **/
  @ApiModelProperty(value = "The token inclusion date")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * The user date of birth
   **/
  @ApiModelProperty(value = "The user date of birth")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * DDD of the cell phone
   **/
  @ApiModelProperty(value = "DDD of the cell phone")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * The user email
   **/
  @ApiModelProperty(value = "The user email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Phone number
   **/
  @ApiModelProperty(value = "Phone number")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * The user token
   **/
  @ApiModelProperty(value = "The user token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * The token expiration date
   **/
  @ApiModelProperty(value = "The token expiration date")
  public String getValidade() {
    return validade;
  }
  public void setValidade(String validade) {
    this.validade = validade;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioTokenResponse {\n");
    
    sb.append("  ativo: ").append(ativo).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  dataInclusao: ").append(dataInclusao).append("\n");
    sb.append("  dataNascimento: ").append(dataNascimento).append("\n");
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  validade: ").append(validade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
