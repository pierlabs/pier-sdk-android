package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the output of the additional registration feature
 **/
@ApiModel(description = "Representation of the output of the additional registration feature")
public class AdicionalContaResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("idEstadoCivil")
  private Long idEstadoCivil = null;
  @SerializedName("idProfissao")
  private Long idProfissao = null;
  @SerializedName("idNacionalidade")
  private Long idNacionalidade = null;
  @SerializedName("idParentesco")
  private Long idParentesco = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("dataCadastroPortador")
  private String dataCadastroPortador = null;

  
  /**
   * Identification Code of the Account to register the Additional
   **/
  @ApiModelProperty(value = "Identification Code of the Account to register the Additional")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Additional Person's Identification Code
   **/
  @ApiModelProperty(value = "Additional Person's Identification Code")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Full Name of Additional
   **/
  @ApiModelProperty(value = "Full Name of Additional")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Name of the Additional that will be recorded on the Card
   **/
  @ApiModelProperty(value = "Name of the Additional that will be recorded on the Card")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * CPF or CNPJ number of Additional
   **/
  @ApiModelProperty(value = "CPF or CNPJ number of Additional")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Additional Civil Status Identification Code
   **/
  @ApiModelProperty(value = "Additional Civil Status Identification Code")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * Professional Identification Code of Additional
   **/
  @ApiModelProperty(value = "Professional Identification Code of Additional")
  public Long getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(Long idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * Nationality Identification Code of Additional
   **/
  @ApiModelProperty(value = "Nationality Identification Code of Additional")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * Identification Code of Kinship (id)
   **/
  @ApiModelProperty(value = "Identification Code of Kinship (id)")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * Email of Additional
   **/
  @ApiModelProperty(value = "Email of Additional")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Indicates the date of registration of the additional
   **/
  @ApiModelProperty(value = "Indicates the date of registration of the additional")
  public String getDataCadastroPortador() {
    return dataCadastroPortador;
  }
  public void setDataCadastroPortador(String dataCadastroPortador) {
    this.dataCadastroPortador = dataCadastroPortador;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdicionalContaResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  idEstadoCivil: ").append(idEstadoCivil).append("\n");
    sb.append("  idProfissao: ").append(idProfissao).append("\n");
    sb.append("  idNacionalidade: ").append(idNacionalidade).append("\n");
    sb.append("  idParentesco: ").append(idParentesco).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  dataCadastroPortador: ").append(dataCadastroPortador).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
