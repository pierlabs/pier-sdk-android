package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{usuario_token_resposta_descricao}}}
 **/
@ApiModel(description = "{{{usuario_token_resposta_descricao}}}")
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
   * {{{usuario_token_resposta_ativo_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_resposta_ativo_descricao}}}")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * {{{usuario_token_resposta_cpf_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_resposta_cpf_descricao}}}")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{usuario_token_resposta_data_inclusao_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_resposta_data_inclusao_descricao}}}")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * {{{usuario_token_resposta_data_nascimento_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_resposta_data_nascimento_descricao}}}")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * {{{usuario_token_resposta_ddd_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_resposta_ddd_descricao}}}")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{usuario_token_resposta_email_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_resposta_email_descricao}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{usuario_token_resposta_telefone_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_resposta_telefone_descricao}}}")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * {{{usuario_token_resposta_token_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_resposta_token_descricao}}}")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * {{{usuario_token_resposta_validade_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_token_resposta_validade_descricao}}}")
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


