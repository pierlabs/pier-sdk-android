package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Par\u00E2metros de requisi\u00E7\u00E3o para valida\u00E7\u00E3o dos dados do portador.
 **/
@ApiModel(description = "Par\u00E2metros de requisi\u00E7\u00E3o para valida\u00E7\u00E3o dos dados do portador.")
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
   * N\u00FAmero do cart\u00E3o.
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero do cart\u00E3o.")
  public String getCartao() {
    return cartao;
  }
  public void setCartao(String cartao) {
    this.cartao = cartao;
  }

  
  /**
   * N\u00FAmero do CPF.
   **/
  @ApiModelProperty(required = true, value = "N\u00FAmero do CPF.")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Nome do portador.
   **/
  @ApiModelProperty(value = "Nome do portador.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Data de nascimento do portador do cart\u00E3o.
   **/
  @ApiModelProperty(value = "Data de nascimento do portador do cart\u00E3o.")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * CEP da resid\u00EAncia do portador da conta.
   **/
  @ApiModelProperty(required = true, value = "CEP da resid\u00EAncia do portador da conta.")
  public String getCepResidencial() {
    return cepResidencial;
  }
  public void setCepResidencial(String cepResidencial) {
    this.cepResidencial = cepResidencial;
  }

  
  /**
   * E-mail do portador do cart\u00E3o.
   **/
  @ApiModelProperty(required = true, value = "E-mail do portador do cart\u00E3o.")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * DDD do n\u00FAmero de telefone do portador do cart\u00E3o.
   **/
  @ApiModelProperty(value = "DDD do n\u00FAmero de telefone do portador do cart\u00E3o.")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * N\u00FAmero do telefone do portador do cart\u00E3o.
   **/
  @ApiModelProperty(value = "N\u00FAmero do telefone do portador do cart\u00E3o.")
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
