package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Return of the attempts registration
 **/
@ApiModel(description = "Return of the attempts registration")
public class ControleTentativaCadastroResponse  {
  
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("login")
  private String login = null;
  @SerializedName("tentativas")
  private Integer tentativas = null;

  
  /**
   * User CPF
   **/
  @ApiModelProperty(value = "User CPF")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Login
   **/
  @ApiModelProperty(value = "Login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * Number of attempts
   **/
  @ApiModelProperty(value = "Number of attempts")
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
