package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{dados_portador_request_description}}}
 **/
@ApiModel(description = "{{{dados_portador_request_description}}}")
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
   * {{{dados_portador_request_cartao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{dados_portador_request_cartao_value}}}")
  public String getCartao() {
    return cartao;
  }
  public void setCartao(String cartao) {
    this.cartao = cartao;
  }

  
  /**
   * {{{dados_portador_request_cpf_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{dados_portador_request_cpf_value}}}")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{dados_portador_request_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_portador_request_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{dados_portador_request_data_nascimento_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_portador_request_data_nascimento_value}}}")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * {{{dados_portador_request_cep_residencial_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{dados_portador_request_cep_residencial_value}}}")
  public String getCepResidencial() {
    return cepResidencial;
  }
  public void setCepResidencial(String cepResidencial) {
    this.cepResidencial = cepResidencial;
  }

  
  /**
   * {{{dados_portador_request_email_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{dados_portador_request_email_value}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{dados_portador_request_ddd_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_portador_request_ddd_value}}}")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * {{{dados_portador_request_telefone_value}}}
   **/
  @ApiModelProperty(value = "{{{dados_portador_request_telefone_value}}}")
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
