package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{controle_tentativa_cadastro_resposta_descricao}}}
 **/
@ApiModel(description = "{{{controle_tentativa_cadastro_resposta_descricao}}}")
public class ControleTentativaCadastroResponse  {
  
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("login")
  private String login = null;
  @SerializedName("tentativas")
  private Integer tentativas = null;

  
  /**
   * {{{controle_tentativa_cadastro_resposta_cpf_descricao}}}
   **/
  @ApiModelProperty(value = "{{{controle_tentativa_cadastro_resposta_cpf_descricao}}}")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{controle_tentativa_cadastro_resposta_login_descricao}}}
   **/
  @ApiModelProperty(value = "{{{controle_tentativa_cadastro_resposta_login_descricao}}}")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * {{{controle_tentativa_cadastro_resposta_tentativas_descricao}}}
   **/
  @ApiModelProperty(value = "{{{controle_tentativa_cadastro_resposta_tentativas_descricao}}}")
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


