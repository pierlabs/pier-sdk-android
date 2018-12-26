package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Retorno da solicita\u00E7\u00E3o tentativa de cadastro
 **/
@ApiModel(description = "Retorno da solicita\u00E7\u00E3o tentativa de cadastro")
public class ControleTentativaCadastroResponse  {
  
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("login")
  private String login = null;
  @SerializedName("tentativas")
  private Integer tentativas = null;

  
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
   * Usu\u00E1rio
   **/
  @ApiModelProperty(value = "Usu\u00E1rio")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * N\u00FAmero de tentativas
   **/
  @ApiModelProperty(value = "N\u00FAmero de tentativas")
  public Integer getTentativas() {
    return tentativas;
  }
  public void setTentativas(Integer tentativas) {
    this.tentativas = tentativas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleTentativaCadastroResponse {\n");
    
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  tentativas: ").append(tentativas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
