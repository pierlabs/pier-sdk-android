package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o do recurso Usuario Token
 **/
@ApiModel(description = "Representa\u00E7\u00E3o do recurso Usuario Token")
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
   * Se o token est\u00E1 ativo
   **/
  @ApiModelProperty(value = "Se o token est\u00E1 ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * CPF do usu\u00E1rio
   **/
  @ApiModelProperty(value = "CPF do usu\u00E1rio")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Data da inclusao do usu\u00E1rio
   **/
  @ApiModelProperty(value = "Data da inclusao do usu\u00E1rio")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Data de nascimento do usu\u00E1rio
   **/
  @ApiModelProperty(value = "Data de nascimento do usu\u00E1rio")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * DDD do telefone do usu\u00E1rio
   **/
  @ApiModelProperty(value = "DDD do telefone do usu\u00E1rio")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * Email do usu\u00E1rio
   **/
  @ApiModelProperty(value = "Email do usu\u00E1rio")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * N\u00FAmero do telefone do usu\u00E1rio
   **/
  @ApiModelProperty(value = "N\u00FAmero do telefone do usu\u00E1rio")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * Token do usu\u00E1rio
   **/
  @ApiModelProperty(value = "Token do usu\u00E1rio")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * Validade do token
   **/
  @ApiModelProperty(value = "Validade do token")
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
