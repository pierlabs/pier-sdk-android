package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da sa\u00EDda do recurso de cadastrar adicionais
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da sa\u00EDda do recurso de cadastrar adicionais")
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
   * C\u00F3digo de identifica\u00E7\u00E3o da Conta para cadastro do Adicional
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da Conta para cadastro do Adicional")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Pessoa Adicional
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da Pessoa Adicional")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Nome completo do Adicional
   **/
  @ApiModelProperty(value = "Nome completo do Adicional")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Nome do Adicional que ser\u00E1 gravado no Cart\u00E3o
   **/
  @ApiModelProperty(value = "Nome do Adicional que ser\u00E1 gravado no Cart\u00E3o")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * N\u00FAmero do CPF ou CNPJ do Adicional
   **/
  @ApiModelProperty(value = "N\u00FAmero do CPF ou CNPJ do Adicional")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do estado civil do adicional do adicional
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do estado civil do adicional do adicional")
  public Long getIdEstadoCivil() {
    return idEstadoCivil;
  }
  public void setIdEstadoCivil(Long idEstadoCivil) {
    this.idEstadoCivil = idEstadoCivil;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Profiss\u00E3o do Adicional
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da Profiss\u00E3o do Adicional")
  public Long getIdProfissao() {
    return idProfissao;
  }
  public void setIdProfissao(Long idProfissao) {
    this.idProfissao = idProfissao;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Nacionalidade do Adicional
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da Nacionalidade do Adicional")
  public Long getIdNacionalidade() {
    return idNacionalidade;
  }
  public void setIdNacionalidade(Long idNacionalidade) {
    this.idNacionalidade = idNacionalidade;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do Parentesco do Adicional com o Titular
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do Parentesco do Adicional com o Titular")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * Email do Adicional
   **/
  @ApiModelProperty(value = "Email do Adicional")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Indica a data de cadastro do adicional
   **/
  @ApiModelProperty(value = "Indica a data de cadastro do adicional")
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
