package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TelephonePersonApprovedPersist;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * PessoaPersist
 **/
@ApiModel(description = "PessoaPersist")
public class PersonPersist  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("dataNascimento")
  private String dataNascimento = null;
  @SerializedName("sexo")
  private String sexo = null;
  @SerializedName("numeroIdentidade")
  private String numeroIdentidade = null;
  @SerializedName("orgaoExpedidorIdentidade")
  private String orgaoExpedidorIdentidade = null;
  @SerializedName("unidadeFederativaIdentidade")
  private String unidadeFederativaIdentidade = null;
  @SerializedName("dataEmissaoIdentidade")
  private String dataEmissaoIdentidade = null;
  @SerializedName("estadoCivil")
  private String estadoCivil = null;
  @SerializedName("profissao")
  private String profissao = null;
  @SerializedName("nacionalidade")
  private String nacionalidade = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("telefones")
  private List<TelephonePersonApprovedPersist> telefones = null;

  
  /**
   * Show the name of the Partner
   **/
  @ApiModelProperty(required = true, value = "Show the name of the Partner")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Partner CPF number
   **/
  @ApiModelProperty(value = "Partner CPF number")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Birth date of the person, when it is PP, or the Opening date of the Company, when it is LP. This date must be informed in format yyyy-MM-dd
   **/
  @ApiModelProperty(value = "Birth date of the person, when it is PP, or the Opening date of the Company, when it is LP. This date must be informed in format yyyy-MM-dd")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * Partner Gender
   **/
  @ApiModelProperty(value = "Partner Gender")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * Identity number
   **/
  @ApiModelProperty(value = "Identity number")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * Issuer organ of the Identity
   **/
  @ApiModelProperty(value = "Issuer organ of the Identity")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * Acronym of the Federal Unity where was issued the Identity
   **/
  @ApiModelProperty(value = "Acronym of the Federal Unity where was issued the Identity")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * Issue date of the identity
   **/
  @ApiModelProperty(value = "Issue date of the identity")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * Marital Status of the partner
   **/
  @ApiModelProperty(value = "Marital Status of the partner")
  public String getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  
  /**
   * Occupation of the partner
   **/
  @ApiModelProperty(value = "Occupation of the partner")
  public String getProfissao() {
    return profissao;
  }
  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  
  /**
   * Nationality of the partner
   **/
  @ApiModelProperty(value = "Nationality of the partner")
  public String getNacionalidade() {
    return nacionalidade;
  }
  public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  
  /**
   * Email of the partner
   **/
  @ApiModelProperty(value = "Email of the partner")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Inform the telephones of the partner
   **/
  @ApiModelProperty(value = "Inform the telephones of the partner")
  public List<TelephonePersonApprovedPersist> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelephonePersonApprovedPersist> telefones) {
    this.telefones = telefones;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonPersist {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  dataNascimento: ").append(dataNascimento).append("\n");
    sb.append("  sexo: ").append(sexo).append("\n");
    sb.append("  numeroIdentidade: ").append(numeroIdentidade).append("\n");
    sb.append("  orgaoExpedidorIdentidade: ").append(orgaoExpedidorIdentidade).append("\n");
    sb.append("  unidadeFederativaIdentidade: ").append(unidadeFederativaIdentidade).append("\n");
    sb.append("  dataEmissaoIdentidade: ").append(dataEmissaoIdentidade).append("\n");
    sb.append("  estadoCivil: ").append(estadoCivil).append("\n");
    sb.append("  profissao: ").append(profissao).append("\n");
    sb.append("  nacionalidade: ").append(nacionalidade).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
